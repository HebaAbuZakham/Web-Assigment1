package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetailsPage {



    @FindBy(id = "//h2[text()[normalize-space()='PAYMENT DETAILS']]\n")
    private WebElement paymentHead;

    @FindBy(id = "cardNumber")
    private WebElement cardNumberField;

    @FindBy(id = "cardExpiry")
    private WebElement cardExpiry;

    @FindBy(id = "cardCvc")
    private WebElement cardCSV;

    @FindBy(xpath = "//button[text()[normalize-space()='Pay']]")
    private WebElement pay;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitSecurePopUp;

    public PaymentDetailsPage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public WebElement getPaymentHead () {
        return paymentHead;
    }

    public void setPaymentHead (WebElement paymentHead) {
        this.paymentHead = paymentHead;
    }



    public WebElement getSubmitSecurePopUp () {
        return submitSecurePopUp;
    }

    public void setSubmitSecurePopUp (WebElement submitSecurePopUp) {
        this.submitSecurePopUp = submitSecurePopUp;
    }

    public WebElement getCardNumberField () {
        return cardNumberField;
    }

    public void setCardNumberField (WebElement cardNumberField) {
        this.cardNumberField = cardNumberField;
    }

    public WebElement getCardExpiry () {
        return cardExpiry;
    }

    public void setCardExpiry (WebElement cardExpiry) {
        this.cardExpiry = cardExpiry;
    }

    public WebElement getCardCSV () {
        return cardCSV;
    }

    public void setCardCSV (WebElement cardCSV) {
        this.cardCSV = cardCSV;
    }

    public WebElement getPay () {
        return pay;
    }

    public void setPay (WebElement pay) {
        this.pay = pay;
    }
}
