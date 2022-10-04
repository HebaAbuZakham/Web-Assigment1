package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassesAndPackages {

    @FindBy(xpath = "//p[text()[normalize-space()='Slope Passes']]")
    private WebElement slopePassesHeader;

    @FindBy (xpath = "//button[text()[normalize-space()='Buy tickets']]")
    private WebElement fullDaySlopePassBuyButton;


    public PassesAndPackages (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public WebElement getFullDaySlopePassBuyButton () {
        return fullDaySlopePassBuyButton;
    }

    public void setFullDaySlopePassBuyButton (WebElement fullDaySlopePassBuyButton) {
        this.fullDaySlopePassBuyButton = fullDaySlopePassBuyButton;
    }

    public WebElement getSlopePassesHeader () {
        return slopePassesHeader;
    }

    public void setSlopePassesHeader (WebElement slopePassesHeader) {
        this.slopePassesHeader = slopePassesHeader;
    }
}
