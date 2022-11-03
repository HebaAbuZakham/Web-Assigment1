package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {


    @FindBy(xpath = "//p[contains(@class,'ltr:font-inter-bold rtl:font-noto-sans-arabic-bold')]")
    private WebElement bookingRef;


    public DashboardPage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public WebElement getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef (WebElement bookingRef) {
        this.bookingRef = bookingRef;
    }
}
