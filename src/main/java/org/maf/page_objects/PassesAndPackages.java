package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassesAndPackages {

//    Slope tab

    @FindBy(xpath = "//h2[text()[normalize-space()='Slope Passes & Pacakges']]")

    private WebElement slopePassesHeader;

    @FindBy (css = "div#layout>div:nth-of-type(2)>main>div>div>section>div:nth-of-type(2)>div>div>div:nth-of-type(2)>div>div:nth-of-type(3)>div:nth-of-type(2)>button")
    private WebElement fullDaySlopePassBuyButton;


    //    Snow park tab
    @FindBy(xpath = "//h2[text()[contains(normalize-space(),'Snow Park')]]")
    private WebElement SnowParkPassesHeader;

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div[@id='layout']/div[2]/main[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]")
    private WebElement SnowParkPassBuyButton;

    //    Snow cinema tab
    @FindBy(xpath = "//h2[text()[normalize-space()='Snow Cinema Passes']]")
    private WebElement SnowCinemaPassesHeader;

   @FindBy(xpath = "//a[@class='passes-btn']")
    private WebElement snowCinemaPassBuyButton;

   // Penguin Encounter tab
   @FindBy(xpath = "//h2[text()[contains(normalize-space(),'Penguin passes')]]")
   private WebElement penguinEncounterPassesHeader;

   @FindBy (xpath = "//button[ancestor::div[@class=\"passes-card-content\"]//div[text()=\"Penguin Encounter Pass\"]]")
   private WebElement penguinEncounterPassBuyButton;

    @FindBy(xpath = "(//button[@class='passes-btn'])[2]")
    private WebElement BreakfastWithPenguinPassBuyButton;

    @FindBy(xpath = "//button[ancestor::div[@class=\"passes-card-content\"]//div[text()=\"Snow Premium\"]]")
    private WebElement  SnowPremiumPassBuyButton;

    @FindBy(xpath = "//button[ancestor::div[@class=\"package-card\"]//p[contains(text(),\"Snow Premium\")]]")
    private WebElement  SnowPremiumPackageBuyButton;

    @FindBy(xpath = "//button[ancestor::div[@class=\"package-card\"]//p[contains(text(),\"Snow Daycation\")]]")
    private WebElement  SnowDaycationPackageBuyButton;

    @FindBy(xpath = "//button[ancestor::div[@class=\"passes-card-content\"]//div[text()=\"Snow Daycation Package\"]]")
    private WebElement  SnowDaycationPassBuyButton;

    // Header tabs locators
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

    public WebElement getBreakfastWithPenguinPassBuyButton() {
        return BreakfastWithPenguinPassBuyButton;
    }

    public void setBreakfastWithPenguinPassBuyButton(WebElement breakfastWithPenguinPassBuyButton) {
        BreakfastWithPenguinPassBuyButton = breakfastWithPenguinPassBuyButton;
    }

    public WebElement getSnowPremiumPassBuyButton() {
        return SnowPremiumPassBuyButton;
    }

    public void setSnowPremiumPassBuyButton(WebElement snowPremiumPassBuyButton) {
        SnowPremiumPassBuyButton = snowPremiumPassBuyButton;
    }

    public WebElement getSnowDaycationPassBuyButton() {
        return SnowDaycationPassBuyButton;
    }

    public void setSnowDaycationPassBuyButton(WebElement snowDaycationPassBuyButton) {
        SnowDaycationPassBuyButton = snowDaycationPassBuyButton;
    }

    public WebElement getSnowPremiumPackageBuyButton() {
        return SnowPremiumPackageBuyButton;
    }

    public void setSnowPremiumPackageBuyButton(WebElement snowPremiumPackageBuyButton) {
        SnowPremiumPackageBuyButton = snowPremiumPackageBuyButton;
    }

    public WebElement getSnowDaycationPackageBuyButton() {
        return SnowDaycationPackageBuyButton;
    }

    public void setSnowDaycationPackageBuyButton(WebElement snowDaycationPackageBuyButton) {
        SnowDaycationPackageBuyButton = snowDaycationPackageBuyButton;
    }
}
