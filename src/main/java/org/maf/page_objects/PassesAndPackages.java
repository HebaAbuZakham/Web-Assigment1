package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassesAndPackages {

//    Slope tab
    @FindBy(xpath = "//p[text()[normalize-space()='Slope Passes']]")
    private WebElement slopePassesHeader;

    @FindBy (xpath = "//button[text()[normalize-space()='Buy tickets']]")
    private WebElement fullDaySlopePassBuyButton;

//    Snow park tab
    @FindBy(xpath = "//p[text()[normalize-space()='Snow Park pass']]")
    private WebElement SnowParkPassesHeader;

    @FindBy(xpath = "//button[ancestor::div[@class=\"passes-card-content\"]//div[text()=\"Snow Park\"]]")
    private WebElement SnowParkPassBuyButton;

    //    Snow cinema tab
    @FindBy(xpath = "//p[text()[normalize-space()='SNOW CINEMA PASS']]")
    private WebElement SnowCinemaPassesHeader;

    @FindBy(xpath = "//a[contains(text(),\"Buy tickets\")][ancestor::div[@class=\"passes-card-content\"]//div[contains(text(),\"Snow Cinema\")]]")
    private WebElement snowCinemaPassBuyButton;


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

    public WebElement getSnowParkPassesHeader() {
        return SnowParkPassesHeader;
    }

    public void setSnowParkPassesHeader(WebElement snowParkPassesHeader) {
        this.SnowParkPassesHeader = snowParkPassesHeader;
    }

    public WebElement getSnowParkPassBuyButton() {
        return SnowParkPassBuyButton;
    }

    public void setSnowParkPassBuyButton(WebElement snowParkPassBuyButton) {
        this.SnowParkPassBuyButton = snowParkPassBuyButton;
    }

    public WebElement getSnowCinemaPassBuyButton() {
        return snowCinemaPassBuyButton;
    }

    public void setSnowCinemaPassBuyButton(WebElement snowCinemaPassBuyButton) {
        this.snowCinemaPassBuyButton = snowCinemaPassBuyButton;
    }

    public WebElement getSnowCinemaPassesHeader() {
        return SnowCinemaPassesHeader;
    }

    public void setSnowCinemaPassesHeader(WebElement snowCinemaPassesHeader) {
        this.SnowCinemaPassesHeader = snowCinemaPassesHeader;
    }
}
