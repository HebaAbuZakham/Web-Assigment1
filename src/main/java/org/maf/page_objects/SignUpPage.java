package org.maf.page_objects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUpPage {
    @FindBy(xpath = "//label[@for='titles3']")
    private WebElement missTitle;
    @FindBy(id  ="first name")
    private WebElement firstName;
    @FindBy(id  ="last name")
    private WebElement lastName;
    @FindBy(id ="email")
    private WebElement email;
    @FindBy(id ="phone number")
    private WebElement phoneNumber;
    @FindBy(xpath = "//div[@label=\"Date of Birth\"]")
    private WebElement calenderList;
    @FindBy(xpath = "//h3[text()[normalize-space()='2023']]")
    private WebElement year;
    @FindBy(id = "1997-calendar-year")
    private WebElement yearOfBirth;
    @FindBy (xpath = "//*[@id=\"app\"]/div/div/main/div/span/form/div[5]/div[1]/div/div/div[2]/div/div[2]/div/div[2]/button[5]")
    private WebElement monthOfBirth;
    @FindBy(xpath = "//td[text()[normalize-space()='6']]")
    private WebElement dateOfBirth;
    @FindBy(xpath = "//button[contains(text(),'Ok')]")
    private WebElement calenderOkButton;
    @FindBy(xpath = "//div[@label=\"Nationality\"]")
    private WebElement nationality;
    @FindBy(xpath = "//span[contains(text(),'United Arab Emirates')]")
    private WebElement nationalityUAE;
    @FindBy(xpath = "//div[@label=\"Country of Residence\"]")
    private WebElement countryOfResidence;
    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    private WebElement searchCountryOfResidence;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/span[1]/form[1]/div[5]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/img[1]")
    private WebElement searchedCountryOfResidence;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(xpath = "//button[@id='submit-button']")
    private WebElement createAccountButton;

    public WebElement getMissTitle() {
        return missTitle;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getCalenderList() {
        return calenderList;
    }

    public WebElement getYear() {
        return year;
    }

    public WebElement getYearOfBirth() {
        return yearOfBirth;
    }

    public WebElement getMonthOfBirth() {
        return monthOfBirth;
    }

    public WebElement getDateOfBirth() {
        return dateOfBirth;
    }

    public WebElement getCalenderOkButton() {
        return calenderOkButton;
    }

    public WebElement getNationality() {
        return nationality;
    }

    public WebElement getNationalityUAE() {
        return nationalityUAE;
    }

    public WebElement getCountryOfResidence() {
        return countryOfResidence;
    }

    public WebElement getSearchCountryOfResidence() {
        return searchCountryOfResidence;
    }

    public WebElement getSearchedCountryOfResidence() {
        return searchedCountryOfResidence;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getCreateAccountButton() {
        return createAccountButton;
    }

    public WebElement getSkiDubaiLogo() {
        return skiDubaiLogo;
    }

    public WebElement getConfirmEmailButton() {
        return confirmEmailButton;
    }

    @FindBy(xpath = "//header/nav[1]/div[1]/a[1]/img[1]")
    private WebElement skiDubaiLogo;
    @FindBy(xpath = "(//button[@id='submit-button'])[2]")
    private WebElement confirmEmailButton;
    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
