package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {

    @FindBy(xpath = "//span[text()='Sign Up']")
    private WebElement signupButton;
    @FindBy(xpath = "//span[contains(@class,'radiobtn-lable w-5')]")
    private WebElement radiobutton;

    @FindBy(id = "first name")
    private WebElement firstname;


    @FindBy(id = "last name")
    private WebElement lastname;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "phone number")
    private WebElement phoneNumber;

    @FindBy(xpath = "(//div[contains(@class,'absolute top-0')]/following-sibling::div)[3]")
    private WebElement date;

    @FindBy(xpath = "//h3[text()[normalize-space()='2023']]")
    private WebElement selectYear;
    @FindBy(xpath = "//div[@id='1995-calendar-year']")
    private WebElement year;

    @FindBy(xpath = "//button[@class='text-primary']/following-sibling::button[1]")
    private WebElement okButton;

    @FindBy(id = "submit-button")
    private WebElement okEmailPopUpButton;

    @FindBy(xpath = "//div[@id='app']/div[1]/div[1]/main[1]/div[1]/span[1]/form[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]")
    private WebElement nationality;

    @FindBy(xpath = "//span[text()='Algeria']")
    private WebElement dropdownNationality;

    @FindBy(xpath = "//div[@id='app']/div[1]/div[1]/main[1]/div[1]/span[1]/form[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]")
    private WebElement countryOfResidence;

    @FindBy(xpath = "//span[text()='United Arab Emirates']")
    private WebElement dropdownCountry;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "submit-button")
    private WebElement submit;

    public WebElement getSignUpButtton () {
        return signupButton;
    }

    public void setSignupButton (WebElement signupButton) {
        this.signupButton = signupButton;
    }

    public WebElement getRadiobutton () {
        return radiobutton;
    }

    public void setRadiobutton (WebElement radiobutton) {
        this.radiobutton = radiobutton;
    }

    public WebElement getFirstname () {
        return firstname;
    }

    public void setFirstname (WebElement firstname) {
        this.firstname = firstname;
    }

    public WebElement getLastname () {
        return lastname;
    }

    public void setLastname (WebElement lastname) {
        this.lastname = lastname;
    }

    public WebElement getEmail () {
        return email;
    }

    public void setEmail (WebElement email) {
        this.email = email;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber (WebElement phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public WebElement getDate() {
        return date;
    }

    public void setDate (WebElement date) {
        this.date = date;
    }
    public WebElement getSelectYear() {
        return selectYear;
    }

    public void setSelectYear (WebElement selectYear) {
        this.selectYear = selectYear;
    }

    public WebElement getYear() {
        return year;
    }

    public void setYear (WebElement year) {
        this.year = year;
    }

    public WebElement getOkButton() {
        return okButton;
    }

    public void setOkButton (WebElement okButton) {
        this.okButton = okButton;
    }

    public WebElement getNationality() {
        return nationality;
    }

    public void setNationality (WebElement nationality) {
        this.nationality = nationality;
    }

    public WebElement getDropdownNationality() {
        return dropdownNationality;
    }

    public void setDropdownNationality (WebElement dropdownNationality) {
        this.dropdownNationality = dropdownNationality;
    }

    public WebElement getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence (WebElement countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public WebElement getDropdownCountry() {
        return dropdownCountry;
    }

    public void setDropdownCountry (WebElement dropdownCountry) {
        this.dropdownCountry = dropdownCountry;
    }

    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public void setSubmit (WebElement submit) {
        this.submit = submit;
    }
    public SignUp (WebDriver driver) {

        PageFactory.initElements (driver, this);
    }

    public WebElement getOkEmailPopUpButton() {
        return okEmailPopUpButton;
    }

    public void setOkEmailPopUpButton(WebElement okEmailPopUpButton) {
        this.okEmailPopUpButton = okEmailPopUpButton;
    }
}
