package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetailsPage {



    @FindBy(xpath = "//button[@class='uppercase text-light-yellow']")
    private WebElement paymentHead;

    @FindBy(id = "cardNumber")
    private WebElement cardNumberField;

    @FindBy(id = "cardExpiry")
    private WebElement cardExpiry;

    @FindBy(id = "cardCvc")
    private WebElement cardCSV;

    @FindBy(xpath = "//*[@id=\"promoCode\"]/div[1]/span")
    private WebElement promoCodeRadio;


    @FindBy(xpath = "//*[@id=\"promoCode\"]/div[2]/div[2]/div[1]/form/input")
    private WebElement promoCodeField;

    @FindBy(xpath = "//button[text()[normalize-space()='Redeem']]\n")
    private WebElement redeemButton;

    @FindBy(xpath = "//input[@placeholder='AED amount']")
    private WebElement redeemAmount;

    @FindBy(xpath = "//input[@name='useAllMySharePoints']/following-sibling::span[1]")
    private WebElement useAllMyShareToggle;

    @FindBy(xpath = "//button[text()[normalize-space()='Apply']]\n")
    private WebElement applyRedeemPoints;

    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/div[2]/div/div/div[1]/div[2]/button")
    private WebElement pay;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitSecurePopUp;

    @FindBy(xpath = "//*[contains(text(),\"promo code\")]")
    private WebElement promoCodeLabel;

    @FindBy(name = "couponCode")
    private WebElement couponCodeInput;

    @FindBy(xpath = "//*[@id=\"promoCode\"]//form/button")
    private WebElement applyPromoCode;

    @FindBy(id = "cardNumber")
    private WebElement ccField;

    @FindBy(id="save-details-for-future-purchases")
    private WebElement saveCCDetailsCheckbox;

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

    public WebElement  getPromoCodeRadio ()
    {
        return promoCodeRadio;
    }

    public void setPromoCodeRadio (WebElement promoCodeRadio) {
        this.promoCodeRadio = promoCodeRadio;
    }

    public WebElement getPromoCodeField ()
    {
        return promoCodeField;
    }

    public void setPromoCodeField (WebElement promoCodeField) {
        this.promoCodeField = promoCodeField;
    }

    public WebElement getApplyPromoCode ()
    {
        return applyPromoCode;
    }

    public void setApplyPromoCode (WebElement applyPromoCode) {
        this.applyPromoCode = applyPromoCode;
    }

    public WebElement getRedeemButton ()
    {
        return redeemButton;
    }

    public void setRedeemButton (WebElement redeemButton) {
        this.redeemButton = redeemButton;
    }

    public WebElement getRedeemAmount ()
    {
        return redeemAmount;
    }

    public void setRedeemAmount (WebElement redeemAmount) {
        this.redeemAmount = redeemAmount;
    }

    public WebElement getApplyRedeemPoints ()
    {
        return applyRedeemPoints;
    }

    public void setApplyRedeemPoints (WebElement applyRedeemPoints) {
        this.applyRedeemPoints = applyRedeemPoints;
    }

    public WebElement getUseAllMyShareToggle() {
        return useAllMyShareToggle;
    }

    public void setUseAllMyShareToggle (WebElement useAllMyShareToggle) {
        this.useAllMyShareToggle = useAllMyShareToggle;
    }
    public WebElement getPay () {
        return pay;
    }

    public void setPay (WebElement pay) {
        this.pay = pay;
    }

    public WebElement getPromoCodeLabel() {
        return promoCodeLabel;
    }

    public void setPromoCodeLabel(WebElement promoCodeLabel) {
        this.promoCodeLabel = promoCodeLabel;
    }

    public WebElement getCouponCodeInput() {
        return couponCodeInput;
    }

    public void setCouponCodeInput(WebElement couponCodeInput) {
        this.couponCodeInput = couponCodeInput;
    }

    public WebElement getCcField() {
        return ccField;
    }

    public void setCcField(WebElement ccField) {
        this.ccField = ccField;
    }
    public WebElement getSaveCCDetailsCheckbox() {
        return saveCCDetailsCheckbox;
    }

    public void setSaveCCDetailsCheckbox(WebElement saveCCDetailsCheckbox) {
        this.saveCCDetailsCheckbox = saveCCDetailsCheckbox;
    }
}
