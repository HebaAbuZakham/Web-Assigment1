package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.AddOnsScreen;
import org.maf.page_objects.LoginPage;
import org.maf.page_objects.PassesAndPackages;
import org.maf.page_objects.SKiHomePage;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.maf.utils.error_handlers.RetryAnalyzer;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class PassesAndPackagesTest extends base {


    @Test(description = "Validate that user can click on slope buy button",retryAnalyzer = RetryAnalyzer.class)
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
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.waitUntilElementVisible (addOnsScreen.getAddMainAddOnsButton());
        Assert.assertTrue (addOnsScreen.getAddMainAddOnsButton().isDisplayed ());

    }

    @Test(description = "Validate user select Snow Cinema Ticket",retryAnalyzer = RetryAnalyzer.class)
    public void validateThatUserSelectSnowCinemaBuyButton() {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSnowCinemaOption ());
        sKiHomePage.getSnowCinemaOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedMethods.threadSleep (1000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSnowCinemaPassesHeader ());
        SharedMethods.SwitchToNewTap(passesAndPackages.getSnowCinemaPassBuyButton());
        Assert.assertTrue(SharedMethods.urlShouldInclude( objXMLReader.getXMLData("VOX-URL")));
    }
}
