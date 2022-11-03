package org.maf.page_objects;


import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
@Setter
public class FindYourBooking {
    @FindBy(css = "div#layout h1")
    @CacheLookup
    private WebElement findYourBookingHeader;

    @FindBy(id = "Booking ID")
    private WebElement findYourBookingField;

    @FindBy(xpath = "//button[@class='gs-base-button-default-styles w-fit']")
    private WebElement submitAndContinue;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    private WebElement signinButton;

    @FindBy   (xpath ="//div[contains(@class,'ltr:text-left rtl:text-right')]")
    private WebElement validationMessage;

    @FindBy   (xpath ="//h1[@class='title']")
    private WebElement guestUserFindBookingHeader;



    public FindYourBooking (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public WebElement getFindYourBookingHeader() {
        return findYourBookingHeader;
    }

    public void setFindYourBookingHeader (WebElement findYourBookingHeader) {
        this.findYourBookingHeader = findYourBookingHeader;
    }

    public WebElement getFindYourBookingField() {
        return findYourBookingField;
    }

    public void setFindYourBookingField (WebElement findYourBookingField) {
        this.findYourBookingField = findYourBookingField;
    }
    public WebElement getFSigninButton() {
        return signinButton;
    }

    public void setSigninButton (WebElement signinButton) {
        this.signinButton = signinButton;
    }

    public WebElement getValidationMessage() {
        return validationMessage;
    }

    public void setValidationMessage (WebElement validationMessage) {
        this.validationMessage = validationMessage;
    }


    public WebElement getGuestUserFindBooking() {
        return guestUserFindBookingHeader;
    }

    public void setGuestUserFindBookingHeader (WebElement guestUserFindBookingHeader) {
        this.guestUserFindBookingHeader = guestUserFindBookingHeader;
    }


}
