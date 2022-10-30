package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.LoginPage;
import org.maf.page_objects.SKiHomePage;
import org.maf.page_objects.TransactionsPage;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.maf.utils.error_handlers.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.maf.core.instance.SelInstance.getDriver;
import static org.maf.core.instance.SelInstance.objXMLReader;

@Listeners(TestListener.class)
public class TransactionsTests extends base {

    @Test(description = "Verify the guest user can not access Transactions page")
    public void verifyTheGuestUserCanNotAccessTransactions() {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        String buttonValue = sKiHomePage.getSignInButton ().getText();
        Assert.assertEquals(buttonValue,"Sign in");

    }

    @Test(description = "Verify the logged user can access Transactions page")
    public void verifyTheLoggedUserCanAccessTransactions() {
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
        sKiHomePage.getUserAvatar ().click();
    }

    @Test(description = "Verify the navigation to transactions page from header")
    public void VerifyTheNavigationToTransactionsPageFromHeader() throws InterruptedException {
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
        SharedMethods.waitUntilElementVisible (sKiHomePage.getUserAvatar ());
        sKiHomePage.getUserAvatar().click();
        TransactionsPage transactionsPage = new TransactionsPage (getDriver ());
        transactionsPage.getTransactionBtn().click();
        Assert.assertTrue (transactionsPage.getSideList().isDisplayed ());
        String transactionTitle = transactionsPage.getTransactionTitle().getText();
        Assert.assertEquals (transactionTitle,"TRANSACTION HISTORY");

    }

    @Test(description = "Verify the navigation to transactions page from Account page")
    public void VerifyTheNavigationToTransactionsPageFromAccountPage() throws InterruptedException {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUserName().sendKeys(objXMLReader.getXMLData("userName"));
        loginPage.getPassword().sendKeys(objXMLReader.getXMLData("passWord"));
        loginPage.getLoginCTA().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getUserAvatar());
        Assert.assertTrue(sKiHomePage.getUserAvatar().isDisplayed());
        sKiHomePage.getUserAvatar().click();
        TransactionsPage transactionsPage = new TransactionsPage(getDriver());
        transactionsPage.getDashboard().click();
        Assert.assertTrue(transactionsPage.getSideList().isDisplayed());
        transactionsPage.getTransactionLeftSide().click();
        String transactionTitle = transactionsPage.getTransactionTitle().getText();
        Assert.assertEquals (transactionTitle,"TRANSACTION HISTORY");
    }

    @Test(description = "verify content of Account page (left side navigator)")
    public void VerifyContentOfAccountPageLeftSideNavigator() throws InterruptedException {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUserName().sendKeys(objXMLReader.getXMLData("userName"));
        loginPage.getPassword().sendKeys(objXMLReader.getXMLData("passWord"));
        loginPage.getLoginCTA().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getUserAvatar());
        Assert.assertTrue(sKiHomePage.getUserAvatar().isDisplayed());
        sKiHomePage.getUserAvatar().click();
        TransactionsPage transactionsPage = new TransactionsPage(getDriver());
        transactionsPage.getDashboard().click();
        transactionsPage.getProfile().getText().equals("Profile");
        transactionsPage.getProfile().click();
        transactionsPage.getYourDetails().getText().equals( "Personal details");
        transactionsPage.getWaiver().getText().equals( "Waiver form");
        transactionsPage.getGear().getText().equals("Set your Gear");
        transactionsPage.getMembership().getText().equals( "Memberships");
        transactionsPage.getTransactionLeftSide().getText().equals( "Transactions");
        transactionsPage.getPayment().getText().equals( "Payments");
        transactionsPage.getShare().getText().equals( "SHARE");
        transactionsPage.getSkiPassport().getText().equals( "Ski Passport");
        transactionsPage.getSnowboardPassport().getText().equals( "Snowboard Passport");
    }

    @Test(description = "Verify selected item is highlighted in left side navigator ")
    public void VerifySelectedItemIsHighlightedInLeftSideNavigator () throws InterruptedException {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUserName().sendKeys(objXMLReader.getXMLData("userName"));
        loginPage.getPassword().sendKeys(objXMLReader.getXMLData("passWord"));
        loginPage.getLoginCTA().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getUserAvatar());
        TransactionsPage transactionsPage = new TransactionsPage(getDriver());
        Assert.assertTrue(sKiHomePage.getUserAvatar().isDisplayed());
        sKiHomePage.getUserAvatar().click();
        SharedMethods.waitUntilElementVisible(transactionsPage.getDashboard());
        transactionsPage.getDashboard().click();
        Assert.assertTrue(transactionsPage.getSideList().isDisplayed());
        transactionsPage.getTransactionLeftSide().click();
        Thread.sleep(10000);
        String highlighted = transactionsPage.getTransactionLeftSide().getAttribute("class");
        String normal  = transactionsPage.getProfile().getAttribute("class");
        Assert.assertEquals(highlighted, "link nuxt-link-exact-active nuxt-link-active active");
        Assert.assertNotEquals(highlighted, normal);
    }

}
