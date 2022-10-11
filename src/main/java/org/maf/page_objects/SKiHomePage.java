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
public class SKiHomePage {

    @FindBy(css = "#onetrust-accept-btn-handler")
    @CacheLookup
    private WebElement acceptCookiesButton;

    @FindBy (css = ".flex.gh-item.items-center.lg\\:cursor-pointer")
    @CacheLookup
    private WebElement locationsListLink;

    @FindBy (id = "onetrust-close-btn-container")
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

    @FindBy (css = ".global-header-container .cta-items-container > div:nth-child(2) a")
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

    @FindBy(css = "#item1f88dba3-e14e-48db-ade9-f289ebaa987e .navbar-item-menu-container")
    private WebElement whatsOnPopUp;

    @FindBy(css = ".navbar-item-menu-tabs-container .tabs-list-container  ul li:nth-child(1)")
    private WebElement ourEventsTab;

    @FindBy(css = ".navbar-item-menu-tabs-container .tabs-list-container  ul li:nth-child(2)")
    private WebElement fitnessAndWellbeingTab;

    @FindBy(css = "#item1f88dba3-e14e-48db-ade9-f289ebaa987e > div > div.navbar-item-menu-tabs-container > div.tabs-list-container > a")
    private WebElement seeAllEventsLink;

    @FindBy(css = "li:nth-of-type(5) > .navbar-item-container > .navbar-item.navbar-item-common-styles")
    private WebElement planYourVisitNav;

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

    @FindBy (css = ".btn-sign-in")
    @CacheLookup
    private WebElement signInButton;

    @FindBy(className = "user-avatar")
    @CacheLookup
    private  WebElement userAvatar;

    @FindBy(xpath = "//a[@class='navbar-item navbar-item-common-styles']")
    @CacheLookup
    private WebElement passesAndPackages;

    @FindBy(xpath = "//a[@href='/en/passes-packages/ski-snowboard']")
    @CacheLookup
    private WebElement slopeOption;

    @FindBy(css = "#hero-section")
    @CacheLookup
    private WebElement heroBannerSection;

    @FindBy(css = "#hero-title")
    @CacheLookup
    private WebElement heroBannerTitle;

    @FindBy(css = "#hero-subtitle")
    @CacheLookup
    private WebElement heroBannerSubTitle;

    @FindBy(css = "#hero-section > div.hero-section-container > img")
    @CacheLookup
    private WebElement heroBannerImage;

    @FindBy(css = "#hero-section > div.scroll-to-continue > p")
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

    @FindBy(css = "div#layout section.activity-section-wrapper.second-section > div > div.activtiy-section-part-wrapper.px-5.md\\3a px-0.md\\3a ltr\\3a pl-10.xl\\3a ltr\\3a pl-43.md\\3a rtl\\3a pr-10.xl\\3a rtl\\3a pr-43 > div > div.base-button > a")
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

    public WebElement getLocationsListLink(){ return locationsListLink; }

    //public WebElement getDubaiLocation(){return dubaiLocation;}


}
