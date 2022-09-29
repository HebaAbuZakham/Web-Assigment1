package org.maf.page_objects;

import org.maf.core.instance.SelInstance;
import org.maf.utils.common.SharedMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

import static org.maf.core.instance.SelInstance.objXMLReader;


public class PersonalStylist {
    WebDriver driver;
    SharedMethods objSharedMethods;

    @FindBy(xpath = "//a[@title='Personal Stylist']")
    WebElement personalStylistLink;

    @FindBy(xpath = "//button[@name='Mall Services']")
    WebElement bookStylistButton;

    @FindBy(xpath = "(//img[contains(@alt,'event Image')])[1]")
    WebElement stylist;

    @FindBy(xpath = "//span[contains(.,'BOOK NOW')]")
    WebElement bookNowButton;

    @FindBy(xpath = "(//div[contains(.,'The Full Makeover')])[10]")
    WebElement BookPackage;

    @FindBy(xpath = "(//button[@name='CONTINUE WITH REQUEST'])[2]")
    WebElement continueWithRequest;

    @FindBy(xpath = "//span[@class='vfc-span-day vfc-hover']")
    WebElement calender;

    @FindBy(xpath = "//div[@class='mb-4 swiper-slide swiper-slide-active']")
    WebElement time;

    @FindBy(xpath = "//input[contains(@name,'firstname')]")
    WebElement firstName;

    @FindBy(xpath = "  //input[contains(@name,'lastname')]")
    WebElement lastName;

    @FindBy(xpath ="//select[@name='countrycode']")
    WebElement countryCode;
    @FindBy(xpath ="//option[@value='AE']")
    WebElement option;

    @FindBy(xpath = "//input[@placeholder='44 123 8979']")
    WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='email']")
    WebElement email;

    @FindBy(xpath = "//select[@name='gender']")
    WebElement gender;

    @FindBy(xpath = "//body/div/mf-booking-flow[@errormsg='The form contains invalid entries, please review and try again.']/section/div/div/div/div/div/div/form/fieldset/div/label/span[1]")
    WebElement chekBox;

    @FindBy(xpath = "//option[contains(@value,'A')]")
    List<WebElement> countryCodeDropDownList;


    @FindBy(xpath = "//select[@name='gender']")
    WebElement genderDropDownList;

    @FindBy(xpath = "//button[@name='BOOK MY SESSION']")
    WebElement bookMySessionButton;

    public PersonalStylist(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }

    public void navigateToPersonalStylistPage() {
        personalStylistLink.click();
    }

    public void clickOnBookStylistButton() {
        bookStylistButton.click();
    }

    public void clickOnStylist()
    {

        stylist.click();
    }
    public void clickOnBookNowButton()
    {
        bookNowButton.click();
    }

    public void clickOnPackage()
    {
        BookPackage.click();
    }
    public void clickOnContinueWithRequest()
    {
        continueWithRequest.click();
    }
    public void chooseTheDate()
    {
        calender.click();
    }
    public void chooseTheTime()
    {
        time.click();
    }

    //todo have blocker here can't choose the country code , will check this with FE team

    public void FillTheForm(){
        objSharedMethods=new SharedMethods(SelInstance.getDriver());
        firstName.sendKeys(objXMLReader.getXMLData ("firstName"));
        lastName.sendKeys(objXMLReader.getXMLData ("lastName"));

        phoneNumber.sendKeys(objXMLReader.getXMLData ("phone"));
        email.sendKeys(objXMLReader.getXMLData ("email"));
        gender.click();
        gender.sendKeys(objXMLReader.getXMLData ("gender"));
        countryCode.click();
        countryCode.sendKeys("971");
        countryCode.sendKeys(Keys.ARROW_DOWN);
        chekBox.click();
        objSharedMethods.changeAttire(bookMySessionButton);
        bookMySessionButton.click();

    }
}
