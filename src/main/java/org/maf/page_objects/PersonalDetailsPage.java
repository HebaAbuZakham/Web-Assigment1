package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PersonalDetailsPage {


    @FindBy (xpath = "//*[@id=\"layout\"]/div[2]/main/section/div/div[1]/div/div/h1")
    WebElement personalDetailsHeader;

    @FindBy (xpath="(//span[contains(@class,'w-2 h-2')])[3]")
    WebElement missRadioButton;
    @FindBy(id = "first name")
    WebElement firstName;

    @FindBy(id = "last name")
    WebElement lastName;

    @FindBy(id="mobile number")
    WebElement mobileNumber;

    @FindBy(id="email")
    WebElement email;

    @FindBy(id="bookingInfoCheckbox")
    WebElement bookingInformationCheckbox;

    @FindBy(id="termsConditsCheckbox")
    WebElement termsConditonsCheckbox;

    @FindBy(xpath="//div[contains(@class,'absolute left-0')]")
    WebElement countryDropDownList;


    @FindBy(xpath = "(//span[contains(@class,'text-dark-blue ltr:ml-4')])[3]")
    private WebElement andoraCountry ;

    @FindBy(xpath="//*[@id=\"layout\"]/div[2]/main/section/div/div[2]/div[1]/section/div/div/div/div/div/span/form/div[4]/button[2]")
    WebElement saveButton;

    @FindBy(xpath="user-name")
    WebElement nameLabel;

    @FindBy(xpath="//*[@id=\"tickets-container\"]/div[3]/button")
    WebElement removeButton;


    @FindBy(xpath="//*[@id='layout']/div[2]/main/section/div/div[2]/div[1]/section/div/div/div/div/div[2]/div[2]/button")
    WebElement editProfileButton;


    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/section/div/div[2]/div[1]/section/div/div/div/div[2]/div/button[1]")
    WebElement createAccount;

    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/section/div/div[2]/div[1]/section/div/div/div/div[2]/div/button[2]")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"tickets-container\"]/div[1]/div/a")
    WebElement editTicketInfo;
    @FindBy(xpath = "(//button[@class='gs-base-button-default-styles w-fit'])[2]")
    private WebElement continueToPayment ;



    @FindBy(xpath= "//*[@id=\"layout\"]/div[2]/main/div[2]/div/div/div[1]/div[1]/button")
    WebElement continueShippingButton;



    public PersonalDetailsPage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }
    public WebElement getPersonalDetailsHeader() {
        return personalDetailsHeader;
    }

    public void setPersonalDetailsHeader (WebElement personalDetailsHeader) {
        this.personalDetailsHeader = personalDetailsHeader;}



    public void clickingMissRadioButton() {
        missRadioButton.click();
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

    public WebElement getMobileNum() {
        return mobileNumber;
    }

    public void setMobileNum (WebElement mobileNumber) {
        this.mobileNumber = mobileNumber;}

    public WebElement getEmail() {
        return email;
    }

    public void setEmail (WebElement email) {
        this.email = email;}


    public WebElement getBookingInformation() {
        return bookingInformationCheckbox;
    }

    public void setBookingInformation (WebElement bookingInformationCheckbox) {
        this.bookingInformationCheckbox = bookingInformationCheckbox;}

    public WebElement getTermsConditonsCheckbox() {
        return termsConditonsCheckbox;
    }

    public void setTermsConditonsCheckbox (WebElement termsConditonsCheckbox) {
        this.termsConditonsCheckbox = termsConditonsCheckbox;}

    public WebElement getCountryDropDownList() {
        return countryDropDownList;
    }

    public void setCountryDropDownList (WebElement countryDropDownList) {
        this.countryDropDownList = countryDropDownList;}

    public WebElement getAndoraCountry() {
        return andoraCountry;
    }

    public void setAndoraCountry (WebElement andoraCountry) {
        this.andoraCountry = andoraCountry;}



    public WebElement getEditProfileButton () {
        return editProfileButton;
    }

    public void setEditProfileButton(WebElement editProfileButton) {
        this.editProfileButton = editProfileButton;
    }

    public WebElement getSaveButton () {
        return saveButton;
    }

    public void setSaveButton(WebElement saveButton) {
        this.saveButton = saveButton;
    }





    public WebElement getContinueToPayment () {
        return continueToPayment;
    }

    public WebElement getMissRadioButton () {
        return missRadioButton;
    }

    public void setContinueToPayment (WebElement continueToPayment) {
        this.continueToPayment = continueToPayment;
    }



    public WebElement getCreateAccount () {
        return createAccount;
    }

    public void setCreateAccount (WebElement createAccount) {
        this.createAccount = createAccount;
    }


    public WebElement getNameLabel () {
        return nameLabel;
    }
}
