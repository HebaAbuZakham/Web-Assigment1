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


    @Test(description = "booking - pass ticket")
    public void VerifyPassTicket()
    {
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        ConfirmationPageTest confirmationPageTest= new ConfirmationPageTest();
        confirmationPageTest.validateThatTheUserBookPassWithPartialPromoCode ();
        SharedMethods.threadSleep (12000);
        sKiHomePage.getMyAccount().click();
        sKiHomePage.getDashboard().click();
        DashboardPage dashboardPage=new DashboardPage(getDriver());
        SharedMethods.waitUntilElementVisible(dashboardPage.getAddGuestCircleNotActive());
        Assert.assertTrue(dashboardPage.getAddGuestCircleActive().isDisplayed());
    }

    @Test(description = "booking - Event ticket")
    public void VerifyEventTicket()
    {
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        ConfirmationPageTest confirmationPageTest= new ConfirmationPageTest();
        confirmationPageTest.validateUserBookEvent ();
        SharedMethods.threadSleep (12000);
        sKiHomePage.getMyAccount().click();
        sKiHomePage.getDashboard().click();
        DashboardPage dashboardPage=new DashboardPage(getDriver());
        SharedMethods.waitUntilElementVisible(dashboardPage.getAddGuestCircleNotActive());
        Assert.assertTrue(dashboardPage.getAddGuestCircleActive().isDisplayed());    }

    @Test(description = "Dashboard - verify new user Empty state ")
    public void VerifySignedUpUserVisitDashboard(){

        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        SignUp signupPage = new SignUp(getDriver());
        signupPage.getSignUpButtton().click();
        SharedMethods.waitUntilElementVisible (signupPage.getRadiobutton ());
        signupPage.getRadiobutton().click();
        signupPage.getFirstname().sendKeys(objXMLReader.getXMLData("firstName"));
        signupPage.getLastname().sendKeys(objXMLReader.getXMLData("lastName"));
        signupPage.getEmail().sendKeys(SharedMethods.generateRandomString()+objXMLReader.getXMLData("randomEmailDomain"));
        signupPage.getPhoneNumber().sendKeys(objXMLReader.getXMLData("phoneNumber"));
        signupPage.getDate().click();
        signupPage.getSelectYear().click();
        signupPage.getYear().click();
        signupPage.getOkButton().click();
        SharedMethods.threadSleep (1000);
        signupPage.getNationality().click();
        SharedMethods.threadSleep (2000);
        signupPage.getDropdownNationality().click();
        SharedMethods.threadSleep (1000);
        signupPage.getCountryOfResidence().click();
        SharedMethods.threadSleep (2000);
        signupPage.getDropdownCountry().click();
        signupPage.getPassword().sendKeys(objXMLReader.getXMLData("password"));
        signupPage.getSubmit().click();
        SharedMethods.threadSleep (2000);
        SharedMethods.mouseClickAction (signupPage.getOkEmailPopUpButton());
        SharedMethods.threadSleep (29000);
        SharedMethods.clickOn(sKiHomePage.getMyAccount());
        sKiHomePage.getDashboard().click();
        DashboardPage dashboardPage=new DashboardPage(getDriver());
        SharedMethods.threadSleep (1000);
        Assert.assertTrue(dashboardPage.getPopularPassesBox().isDisplayed());
        Assert.assertTrue(dashboardPage.getWelcomeBackBox().isDisplayed());
    }

    @Test(description = "Dashboard - Verify User Book Snow Premium")
    public void VerifyUserBookSnowPremium()
    {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.clickOn(sKiHomePage.getAcceptCookiesButton ());
        SharedSteps.userLogInToTheSite( objXMLReader.getXMLData ("userName2"),  objXMLReader.getXMLData ("passWord2"));
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedSteps.userBookPassForm(sKiHomePage.getPenguinEncounterOption (), passesAndPackages.getSnowPremiumPackageBuyButton());
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        ActivitiesPage activitiesPage = new ActivitiesPage(getDriver ());
        SharedMethods.threadSleep (10000);
        String selectedTimeSlot = activitiesPage.getLastActivityTimeSlot().getText();
        SharedMethods.clickOn(activitiesPage.getLastActivityTimeSlot());
        SharedMethods.clickOn(activitiesPage.getPackageSlopePassAddButton());
        SharedMethods.clickOn(activitiesPage.getAddTicketButton());
        SharedMethods.threadSleep (4000);
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.threadSleep (3000);
        SharedMethods.waitUntilElementVisible (paymentDetailsPage.getCardCSV ());
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData ("masterCard1"),
                objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        SharedMethods.clickOn(paymentDetailsPage.getPay ());
        SharedMethods.threadSleep (5000);
        sKiHomePage.getMyAccount().click();
        sKiHomePage.getDashboard().click();
        DashboardPage dashboardPage=new DashboardPage(getDriver());
        Assert.assertTrue(SharedMethods.elementContainsText(dashboardPage.getSnowPremiumCardFirstActivity(), selectedTimeSlot));
        Assert.assertTrue(SharedMethods.elementContainsText(dashboardPage.getSnowPremiumCardFirstActivity(),"Penguin Encounter"));
        Assert.assertTrue(SharedMethods.elementContainsText(dashboardPage.getSnowPremiumCardSecondActivity(),"2 Hours Slope Pass"));
    }


}


