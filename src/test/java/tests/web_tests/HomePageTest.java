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
public class HomePageTest extends base {


    @Test(description = "Validate that user is able to navigate to homepage and accept cookies",retryAnalyzer = RetryAnalyzer.class)
    public void validateThatUserIsAbleToNavigateToHomePageAndAcceptCookies() {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
    }

    @Test(description = "Validate that user can select slop from passes and packages DropDown")
    public void validateThatUserCanSelectSlopeFromPassesAndPackagesDropDown()  {
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
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSlopePassesHeader ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        Assert.assertTrue (passesAndPackages.getSlopePassesHeader ().isDisplayed ());

    }

    @Test(description = "Validate that Dubai is exist in the locations DropDown ")
    public void validateThatDubaiIsExistInTheLocationsDropDown(){
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getLocationsList());
        SharedMethods.waitUntilElementClickable(sKiHomePage.getLocationsList());
        sKiHomePage.getLocationsList().click();
        Assert.assertEquals(sKiHomePage.getDubaiLocation().getText(), "Ski Dubai");
       // Assert.assertTrue(sKiHomePage.getDubaiLocation().isDisplayed());
        

    }

    }
