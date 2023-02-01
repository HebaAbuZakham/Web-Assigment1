package org.maf.page_objects;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class SKiHomePage {

    @FindBy(css = "#onetrust-accept-btn-handler")
    @CacheLookup
    private WebElement acceptCookiesButton;

    @FindBy (css = ".flex.gh-item.items-center.lg\\:cursor-pointer")
    @CacheLookup
    private WebElement locationsListLink;

    @FindBy (css = "#onetrust-close-btn-container")
    @CacheLookup
    private WebElement closeCookiesBanner;

    @FindBy (css = " div.env-list-box-wrapper > div ")
    @CacheLookup
    private WebElement locationListDropDownMenu;

    @FindBy(css = ".env-list-box-wrapper div ul li:nth-child(1)")
    @CacheLookup
    private WebElement skiDubaiLink;

    @FindBy(css = ".env-list-box-wrapper div ul li:nth-child(2)")
    @CacheLookup
    private WebElement snowAbuDhabiLink;

    @FindBy(css = ".env-list-box-wrapper div ul li:nth-child(3)")
    @CacheLookup
    private WebElement snowOmanLink;

    @FindBy (css = ".gh-item.status-update-link")
    @CacheLookup
    private WebElement statusUpdateLink;

    @FindBy (css = ".status-update-box-container .content-box")
    @CacheLookup
    private WebElement statusUpdatePopUp;

    @FindBy (css = ".global-header-container .localization-box-container a")
    @CacheLookup
    private WebElement localizationLink;

    @FindBy (xpath = " //*[@id=\"layout\"]/header/div/nav/div[2]/div[1]/div[2]/div[2]/div/div/div")
    @CacheLookup
    private WebElement localizationOman;


    @FindBy (css = ".localization-box-container .content-box")
    @CacheLookup
    private WebElement localizationPopUp;

    @FindBy (css = ".localization-box-container ul.localization-list li.local-item.active")
    @CacheLookup
    private WebElement languageTab;

    @FindBy (css = ".localization-box-container ul.localization-list li.local-item.active")
    @CacheLookup
    private WebElement currencyTab;

    @FindBy (css = ".localization-box-container > .localization-box-wrapper >div > ul.mt-3 > li")
    @CacheLookup
    private WebElement langText;

    @FindBy (css = ".global-header-container .cta-items-container > div:nth-child(1) a")
    @CacheLookup
    private WebElement callLink;

    @FindBy (xpath = "//a[contains(text(),'Contact us')]")
    @CacheLookup
    private WebElement contactUsLink;

    @FindBy (css = ".global-header-container .cta-items-container > div:nth-child(3) a")
    @CacheLookup
    private WebElement schoolGroupsLink;

    @FindBy (css = ".global-header-container .cta-items-container > div:nth-child(4) a")
    @CacheLookup
    private WebElement corporateTeamsLink;

    @FindBy(css = "div#layout div.logo-container > a > img")
    private WebElement logo;

    @FindBy(css = "li:nth-of-type(2) > .navbar-item-container > .navbar-item.navbar-item-common-styles")
    private WebElement packagesNav;

    @FindBy(css = "#item018df3ae-6799-453b-a6d3-6305c05f1827 > div > ul > li:nth-child(1)")
    private WebElement slopePackage;

    @FindBy(css = "#item018df3ae-6799-453b-a6d3-6305c05f1827 > div > ul > li:nth-child(2)")
    private WebElement snowParkPackage;

    @FindBy(css = "#item018df3ae-6799-453b-a6d3-6305c05f1827 > div > ul > li:nth-child(3)")

    private WebElement penguinEncountersPackage;
    @FindBy(css = "#item018df3ae-6799-453b-a6d3-6305c05f1827 > div > ul > li:nth-child(4)")
    private WebElement snowCinemaPackage;

    @FindBy(css = "#item018df3ae-6799-453b-a6d3-6305c05f1827 > div > ul > li:nth-child(5)")
    private WebElement membershipsPackage;

    @FindBy(css = "#item018df3ae-6799-453b-a6d3-6305c05f1827 > div > ul > li:nth-child(6)")
    private WebElement birthdaysPackage;

    @FindBy(css = "li:nth-of-type(3) > .navbar-item-container > .navbar-item.navbar-item-common-styles")
    private WebElement skiAcademyNav;

    @FindBy(css = "#itemaa043070-5d22-4904-8dd2-c5ce4a1d5070 > div > ul > li:nth-child(1)")
    private WebElement exploreSkiAcademyLink;

    @FindBy(css = "#itemaa043070-5d22-4904-8dd2-c5ce4a1d5070 > div > ul > li:nth-child(2)")
    private WebElement skiLessonsLink;

    @FindBy(css = "#itemaa043070-5d22-4904-8dd2-c5ce4a1d5070 > div > ul > li:nth-child(3)")
    private WebElement snowboardLessonsLink;

    @FindBy(css = "li:nth-of-type(4) > .navbar-item-container > .navbar-item.navbar-item-common-styles")
    private WebElement whatsOnNav;

    @FindBy(xpath = "//p[@class=\"title\"][contains(text(),\"Ladies' Night\")]")
    private WebElement ladiesNightCard;

    @FindBy(css = "#item1f88dba3-e14e-48db-ade9-f289ebaa987e .navbar-item-menu-container")
    private WebElement whatsOnPopUp;

    @FindBy(css = ".navbar-item-menu-tabs-container .tabs-list-container  ul li:nth-child(1)")
    private WebElement ourEventsTab;

    @FindBy(css = ".navbar-item-menu-tabs-container .tabs-list-container  ul li:nth-child(2)")
    private WebElement fitnessAndWellbeingTab;

    @FindBy(css = "#item1f88dba3-e14e-48db-ade9-f289ebaa987e > div > div.navbar-item-menu-tabs-container > div.tabs-list-container > a")
    private WebElement seeAllEventsLink;

    @FindBy(xpath = "//header/div[1]/nav[1]/div[2]/div[1]/div[1]/ul[1]/li[5]/div[1]/a[1]")
    private WebElement planYourVisitNav;
    ////header/div[1]/nav[1]/div[2]/div[1]/div[1]/ul[1]/li[5]/div[1]/a[1]

    @FindBy(css = "#iteme32c69ce-7580-486f-ae31-e09760e6a75e > div > ul > li:nth-child(1)")
    private WebElement comePreparedLink;

    @FindBy(css = "#iteme32c69ce-7580-486f-ae31-e09760e6a75e > div > ul > li:nth-child(2)")
    private WebElement yourGuideLink;

    @FindBy(css = "#iteme32c69ce-7580-486f-ae31-e09760e6a75e > div > ul > li:nth-child(3)")
    private WebElement ourPenguinsLink;

    @FindBy(css = "#iteme32c69ce-7580-486f-ae31-e09760e6a75e > div > ul > li:nth-child(4)")
    private WebElement findYourBookingLink;

    @FindBy(css = "#iteme32c69ce-7580-486f-ae31-e09760e6a75e > div > ul > li:nth-child(5)")
    private WebElement foodLink;


    @FindBy(css = ".navbar-actions-container .navbar-checkout-panel")
    private WebElement cartNav;

    @FindBy(css = ".navbar-actions-container .navbar-checkout-panel .checkout-menu-wrapper")
    private WebElement cartPopUp;

    @FindBy(css = "#layout > header > div.update-msg-container > button")
    private WebElement closeYellowBanner;

    @FindBy (css = "button.btn-sign-in")
    @CacheLookup
    private WebElement signInButton;

    @FindBy(xpath = "//div[@class='user-avatar-container']//div[1]")
    @CacheLookup
    private  WebElement userAvatar;

    @FindBy(xpath = "//a[@class='navbar-item navbar-item-common-styles']")
    @CacheLookup
    private WebElement passesAndPackages;

    @FindBy(xpath = "//p[contains(text(), \"Slope\")]")
    @CacheLookup
    private WebElement slopeOption;

    @FindBy(css = "#hero-section")
    @CacheLookup
    private WebElement heroBannerSection;

    @FindBy(css = "#hero-title")
    @CacheLookup
    private WebElement heroBannerTitle;

    @FindBy(xpath = "//p[contains(text(), \"Snow Park\")]")
    private WebElement snowParkOption;

    @FindBy(xpath = "//p[contains(text(), \"Snow Cinema\")]")
    private WebElement snowCinemaOption;

    @FindBy(xpath = "//p[contains(text(), \"Penguin Encounters\")]")
    private WebElement penguinEncounterOption;

    @FindBy(css = "#hero-subtitle")
    @CacheLookup
    private WebElement heroBannerSubTitle;

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div[@id='layout']/div[2]/main[1]/section[1]/div[1]/div[1]/img[1]")
    @CacheLookup
    private WebElement heroBannerImage;

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div[@id='layout']/div[2]/main[1]/section[1]/div[1]/div[2]")
    @CacheLookup
    private WebElement scrollDownButton;

    @FindBy(css = "#activitySection87c73176-c78d-49c9-bb14-597a689240fe")
    @CacheLookup
    private WebElement activitySection;

    @FindBy(xpath = "//*[@id=\"activitySection87c73176-c78d-49c9-bb14-597a689240fe\"]/div/div[1]/div/div[1]/h2\n")
    @CacheLookup
    private WebElement activitySectionTitle;

    @FindBy(xpath = "//*[@id=\"activitySection87c73176-c78d-49c9-bb14-597a689240fe\"]/div/div[1]/div/div[1]/p")
    @CacheLookup
    private WebElement activitySectionDescription;

    @FindBy(xpath = "//a[contains(text(),'Ready to chill?')]")
    @CacheLookup
    private WebElement activitySectionButton;

    @FindBy(css ="#activitySection940ded13-8d91-4d32-b680-e6fb2475b40f")
    @CacheLookup
    private WebElement penguinEncounterSection;

    @FindBy(xpath = "//*[@id=\"activitySection940ded13-8d91-4d32-b680-e6fb2475b40f\"]/div/div[1]/div/div[1]/h2")
    @CacheLookup
    private WebElement penguinEncounterTitle;

    @FindBy(xpath = "//*[@id=\"activitySection940ded13-8d91-4d32-b680-e6fb2475b40f\"]/div/div[1]/div/div[1]/p")
    @CacheLookup
    private WebElement penguinEncounterDescription;

    @FindBy(css = "#lottieActiity940ded13-8d91-4d32-b680-e6fb2475b40f")
    @CacheLookup
    private WebElement penguinEncounterImage;

    @FindBy(xpath = "//*[@id=\"activitySection940ded13-8d91-4d32-b680-e6fb2475b40f\"]/div/div[1]/div/div[2]/a")
    @CacheLookup
    private WebElement penguinEncounterButton;

    @FindBy(css = "#activitySectionaeb677da-2dc1-4c86-ac4f-bce1c274c5d9")
    @CacheLookup
    private WebElement snowCinemaSection;

    @FindBy(xpath = "//*[@id=\"activitySectionaeb677da-2dc1-4c86-ac4f-bce1c274c5d9\"]/div/div[1]/div/div[1]/h2")
    @CacheLookup
    private WebElement snowCinemaTitle;

    @FindBy(xpath = "//*[@id=\"activitySectionaeb677da-2dc1-4c86-ac4f-bce1c274c5d9\"]/div/div[1]/div/div[1]/p")
    @CacheLookup
    private WebElement snowCinemaDescription;

    @FindBy(css = "#lottieActiityaeb677da-2dc1-4c86-ac4f-bce1c274c5d9")
    @CacheLookup
    private WebElement snowCinemaImage;

    @FindBy(xpath = "//*[@id=\"activitySectionaeb677da-2dc1-4c86-ac4f-bce1c274c5d9\"]/div/div[1]/div/div[2]/a")
    @CacheLookup
    private WebElement snowCinemaButton;

    @FindBy(css = "#activitySection328c10b0-42a3-4e10-8b2b-4da2d8a43c2f")
    @CacheLookup
    private WebElement hitSlopsSection;

    @FindBy(xpath = "//*[@id=\"activitySection328c10b0-42a3-4e10-8b2b-4da2d8a43c2f\"]/div/div[1]/div/div[1]/h2")
    @CacheLookup
    private WebElement hitSlopsTitle;

    @FindBy(xpath = "//*[@id=\"activitySection328c10b0-42a3-4e10-8b2b-4da2d8a43c2f\"]/div/div[1]/div/div[1]/p")
    @CacheLookup
    private WebElement hitSlopsDescription;

    @FindBy(xpath = "//*[@id=\"activitySection328c10b0-42a3-4e10-8b2b-4da2d8a43c2f\"]/div/div[1]/div/div[2]/a")
    @CacheLookup
    private WebElement hitSlopsButton;

    @FindBy(css = "#lottieActiity328c10b0-42a3-4e10-8b2b-4da2d8a43c2f")
    @CacheLookup
    private WebElement hitSlopsImage;


    @FindBy(css = "#activitySectiona2f2aa0a-718c-4467-afe5-2d493b0ceaff")
    @CacheLookup
    private WebElement learnToSkiSection;

    @FindBy(xpath = "//*[@id=\"activitySectiona2f2aa0a-718c-4467-afe5-2d493b0ceaff\"]/div/div[1]/div/div[1]/h2")
    @CacheLookup
    private WebElement learnToSkiTitle;

    @FindBy(xpath = "//*[@id=\"activitySectiona2f2aa0a-718c-4467-afe5-2d493b0ceaff\"]/div/div[1]/div/div[1]/p")
    @CacheLookup
    private WebElement learnToSkiSectionDescription;

    @FindBy(xpath = "//*[@id=\"activitySectiona2f2aa0a-718c-4467-afe5-2d493b0ceaff\"]/div/div[1]/div/div[2]/a")
    @CacheLookup
    private WebElement learnToSkiSectionButton;

    @FindBy(css = "#lottieActiitya2f2aa0a-718c-4467-afe5-2d493b0ceaff")
    @CacheLookup
    private WebElement learnToSkiSectionImage;

    @FindBy(css = "#findTicketBar > div")
    @CacheLookup
    private WebElement findTicketBar;

    @FindBy(xpath = "//*[@id=\"findTicketBar\"]/div/div/div[1]/div[1]/div[2]")
    @CacheLookup
    private WebElement experienceField;

    @FindBy(css = "#booking-bar-experience > ul > li:nth-child(1)")
    @CacheLookup
    private WebElement firstPackage;

    @FindBy(xpath = "//*[@id=\"findTicketBar\"]/div/div/div[2]/div[1]/div[2]")
    @CacheLookup
    private WebElement dateField;

    @FindBy(xpath = "//*[@id=\"booking-bar-date\"]/div/div/div/div/div/div[2]/table/tbody/tr[6]/td[2]")
    @CacheLookup
    private WebElement dateNum;

    @FindBy(xpath = "//*[@id=\"findTicketBar\"]/div/div/div[3]/div[1]/div[2]")
    @CacheLookup
    private WebElement PeopleField;

    @FindBy(xpath = "//*[@id=\"findTicketBar\"]/div/div/div[4]/button")
    @CacheLookup
    private WebElement findTicketButton;


    @FindBy(css = "#layout > footer")
    @CacheLookup
    private WebElement footerSection;

    @FindBy(css = "#layout > footer > div.bg-\\[\\#2F261E\\].px-4.py-\\[22px\\].lg\\:px-15")
    @CacheLookup
    private WebElement copyRightSection;

    @FindBy(css = "#layout > footer > div.footer-content-container > div.w-full.flex.justify-center.lg\\:w-fit.mb-4.lg\\:mb-\\[42px\\] > a")
    @CacheLookup
    private WebElement logoFooter;

    @FindBy(css = "#layout > footer > div.footer-content-container > div.site-links-container > div.site-general-info-container")
    @CacheLookup
    private WebElement mallTiming;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[2]/div[2]/div[2]/ul/li[1]/a")
    @CacheLookup
    private WebElement shareLink;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[2]/div[2]/div[2]/ul/li[2]/a")
    @CacheLookup
    private WebElement sustainabilityLink;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[2]/div[2]/div[2]/ul/li[3]/a")
    @CacheLookup
    private WebElement contactUsLinkFooter;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[2]/div[2]/div[2]/ul/li[4]/a")
    @CacheLookup
    private WebElement siteMapLink;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[2]/div[2]/div[2]/ul/li[5]/a")
    @CacheLookup
    private WebElement ourLocationLink;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[2]/div[3]/div[2]/ul/li[1]/a")
    @CacheLookup
    private WebElement antiFraudDisclaimerLink;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[2]/div[3]/div[2]/ul/li[2]/a")
    @CacheLookup
    private WebElement healthAndSafetyLink;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[2]/div[3]/div[2]/ul/li[3]/a")
    @CacheLookup
    private WebElement responsibleDisclosurePolicyLink;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[2]/div[3]/div[2]/ul/li[4]/a")
    @CacheLookup
    private WebElement termsAndConditionsLink;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[2]/div[3]/div[2]/ul/li[5]/a")
    @CacheLookup
    private WebElement careersLink;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[2]/div[3]/div[2]/ul/li[6]/a")
    @CacheLookup
    private WebElement privacyCentreLink;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[2]/div[3]/div[2]/ul/li[7]/a")
    @CacheLookup
    private WebElement cookiesSettingsLink;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[2]/div[4]")
    @CacheLookup
    private WebElement newsletterSection;

    @FindBy(css = "#email")
    @CacheLookup
    private WebElement emailField;

    @FindBy(css = "#layout > footer > div.footer-content-container > div.site-links-container > div.fourth-part > span > button")
    @CacheLookup
    private WebElement joinButton;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[4]/div[1]/div")
    @CacheLookup
    private WebElement socialMediaSection;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[4]/div[1]/div/ul/li[1]/a/img")
    @CacheLookup
    private WebElement facebookIcon;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[4]/div[1]/div/ul/li[2]/a/img")
    @CacheLookup
    private WebElement instagramIcon;

    @FindBy(xpath = "//*[@id=\"layout\"]/footer/div[2]/div[4]/div[2]/ul")
    @CacheLookup
    private WebElement paymentIcons;

    @FindBy(css = "div#layout div.content-container > p")
    @CacheLookup
    private WebElement successMessage;

    @FindBy(id = "onetrust-reject-all-handler")
    @CacheLookup
    private WebElement rejectCookies;

    @FindBy(xpath = "//a[@href='/en-ae/ski-dubai/accounts/payments']")
    private WebElement paymentOption;

//    Penguin encounter tab
    @FindBy(xpath = "//a[@href='/en/passes-packages/penguin-encounters']")
    @CacheLookup
    private WebElement penguinEncountersOption;

    //    Snow Cinema tab
    @FindBy(xpath = "//p[contains(text(),'Snow Cinema')]")
    private WebElement snowCinemaLink;


    @FindBy(xpath = "//div[@class='user-avatar-container']//div[1]")
    private WebElement myAccount;

    @FindBy(xpath = "//*[contains(@href,'/accounts/profile/personal-details')]")
    private WebElement profileOption;



    @FindBy(xpath = "//a[contains(@href,'/accounts/dashboard')]")
    private WebElement dashboard;

    @FindBy(xpath = "//a[contains(@href,'/accounts/transactions')]")
    private WebElement transaction;

    @FindBy(xpath = "//button[@type='button']")
    private WebElement logout;

    public SKiHomePage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public WebElement getSnowParkOption () {
        return snowParkOption;
    }

    public void setSnowParkOption (WebElement snowParkOption) {
        this.snowParkOption = snowParkOption;
    }

    public WebElement getSnowCinemaOption () {
        return snowCinemaOption;
    }

    public void setSnowCinemaOption (WebElement snowCinemaOption) {
        this.snowCinemaOption = snowCinemaOption;
    }

    public WebElement getPenguinEncounterOption () {
        return penguinEncounterOption;
    }

    public void setPenguinEncounterOption (WebElement penguinEncounterOption) {
        this.penguinEncounterOption = penguinEncounterOption;
    }

    public void setLocationsListLink (WebElement locationsListLink) {
        this.locationsListLink = locationsListLink;
    }

    public WebElement getCloseCookiesBanner () {
        return closeCookiesBanner;
    }

    public void setCloseCookiesBanner (WebElement closeCookiesBanner) {
        this.closeCookiesBanner = closeCookiesBanner;
    }

    public WebElement getLocationListDropDownMenu () {
        return locationListDropDownMenu;
    }

    public void setLocationListDropDownMenu (WebElement locationListDropDownMenu) {
        this.locationListDropDownMenu = locationListDropDownMenu;
    }

    public WebElement getSkiDubaiLink () {
        return skiDubaiLink;
    }

    public void setSkiDubaiLink (WebElement skiDubaiLink) {
        this.skiDubaiLink = skiDubaiLink;
    }

    public WebElement getSnowAbuDhabiLink () {
        return snowAbuDhabiLink;
    }

    public void setSnowAbuDhabiLink (WebElement snowAbuDhabiLink) {
        this.snowAbuDhabiLink = snowAbuDhabiLink;
    }

    public WebElement getSnowOmanLink () {
        return snowOmanLink;
    }

    public void setSnowOmanLink (WebElement snowOmanLink) {
        this.snowOmanLink = snowOmanLink;
    }

    public WebElement getStatusUpdateLink () {
        return statusUpdateLink;
    }

    public void setStatusUpdateLink (WebElement statusUpdateLink) {
        this.statusUpdateLink = statusUpdateLink;
    }

    public WebElement getStatusUpdatePopUp () {
        return statusUpdatePopUp;
    }

    public void setStatusUpdatePopUp (WebElement statusUpdatePopUp) {
        this.statusUpdatePopUp = statusUpdatePopUp;
    }

    public WebElement getLocalizationLink () {
        return localizationLink;
    }

    public void setLocalizationLink (WebElement localizationLink) {
        this.localizationLink = localizationLink;
    }

    public WebElement getLocalizationOman () {
        return localizationOman;
    }

    public void setLocalizationOman (WebElement localizationOman) {
        this.localizationOman = localizationOman;
    }

    public WebElement getLocalizationPopUp () {
        return localizationPopUp;
    }

    public void setLocalizationPopUp (WebElement localizationPopUp) {
        this.localizationPopUp = localizationPopUp;
    }

    public WebElement getLanguageTab () {
        return languageTab;
    }

    public void setLanguageTab (WebElement languageTab) {
        this.languageTab = languageTab;
    }

    public WebElement getCurrencyTab () {
        return currencyTab;
    }

    public void setCurrencyTab (WebElement currencyTab) {
        this.currencyTab = currencyTab;
    }

    public WebElement getLangText () {
        return langText;
    }

    public void setLangText (WebElement langText) {
        this.langText = langText;
    }

    public WebElement getCallLink () {
        return callLink;
    }

    public void setCallLink (WebElement callLink) {
        this.callLink = callLink;
    }

    public WebElement getContactUsLink () {
        return contactUsLink;
    }

    public void setContactUsLink (WebElement contactUsLink) {
        this.contactUsLink = contactUsLink;
    }

    public WebElement getSchoolGroupsLink () {
        return schoolGroupsLink;
    }

    public void setSchoolGroupsLink (WebElement schoolGroupsLink) {
        this.schoolGroupsLink = schoolGroupsLink;
    }

    public WebElement getCorporateTeamsLink () {
        return corporateTeamsLink;
    }

    public void setCorporateTeamsLink (WebElement corporateTeamsLink) {
        this.corporateTeamsLink = corporateTeamsLink;
    }

    public WebElement getLogo () {
        return logo;
    }

    public void setLogo (WebElement logo) {
        this.logo = logo;
    }

    public WebElement getPackagesNav () {
        return packagesNav;
    }

    public void setPackagesNav (WebElement packagesNav) {
        this.packagesNav = packagesNav;
    }

    public WebElement getSlopePackage () {
        return slopePackage;
    }

    public void setSlopePackage (WebElement slopePackage) {
        this.slopePackage = slopePackage;
    }

    public WebElement getSnowParkPackage () {
        return snowParkPackage;
    }

    public void setSnowParkPackage (WebElement snowParkPackage) {
        this.snowParkPackage = snowParkPackage;
    }

    public WebElement getPenguinEncountersPackage () {
        return penguinEncountersPackage;
    }

    public void setPenguinEncountersPackage (WebElement penguinEncountersPackage) {
        this.penguinEncountersPackage = penguinEncountersPackage;
    }

    public WebElement getSnowCinemaPackage () {
        return snowCinemaPackage;
    }

    public void setSnowCinemaPackage (WebElement snowCinemaPackage) {
        this.snowCinemaPackage = snowCinemaPackage;
    }

    public WebElement getMembershipsPackage () {
        return membershipsPackage;
    }

    public void setMembershipsPackage (WebElement membershipsPackage) {
        this.membershipsPackage = membershipsPackage;
    }

    public WebElement getBirthdaysPackage () {
        return birthdaysPackage;
    }

    public void setBirthdaysPackage (WebElement birthdaysPackage) {
        this.birthdaysPackage = birthdaysPackage;
    }

    public WebElement getSkiAcademyNav () {
        return skiAcademyNav;
    }

    public void setSkiAcademyNav (WebElement skiAcademyNav) {
        this.skiAcademyNav = skiAcademyNav;
    }

    public WebElement getExploreSkiAcademyLink () {
        return exploreSkiAcademyLink;
    }

    public void setExploreSkiAcademyLink (WebElement exploreSkiAcademyLink) {
        this.exploreSkiAcademyLink = exploreSkiAcademyLink;
    }

    public WebElement getSkiLessonsLink () {
        return skiLessonsLink;
    }

    public void setSkiLessonsLink (WebElement skiLessonsLink) {
        this.skiLessonsLink = skiLessonsLink;
    }

    public WebElement getSnowboardLessonsLink () {
        return snowboardLessonsLink;
    }

    public void setSnowboardLessonsLink (WebElement snowboardLessonsLink) {
        this.snowboardLessonsLink = snowboardLessonsLink;
    }

    public WebElement getWhatsOnNav () {
        return whatsOnNav;
    }

    public void setWhatsOnNav (WebElement whatsOnNav) {
        this.whatsOnNav = whatsOnNav;
    }

    public WebElement getWhatsOnPopUp () {
        return whatsOnPopUp;
    }

    public void setWhatsOnPopUp (WebElement whatsOnPopUp) {
        this.whatsOnPopUp = whatsOnPopUp;
    }

    public WebElement getOurEventsTab () {
        return ourEventsTab;
    }

    public void setOurEventsTab (WebElement ourEventsTab) {
        this.ourEventsTab = ourEventsTab;
    }

    public WebElement getFitnessAndWellbeingTab () {
        return fitnessAndWellbeingTab;
    }

    public void setFitnessAndWellbeingTab (WebElement fitnessAndWellbeingTab) {
        this.fitnessAndWellbeingTab = fitnessAndWellbeingTab;
    }

    public WebElement getSeeAllEventsLink () {
        return seeAllEventsLink;
    }

    public void setSeeAllEventsLink (WebElement seeAllEventsLink) {
        this.seeAllEventsLink = seeAllEventsLink;
    }

    public WebElement getPlanYourVisitNav () {
        return planYourVisitNav;
    }

    public void setPlanYourVisitNav (WebElement planYourVisitNav) {
        this.planYourVisitNav = planYourVisitNav;
    }

    public WebElement getComePreparedLink () {
        return comePreparedLink;
    }

    public void setComePreparedLink (WebElement comePreparedLink) {
        this.comePreparedLink = comePreparedLink;
    }

    public WebElement getYourGuideLink () {
        return yourGuideLink;
    }

    public void setYourGuideLink (WebElement yourGuideLink) {
        this.yourGuideLink = yourGuideLink;
    }

    public WebElement getOurPenguinsLink () {
        return ourPenguinsLink;
    }

    public void setOurPenguinsLink (WebElement ourPenguinsLink) {
        this.ourPenguinsLink = ourPenguinsLink;
    }

    public WebElement getFindYourBookingLink () {
        return findYourBookingLink;
    }

    public void setFindYourBookingLink (WebElement findYourBookingLink) {
        this.findYourBookingLink = findYourBookingLink;
    }

    public WebElement getFoodLink () {
        return foodLink;
    }

    public void setFoodLink (WebElement foodLink) {
        this.foodLink = foodLink;
    }

    public WebElement getCartNav () {
        return cartNav;
    }

    public void setCartNav (WebElement cartNav) {
        this.cartNav = cartNav;
    }

    public WebElement getCartPopUp () {
        return cartPopUp;
    }

    public void setCartPopUp (WebElement cartPopUp) {
        this.cartPopUp = cartPopUp;
    }

    public WebElement getCloseYellowBanner () {
        return closeYellowBanner;
    }

    public void setCloseYellowBanner (WebElement closeYellowBanner) {
        this.closeYellowBanner = closeYellowBanner;
    }

    public WebElement getHeroBannerSection () {
        return heroBannerSection;
    }

    public void setHeroBannerSection (WebElement heroBannerSection) {
        this.heroBannerSection = heroBannerSection;
    }

    public WebElement getHeroBannerTitle () {
        return heroBannerTitle;
    }

    public void setHeroBannerTitle (WebElement heroBannerTitle) {
        this.heroBannerTitle = heroBannerTitle;
    }

    public WebElement getHeroBannerSubTitle () {
        return heroBannerSubTitle;
    }

    public void setHeroBannerSubTitle (WebElement heroBannerSubTitle) {
        this.heroBannerSubTitle = heroBannerSubTitle;
    }

    public WebElement getHeroBannerImage () {
        return heroBannerImage;
    }

    public void setHeroBannerImage (WebElement heroBannerImage) {
        this.heroBannerImage = heroBannerImage;
    }

    public WebElement getScrollDownButton () {
        return scrollDownButton;
    }

    public void setScrollDownButton (WebElement scrollDownButton) {
        this.scrollDownButton = scrollDownButton;
    }

    public WebElement getActivitySection () {
        return activitySection;
    }

    public void setActivitySection (WebElement activitySection) {
        this.activitySection = activitySection;
    }

    public WebElement getActivitySectionTitle () {
        return activitySectionTitle;
    }

    public void setActivitySectionTitle (WebElement activitySectionTitle) {
        this.activitySectionTitle = activitySectionTitle;
    }

    public WebElement getActivitySectionDescription () {
        return activitySectionDescription;
    }

    public void setActivitySectionDescription (WebElement activitySectionDescription) {
        this.activitySectionDescription = activitySectionDescription;
    }

    public WebElement getActivitySectionButton () {
        return activitySectionButton;
    }

    public void setActivitySectionButton (WebElement activitySectionButton) {
        this.activitySectionButton = activitySectionButton;
    }

    public WebElement getPenguinEncounterSection () {
        return penguinEncounterSection;
    }

    public void setPenguinEncounterSection (WebElement penguinEncounterSection) {
        this.penguinEncounterSection = penguinEncounterSection;
    }

    public WebElement getPenguinEncounterTitle () {
        return penguinEncounterTitle;
    }

    public void setPenguinEncounterTitle (WebElement penguinEncounterTitle) {
        this.penguinEncounterTitle = penguinEncounterTitle;
    }

    public WebElement getPenguinEncounterDescription () {
        return penguinEncounterDescription;
    }

    public void setPenguinEncounterDescription (WebElement penguinEncounterDescription) {
        this.penguinEncounterDescription = penguinEncounterDescription;
    }

    public WebElement getPenguinEncounterImage () {
        return penguinEncounterImage;
    }

    public void setPenguinEncounterImage (WebElement penguinEncounterImage) {
        this.penguinEncounterImage = penguinEncounterImage;
    }

    public WebElement getPenguinEncounterButton () {
        return penguinEncounterButton;
    }

    public void setPenguinEncounterButton (WebElement penguinEncounterButton) {
        this.penguinEncounterButton = penguinEncounterButton;
    }

    public WebElement getSnowCinemaSection () {
        return snowCinemaSection;
    }

    public void setSnowCinemaSection (WebElement snowCinemaSection) {
        this.snowCinemaSection = snowCinemaSection;
    }

    public WebElement getSnowCinemaTitle () {
        return snowCinemaTitle;
    }

    public void setSnowCinemaTitle (WebElement snowCinemaTitle) {
        this.snowCinemaTitle = snowCinemaTitle;
    }

    public WebElement getSnowCinemaDescription () {
        return snowCinemaDescription;
    }

    public void setSnowCinemaDescription (WebElement snowCinemaDescription) {
        this.snowCinemaDescription = snowCinemaDescription;
    }

    public WebElement getSnowCinemaImage () {
        return snowCinemaImage;
    }

    public void setSnowCinemaImage (WebElement snowCinemaImage) {
        this.snowCinemaImage = snowCinemaImage;
    }

    public WebElement getSnowCinemaButton () {
        return snowCinemaButton;
    }

    public void setSnowCinemaButton (WebElement snowCinemaButton) {
        this.snowCinemaButton = snowCinemaButton;
    }

    public WebElement getHitSlopsSection () {
        return hitSlopsSection;
    }

    public void setHitSlopsSection (WebElement hitSlopsSection) {
        this.hitSlopsSection = hitSlopsSection;
    }

    public WebElement getHitSlopsTitle () {
        return hitSlopsTitle;
    }

    public void setHitSlopsTitle (WebElement hitSlopsTitle) {
        this.hitSlopsTitle = hitSlopsTitle;
    }

    public WebElement getHitSlopsDescription () {
        return hitSlopsDescription;
    }

    public void setHitSlopsDescription (WebElement hitSlopsDescription) {
        this.hitSlopsDescription = hitSlopsDescription;
    }

    public WebElement getHitSlopsButton () {
        return hitSlopsButton;
    }

    public void setHitSlopsButton (WebElement hitSlopsButton) {
        this.hitSlopsButton = hitSlopsButton;
    }

    public WebElement getHitSlopsImage () {
        return hitSlopsImage;
    }

    public void setHitSlopsImage (WebElement hitSlopsImage) {
        this.hitSlopsImage = hitSlopsImage;
    }

    public WebElement getLearnToSkiSection () {
        return learnToSkiSection;
    }

    public void setLearnToSkiSection (WebElement learnToSkiSection) {
        this.learnToSkiSection = learnToSkiSection;
    }

    public WebElement getLearnToSkiTitle () {
        return learnToSkiTitle;
    }

    public void setLearnToSkiTitle (WebElement learnToSkiTitle) {
        this.learnToSkiTitle = learnToSkiTitle;
    }

    public WebElement getLearnToSkiSectionDescription () {
        return learnToSkiSectionDescription;
    }

    public void setLearnToSkiSectionDescription (WebElement learnToSkiSectionDescription) {
        this.learnToSkiSectionDescription = learnToSkiSectionDescription;
    }

    public WebElement getLearnToSkiSectionButton () {
        return learnToSkiSectionButton;
    }

    public void setLearnToSkiSectionButton (WebElement learnToSkiSectionButton) {
        this.learnToSkiSectionButton = learnToSkiSectionButton;
    }

    public WebElement getLearnToSkiSectionImage () {
        return learnToSkiSectionImage;
    }

    public void setLearnToSkiSectionImage (WebElement learnToSkiSectionImage) {
        this.learnToSkiSectionImage = learnToSkiSectionImage;
    }

    public WebElement getFindTicketBar () {
        return findTicketBar;
    }

    public void setFindTicketBar (WebElement findTicketBar) {
        this.findTicketBar = findTicketBar;
    }

    public WebElement getExperienceField () {
        return experienceField;
    }

    public void setExperienceField (WebElement experienceField) {
        this.experienceField = experienceField;
    }

    public WebElement getFirstPackage () {
        return firstPackage;
    }

    public void setFirstPackage (WebElement firstPackage) {
        this.firstPackage = firstPackage;
    }

    public WebElement getDateField () {
        return dateField;
    }

    public void setDateField (WebElement dateField) {
        this.dateField = dateField;
    }

    public WebElement getDateNum () {
        return dateNum;
    }

    public void setDateNum (WebElement dateNum) {
        this.dateNum = dateNum;
    }

    public WebElement getPeopleField () {
        return PeopleField;
    }

    public void setPeopleField (WebElement peopleField) {
        PeopleField = peopleField;
    }

    public WebElement getFindTicketButton () {
        return findTicketButton;
    }

    public void setFindTicketButton (WebElement findTicketButton) {
        this.findTicketButton = findTicketButton;
    }

    public WebElement getFooterSection () {
        return footerSection;
    }

    public void setFooterSection (WebElement footerSection) {
        this.footerSection = footerSection;
    }

    public WebElement getCopyRightSection () {
        return copyRightSection;
    }

    public void setCopyRightSection (WebElement copyRightSection) {
        this.copyRightSection = copyRightSection;
    }

    public WebElement getLogoFooter () {
        return logoFooter;
    }

    public void setLogoFooter (WebElement logoFooter) {
        this.logoFooter = logoFooter;
    }

    public WebElement getMallTiming () {
        return mallTiming;
    }

    public void setMallTiming (WebElement mallTiming) {
        this.mallTiming = mallTiming;
    }

    public WebElement getShareLink () {
        return shareLink;
    }

    public void setShareLink (WebElement shareLink) {
        this.shareLink = shareLink;
    }

    public WebElement getSustainabilityLink () {
        return sustainabilityLink;
    }

    public void setSustainabilityLink (WebElement sustainabilityLink) {
        this.sustainabilityLink = sustainabilityLink;
    }

    public WebElement getContactUsLinkFooter () {
        return contactUsLinkFooter;
    }

    public void setContactUsLinkFooter (WebElement contactUsLinkFooter) {
        this.contactUsLinkFooter = contactUsLinkFooter;
    }

    public WebElement getSiteMapLink () {
        return siteMapLink;
    }

    public void setSiteMapLink (WebElement siteMapLink) {
        this.siteMapLink = siteMapLink;
    }

    public WebElement getOurLocationLink () {
        return ourLocationLink;
    }

    public void setOurLocationLink (WebElement ourLocationLink) {
        this.ourLocationLink = ourLocationLink;
    }

    public WebElement getAntiFraudDisclaimerLink () {
        return antiFraudDisclaimerLink;
    }

    public void setAntiFraudDisclaimerLink (WebElement antiFraudDisclaimerLink) {
        this.antiFraudDisclaimerLink = antiFraudDisclaimerLink;
    }

    public WebElement getHealthAndSafetyLink () {
        return healthAndSafetyLink;
    }

    public void setHealthAndSafetyLink (WebElement healthAndSafetyLink) {
        this.healthAndSafetyLink = healthAndSafetyLink;
    }

    public WebElement getResponsibleDisclosurePolicyLink () {
        return responsibleDisclosurePolicyLink;
    }

    public void setResponsibleDisclosurePolicyLink (WebElement responsibleDisclosurePolicyLink) {
        this.responsibleDisclosurePolicyLink = responsibleDisclosurePolicyLink;
    }

    public WebElement getTermsAndConditionsLink () {
        return termsAndConditionsLink;
    }

    public void setTermsAndConditionsLink (WebElement termsAndConditionsLink) {
        this.termsAndConditionsLink = termsAndConditionsLink;
    }

    public WebElement getCareersLink () {
        return careersLink;
    }

    public void setCareersLink (WebElement careersLink) {
        this.careersLink = careersLink;
    }

    public WebElement getPrivacyCentreLink () {
        return privacyCentreLink;
    }

    public void setPrivacyCentreLink (WebElement privacyCentreLink) {
        this.privacyCentreLink = privacyCentreLink;
    }

    public WebElement getCookiesSettingsLink () {
        return cookiesSettingsLink;
    }

    public void setCookiesSettingsLink (WebElement cookiesSettingsLink) {
        this.cookiesSettingsLink = cookiesSettingsLink;
    }

    public WebElement getNewsletterSection () {
        return newsletterSection;
    }

    public void setNewsletterSection (WebElement newsletterSection) {
        this.newsletterSection = newsletterSection;
    }

    public WebElement getEmailField () {
        return emailField;
    }

    public void setEmailField (WebElement emailField) {
        this.emailField = emailField;
    }

    public WebElement getJoinButton () {
        return joinButton;
    }

    public void setJoinButton (WebElement joinButton) {
        this.joinButton = joinButton;
    }

    public WebElement getSocialMediaSection () {
        return socialMediaSection;
    }

    public void setSocialMediaSection (WebElement socialMediaSection) {
        this.socialMediaSection = socialMediaSection;
    }

    public WebElement getFacebookIcon () {
        return facebookIcon;
    }

    public void setFacebookIcon (WebElement facebookIcon) {
        this.facebookIcon = facebookIcon;
    }

    public WebElement getInstagramIcon () {
        return instagramIcon;
    }

    public void setInstagramIcon (WebElement instagramIcon) {
        this.instagramIcon = instagramIcon;
    }

    public WebElement getPaymentIcons () {
        return paymentIcons;
    }

    public void setPaymentIcons (WebElement paymentIcons) {
        this.paymentIcons = paymentIcons;
    }

    public WebElement getSuccessMessage () {
        return successMessage;
    }

    public void setSuccessMessage (WebElement successMessage) {
        this.successMessage = successMessage;
    }

    public WebElement getRejectCookies () {
        return rejectCookies;
    }

    public void setRejectCookies (WebElement rejectCookies) {
        this.rejectCookies = rejectCookies;
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

    public WebElement getLocationsListLink(){ return locationsListLink; }

    public WebElement getPenguinEncountersOption() {
        return penguinEncountersOption;
    }

    public void setPenguinEncountersOption(WebElement penguinEncountersOption) {
        this.penguinEncountersOption = penguinEncountersOption;
    }

    //public WebElement getDubaiLocation(){return dubaiLocation;}

    public WebElement getPaymentOption(){return paymentOption;}

    public void setPaymentOption(WebElement paymentIcons) {this.paymentIcons=paymentIcons;}

    public WebElement getProfileOption(){return profileOption;}

    public WebElement getSnowCinemaLink(){return snowCinemaLink;}


    public WebElement getMyAccount(){return myAccount;}

    public void setMyAccount( WebElement myAccount) {this.myAccount=myAccount;}

    public WebElement getDashboard (){return dashboard;}

    public void setDashboard ( WebElement dashboard) {this.dashboard=dashboard;}

    public WebElement getTransaction (){return transaction;}

    public void setTransaction ( WebElement transaction) {this.transaction=transaction;}




    public WebElement getLogout (){return logout;}

    public void setLogout ( WebElement logout) {this.logout=logout;}



    public WebElement getLadiesNightCard() {
        return ladiesNightCard;
    }

    public void setLadiesNightCard(WebElement ladiesNightCard) {
        this.ladiesNightCard = ladiesNightCard;
    }
}
