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
public class ConfirmationPage {

    @FindBy(css = "div#layout div.general-info > h2")
    private WebElement bookingConfirmation;

    @FindBy(xpath = "//div[contains(@class,'ltr:font-inter-reguler rtl:font-noto-sans-arabic-reguler')]//div[1]")
    private WebElement bookingConfirmationNum;


    @FindBy(xpath = "//div[@class=\"collection-name add-on\" and contains(text(), \"supervision ticket\")]")
    private WebElement supervisionTicket;

    @FindBy(xpath = "//div[@class=\"cell activity w-1/2\"]")
    private WebElement firstActivityName;

    @FindBy(xpath = "//div[@class=\"cell w-1/2\"]")
    private WebElement firstActivityDate;

    @FindBy(xpath = "//*[@class=\"payment-details extra-detials\"][div[contains(text(), \"Payment method\")]]/div[@class=\"value\"]")
    private WebElement paymentMethod;

    @FindBy(xpath = "//div[@class=\"cell flex items-center w-1/5\"]")
    private WebElement firstTicketNumber;


    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/section/div/div[2]/div[2]/div/div/div[2]/ul/a[1]/div[2]")
    @CacheLookup
    private WebElement addGuestButton;

    @FindBy(css = "#submit-btn")
    @CacheLookup
    private WebElement addGearButton;


    @FindBy(xpath = "//div[@class=\"total-price-details\"]//div[@class=\"total-amount\"]")
    private WebElement totalPriceAmount;

    @FindBy(xpath = "//*[@class=\"payment-details extra-detials\"][div[contains(text(), \"promo\")]]/div[@class=\"value\"]")
    private WebElement usedPromoCode;

    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/section/div/div[2]/div[2]/div/div/div[2]/ul/a[1]")
    private WebElement assignGuestButton;

    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/section/div/div[2]/div[2]/div/div/div[2]/ul/a/div[2]/div/h3")
    @CacheLookup
    private WebElement nextStepTitle;

    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/section/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div")
    private WebElement bookingRef;

    @FindBy(xpath = "(//*[@class=\"cell activity w-1/2\"])[1]")
    private WebElement firstBookingPackageLine;

    @FindBy(xpath = "(//*[@class=\"cell activity w-1/2\"])[2]")
    private WebElement secondBookingPackageLine;

    public ConfirmationPage(WebDriver driver) {
        PageFactory.initElements (driver, this);
    }

    public WebElement getSupervisionTicket() {
        return supervisionTicket;
    }

    public void setSupervisionTicket(WebElement supervisionTicket) {
        this.supervisionTicket = supervisionTicket;
    }

    public WebElement getBookingConfirmation() {
        return bookingConfirmationNum;
    }

    public void setSecondBookingPackageLine(WebElement secondBookingPackageLine) {
        this.secondBookingPackageLine = secondBookingPackageLine;
    }

    public WebElement getSecondBookingPackageLine() {
        return secondBookingPackageLine;
    }

    public void setFirstBookingPackageLine(WebElement firstBookingPackageLine) {
        this.firstBookingPackageLine = firstBookingPackageLine;
    }

    public WebElement getFirstBookingPackageLine() {
        return firstBookingPackageLine;
    }

    public void setBookingConfirmation (WebElement bookingConfirmationNum) {
        this.bookingConfirmationNum = bookingConfirmationNum;
    }

    public WebElement getFirstActivityName() {
        return firstActivityName;
    }

    public void setFirstActivityName(WebElement firstActivityName) {
        this.firstActivityName = firstActivityName;
    }

    public WebElement getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(WebElement paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public WebElement getFirstActivityDate() {
        return firstActivityDate;
    }

    public void setFirstActivityDate(WebElement firstActivityDate) {
        this.firstActivityDate = firstActivityDate;
    }

    public WebElement getFirstTicketNumber() {
        return firstTicketNumber;
    }

    public void setFirstTicketNumber(WebElement firstTicketNumber) {
        this.firstTicketNumber = firstTicketNumber;
    }

    public WebElement getTotalPriceAmount() {
        return totalPriceAmount;
    }

    public void setTotalPriceAmount(WebElement totalPriceAmount) {
        this.totalPriceAmount = totalPriceAmount;
    }

    public WebElement getUsedPromoCode() {
        return usedPromoCode;
    }

    public void setUsedPromoCode(WebElement usedPromoCode) {
        this.usedPromoCode = usedPromoCode;
    }

    public WebElement getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef(WebElement bookingRef) {
        this.bookingRef = bookingRef;
    }


}
