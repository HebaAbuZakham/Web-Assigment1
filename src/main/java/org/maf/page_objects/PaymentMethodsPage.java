package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PaymentMethodsPage {

    @FindBy(xpath = "//h1[@class='title']")
    private WebElement paymentPageTitle;

    @FindBy(xpath = "//button[@class='btn-add-card']//span[1]")
    private WebElement addCardButton;

    @FindBy(xpath = "//button[@class='btn-close']")
    private WebElement deleteCardButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/button[2]")
    private WebElement deleteConfirmationButton;

    @FindBy(xpath = "//span[contains(text(),'Add a credit or debit card')]")
    private WebElement addCardRadio;

    @FindBy(xpath = "//input[@id='cardNumber']")
    private WebElement cardNumberField;

    @FindBy(xpath = "//input[@id='cardExpiry']")
    private WebElement cardExpiryField;

    @FindBy(xpath = "//input[@id='cardCvc']")
    private WebElement cardCvcField;

    @FindBy(className = "card-submit")
    private WebElement saveButton;

    @FindBy(className = "card-masked-number")
    private WebElement cardInfo;

    @FindBy(xpath = "//*[@id=\"simulatorFrame\"]")
    private WebElement threeDsFrame;

    @FindBy(xpath = "//button[contains(@class,'btn btn-primary')]")
    private WebElement submitButton;

    @FindBy(xpath = "//p[text()='Card authentication failed']")
    private WebElement authenticationMsg;

    @FindBy(xpath = "//div[text()[normalize-space()='Default payment']]")
    private WebElement defaultLabel;




    public PaymentMethodsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getPaymentPageTitle(){return paymentPageTitle;}

    public void setPaymentPageTitle(WebElement paymentPageTitle){this.paymentPageTitle=paymentPageTitle;}

    public WebElement getAddCardButton() { return addCardButton;}

    public void setAddCardButton(WebElement addCardButton){this.addCardButton= addCardButton; }

    public WebElement getDeleteCardButton(){return deleteCardButton;}

    public void setDeleteCardButton(WebElement deleteCardButton){this.deleteCardButton=deleteCardButton;}

    public WebElement getDeleteConfirmationButton(){return deleteConfirmationButton;}

    public WebElement getAddCardRadio(){return addCardRadio;}

    public WebElement getCardNumberField(){return cardNumberField;}

    public WebElement getCardExpiryField(){return cardExpiryField;}

    public WebElement getCardCvcField(){return cardCvcField;}

    public WebElement getSaveButton(){return saveButton;}

    public WebElement getCardInfo(){return cardInfo;}

    public WebElement getSubmitButton(){return submitButton;}

    public WebElement getAuthenticationMsg(){return authenticationMsg;}

    public WebElement getDefaultLabel(){return defaultLabel;}


    //public WebElement getThreeDsWindow(){return threeDsFrame;}

    public void clickSubmitButton(WebDriver driver){

        driver.switchTo().frame(threeDsFrame);
        submitButton.click();
        driver.switchTo().defaultContent();
    }

}
