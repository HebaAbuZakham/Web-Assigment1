package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.LoginPage;
import org.maf.page_objects.SKiHomePage;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
//import org.maf.utils.error_handlers.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class LoginTest extends base {

    @Test(description = "Validate that user is able to login")
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

    @Test(description = "Validate that user can not login with wrong Email")
    public void validateThatUserIsNotAbleToLogInWithWrongEmail() {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys (objXMLReader.getXMLData ("email"));
        loginPage.getPassword ().sendKeys (objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        Assert.assertEquals (loginPage.getWrongMessage ().getText() , "Wrong email and / or wrong password. Please try again.");
    }

    @Test(description = "Validate that user can not login with wrong password")
    public void validateThatUserIsNotAbleToLogInWithWrongPassword() {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys (objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys (objXMLReader.getXMLData ("firstName"));
        loginPage.getLoginCTA ().click ();
        Assert.assertEquals (loginPage.getWrongMessage ().getText() , "Wrong email and / or wrong password. Please try again.");

    }

    @Test(description = "Validate that user can not login with wrong email and password")
    public void validateThatUserIsNotAbleToLogInWithWrongEmailAndPassword() {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys (objXMLReader.getXMLData ("email"));
        loginPage.getPassword ().sendKeys (objXMLReader.getXMLData ("firstName"));
        loginPage.getLoginCTA ().click ();
        Assert.assertEquals (loginPage.getWrongMessage ().getText() , "Wrong email and / or wrong password. Please try again.");

    }

    @Test(description = "Validate that user can not login if email is not filled")
    public void validateThatUserIsNotAbleToLogInIfEmailIsNotFilled() {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys (objXMLReader.getXMLData ("userName"));
        loginPage.getUserName ().clear();
        loginPage.getPassword ().sendKeys (objXMLReader.getXMLData ("passWord"));
        loginPage.getUserName ().click ();
        Assert.assertEquals (loginPage.getNotFilledEmail().getText() , "Please enter the email.");

    }

    @Test(description = "Validate that user can not login if password is not filled")
    public void validateThatUserIsNotAbleToLogInIfPasswordIsNotFilled() {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys (objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys (objXMLReader.getXMLData ("passWord"));
        loginPage.getPassword ().clear();
        loginPage.getUserName ().click ();
        Assert.assertEquals (loginPage.getNotFilledPassword().getText() , "Please enter the password.");

    }

    @Test(description = "Validate that user can not login if email and password are not filled")
    public void validateThatUserIsNotAbleToLogInIfEmailAndPasswordAreNotFilled() {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getNotFilledEmail ().click ();
        loginPage.getNotFilledPassword().click ();
        loginPage.getNotFilledEmail ().click ();
        Assert.assertEquals (loginPage.getNotFilledEmail().getText() , "Please enter the email.");
        Assert.assertEquals (loginPage.getNotFilledPassword().getText() , "Please enter the password.");

    }

    @Test(description = "Validate that user can not login with wrong Email Format")
    public void validateThatUserIsNotAbleToLogInWithWrongEmailFormat() {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys (objXMLReader.getXMLData ("firstName"));
        loginPage.getPassword ().sendKeys (objXMLReader.getXMLData ("passWord"));
        Assert.assertEquals (loginPage.getNotFilledEmail().getText() , "Please enter a valid email address.");

    }
}
