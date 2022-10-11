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
public class PassesAndPackages {

    @FindBy(xpath = "//p[text()[normalize-space()='Slope Passes']]")
    private WebElement slopePassesHeader;

    @FindBy (xpath = "//button[text()[normalize-space()='Buy tickets']]")
    private WebElement fullDaySlopePassBuyButton;

    @FindBy(css = ".tabs-list > li:nth-of-type(1)")
    @CacheLookup
    private WebElement slopeTab;

    @FindBy(css = ".tabs-list > li:nth-of-type(2)")
    @CacheLookup
    private WebElement snowParkTab;

    @FindBy(css = ".tabs-list > li:nth-of-type(3)")
    @CacheLookup
    private WebElement penguinEncounterTab;

    @FindBy(css = ".tabs-list > li:nth-of-type(4)")
    @CacheLookup
    private WebElement snowCinemaTab;


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
