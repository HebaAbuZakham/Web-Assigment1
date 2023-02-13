package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.LoginPage;
import org.maf.page_objects.SignUpPage;
import org.maf.page_objects.SkiHomePage;
import org.maf.utils.ExtentReport.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.maf.utils.common.SharedMethods.waitUntilElementVisible;
//154924
@Listeners(TestListener.class)
public class LoginTest extends base {
    SoftAssert softAssert = new SoftAssert();
    @Test(description = "validate that the uer can sign in correctly")
    public void ValidateTheSignIn(){
        SkiHomePage skiHomePage = new SkiHomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        waitUntilElementVisible(skiHomePage.getSignInButton());
        skiHomePage.getSignInButton().click();
        loginPage.getEmail().sendKeys(objXMLReader.getXMLData("userName1"));
        loginPage.getPassword().sendKeys(objXMLReader.getXMLData("passWord1"));
        loginPage.getSignInButton().click();
        //Assert that the login working fine
        waitUntilElementVisible(skiHomePage.getProfileAvatar());
        softAssert.assertTrue(skiHomePage.getProfileAvatar().isDisplayed());
        softAssert.assertAll();
    }
}
