package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.*;
import org.maf.utils.Common_steps.SharedSteps;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.maf.utils.error_handlers.RetryAnalyzer;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class PassesAndPackagesTest extends base {


    @Test(description = "Validate that user can click on slope buy button")
    public void validateThatUserCanSelectBuySlope()  {

        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSlopeOption ());
        sKiHomePage.getSlopeOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedMethods.threadSleep (1000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSlopePassesHeader ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.waitUntilElementVisible (addOnsScreen.getAddMainAddOnsButton());
        Assert.assertTrue (addOnsScreen.getAddMainAddOnsButton().isDisplayed ());

    }

    @Test(description = "Validate user select Snow Cinema Ticket")
    public void validateThatUserSelectSnowCinemaBuyButton() {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSnowCinemaLink ());
        sKiHomePage.getSnowCinemaLink ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedMethods.threadSleep (1000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSnowCinemaPassesHeader ());
        SharedMethods.SwitchToNewTap(passesAndPackages.getSnowCinemaPassBuyButton());
        Assert.assertTrue(SharedMethods.urlShouldInclude( objXMLReader.getXMLData("VOX-URL")));
    }

    @Test(description = "Validate that user can click on snow park buy button")
    public void validateThatUserSelectBuySnowPark(){
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkOption());
        sKiHomePage.getSnowParkOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible(passesAndPackages.getSnowParkPassesHeader());
        SharedMethods.SwitchToNewTap(passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.jsScrollDown (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.waitUntilElementVisible (addOnsScreen.getAddMainAddOnsButton());
        Assert.assertTrue (addOnsScreen.getAddMainAddOnsButton().isDisplayed ());
    }
    @Test(description = "Validate that user can click on penguin encounter buy button")
    public void validateThatUserSelectBuyPenguinEncounter(){
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementClickable(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPenguinEncounterOption());
        sKiHomePage.getPenguinEncounterOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible(passesAndPackages.getPenguinEncounterPassesHeader());
        SharedMethods.threadSleep (1000);
        SharedMethods.SwitchToNewTap(passesAndPackages.getPenguinEncounterPassBuyButton());
        SharedMethods.jsScrollDown(passesAndPackages.getPenguinEncounterPassBuyButton());
        SharedMethods.threadSleep (3000);
        ActivitiesPage activitiesPage= new ActivitiesPage(getDriver());
        SharedMethods.waitUntilElementVisible(activitiesPage.getActivitiesTitle());
        Assert.assertTrue(activitiesPage.getActivitiesTitle().isDisplayed());


    }
    
    @Test(description = "Validate that user can book package with bonus activity")
    public void validateThatUserBuyPackageWithBonusActivity(){
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementClickable(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages());
        SharedMethods.clickOn(sKiHomePage.getSnowParkOption());
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible(passesAndPackages.getSnowParkPassesHeader());
        SharedMethods.SwitchToNewTap(passesAndPackages.getSnowPremiumPassBuyButton());
        ActivitiesPage activitiesPage= new ActivitiesPage(getDriver());
        SharedMethods.waitUntilElementVisible(activitiesPage.getActivitiesTitle());
        Assert.assertTrue(activitiesPage.getActivitiesTitle().isDisplayed());
        AddOnsScreen addOnsScreen= new AddOnsScreen(getDriver()) ;
        SharedSteps.userSearchCalendarForDate();
        SharedMethods.clickOn(activitiesPage.getLastActivityTimeSlot());
        SharedMethods.clickOn(activitiesPage.getPackageSlopePassAddButton());
        SharedMethods.clickOn(activitiesPage.getAddTicketButton());
        SharedMethods.clickAction(activitiesPage.getSlopeActivity2HoursSlopeButton());
        SharedMethods.threadSleep (4000);
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.threadSleep (1000);
        SharedMethods.clickOn(personalDetailsPage.getContinueToPayment());
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.threadSleep (3000);
        SharedMethods.waitUntilElementVisible (paymentDetailsPage.getCardCSV ());
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData ("masterCard1"),
                objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));        
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        SharedMethods.clickOn(paymentDetailsPage.getPay ());
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.threadSleep (5000);
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());

    }

    @Test(description = "Validate that user can book package without bonus activity")
    public void validateThatUserBuyPackageWithoutBonusActivity(){
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementClickable(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (14000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkOption());
        sKiHomePage.getSnowParkOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible(passesAndPackages.getSnowParkPassesHeader());
        SharedMethods.threadSleep (2000);
        SharedMethods.waitUntilElementClickable(passesAndPackages.getSnowDaycationPassBuyButton());
        SharedMethods.jsScrollDown(passesAndPackages.getSnowDaycationPassBuyButton());
        SharedMethods.clickOn(passesAndPackages.getSnowDaycationPassBuyButton());
        ActivitiesPage activitiesPage= new ActivitiesPage(getDriver());
        SharedMethods.waitUntilElementVisible(activitiesPage.getActivitiesTitle());
        Assert.assertTrue(activitiesPage.getActivitiesTitle().isDisplayed());
        AddOnsScreen addOnsScreen= new AddOnsScreen(getDriver()) ;
        SharedMethods.threadSleep (4000);
        SharedMethods.clickOn(activitiesPage.getPackageSlopePassAddButton());
        SharedMethods.clickOn(activitiesPage.getAddTicketButton());
        SharedMethods.threadSleep (4000);
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.threadSleep (3000);
        SharedMethods.waitUntilElementVisible (paymentDetailsPage.getCardCSV ());
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData ("masterCard1"),
                objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        SharedMethods.clickOn(paymentDetailsPage.getPay ());
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.threadSleep (5000);
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());

    }
}
