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


    @Test(description = "Validate that the user can interact with the personal details form")
    public void validateThatUserCanInterActWithPersonalDetailsTab()  {

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
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.waitUntilElementVisible (addOnsScreen.getAddMainAddOnsButton());
        SharedMethods.waitUntilElementVisible(addOnsScreen.getContinueButton ());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible (paymentDetailsPage.getCardCSV ());
        Assert.assertTrue (paymentDetailsPage.getCardCSV ().isDisplayed ());

    }


    @Test(description = "Logged in user-Verify editing personal details info is saved")

    public void testFillingEditForm()
    {
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
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(personalDetailsPage.getPersonalDetailsHeader());
        SharedMethods.waitTillClickAble (personalDetailsPage.getEditProfileButton());
        personalDetailsPage.getEditProfileButton().click ();
        String name = objXMLReader.getXMLData ("firstName");
        String surname = objXMLReader.getXMLData ("lastName");
        SharedMethods.clearField(personalDetailsPage.getFirstName());
        personalDetailsPage.getFirstName().sendKeys(objXMLReader.getXMLData ("firstName"));
        SharedMethods.clearField(personalDetailsPage.getLastName());
        personalDetailsPage.getLastName().sendKeys(objXMLReader.getXMLData ("lastName"));
        SharedMethods.waitTillClickAble (personalDetailsPage.getSaveButton());
        personalDetailsPage.getSaveButton().click ();
        Assert.assertEquals(personalDetailsPage.getNameLabel().getText(), name.toUpperCase() + " " +surname.toUpperCase());
    }

    @Test(description = "Guest user-Verify filling the guest user with valid info is working fine")
    public void testGuestUser() {
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkOption());
        sKiHomePage.getSnowParkOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
       SharedMethods.waitUntilElementVisible(passesAndPackages.getSnowParkPassesHeader());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(personalDetailsPage.getPersonalDetailsHeader());
        personalDetailsPage.clickingMissRadioButton();
        personalDetailsPage.getFirstName().sendKeys(objXMLReader.getXMLData ("firstName"));
        personalDetailsPage.getLastName().sendKeys (objXMLReader.getXMLData ("lastName"));
        personalDetailsPage.getMobileNum().sendKeys (objXMLReader.getXMLData ("phone"));
        personalDetailsPage.getEmail().sendKeys (objXMLReader.getXMLData ("email"));
        personalDetailsPage.getCountryDropDownList().click();
        SharedMethods.mouseClickAction(personalDetailsPage.getAndoraCountry());
        SharedMethods.mouseClickAction (personalDetailsPage.getBookingInformation());
        SharedMethods.mouseClickAction (personalDetailsPage.getTermsConditonsCheckbox());
        SharedMethods.mouseClickAction(personalDetailsPage.getContinueToPayment ());
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible (paymentDetailsPage.getCardCSV ());
       Assert.assertTrue (paymentDetailsPage.getCardCSV ().isDisplayed ());
    }




}
