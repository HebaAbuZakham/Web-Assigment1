package org.maf.page_objects;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
@Setter
public class AddOnsScreen extends BookingSharedComponent{

    @FindBy(xpath = "//h1[text()[normalize-space()='add-ons']]")
    private WebElement addOnsLabel;
    //@FindBy(xpath = "//button[contains(@class,'counter-buttons plus-button')]")
    @FindBy(xpath = "//div[contains(@class,'relative counter-number')]/following-sibling::button")
    private WebElement addMainAddOnsButton;

    @FindBy(xpath = "//div[@class=\"addOnsItem\"]//p[contains(text(),\"Slope adult supervision ticket\")]")
    private WebElement supervisionAddOnsTicket;

    @FindBy(xpath = "//span[text()=\"This ticket requires adult supervision.\"]")
    private WebElement needSupervisionTicketMsg;

    @FindBy(xpath = "//span[text()=\"This pass requires an adult ticket.\"]")
    private WebElement needAdultTicketMsg;

    @FindBy(xpath = "//button[text()[normalize-space()='Continue']]")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@class='mx-calendar mx-calendar-panel-date']")
    private WebElement calenderFrame;

    @FindBy(xpath = "//button[@aria-label=\"plus\"][ancestor::div[@class=\"addOnsItemContainer\"]//p[contains(text(),\"Slope adult supervision ticket\")]]")
    private WebElement supervisionTicketPlusButton;

    @FindBy(xpath = "//button[@aria-label=\"plus\"][ancestor::div[@class=\"addOnsItemContainer\"]//p[contains(text(),\"Mobile Lanyard\")]]")
    private WebElement mobileLanyardTicketPlusButton;

    @FindBy(xpath = "//*[@class=\"AddOnsSideContainer\"]//p[contains(text(),\"Slope adult supervision ticket\")]")
    private WebElement addedSupervisionToBookingCard;

    @FindBy(css = "div#tickets-container button[type=\"button\"].counter-buttons.minus-button.active-button")
    @CacheLookup
    private WebElement removeIcon;

    @FindBy(css = "div#tickets-container ul#booking-bar-guest-ddl > .lg\\:py-4.opacity-0.py-\\[2\\.563rem\\] > .ticket-count-container > .flex.flex-row.lg\\:ltr\\:mr-0.lg\\:rtl\\:ml-0.ltr\\:mr-\\[-3px\\].rtl\\:ml-\\[-3px\\].ticket-counter-container > .counter-buttons.plus-button")
    @CacheLookup
    private WebElement AddJunior;

    @FindBy(css = "div#tickets-container ul#booking-bar-guest-ddl > li:nth-of-type(3)  .flex.flex-row.lg\\:ltr\\:mr-0.lg\\:rtl\\:ml-0.ltr\\:mr-\\[-3px\\].rtl\\:ml-\\[-3px\\].ticket-counter-container > .counter-buttons.plus-button")
    @CacheLookup
    private WebElement AddChild;

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

    public WebElement getNeedAdultTicketMsg() {
        return needAdultTicketMsg;
    }

    public void setNeedAdultTicketMsg(WebElement needAdultTicketMsg) {
        this.needAdultTicketMsg = needAdultTicketMsg;
    }

    public WebElement getSupervisionTicketPlusButton() {
        return supervisionTicketPlusButton;
    }

    public void setSupervisionTicketPlusButton(WebElement supervisionTicketPlusButton) {
        this.supervisionTicketPlusButton = supervisionTicketPlusButton;
    }

    public WebElement getAddedSupervisionToBookingCard() {
        return addedSupervisionToBookingCard;
    }

    public void setAddedSupervisionToBookingCard(WebElement addedSupervisionToBookingCard) {
        this.addedSupervisionToBookingCard = addedSupervisionToBookingCard;
    }

    public WebElement getMobileLanyardTicketPlusButton() {
        return mobileLanyardTicketPlusButton;
    }

    public void setMobileLanyardTicketPlusButton(WebElement mobileLanyardTicketPlusButton) {
        this.mobileLanyardTicketPlusButton = mobileLanyardTicketPlusButton;
    }

}
