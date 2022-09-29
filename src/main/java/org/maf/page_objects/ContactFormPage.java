package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import static org.maf.core.instance.SelInstance.objXMLReader;

public class ContactFormPage {
    WebDriver driver;



    @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    WebElement email;

    @FindBy(id = "MazPhoneNumberInput-9_phone_number")
    WebElement phoneNumber;


    @FindBy(xpath = "//div[@class='select-country-container']")
    WebElement phoneCountryButton;


    @FindBy(xpath = "//div[@class = 'country-selector__list__item__flag-container']")
    List<WebElement> phoneCountryDropDownList;

    @FindBy(xpath = "//select[@name='reasonforcontact']")
    WebElement reasonOfContactDropDownList;

    @FindBy(xpath = "//textarea[@placeholder='Add your message*']")
    WebElement  addYourMessage;

    @FindBy(name = "SUBMIT")
    public WebElement  submitButton;

    @FindBy(xpath = "//label[@id='recaptcha-anchor-label']")
    WebElement  reCaptchaForm;

    @FindBy(xpath = "//*[@id=\"mf-feedback-form\"]/section/div/div/div/form/div/div[1]/div/div/div/iframe")
    WebElement  iframe;

    @FindBy(xpath ="//a[contains(@name,'Back to Home Page')]" )
     public WebElement  homeButton;

    @FindBy(xpath = "//a[@title='Contact Form']")
    public WebElement contactFormLink;


    public ContactFormPage(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }


    public void fillFirstNameField(String fName) {
        firstName.sendKeys(fName);

    }



    public void clickOnRecaptcha() {

        driver.switchTo().frame(iframe);
        reCaptchaForm.click();
        driver.switchTo().defaultContent();

    }

    public void fillLastNameField(String lName) {

        lastName.sendKeys(lName);

    }

    public void fillEmail(String userEmail) {
        email.sendKeys(userEmail);

    }

    public void fillPhoneNumber() {
        phoneCountryButton.click();
        phoneCountryDropDownList.get(228).click();
        phoneNumber.sendKeys(objXMLReader.getXMLData ("phoneNumber"));

    }

    public void fillReasonOfContact()
    {
        reasonOfContactDropDownList.sendKeys(objXMLReader.getXMLData ("Other"));
    }

    public void AddYourMessage(String message)
    {
        addYourMessage.sendKeys(message);
    }

    public void clickOnSubmitButton()
    {
        submitButton.click();

    }

    public void clickOnPageFromThrFooter(WebElement element)
    {
        element.click();
    }
}


