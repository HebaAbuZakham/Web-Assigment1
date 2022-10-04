package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage {

    @FindBy(xpath = "//button[text()[normalize-space()='Continue to payment']]")
    private WebElement continueToPayment ;


    public PersonalDetailsPage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public WebElement getContinueToPayment () {
        return continueToPayment;
    }

    public void setContinueToPayment (WebElement continueToPayment) {
        this.continueToPayment = continueToPayment;
    }
}
