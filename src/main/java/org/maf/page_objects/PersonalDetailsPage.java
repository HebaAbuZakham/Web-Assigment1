package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage {


    @FindBy(id = "first name")
    WebElement firstName;

    @FindBy(id = "last name")
    WebElement lastName;

    @FindBy(id="mobile number")
    WebElement mobileNumber;

    @FindBy(id="email")
    WebElement email;

    @FindBy(id="bookingInfoCheckbox")
    WebElement bookingInformation;

    @FindBy(id="termsConditsCheckbox")
    WebElement termsConditonsCheckbox;

    @FindBy(id="//*[@id=\"layout\"]/div[2]/main/section/div/div[2]/div[1]/section/div/div/div/div/div/span/form/div[4]/button[2]")
    WebElement saveButton;


    @FindBy(xpath="//*[@id=\"tickets-container\"]/div[3]/button")
    WebElement removeButton;


    @FindBy(xpath="/*[@id=\"layout\"]/div[2]/main/section/div/div[2]/div[1]/section/div/div/div/div/div[2]/div[2]/button")
    WebElement editProfileButton;


    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/section/div/div[2]/div[1]/section/div/div/div/div[2]/div/button[1]")
    WebElement createAccount;

    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/section/div/div[2]/div[1]/section/div/div/div/div[2]/div/button[2]")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"tickets-container\"]/div[1]/div/a")
    WebElement editTicketInfo;
    @FindBy(xpath = "//button[text()[normalize-space()='Continue to payment']]")
    private WebElement continueToPayment ;

    @FindBy(xpath= "//*[@id=\"layout\"]/div[2]/main/div[2]/div/div/div[1]/div[1]/button")
    WebElement continueShippingButton;

    public void typeFirstName() {
        firstName.sendKeys("razan");
    }
    public void typeLastName() {
        lastName.sendKeys("yousef");
    }

    public void clickingOnEditProfile() {
        editProfileButton.click();
    }

    public void clickingOnSaveButton() {
        saveButton.click();
    }


    public PersonalDetailsPage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public WebElement getContinueToPayment () {
        return continueToPayment;
    }

    public void setContinueToPayment (WebElement continueToPayment) {
        this.continueToPayment = continueToPayment;
    }
}
