package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.LoginPage;
import org.maf.page_objects.SKiHomePage;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.maf.utils.error_handlers.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class LoginTest extends base {

    @Test(description = "Validate that user is able to login",retryAnalyzer = RetryAnalyzer.class)
    public void validateThatUserIsAbleToLogIn() {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys (objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys (objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.waitUntilElementVisible (sKiHomePage.getUserAvatar ());
        Assert.assertTrue (sKiHomePage.getUserAvatar ().isDisplayed ());
    }
}
