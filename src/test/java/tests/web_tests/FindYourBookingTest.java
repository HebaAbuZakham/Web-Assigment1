package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.*;
import org.maf.utils.Common_steps.SharedSteps;
import org.maf.utils.common.SharedMethods;
import org.maf.utils.handler.XMLReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindYourBookingTest extends base {



    @Test(description = "Logged in user- Verify that the user is able to search on valid booking reference")
    public void validateValidBookingForLoggedinUser() {

        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getMyAccount());
        SharedMethods.clickAction (sKiHomePage.getMyAccount());
        SharedMethods.clickAction ( sKiHomePage.getDashboard());
        SharedMethods.threadSleep (1200);
        DashboardPage dashboard= new DashboardPage(getDriver());
        String FieldValue= dashboard.getBookingRef().getText();
        SharedMethods.threadSleep (1200);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPlanYourVisitNav ());
        sKiHomePage.getPlanYourVisitNav ().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getFindYourBookingLink());
        sKiHomePage.getFindYourBookingLink().click();
        FindYourBooking findYourBooking= new FindYourBooking(getDriver());
        findYourBooking.getFindYourBookingField().sendKeys(FieldValue);
        SharedMethods.waitUntilElementVisible(findYourBooking.getValidationMessage());
        Assert.assertTrue (findYourBooking.getValidationMessage().isDisplayed());


    }

    @Test(description = "Logged in user- Verify that validation message is shown when search with invalid booking reference")
    public void validateInvalidBookingForLoggedinUser() {

        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPlanYourVisitNav ());
        SharedMethods.clickAction (sKiHomePage.getPlanYourVisitNav ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getFindYourBookingLink());
        sKiHomePage.getFindYourBookingLink().click();
        FindYourBooking findYourBooking= new FindYourBooking(getDriver());
        findYourBooking.getFindYourBookingField().click();
        findYourBooking.getFindYourBookingField().sendKeys(objXMLReader.getXMLData ("invalidBooking"));
        findYourBooking.getSubmitAndContinue().click();
        SharedMethods.waitUntilElementVisible(findYourBooking.getValidationMessage());
        Assert.assertTrue (findYourBooking.getValidationMessage().isDisplayed());


    }

    @Test(description = "Logged in user- Verify that the user is not able to search on  booking reference belong to another user")
    public void validateBookingBelongForAnotherUser() {

        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName1"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord1"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        sKiHomePage.getMyAccount().click();
        sKiHomePage.getDashboard().click();
        DashboardPage dashboard= new DashboardPage(getDriver());
        String FieldValue= dashboard.getBookingRef().getText();
        SharedMethods.clickAction (sKiHomePage.getMyAccount());
        SharedMethods.clickAction ( sKiHomePage.getLogout());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPlanYourVisitNav ());
        SharedMethods.clickAction (sKiHomePage.getPlanYourVisitNav ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getFindYourBookingLink());
        sKiHomePage.getFindYourBookingLink().click();
        FindYourBooking findYourBooking= new FindYourBooking(getDriver());
        findYourBooking.getFindYourBookingField().sendKeys(FieldValue);
        SharedMethods.waitUntilElementVisible(findYourBooking.getValidationMessage());
        Assert.assertTrue (findYourBooking.getValidationMessage().isDisplayed());

    }

    @Test(description = "Guest user- Verify that the user is not able to search on valid booking id")
    public void validateValidBookingForGuestUser() {
        PersonalDetailsTests personalDetails= new PersonalDetailsTests();
        personalDetails.testGuestUser();
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getPaymentHead());
        paymentDetailsPage.getCardNumberField ().sendKeys (objXMLReader.getXMLData ("masterCard1"));
        SharedSteps.userFillCCInfo(objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
        String value= SharedMethods.FieldValue(confirmationPage.getBookingRef());
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPlanYourVisitNav ());
        SharedMethods.clickAction (sKiHomePage.getPlanYourVisitNav ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getFindYourBookingLink());
        sKiHomePage.getFindYourBookingLink().click();
        FindYourBooking findYourBooking= new FindYourBooking(getDriver());
        findYourBooking.getFindYourBookingField().sendKeys(value);
        findYourBooking.getSubmitAndContinue().click();
        Assert.assertTrue (findYourBooking.getGuestUserFindBooking().isDisplayed());


    }



}
