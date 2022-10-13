package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.*;
import org.maf.utils.Common_steps.SharedSteps;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.maf.utils.error_handlers.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class PaymentDetailsTests extends base {


    @Test(description = "Validate that the user can fill payment details info and submit payment")
    public void ValidateThatUserCanFillPaymentDetailsInfo() {

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
        addOnsScreen.getContinueButton ().click ();
        SharedMethods.mouseClickAction (addOnsScreen.getCalendarButton());
        SharedMethods.mouseClickAction (addOnsScreen.getNextMonthButton ());
        SharedMethods.mouseClickAction (addOnsScreen.getMonthSelection ());
        SharedMethods.waitTillElementDisAppear (addOnsScreen.getCalenderFrame ());
        SharedMethods.mouseClickAction (addOnsScreen.getAdultsDropDown());
        SharedMethods.threadSleep (7000);
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());

        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData ("masterCard1"),
                objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();

    }

}
