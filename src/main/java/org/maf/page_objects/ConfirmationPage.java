package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
    @FindBy(xpath = "//h2[contains(text(),\"Booking confirmed\")]")
    private WebElement bookingConfirmation;

    @FindBy(xpath = "//div[@class=\"collection-name add-on\" and contains(text(), \"supervision ticket\")]")
    private WebElement supervisionTicket;

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
}
