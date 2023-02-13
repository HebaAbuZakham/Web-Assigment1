package org.maf.page_objects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class ProfilePage {
    @FindBy(xpath = "(//a[@href='/en-ae/ski-dubai/accounts/profile/personal-details'])[2]")
    private WebElement yourDetails;
    @FindBy(xpath = "//h1[text()[normalize-space()='YOUR DETAILS']]")
    private WebElement yourDetailsLabel;
    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/div/main/section/div/div[1]/div/div/div/div[2]/div[1]/div[2]")
    private WebElement firstNameValue;
    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/div/main/section/div/div[1]/div/div/div/div[2]/div[2]/div[2]")
    private WebElement lastNameValue;
    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/div/main/section/div/div[1]/div/div/div/div[2]/div[3]/div[2]")
    private WebElement dateOfBirthValue;
    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/div/main/section/div/div[1]/div/div/div/div[2]/div[4]/div[2]")
    private WebElement emailValue;

    public WebElement getYourDetails() {
        return yourDetails;
    }

    public WebElement getYourDetailsLabel() {
        return yourDetailsLabel;
    }

    public WebElement getFirstNameValue() {
        return firstNameValue;
    }

    public WebElement getLastNameValue() {
        return lastNameValue;
    }

    public WebElement getDateOfBirthValue() {
        return dateOfBirthValue;
    }

    public WebElement getEmailValue() {
        return emailValue;
    }

    public WebElement getPhoneNumberValue() {
        return phoneNumberValue;
    }

    public WebElement getNationalityValue() {
        return nationalityValue;
    }

    public WebElement getCountryOfResidenceValue() {
        return countryOfResidenceValue;
    }

    public WebElement getPasswordValue() {
        return passwordValue;
    }

    public WebElement getChangeDetailsButton() {
        return changeDetailsButton;
    }

    public WebElement getResetPasswordButton() {
        return resetPasswordButton;
    }

    public WebElement getResetPasswordSuccessPopUp() {
        return resetPasswordSuccessPopUp;
    }

    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/div/main/section/div/div[1]/div/div/div/div[2]/div[5]/div[2]")
    private WebElement phoneNumberValue;
    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/div/main/section/div/div[1]/div/div/div/div[2]/div[6]/div[2]")
    private WebElement nationalityValue;
    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/div/main/section/div/div[1]/div/div/div/div[2]/div[7]/div[2]")
    private WebElement countryOfResidenceValue;
    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/div/main/section/div/div[1]/div/div/div/div[2]/div[8]/div[2]")
    private WebElement passwordValue;
    @FindBy(xpath = "//button[contains(text(),'Change')]")
    private WebElement changeDetailsButton;
    @FindBy(xpath = "//button[contains(text(),'Reset password')]")
    private WebElement resetPasswordButton;
    @FindBy(xpath = "//p[text()='Password reset code sent!']")
    private WebElement resetPasswordSuccessPopUp;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
