package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.*;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.maf.utils.error_handlers.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class PersonalDetailsTests extends base {


    @Test(description = "Validate that the user can interact with the personal details form",retryAnalyzer = RetryAnalyzer.class)
    public void validateThatUserCanInterActWithPersonalDetailsTab()  {

        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        sKiHomePage.getAcceptCookiesButton ().click ();
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
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.waitUntilElementClickable (addOnsScreen.getAddMainAddOnsButton ());
        addOnsScreen.getAddMainAddOnsButton ().click ();
        SharedMethods.mouseClickAction (addOnsScreen.getCalendarButton());
        SharedMethods.mouseClickAction (addOnsScreen.getNextMonthButton ());
        SharedMethods.mouseClickAction (addOnsScreen.getMonthSelection ());
        SharedMethods.waitTillElementDisAppear (addOnsScreen.getCalenderFrame ());
        SharedMethods.mouseClickAction (addOnsScreen.getAdultsDropDown());
        SharedMethods.threadSleep (7000);
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        Assert.assertTrue (paymentDetailsPage.getCardCSV ().isDisplayed ());

    }


    @Test(description = "Logged in user-Verify editing personal details info is saved")

    public void testFillingEditForm()
    {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        sKiHomePage.getAcceptCookiesButton ().click ();
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
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.waitUntilElementClickable (addOnsScreen.getAddMainAddOnsButton ());
        addOnsScreen.getAddMainAddOnsButton ().click ();
        SharedMethods.mouseClickAction (addOnsScreen.getCalendarButton());
        SharedMethods.mouseClickAction (addOnsScreen.getNextMonthButton ());
        SharedMethods.mouseClickAction (addOnsScreen.getMonthSelection ());
        SharedMethods.waitTillElementDisAppear (addOnsScreen.getCalenderFrame ());
        SharedMethods.mouseClickAction (addOnsScreen.getAdultsDropDown());
        SharedMethods.threadSleep (7000);
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();

        PersonalDetailsPage personalDetailsObj= new PersonalDetailsPage(getDriver());
        personalDetailsObj.clickingOnEditProfile();
        personalDetailsObj.getFirstName().sendKeys ( objXMLReader.getXMLData ("firstName"));
        personalDetailsObj.getFirstName().sendKeys ( objXMLReader.getXMLData ("lastName"));
        personalDetailsObj.clickingOnSaveButton();
        //Assert.assertTrue( personalDetailsObj.getNameLabel());
    }

    @Test(description = "Guest user-Verify filling guest user info")
    public void testGuestUser() {

        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
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
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.waitUntilElementClickable (addOnsScreen.getAddMainAddOnsButton ());
        addOnsScreen.getAddMainAddOnsButton ().click ();
        SharedMethods.mouseClickAction (addOnsScreen.getCalendarButton());
        SharedMethods.mouseClickAction (addOnsScreen.getNextMonthButton ());
        SharedMethods.mouseClickAction (addOnsScreen.getMonthSelection ());
        SharedMethods.waitTillElementDisAppear (addOnsScreen.getCalenderFrame ());
        SharedMethods.mouseClickAction (addOnsScreen.getAdultsDropDown());
        SharedMethods.threadSleep (7000);
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();

        PersonalDetailsPage personalDetailsObj= new PersonalDetailsPage(getDriver());
        personalDetailsObj.clickingOnEditProfile();
        personalDetailsObj.getFirstName().sendKeys ( objXMLReader.getXMLData ("firstName"));
        personalDetailsObj.getFirstName().sendKeys ( objXMLReader.getXMLData ("lastName"));
        personalDetailsObj.clickingOnSaveButton();
        //Assert.assertTrue( personalDetailsObj.getNameLabel());

    }

    @Test(description = "Guest user-Verify user is not able to processed for tickets required login")
    public void testTicketRequiredLogin() {

        PersonalDetailsPage personalDetailsObj= new PersonalDetailsPage(getDriver());

    }
    @Test(description = "Logged in user-Verify Verify editing ticket info")
    public void testEditingTicketInfo() {

        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        sKiHomePage.getAcceptCookiesButton ().click ();
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
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.waitUntilElementClickable (addOnsScreen.getAddMainAddOnsButton ());
        addOnsScreen.getAddMainAddOnsButton ().click ();
        SharedMethods.mouseClickAction (addOnsScreen.getCalendarButton());
        SharedMethods.mouseClickAction (addOnsScreen.getNextMonthButton ());
        SharedMethods.mouseClickAction (addOnsScreen.getMonthSelection ());
        SharedMethods.waitTillElementDisAppear (addOnsScreen.getCalenderFrame ());
        SharedMethods.mouseClickAction (addOnsScreen.getAdultsDropDown());
        SharedMethods.threadSleep (7000);
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsObj= new PersonalDetailsPage(getDriver());
        personalDetailsObj.clickingOnEditProfile();


    }


}
