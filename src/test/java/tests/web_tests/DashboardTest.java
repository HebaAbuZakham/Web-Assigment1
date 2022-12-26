package tests.web_tests;
import com.github.javafaker.Faker;
import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.*;
import org.maf.utils.Common_steps.SharedSteps;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)

public class DashboardTest extends base {
    @Test(description = "booking - no post booking steps done")
    public void VerifNoStepsDone()
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
        ConfirmationPageTest confirmationPageTest= new ConfirmationPageTest();
        confirmationPageTest.validateThatTheUserBookPassWithPromoCode();
        sKiHomePage.getMyAccount().click();
        sKiHomePage.getDashboard().click();
        DashboardPage dashboardPage=new DashboardPage(getDriver());
        SharedMethods.waitUntilElementVisible(dashboardPage.getAddGuestCircleNotActive());
        Assert.assertTrue(dashboardPage.getAddGuestCircleNotActive().isDisplayed());
    }
    @Test(description = "booking - only assign guest from post booking steps done")
    public void VerifAssignGuestDone()
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
        AddGuestsTest addGuestsTest=new AddGuestsTest();
        addGuestsTest.validateThatTheUserIsAbleToAddAdultGuest ();
        sKiHomePage.getMyAccount().click();
        sKiHomePage.getDashboard().click();
        DashboardPage dashboardPage=new DashboardPage(getDriver());
        SharedMethods.waitUntilElementVisible(dashboardPage.getAddGuestCircleNotActive());
        Assert.assertTrue(dashboardPage.getAddGuestCircleActive().isDisplayed());
    }
    @Test(description = "booking - assign guest + gear from post booking steps done")
    public void VerifyAssignGearsDone()
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
        AddGearTests addGearTests = new AddGearTests();
        addGearTests.validateThatTheUserIsAbleToAddGear ();
        sKiHomePage.getMyAccount().click();
        sKiHomePage.getDashboard().click();
        DashboardPage dashboardPage=new DashboardPage(getDriver());
        SharedMethods.waitUntilElementVisible(dashboardPage.getAddGuestCircleNotActive());
        Assert.assertTrue(dashboardPage.getAddGuestCircleActive().isDisplayed());
        Assert.assertTrue(dashboardPage.getChooseGearActive().isDisplayed());
    }
    @Test(description = "booking - all post booking steps done")
    public void VerifyAllStepsDone()
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
        AddGearTests addGearTests = new AddGearTests();
        addGearTests.validateThatTheUserIsAbleToAddGear ();
        sKiHomePage.getMyAccount().click();
        sKiHomePage.getDashboard().click();
        DashboardPage dashboardPage=new DashboardPage(getDriver());
        SharedMethods.waitUntilElementVisible(dashboardPage.getAddGuestCircleNotActive());
        Assert.assertTrue(dashboardPage.getAddGuestCircleActive().isDisplayed());
        Assert.assertTrue(dashboardPage.getChooseGearActive().isDisplayed());
    }


}


