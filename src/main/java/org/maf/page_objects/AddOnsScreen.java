package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddOnsScreen {


    @FindBy(xpath = "//h1[text()[normalize-space()='add-ons']]")
    private WebElement addOnsLabel;
    @FindBy(xpath = "//button[contains(@class,'counter-buttons plus-button')]")
    private WebElement addMainAddOnsButton;

    @FindBy (xpath = "//div[@class='field-row']//button")
    private WebElement calendarButton;

    @FindBy(className = "mx-icon-right")
    private WebElement nextMonthButton;

    @FindBy(xpath = "//div[text()='10']")
    private WebElement monthSelection;

    @FindBy(xpath = "//p[text()[normalize-space()='1 adult']]")
    private WebElement adultsDropDown;

    @FindBy(css = "ul#booking-bar-guest-ddl>li:nth-of-type(2)>div>div:nth-of-type(2)>button:nth-of-type(2)")
    private WebElement numberOfJuniors;

    @FindBy(xpath = "//*[@id=\"tickets-container\"]/div[2]/div[2]/button")
    private WebElement guestsDropDownList;

    @FindBy(css = "ul#booking-bar-guest-ddl>li:nth-of-type(1)>div>div:nth-of-type(2)>button:nth-of-type(1)")
    private WebElement removeAdultGuest;

    @FindBy(xpath = "//div[@class=\"addOnsItem\"]//p[contains(text(),\"Slope adult supervision ticket\")]")
    private WebElement supervisionAddOnsTicket;

    @FindBy(xpath = "//span[text()=\"This ticket requires adult supervision.\"]")
    private WebElement needSupervisionTicketMsg;

    @FindBy(xpath = "//button[@class='gs-base-button-default-styles w-fit']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@class='mx-calendar mx-calendar-panel-date']")
    private WebElement calenderFrame;


    public AddOnsScreen (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }


    public WebElement getCalenderFrame () {
        return calenderFrame;
    }

    public void setCalenderFrame (WebElement calenderFrame) {
        this.calenderFrame = calenderFrame;
    }

    public WebElement getContinueButton () {
        return continueButton;
    }

    public void setContinueButton (WebElement continueButton) {
        this.continueButton = continueButton;
    }

    public WebElement getCalendarButton () {
        return calendarButton;
    }

    public void setCalendarButton (WebElement calendarButton) {
        this.calendarButton = calendarButton;
    }

    public WebElement getNextMonthButton () {
        return nextMonthButton;
    }

    public void setNextMonthButton (WebElement nextMonthButton) {
        this.nextMonthButton = nextMonthButton;
    }

    public WebElement getMonthSelection () {
        return monthSelection;
    }

    public void setMonthSelection (WebElement monthSelection) {
        this.monthSelection = monthSelection;
    }

    public WebElement getAdultsDropDown () {
        return adultsDropDown;
    }

    public void setAdultsDropDown (WebElement adultsDropDown) {
        this.adultsDropDown = adultsDropDown;
    }

    public WebElement getNumberOfJuniors () {
        return numberOfJuniors;
    }

    public void setNumberOfJuniors (WebElement numberOfJuniors) {
        this.numberOfJuniors = numberOfJuniors;
    }

    public WebElement getGuestsDropDownList () {return guestsDropDownList;}

    public  void setGuestsDropDownList (WebElement guestsDropDownList){ this.guestsDropDownList = guestsDropDownList;}

    public WebElement getRemoveAdultGuest () {return removeAdultGuest;}

    public void setRemoveAdultGuest(WebElement removeAdultGuest) {
        this.removeAdultGuest = removeAdultGuest;
    }

    public WebElement getAddOnsLabel () {
        return addOnsLabel;
    }

    public WebElement getAddMainAddOnsButton () {
        return addMainAddOnsButton;
    }

    public void setAddMainAddOnsButton (WebElement addMainAddOnsButton) {
        this.addMainAddOnsButton = addMainAddOnsButton;
    }

    public void setAddOnsLabel (WebElement addOnsLabel) {
        this.addOnsLabel = addOnsLabel;
    }


    public WebElement getSupervisionAddOnsTicket() { return supervisionAddOnsTicket;}

    public void setSupervisionAddOnsTicket(WebElement supervisionAddOnsTicket) {
        this.supervisionAddOnsTicket = supervisionAddOnsTicket;
    }

    public WebElement getNeedSupervisionTicketMsg() {
        return needSupervisionTicketMsg;
    }

    public void setNeedSupervisionTicketMsg(WebElement needSupervisionTicketMsg) {
        this.needSupervisionTicketMsg = needSupervisionTicketMsg;
    }
}
