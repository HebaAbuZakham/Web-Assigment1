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
    @FindBy(xpath = "//h2[contains(text(),\"Booking confirmed\")]")
    private WebElement bookingConfirmation;

    @FindBy(xpath = "//div[@class=\"collection-name add-on\" and contains(text(), \"supervision ticket\")]")
    private WebElement supervisionTicket;

    @FindBy(xpath = "//div[@class=\"cell activity w-1/2\"]")
    private WebElement firstActivityName;

    @FindBy(xpath = "//div[@class=\"cell w-1/2\"]")
    private WebElement firstActivityDate;

    @FindBy(xpath = "//div[@class=\"payment-details extra-detials\"][//div[contains(text(),\"Payment method\")]]/div[@class=\"value\"]")
    private WebElement paymentMethod;

    @FindBy(xpath = "//div[@class=\"cell flex items-center w-1/5\"]")
    private WebElement firstTicketNumber;

    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/section/div/div[2]/div[2]/div/div/div[2]/ul/a[1]/div[2]")
    @CacheLookup
    private WebElement addGuestButton;


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
        return bookingConfirmation;
    }

    public void setBookingConfirmation(WebElement bookingConfirmation) {
        this.bookingConfirmation = bookingConfirmation;
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
}
