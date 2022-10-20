package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassesAndPackages {

//    Slope tab
    @FindBy(xpath = "//li[text()[normalize-space()='Slope']]")
    private WebElement slopePassesHeader;

    @FindBy (xpath = "//span[@class='passes-price']/following-sibling::button")
    private WebElement fullDaySlopePassBuyButton;

//    Snow park tab
    @FindBy(xpath = "//p[text()[normalize-space()='Snow Park']]")
    private WebElement SnowParkPassesHeader;

    @FindBy(xpath = "//button[ancestor::div[@class=\"passes-card-content\"]//div[text()=\"Snow Park\"]]")
    private WebElement SnowParkPassBuyButton;

    //    Snow cinema tab
    @FindBy(xpath = "//li[contains(text(),'Snow Cinema')]")
    private WebElement SnowCinemaPassesHeader;

   @FindBy(xpath = "//a[@class='passes-btn']")
    private WebElement snowCinemaPassBuyButton;

   // Penguin Encounter tab
   @FindBy(xpath = "//li[text()[normalize-space()='Penguin Encounter']]")
   private WebElement penguinEncounterPassesHeader;

   @FindBy (xpath = "//button[text()[normalize-space()='Buy tickets']]")
   private WebElement penguinEncounterPassBuyButton;

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


    public WebElement getSlopeTab () {
        return slopeTab;
    }

    public void setSlopeTab (WebElement slopeTab) {
        this.slopeTab = slopeTab;
    }

    public WebElement getSnowParkTab () {
        return snowParkTab;
    }

    public void setSnowParkTab (WebElement snowParkTab) {
        this.snowParkTab = snowParkTab;
    }

    public WebElement getPenguinEncounterTab () {
        return penguinEncounterTab;
    }

    public void setPenguinEncounterTab (WebElement penguinEncounterTab) {
        this.penguinEncounterTab = penguinEncounterTab;
    }

    public WebElement getSnowCinemaTab () {
        return snowCinemaTab;
    }

    public void setSnowCinemaTab (WebElement snowCinemaTab) {
        this.snowCinemaTab = snowCinemaTab;
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

    public WebElement getPenguinEncounterPassesHeader(){return penguinEncounterPassesHeader;}

    public void setPenguinEncounterPassesHeader (WebElement penguinEncounterPassesHeader){
        this.penguinEncounterPassesHeader = penguinEncounterPassesHeader;
    }

    public WebElement getPenguinEncounterPassBuyButton(){return penguinEncounterPassBuyButton;}

    public void setPenguinEncounterPassBuyButton(WebElement penguinEncounterPassBuyButton){
        this.penguinEncounterPassBuyButton= penguinEncounterPassBuyButton;
    }

}
