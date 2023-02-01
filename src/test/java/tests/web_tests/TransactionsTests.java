package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.LoginPage;
import org.maf.page_objects.PassesAndPackages;
import org.maf.page_objects.SKiHomePage;
import org.maf.page_objects.TransactionsPage;
import org.maf.utils.Common_steps.SharedSteps;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.maf.utils.error_handlers.RetryAnalyzer;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;


import static org.maf.core.instance.SelInstance.getDriver;
import static org.maf.core.instance.SelInstance.objXMLReader;

@Listeners(TestListener.class)
public class TransactionsTests extends base {

    @Test(description = "Verify the guest user can not access Transactions page")
    public void verifyTheGuestUserCanNotAccessTransactions() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        String buttonValue = sKiHomePage.getSignInButton().getText();
        Assert.assertEquals(buttonValue, "Sign In");
    }

    @Test(description = "Verify the logged user can access Transactions page")
    public void verifyTheLoggedUserCanAccessTransactions() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUserName().sendKeys(objXMLReader.getXMLData("userName"));
        loginPage.getPassword().sendKeys(objXMLReader.getXMLData("passWord"));
        SharedMethods.threadSleep (1000);
        loginPage.getLoginCTA().click();
        SharedMethods.threadSleep (12000);
        sKiHomePage.getMyAccount().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getTransaction());
        sKiHomePage.getTransaction().click();
        TransactionsPage transactionsPage= new TransactionsPage(getDriver());
        SharedMethods.waitUntilElementVisible(transactionsPage.getTransactionTitle());

    }// transactions link xpath needs to be updated

    @Test(description = "Verify the navigation to transactions page from header")
    public void VerifyTheNavigationToTransactionsPageFromHeader() throws InterruptedException {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUserName().sendKeys(objXMLReader.getXMLData("userName"));
        loginPage.getPassword().sendKeys(objXMLReader.getXMLData("passWord"));
        SharedMethods.threadSleep (1000);
        loginPage.getLoginCTA().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getUserAvatar());
        Assert.assertTrue(sKiHomePage.getUserAvatar().isDisplayed());
        SharedMethods.threadSleep(10000);
        SharedMethods.waitUntilElementClickable(sKiHomePage.getUserAvatar());
        sKiHomePage.getUserAvatar().click();
        TransactionsPage transactionsPage = new TransactionsPage(getDriver());
        transactionsPage.getTransactionBtn().click();
        Assert.assertTrue(transactionsPage.getSideList().isDisplayed());
        String transactionTitle = transactionsPage.getTransactionTitle().getText();
        Assert.assertEquals(transactionTitle, "TRANSACTION HISTORY");

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
        SharedMethods.threadSleep(9000);
        SharedMethods.waitUntilElementVisible(sKiHomePage.getUserAvatar());
        SharedMethods.mouseClickAction(sKiHomePage.getUserAvatar());
        TransactionsPage transactionsPage = new TransactionsPage(getDriver());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getDashboard());
        SharedMethods.mouseClickAction(transactionsPage.getDashboard());
        SharedMethods.threadSleep(1000);
        SharedMethods.mouseClickAction(transactionsPage.getDashboard());
        SharedMethods.clickOn(transactionsPage.getTransactionLeftSide());
        SharedMethods.waitUntilElementVisible(transactionsPage.getTransactionTitle());
        String transactionTitle = transactionsPage.getTransactionTitle().getText();
        Assert.assertEquals(transactionTitle, "TRANSACTION HISTORY");
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
        SharedMethods.threadSleep(12000);
        SharedMethods.waitUntilElementVisible(sKiHomePage.getUserAvatar());
        Assert.assertTrue(sKiHomePage.getUserAvatar().isDisplayed());
        SharedMethods.mouseClickAction(sKiHomePage.getUserAvatar());
        SharedMethods.threadSleep(1200);
        TransactionsPage transactionsPage = new TransactionsPage(getDriver());
        SharedMethods.mouseClickAction(transactionsPage.getProfile());
        SharedMethods.threadSleep(4000);
        transactionsPage.getProfile().getText().equals("Profile");
        transactionsPage.getProfile().click();
        transactionsPage.getYourDetails().getText().equals("Personal details");
        transactionsPage.getWaiver().getText().equals("Waiver form");
        transactionsPage.getGear().getText().equals("Set your Gear");
        transactionsPage.getMembership().getText().equals("Memberships");
        transactionsPage.getTransactionLeftSide().getText().equals("Transactions");
        transactionsPage.getPayment().getText().equals("Payments");
        transactionsPage.getShare().getText().equals("SHARE");
        transactionsPage.getSkiPassport().getText().equals("Ski Passport");
        transactionsPage.getSnowboardPassport().getText().equals("Snowboard Passport");
    }

    @Test(description = "Verify selected item is highlighted in left side navigator ")
    public void VerifySelectedItemIsHighlightedInLeftSideNavigator() throws InterruptedException {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUserName().sendKeys(objXMLReader.getXMLData("userName"));
        loginPage.getPassword().sendKeys(objXMLReader.getXMLData("passWord"));
        loginPage.getLoginCTA().click();
        SharedMethods.threadSleep(10000);
        SharedMethods.waitUntilElementVisible(sKiHomePage.getUserAvatar());
        TransactionsPage transactionsPage = new TransactionsPage(getDriver());
        Assert.assertTrue(sKiHomePage.getUserAvatar().isDisplayed());
        sKiHomePage.getUserAvatar().click();
        SharedMethods.waitUntilElementVisible(transactionsPage.getDashboard());
        transactionsPage.getDashboard().click();
        Assert.assertTrue(transactionsPage.getSideList().isDisplayed());
        transactionsPage.getTransactionLeftSide().click();
        SharedMethods.threadSleep(10000);
        String highlighted = transactionsPage.getTransactionLeftSide().getAttribute("class");
        String normal = transactionsPage.getProfile().getAttribute("class");
        Assert.assertEquals(highlighted, "link nuxt-link-exact-active nuxt-link-active active");
        Assert.assertNotEquals(highlighted, normal);
    }

    @Test(description = "verify page content for user with no transactions")
    public void VerifyTransactionsAreCollapsed()
    {
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUserName().sendKeys(objXMLReader.getXMLData("userWithNoTransactionsEmail"));
        loginPage.getPassword().sendKeys(objXMLReader.getXMLData("userWithNoTransactionsPassWord"));
        loginPage.getLoginCTA().click();
        SharedMethods.threadSleep (15000);
        SharedMethods.waitUntilElementVisible(sKiHomePage.getUserAvatar());
        sKiHomePage.getUserAvatar().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getTransaction());
        sKiHomePage.getTransaction().click();
        TransactionsPage transactionsPage= new TransactionsPage(getDriver());
        SharedMethods.waitUntilElementVisible(transactionsPage.getNoTransaction());
        Assert.assertTrue(transactionsPage.getNoTransaction().isDisplayed());
    }

    @Test(description = "verify that have a look at our tickets“ link will lead to the “Passes & Packages/Explore” page")
    public void VerifyHaveALookLink()
    {
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUserName().sendKeys(objXMLReader.getXMLData("userWithNoTransactionsEmail"));
        loginPage.getPassword().sendKeys(objXMLReader.getXMLData("userWithNoTransactionsPassWord"));
        loginPage.getLoginCTA().click();
        SharedMethods.threadSleep (12000);
        sKiHomePage.getMyAccount().click();
        sKiHomePage.getTransaction().click();
        TransactionsPage transactionsPage= new TransactionsPage(getDriver());
        SharedMethods.waitUntilElementVisible(transactionsPage.getNoTransaction());
        transactionsPage.getHaveALookLink().click();
        PassesAndPackages passesAndPackages=new PassesAndPackages (getDriver());
        SharedMethods.waitUntilElementVisible(passesAndPackages.getPenguinEncounterTab());
        Assert.assertTrue(passesAndPackages.getPenguinEncounterTab().isDisplayed());
    }

    @Test(description = "verify the content of expanded transactions")
    public void VerifyContentForTheTransaction()
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
        SharedMethods.waitUntilElementVisible(sKiHomePage.getUserAvatar());
        sKiHomePage.getUserAvatar().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getTransaction());
        sKiHomePage.getTransaction().click();
        TransactionsPage transactionsPage= new TransactionsPage(getDriver());
        SharedMethods.waitUntilElementVisible(transactionsPage.getTransactionTitle());
        Assert.assertEquals(transactionsPage.getLocationName().getText(),"Ski Dubai");
    }

    @Test(description = "verify a Transaction for pass non time based ticket")
    public void VerifyTransactionForPassNonTimeBased()
    {
        ConfirmationPageTest confirmationPageTest= new ConfirmationPageTest();
        confirmationPageTest.validateThatTheUserBookPassWithPromoCode();
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getMyAccount().click();
        sKiHomePage.getTransaction().click();
        TransactionsPage transactionsPage= new TransactionsPage(getDriver());
        SharedMethods.waitUntilElementVisible(transactionsPage.getArrowButton());
        transactionsPage.getArrowButton().click();
       Assert.assertFalse(isElementPresent(transactionsPage.getTimeValue()));
    }

    @Test(description = "verify a Transaction for pass time based ticket")
    public void VerifyTransactionForPassTimeBased()
    {
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        ConfirmationPageTest confirmationPageTest= new ConfirmationPageTest();
        confirmationPageTest.validateUserBookEvent();
        SharedMethods.threadSleep (12000);
        sKiHomePage.getMyAccount().click();
        sKiHomePage.getTransaction().click();
        TransactionsPage transactionsPage= new TransactionsPage(getDriver());
        SharedMethods.waitUntilElementVisible(transactionsPage.getArrowButton());
        transactionsPage.getArrowButton().click();
        Assert.assertTrue(transactionsPage.getTimeValue().isDisplayed());
    }

    @Test (description = "verify a Transaction for a package with bonus activity" )
    public void VerifyTransactionForPackageWithBonus()
    {
        PassesAndPackagesTest passesAndPackagesTest=new PassesAndPackagesTest ();
        passesAndPackagesTest.validateThatUserBuyPackageWithBonusActivity();
        SKiHomePage sKiHomePage= new SKiHomePage (getDriver());
        sKiHomePage.getMyAccount().click();
        sKiHomePage.getTransaction().click();
        TransactionsPage transactionsPage= new TransactionsPage(getDriver());
        Assert.assertTrue(transactionsPage.getBonusTicket().isDisplayed());
    }

   @Test (description = "verify a Transaction for a package without bonus activity" )
   public void VerifyTransactionForPackageWithoutBonus()
   {
       PassesAndPackagesTest passesAndPackagesTest=new PassesAndPackagesTest ();
       passesAndPackagesTest.validateThatUserBuyPackageWithoutBonusActivity();
       SKiHomePage sKiHomePage= new SKiHomePage (getDriver());
       SharedMethods.threadSleep (14000);
       SharedMethods.waitUntilElementVisible(sKiHomePage.getUserAvatar());
       sKiHomePage.getUserAvatar().click();
       SharedMethods.waitUntilElementVisible(sKiHomePage.getTransaction());
       sKiHomePage.getTransaction().click();
       TransactionsPage transactionsPage= new TransactionsPage(getDriver());
       SharedMethods.waitUntilElementVisible(transactionsPage.getTransactionCardExpandArrow());
       SharedMethods.clickOn(transactionsPage.getTransactionCardExpandArrow());
       Assert.assertFalse(isElementPresent(transactionsPage.getBonusTicket()));
   }

    @Test (description = "verify user with Transactions that the transactions are collapsed by default" )
    public void VerifyTransactionAreCollapsed() {
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        sKiHomePage.getMyAccount().click();
        sKiHomePage.getTransaction().click();
        TransactionsPage transactionsPage= new TransactionsPage(getDriver());
        SharedMethods.waitUntilElementVisible(transactionsPage.getArrowButton());
        Assert.assertTrue(transactionsPage.getArrowButton().isDisplayed());

    }
    @Test (description = "verify if user reached last transaction the page hides the “View more” link or disables it" )
    public void VerifyViewMoreIsHidden() {
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        SharedMethods.threadSleep(200);
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible(sKiHomePage.getUserAvatar());
        SharedMethods.mouseClickAction(sKiHomePage.getUserAvatar());
        SharedMethods.threadSleep(1200);
        SharedMethods.waitUntilElementVisible(sKiHomePage.getTransaction());
        SharedMethods.mouseClickAction(sKiHomePage.getTransaction());
        SharedMethods.threadSleep(3000);
        TransactionsPage transactionsPage= new TransactionsPage(getDriver());
        SharedMethods.waitUntilElementVisible(transactionsPage.getViewMore());
        Assert.assertTrue(transactionsPage.getViewMore().isDisplayed());
        Assert.assertEquals(SharedMethods.getElementCount(transactionsPage.getTransaction_cards()), 10);
        transactionsPage.getViewMore().click();
        Assert.assertTrue(SharedMethods.getElementCount(transactionsPage.getTransaction_cards()) <= 20);

    }

    protected boolean isElementPresent(WebElement el){
        try{
            el.isDisplayed();
            return true;
        }
        catch(NoSuchElementException e){
            return false;
        }
    }
}
