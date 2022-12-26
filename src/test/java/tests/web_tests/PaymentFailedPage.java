package tests.web_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentFailedPage {
    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/section/div/div/div[1]/div/button")
    private WebElement backToPaymentButton;

    public PaymentFailedPage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public WebElement getBackToPaymentButton() {
        return backToPaymentButton;
    }
    public void setBackToPaymentButton (WebElement backToPaymentButton) {
        this.backToPaymentButton = backToPaymentButton;
    }
}
