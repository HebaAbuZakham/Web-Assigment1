package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {


    @FindBy(css = "//p[contains(@class,'font-inter-bold text-base')]")
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
