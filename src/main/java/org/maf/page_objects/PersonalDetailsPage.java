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

    @FindBy(xpath="//button[@class='gs-base-button-default-styles w-fit']")
    WebElement saveButton;

    @FindBy(xpath="user-name")
    WebElement nameLabel;

    @FindBy(xpath="//*[@id=\"tickets-container\"]/div[3]/button")
    WebElement removeButton;


    @FindBy(xpath="//button[@class='gs-base-button-default-styles w-fit']")
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



    public PersonalDetailsPage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public WebElement getFirstName() {
        return firstName;
    }

        public void setFirstName (WebElement firstName) {
            this.firstName = firstName;}

    public WebElement getLastName() {
        return lastName;
    }

    public void setLastName (WebElement lastName) {
        this.lastName = lastName;}

    public void clickingOnEditProfile() {
        editProfileButton.click();
    }

    public void clickingOnSaveButton() {
        saveButton.click();
    }


    public WebElement getContinueToPayment () {
        return continueToPayment;
    }

    public void setContinueToPayment (WebElement continueToPayment) {
        this.continueToPayment = continueToPayment;
    }
    public WebElement getNameLabel () {
        return nameLabel;
    }
}
