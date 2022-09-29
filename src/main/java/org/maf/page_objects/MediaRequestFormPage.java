package org.maf.page_objects;

import org.maf.utils.common.SharedMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

import static org.maf.core.instance.SelInstance.getDriver;

public class MediaRequestFormPage {
    WebDriver driver;
    SharedMethods ObjSharedMethods=new SharedMethods(getDriver());

    @FindBy(xpath = "//input[@name='organisation_channel_name']")
    WebElement organisationChannelName;

    @FindBy(xpath = "//input[@name='show_program_name']")
    WebElement showProgramName;

    @FindBy(xpath = "//input[@name='applicant_name']")
    WebElement applicantName;

    @FindBy(xpath = "//input[@name='filming_topic']")
    WebElement filmingTopic;

    @FindBy(xpath = "//select[@name='coverage_type']")
    WebElement coverageTypeDropDownList;

    @FindBy(xpath = "//input[@name='no_of_crew_members']")
    WebElement noOfCrewMembers;

    @FindBy(xpath ="//textarea[@placeholder='Please give brief details about the purpose of your project.']")
    WebElement textArea;

    @FindBy(xpath ="//div[contains(@class,'grid lg:grid-cols-3 grid-cols-1 gap-x-4 gap-y-8')]//div[1]//label[1]//span[1]")
    WebElement checkBox;

    @FindBy(xpath ="//input[@placeholder='Start Date']")
    WebElement startDate;

    @FindBy(xpath ="//select[contains(@name,'start_time')]")
    WebElement startTime;

    @FindBy(xpath ="//select[@name='end_time']")
    WebElement endTime;

    @FindBy(xpath = "//span[@class='vfc-span-day vfc-hover']")
    List<WebElement> calender;

    @FindBy(xpath = "//iframe[@title='reCAPTCHA']")
    WebElement iframe;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    WebElement reCaptchaForm;

    @FindBy(xpath = "//div[contains(@class,'mt-14 mb-9 flex flex-col items-center')]//span[contains(@class,'checkmark')]")
    WebElement submitCheckBox;

    @FindBy(css = "button[name='SUBMIT']")
    public WebElement submitButton;

    @FindBy(xpath = "//a[contains(text(),'Contact Us')]")
    WebElement contactUS;

    @FindBy(xpath = "//a[@title='Photography &amp; film requests form link']")
    public WebElement photography;



    public MediaRequestFormPage(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }

    public void clickOnContactUS()
    {
        contactUS.click();
    }

    public void fillTheOrganisationChannelName(String organisationName)
    {
        organisationChannelName.sendKeys(organisationName);
    }

    public void fillTheShowProgramName(String showName)
    {
        showProgramName.sendKeys(showName);
    }
    public void fillTheApplicationName(String application)
    {
        applicantName.sendKeys(application);
    }
    public void fillTheFilmingTopic(String filming)
    {
        filmingTopic.sendKeys(filming);
    }

    public void chooseTheCoverageType(String coverageType)
    {
        coverageTypeDropDownList.sendKeys(coverageType);

    }
    public void fillNoOfCrewMembers(String no)
    {
        noOfCrewMembers.sendKeys(no);

    }

    public void fillTextArea(String text)
    {
        textArea.sendKeys(text);

    }

    public void checkTheCheckBox()
    {
        checkBox.click();
    }

    public void setStartDate()
    {
        startDate.click();
        calender.get(ObjSharedMethods.getCurrentDay()+1).click();
        calender.get(ObjSharedMethods.getCurrentDay()+1).click();
    }

    public void setStartTime()
    {
        startTime.sendKeys("02:00");
    }

    public void setEndTime()
    {
        endTime.sendKeys("02:00");
    }
    public void clickOnRecaptcha() {

        driver.switchTo().frame(iframe);
        reCaptchaForm.click();
        driver.switchTo().defaultContent();

    }
    public void clickOnSubmitCheckBox() {

     submitCheckBox.click();

    }

    public void clickOnSubmitButton()
    {
        WebDriverWait wait = new WebDriverWait(driver, 70);

       wait.until(ExpectedConditions.elementToBeClickable(submitButton));

        submitButton.click();
    }

}
