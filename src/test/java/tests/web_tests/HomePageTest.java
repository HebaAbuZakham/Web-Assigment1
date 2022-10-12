package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.*;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.maf.utils.error_handlers.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(TestListener.class)
public class HomePageTest extends base {


    @Test(description = "Validate that user is able to navigate to homepage and accept cookies", retryAnalyzer = RetryAnalyzer.class)
    public void validateThatUserIsAbleToNavigateToHomePageAndAcceptCookies() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
    }

    @Test(description = "Validate that Dubai is exist in the locations DropDown ")
    public void validateThatDubaiIsExistInTheLocationsDropDown() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getLocationsListLink());
        SharedMethods.waitUntilElementClickable(sKiHomePage.getLocationsListLink());
        sKiHomePage.getLocationsListLink().click();
        Assert.assertEquals(sKiHomePage.getSkiDubaiLink().getText(), "Ski Dubai");

    }

    @Test(description = "Validate that user is able to navigate to Snow Abu Dhabi")
    public void validateThatUserIsAbleToNavigateToSnowAbuDhabi() {
        SoftAssert softAssert = new SoftAssert();
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getLocationsListLink());
        SharedMethods.waitUntilElementClickable(sKiHomePage.getLocationsListLink());
        sKiHomePage.getLocationsListLink().click();
        sKiHomePage.getSnowAbuDhabiLink().click();
        SharedMethods.threadSleep(3000);
        sKiHomePage.getCloseCookiesBanner().click();
        sKiHomePage.getCloseYellowBanner().click();
        softAssert.assertEquals(sKiHomePage.getLocalizationLink().getText(), "Snow Abu Dhabi");

    }

    @Test(description = "Validate that user is able to navigate to Snow Oman")
    public void validateThatUserIsAbleToNavigateToSnowOman() {
        SoftAssert softAssert = new SoftAssert();
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getLocationsListLink());
        SharedMethods.waitUntilElementClickable(sKiHomePage.getLocationsListLink());
        sKiHomePage.getLocationsListLink().click();
        sKiHomePage.getSnowOmanLink().click();
        SharedMethods.threadSleep(3000);
        sKiHomePage.getCloseCookiesBanner().click();
        softAssert.assertEquals(sKiHomePage.getLocalizationOman().getText(), "Snow Oman");


    }

    @Test(description = "Validate that user can select slop from passes and packages DropDown")
    public void validateThatUserCanSelectSlopeFromPassesAndPackagesDropDown() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SoftAssert softAssert = new SoftAssert();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPackagesNav());
        sKiHomePage.getPackagesNav().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSlopePackage());
        sKiHomePage.getSlopePackage().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible(passesAndPackages.getSlopeTab());
        softAssert.assertEquals(passesAndPackages.getSlopeTab().getText(), "Slope");

    }

    @Test(description = "Validate that user can select Snow Park from passes and packages DropDown")
    public void validateThatUserCanSelectSnowParkFromPassesAndPackagesDropDown() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SoftAssert softAssert = new SoftAssert();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPackagesNav());
        sKiHomePage.getPackagesNav().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkPackage());
        sKiHomePage.getSnowParkPackage().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible(passesAndPackages.getSnowParkTab());
        softAssert.assertEquals(passesAndPackages.getSlopeTab().getText(), "Snow Park");

    }

    @Test(description = "Validate that user can select Penguin Encounter from passes and packages DropDown")
    public void validateThatUserCanSelectPenguinEncounterFromPassesAndPackagesDropDown() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SoftAssert softAssert = new SoftAssert();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPackagesNav());
        sKiHomePage.getPackagesNav().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPenguinEncountersPackage());
        sKiHomePage.getPenguinEncountersPackage().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible(passesAndPackages.getPenguinEncounterTab());
        softAssert.assertEquals(passesAndPackages.getSlopeTab().getText(), "Penguin Encounter");

    }

    @Test(description = "Validate that user can select Snow Cinema from passes and packages DropDown")
    public void validateThatUserCanSelectSnowCinemaFromPassesAndPackagesDropDown() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SoftAssert softAssert = new SoftAssert();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPackagesNav());
        sKiHomePage.getPackagesNav().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowCinemaPackage());
        sKiHomePage.getSnowCinemaPackage().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible(passesAndPackages.getSnowCinemaTab());
        softAssert.assertEquals(passesAndPackages.getSlopeTab().getText(), "Snow Cinema");

    }

    @Test(description = "Validate that user can select Explore Ski Academy from Ski Academy Nav")
    public void validateThatUserCanSelectExploreSkiAcademyFromSkiAcademyNav() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SoftAssert softAssert = new SoftAssert();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSkiAcademyNav());
        sKiHomePage.getSkiAcademyNav().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getExploreSkiAcademyLink());
        sKiHomePage.getExploreSkiAcademyLink().click();
        SkiAcademy skiAcademy = new SkiAcademy(getDriver());
        SharedMethods.waitUntilElementVisible(skiAcademy.getExploreSkiAcademyHeader());
        softAssert.assertEquals(skiAcademy.getExploreSkiAcademyHeader().getText(), "BOOK A LESSON");

    }

    @Test(description = "Validate that user can select Ski Lessons from Ski Academy Nav")
    public void validateThatUserCanSelectSkiLessonsFromSkiAcademyNav() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SoftAssert softAssert = new SoftAssert();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSkiAcademyNav());
        sKiHomePage.getSkiAcademyNav().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSkiLessonsLink());
        sKiHomePage.getSkiLessonsLink().click();
        SkiAcademy skiAcademy = new SkiAcademy(getDriver());
        SharedMethods.waitUntilElementVisible(skiAcademy.getSkiLessonsHeader());
        softAssert.assertEquals(skiAcademy.getSkiLessonsHeader().getText(), "WHAT LEVEL ARE YOU?");

    }

    @Test(description = "Validate that user can select Snowboard Lessons from Ski Academy Nav")
    public void validateThatUserCanSelectSnowboardLessonsFromSkiAcademyNav() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SoftAssert softAssert = new SoftAssert();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSkiAcademyNav());
        sKiHomePage.getSkiAcademyNav().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowboardLessonsLink());
        sKiHomePage.getSnowboardLessonsLink().click();
        SkiAcademy skiAcademy = new SkiAcademy(getDriver());
        SharedMethods.waitUntilElementVisible(skiAcademy.getSnowboardLessonsHeader());
        softAssert.assertEquals(skiAcademy.getSnowboardLessonsHeader().getText(), "WHAT LEVEL ARE YOU?");

    }

    @Test(description = "Validate that Our Events is exist in the What's On Nav ")
    public void validateThatOurEventsIsExistInTheWhatsOnNav() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getWhatsOnNav());
        sKiHomePage.getWhatsOnNav().click();
        sKiHomePage.getOurEventsTab().click();
        Assert.assertEquals(sKiHomePage.getOurEventsTab().getText(), "Our Events");

    }

    @Test(description = "Validate that Fitness And Wellbeing is exist in the What's On Nav ")
    public void validateThatFitnessAndWellbeingIsExistInTheWhatsOnNav() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getWhatsOnNav());
        sKiHomePage.getWhatsOnNav().click();
        sKiHomePage.getFitnessAndWellbeingTab().click();
        Assert.assertEquals(sKiHomePage.getFitnessAndWellbeingTab().getText(), "Fitness and Wellbeing");

    }

    @Test(description = "Validate that user is able to navigate to All Events from What's On nav")
    public void validateThatUserIsAbleToNavigateToAllEventsFromWhatsOnNav() {
        SoftAssert softAssert = new SoftAssert();
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        EventsPage eventsPage = new EventsPage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getWhatsOnNav());
        sKiHomePage.getWhatsOnNav().click();
        sKiHomePage.getSeeAllEventsLink().click();
        softAssert.assertEquals(eventsPage.getEventHeader().getText(), "FIND EVENTS");
    }

    @Test(description = "Validate that user is able to navigate to Come Prepared from Plan Your Visit nav")
    public void validateThatUserIsAbleToNavigateToComePreparedFromPlanYourVisitNav() {
        SoftAssert softAssert = new SoftAssert();
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        ComePrepared comePrepared = new ComePrepared(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPlanYourVisitNav());
        sKiHomePage.getPlanYourVisitNav().click();
        sKiHomePage.getComePreparedLink().click();
        softAssert.assertEquals(comePrepared.getComePreparedHeader().getText(), "GET READY TO CHILL");
    }

    @Test(description = "Validate that user is able to navigate to Your Guide from Plan Your Visit nav")
    public void validateThatUserIsAbleToNavigateToYourGuideFromPlanYourVisitNav() {
        SoftAssert softAssert = new SoftAssert();
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        YourGuidePage yourGuidePage = new YourGuidePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPlanYourVisitNav());
        sKiHomePage.getPlanYourVisitNav().click();
        sKiHomePage.getYourGuideLink().click();
        softAssert.assertEquals(yourGuidePage.getYourGuideHeader().getText(), "THE ULTIMATE SNOW DAY");
    }

    @Test(description = "Validate that user is able to navigate to Our PENGUINS from Plan Your Visit nav")
    public void validateThatUserIsAbleToNavigateToOurPenguinsFromPlanYourVisitNav() {
        SoftAssert softAssert = new SoftAssert();
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        OurPenguinsPage ourPenguinsPage = new OurPenguinsPage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPlanYourVisitNav());
        sKiHomePage.getPlanYourVisitNav().click();
        sKiHomePage.getOurPenguinsLink().click();
        softAssert.assertEquals(ourPenguinsPage.getOurPenguinsHeader().getText(), "LEARN TO UNDERSTAND PENGUINS");
    }

    @Test(description = "Validate that user is able to navigate to Find Your Booking from Plan Your Visit nav")
    public void validateThatUserIsAbleToNavigateToFindYourBookingFromPlanYourVisitNav() {
        SoftAssert softAssert = new SoftAssert();
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        FindYourBooking findYourBooking = new FindYourBooking(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPlanYourVisitNav());
        sKiHomePage.getPlanYourVisitNav().click();
        sKiHomePage.getFindYourBookingLink().click();
        softAssert.assertEquals(findYourBooking.getFindYourBookingHeader().getText(), "LET’S FIND YOUR BOOKING");
    }


    @Test(description = "Validate that user is able to navigate to Food Beverage from Plan Your Visit nav")
    public void validateThatUserIsAbleToNavigateToFoodBeverageFromPlanYourVisitNav() {
        SoftAssert softAssert = new SoftAssert();
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        FoodBeveragePage foodBeveragePage = new FoodBeveragePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPlanYourVisitNav());
        sKiHomePage.getPlanYourVisitNav().click();
        sKiHomePage.getFoodLink().click();
        softAssert.assertEquals(foodBeveragePage.getFoodBeverageHeader().getText(), "FOOD AND DRINK");
    }

    @Test(description = "Validate that user is able to See the Cart From Global Navs")
    public void validateThatUserIsableToSeeTheCartFromGlobalNavs() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getCartNav());
        sKiHomePage.getCartNav().click();
        sKiHomePage.getCartPopUp().isDisplayed();
    }

    @Test(description = "Validate that user is able to login", retryAnalyzer = RetryAnalyzer.class)
    public void validateThatUserIsAbleToLogIn() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUserName().sendKeys(objXMLReader.getXMLData("userName"));
        loginPage.getPassword().sendKeys(objXMLReader.getXMLData("passWord"));
        loginPage.getLoginCTA().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getUserAvatar());
        Assert.assertTrue(sKiHomePage.getUserAvatar().isDisplayed());
    }

    @Test(description = "Validate that Hero Banner Section is exist in the Home Page")
    public void validateThatHeroBannerSectionIsExistInTheHomePage() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getHeroBannerSection());
        sKiHomePage.getHeroBannerSection().isDisplayed();
        sKiHomePage.getHeroBannerTitle().isDisplayed();
        sKiHomePage.getHeroBannerSubTitle().isDisplayed();
        sKiHomePage.getHeroBannerImage().isDisplayed();
    }

    @Test(description = "Validate That The User Is Able To Scroll Down To Activity Section By Clicking On Scroll Down Button")
    public void validateThatTheUserIsAbleToScrollDownToActivitySectionByClickingOnScrollDownButton() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getHeroBannerSection());
        SharedMethods.moveToElement(sKiHomePage.getActivitySection());
        sKiHomePage.getActivitySection().isDisplayed();
    }

    @Test(description = "Validate that Activity Section is exist in the Home Page")
    public void validateThatActivitySectionIsExistInTheHomePage() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getActivitySection());
        sKiHomePage.getActivitySection().isDisplayed();
        sKiHomePage.getActivitySectionTitle().isDisplayed();
        sKiHomePage.getActivitySectionDescription().isDisplayed();
        sKiHomePage.getActivitySectionButton().isDisplayed();
    }

    @Test(description = "Validate That The User Is Able To Navigate To Snow Park Page From Activity Section")
    public void validateThatTheUserIsAbleToNavigateToSnowParkPageFromActivitySection() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getHeroBannerSection());
        sKiHomePage.getScrollDownButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getActivitySectionButton());
        sKiHomePage.getActivitySectionButton().click();
        passesAndPackages.getSnowParkTab().isDisplayed();

    }

    @Test(description = "Validate that PENGUIN ENCOUNTER Section is exist in the Home Page")
    public void validateThatPenguinEncounterSectionIsExistInTheHomePage() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getPenguinEncounterTitle());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPenguinEncounterSection());
        sKiHomePage.getPenguinEncounterSection().isDisplayed();
        sKiHomePage.getPenguinEncounterTitle().isDisplayed();
        sKiHomePage.getPenguinEncounterDescription().isDisplayed();
        sKiHomePage.getPenguinEncounterImage().isDisplayed();
        sKiHomePage.getPenguinEncounterButton().isDisplayed();

    }

    @Test(description = "Validate That The User Is Able To Navigate To PENGUIN ENCOUNTER Page From PENGUIN ENCOUNTER Section")
    public void validateThatTheUserIsAbleToNavigateToPenguinEncounterPageFromPenguinEncounterSection() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getPenguinEncounterButton());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getActivitySectionButton());
        sKiHomePage.getActivitySectionButton().click();
        passesAndPackages.getPenguinEncounterTab().isDisplayed();

    }

    @Test(description = "Validate that Snow Cinema Section is exist in the Home Page")
    public void validateThatSnowCinemaSectionIsExistInTheHomePage() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getSnowCinemaTitle());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowCinemaSection());
        sKiHomePage.getSnowCinemaSection().isDisplayed();
        sKiHomePage.getSnowCinemaTitle().isDisplayed();
        sKiHomePage.getSnowCinemaDescription().isDisplayed();
        sKiHomePage.getSnowCinemaImage().isDisplayed();
        sKiHomePage.getSnowCinemaButton().isDisplayed();

    }

    @Test(description = "Validate That The User Is Able To Navigate To Snow Cinema Page From Snow Cinema Section")
    public void validateThatTheUserIsAbleToNavigateToSnowCinemaPageFromSnowCinemaSection() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getHitSlopsSection());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowCinemaButton());
        sKiHomePage.getSnowCinemaButton().click();
        passesAndPackages.getSnowCinemaTab().isDisplayed();

    }

    @Test(description = "Validate that Hit The Slopes Section is exist in the Home Page")
    public void validateThatHitTheSlopesSectionIsExistInTheHomePage() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getHitSlopsTitle());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getHitSlopsSection());
        sKiHomePage.getHitSlopsSection().isDisplayed();
        sKiHomePage.getHitSlopsTitle().isDisplayed();
        sKiHomePage.getHitSlopsDescription().isDisplayed();
        sKiHomePage.getHitSlopsImage().isDisplayed();
        sKiHomePage.getHitSlopsButton().isDisplayed();

    }

    @Test(description = "Validate That The User Is Able To Navigate To Snow board Page From Snow Hit The Slopes Section")
    public void validateThatTheUserIsAbleToNavigateToSnowBoardPageFromHitTheSlopesSection() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getHitSlopsSection());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowCinemaButton());
        sKiHomePage.getSnowCinemaButton().click();
        passesAndPackages.getSnowCinemaTab().isDisplayed();

    }


    @Test(description = "Validate that Learn To Ski & Board Section is exist in the Home Page")
    public void validateThatLearnToSkiAndBoardSectionIsExistInTheHomePage() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getLearnToSkiTitle());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getLearnToSkiSection());
        sKiHomePage.getLearnToSkiSection().isDisplayed();
        sKiHomePage.getLearnToSkiTitle().isDisplayed();
        sKiHomePage.getLearnToSkiSectionDescription().isDisplayed();
        sKiHomePage.getLearnToSkiSectionImage().isDisplayed();
        sKiHomePage.getLearnToSkiSectionButton().isDisplayed();

    }

    @Test(description = "Validate That The User Is Able To Navigate To School Academy Page From Learn To Ski & Board Section Section")
    public void validateThatTheUserIsAbleToNavigateToSchoolAcademyPageFromLearnToSkiAndBoardSection() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        SkiAcademy skiAcademy = new SkiAcademy(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getFooterSection());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getLearnToSkiSectionButton());
        sKiHomePage.getLearnToSkiSectionButton().click();
        skiAcademy.getExploreSkiAcademyHeader().isDisplayed();

    }

    @Test(description = "Validate That The User Is Able To Find Tickets From Find Tickets Bar")
    public void validateThatTheUserIsAbleToFindTicketsFromFindTicketsBar() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.threadSleep(12000);
        SharedMethods.MouseClickAction(sKiHomePage.getExperienceField());
        SharedMethods.MouseClickAction(sKiHomePage.getFirstPackage());
        SharedMethods.MouseClickAction(sKiHomePage.getDateField());
        SharedMethods.MouseClickAction(sKiHomePage.getDateNum());
        SharedMethods.MouseClickAction(sKiHomePage.getPeopleField());
        SharedMethods.MouseClickAction(sKiHomePage.getFindTicketButton());

    }

    @Test(description = "Validate that Footer is exist in the Home Page")
    public void validateThatFooterIsExistInTheHomePage() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getCopyRightSection());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getFooterSection());
        sKiHomePage.getFooterSection().isDisplayed();

    }

    @Test(description = "Validate that Logo is exist in the Footer")
    public void validateThatLogoIsExistInTheFooter() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getCopyRightSection());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getFooterSection());
        sKiHomePage.getLogoFooter().isDisplayed();
    }

    @Test(description = "Validate that Mall Timing is exist in the Footer")
    public void validateThatMallTimingIsExistInTheFooter() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getCopyRightSection());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getFooterSection());
        sKiHomePage.getMallTiming().isDisplayed();
    }

    @Test(description = "Validate that All links are exist under Ski Dubai section in Footer")
    public void validateAllLinksUnderSkiDubaiSectionInFooter() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getCopyRightSection());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getFooterSection());
        sKiHomePage.getShareLink().isDisplayed();
        sKiHomePage.getSustainabilityLink().isDisplayed();
        sKiHomePage.getContactUsLink().isDisplayed();
        sKiHomePage.getSiteMapLink().isDisplayed();
        sKiHomePage.getOurLocationLink().isDisplayed();
    }

    @Test(description = "Validate that All links are exist under Help And Support section in Footer")
    public void validateAllLinksUnderHelpAndSupportSectionInFooter() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getCopyRightSection());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getFooterSection());
        sKiHomePage.getAntiFraudDisclaimerLink().isDisplayed();
        sKiHomePage.getHealthAndSafetyLink().isDisplayed();
        sKiHomePage.getResponsibleDisclosurePolicyLink().isDisplayed();
        sKiHomePage.getTermsAndConditionsLink().isDisplayed();
        sKiHomePage.getCareersLink().isDisplayed();
    }

    @Test(description = "Validate that User Is Able To Join Newsletter ")
    public void validateThatUserIsAbleToJoinNewsletter() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getCopyRightSection());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getFooterSection());
        sKiHomePage.getEmailField().sendKeys(objXMLReader.getXMLData("email"));
        sKiHomePage.getJoinButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSuccessMessage());
        Assert.assertEquals(sKiHomePage.getSuccessMessage().getText(), "Your details have been received, we will contact you shortly. Thank you!");

    }

    @Test(description = "Validate that Social Icons are exist in Footer")
    public void validateSocialIconsInFooter() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getCopyRightSection());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getFooterSection());
        sKiHomePage.getFacebookIcon().isDisplayed();
        sKiHomePage.getInstagramIcon().isDisplayed();

    }

    @Test(description = "Validate that Payment Icons are exist in Footer")
    public void validatePaymentInFooter() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.moveToElement(sKiHomePage.getCopyRightSection());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getFooterSection());
        sKiHomePage.getPaymentIcons().isDisplayed();
    }

}
