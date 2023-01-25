package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    @FindBy(xpath = "//button[@aria-label=\"add user\"]")
    private WebElement addIcon;

    @FindBy(xpath = "*[@id=\"layout\"]/div[2]/div/main/section/div/div[1]/div/div/ul")
    private WebElement usersList;


    @FindBy(xpath = "//span[contains(@class,'w-2 h-2')]")
    private WebElement titleMR;

    @FindBy(xpath = "(//span[contains(@class,'w-2 h-2')])[2]")
    private WebElement titleMRs;

    @FindBy(xpath = "(//span[contains(@class,'w-2 h-2')])[3]")
    private WebElement titleMissMs;

    @FindBy (id = "first name")
    private WebElement firstName;

    @FindBy (id = "last name")
    private WebElement lastName;

    @FindBy(xpath = "//label[@for='date']/following-sibling::div[1]")
    private WebElement birthDate;

    @FindBy(xpath = "(//span[@class='mx-calendar-header-label']//button)[2]")
    private WebElement year;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    private WebElement backIcon;

    @FindBy(xpath = "//td[@data-year='2010']")
    private WebElement desiredYear;

    @FindBy(xpath = "//div[text()='Oct']")
    private WebElement month;

    @FindBy(xpath = "//div[text()='14']")
    private WebElement day;


    @FindBy(xpath = "country-code-box")
    private WebElement countryCodeBox;

    @FindBy(id = "mobile number")
    private WebElement mobileNumber;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "(//div[contains(@class,'absolute left-0')])[2]")
    private WebElement countryOfResident;

    @FindBy(xpath = "//span[text()='United Arab Emirates']")
    private WebElement uae;

    @FindBy(xpath = "//label[@for='nationality']/following-sibling::div[1]")
    private WebElement nationality;

    @FindBy(xpath = "//button[text()[normalize-space()='Cancel']]")
    private WebElement cancelButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//h1[@class='title']")
    private WebElement pageTitle;

    @FindBy(xpath = "(//a[contains(@href,'/accounts/profile/set-your-gear')])[2]")
    private WebElement gearButton;

    @FindBy(xpath = "//div[text()[normalize-space()='CHOOSE YOUR GEAR']]")
    private WebElement gearPageTitle;

    @FindBy(xpath = "//button[text()[normalize-space()='Buy now']]")
    private WebElement buyMembershipButton;

    @FindBy(xpath = "//h3[text()[normalize-space()='Complete member details']]")
    private WebElement buyMembershipTitle;


    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getAddIcon(){return addIcon;}

    public WebElement getTitleMR(){return titleMR;}

    public WebElement getTitleMRs(){return titleMRs;}

    public WebElement getTitleMissMs(){return titleMissMs;}

    public WebElement getFirstName(){return firstName;}

    public WebElement getLastName(){return lastName;}

    public WebElement getBirthDate(){return birthDate;}

    public WebElement getCountryCodeBox(){return countryCodeBox;}

    public WebElement getMobileNumber(){return mobileNumber;}

    public WebElement getEmail(){return email;}

    public WebElement getCountryOfResident(){return countryOfResident;}

    public WebElement getNationality(){return nationality;}

    public WebElement getSubmitButton(){return submitButton;}

    public WebElement getCancelButton(){return cancelButton;}

    public WebElement getGearButton(){return gearButton;}

    public WebElement getYear(){return year;}

    public WebElement getBackIcon(){return backIcon;}

    public WebElement getDesiredYear(){return desiredYear;}

    public WebElement getMonth(){return month;}

    public WebElement getDay(){return day;}

    public WebElement getUae(){return uae;}

    public WebElement getPageTitle() { return pageTitle;}

    public WebElement getGearPageTitle(){return gearPageTitle;}

    public WebElement getBuyMembershipButton(){return buyMembershipButton;}

    public WebElement getBuyMembershipTitle(){return buyMembershipTitle;}
}
