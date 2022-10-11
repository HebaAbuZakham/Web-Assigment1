package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SKiHomePage {

    @FindBy(xpath = "//button[text()='Accept']")
    private WebElement acceptCookiesButton;

    @FindBy (className = "//div[contains(@class,'gh-item flex')]")
    private WebElement locationsList;

    @FindBy (className = "//div[contains(@class,'gh-item flex')]")
    private WebElement dubaiLocation;


    @FindBy (className = "btn-sign-in")
    private WebElement signInButton;

    @FindBy(className = "user-avatar")
    private  WebElement userAvatar;

    @FindBy(xpath = "//a[@class='navbar-item navbar-item-common-styles']")
    private WebElement passesAndPackages;

    @FindBy(xpath = "//a[@href='/en/passes-packages/ski-snowboard']")
    private WebElement slopeOption;

    @FindBy(xpath = "//a[@href='/en/passes-packages/snowpark']")
    private WebElement snowParkOption;

    @FindBy(xpath = "//a[@href='/en/passes-packages/snowcinema']")
    private WebElement snowCinemaOption;

    @FindBy(xpath = "(//p[@class='name'])[3]")
    private WebElement penguinEncounterOption;

    public SKiHomePage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public WebElement getSlopeOption () {
        return slopeOption;
    }

    public void setSlopeOption (WebElement slopeOption) {
        this.slopeOption = slopeOption;
    }

    public WebElement getPassesAndPackages () {
        return passesAndPackages;
    }

    public void setPassesAndPackages (WebElement passesAndPackages) {
        this.passesAndPackages = passesAndPackages;
    }

    public void setUserAvatar (WebElement userAvatar) {
        this.userAvatar = userAvatar;
    }

    public WebElement getUserAvatar () {
        return userAvatar;
    }

    public WebElement getAcceptCookiesButton () {
        return acceptCookiesButton;
    }

    public void setAcceptCookiesButton (WebElement acceptCookiesButton) {
        this.acceptCookiesButton = acceptCookiesButton;
    }

    public WebElement getSignInButton () {
        return signInButton;
    }

    public void setSignInButton (WebElement signInButton) {
        this.signInButton = signInButton;
    }

    public WebElement getLocationsList(){ return locationsList; }

    public WebElement getDubaiLocation(){return dubaiLocation;}


    public WebElement getSnowParkOption() {
        return snowParkOption;
    }

    public void setSnowParkOption(WebElement snowParkOption) {
        this.snowParkOption = snowParkOption;
    }

    public WebElement getSnowCinemaOption() {
        return snowCinemaOption;
    }

    public void setSnowCinemaOption(WebElement snowCinemaOption) {
        this.snowCinemaOption = snowCinemaOption;
    }

    public WebElement getPenguinEncounterOption(){return penguinEncounterOption;}

    public void setPenguinEncounterOption(WebElement penguinEncounterOption){this.penguinEncounterOption= penguinEncounterOption;}
}
