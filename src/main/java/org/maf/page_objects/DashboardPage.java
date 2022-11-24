package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {


    @FindBy(xpath = "//p[contains(@class,'ltr:font-inter-bold rtl:font-noto-sans-arabic-bold')]")
    private WebElement bookingRef;

    @FindBy(xpath ="//div[@class='circles not-active']")
    private WebElement addGuestCircleNotActive;

    @FindBy(xpath ="(//div[@class='circles active'])[2]")
    private WebElement addGuestCircleActive;

    @FindBy(xpath ="(//div[@class='circles active'])[3]")
    private WebElement chooseGearActive;

    public DashboardPage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public WebElement getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef (WebElement bookingRef) {
        this.bookingRef = bookingRef;
    }
    public WebElement getAddGuestCircleNotActive() {
        return addGuestCircleNotActive;
    }

    public void setAddGuestCircleNotActive (WebElement addGuestCircleNotActive) {
        this.addGuestCircleNotActive = addGuestCircleNotActive;
    }

    public WebElement getAddGuestCircleActive() {
        return addGuestCircleActive;
    }

    public void setAddGuestCircleActive(WebElement addGuestCircleActive) {
        this.addGuestCircleActive = addGuestCircleActive;
    }

    public WebElement getChooseGearActive() {
        return chooseGearActive;
    }

    public void setChooseGearActive(WebElement chooseGearActive) {
        this.chooseGearActive = chooseGearActive;
    }
}
