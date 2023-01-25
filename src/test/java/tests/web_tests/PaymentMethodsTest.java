package tests.web_tests;


import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.LoginPage;
import org.maf.page_objects.PaymentDetailsPage;
import org.maf.page_objects.PaymentMethodsPage;
import org.maf.page_objects.SKiHomePage;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)

public class PaymentMethodsTest extends base {

    @Test(description = "Validate that user can navigate to the payment page")
    public void validateThatUserCanNavigateToThePaymentPage(){
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getUserAvatar());
        SharedMethods.clickAction(sKiHomePage.getUserAvatar());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPaymentOption());
        sKiHomePage.getPaymentOption().click();
        PaymentMethodsPage paymentMethodsPage= new PaymentMethodsPage(getDriver());
        SharedMethods.threadSleep (3000);
        SharedMethods.waitUntilElementVisible (paymentMethodsPage.getPaymentPageTitle());
        Assert.assertEquals(paymentMethodsPage.getPaymentPageTitle().getText(),"PAYMENT METHODS");
    }

    @Test(description = "Validate that the user is able to add new Visa card")
    public void validateThatTheUserCanAddNewVisaCard(){
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getUserAvatar());
        SharedMethods.clickAction(sKiHomePage.getUserAvatar());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPaymentOption());
        sKiHomePage.getPaymentOption().click();
        PaymentMethodsPage paymentMethodsPage= new PaymentMethodsPage(getDriver());
        SharedMethods.threadSleep (3000);
        //Old cards deletion
        try {

        if (paymentMethodsPage.getDeleteCardButton().isDisplayed()){
        while (paymentMethodsPage.getDeleteCardButton().isDisplayed()){
            paymentMethodsPage.getDeleteCardButton().click();
            SharedMethods.waitUntilElementVisible(paymentMethodsPage.getDeleteConfirmationButton());
            paymentMethodsPage.getDeleteConfirmationButton().click();
            SharedMethods.threadSleep (1000);
        }}}
        catch (Exception e){
            System.out.println("no added cards");
        }

        paymentMethodsPage.getAddCardRadio().click();
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getAddCardRadio());
        paymentMethodsPage.getCardNumberField().sendKeys(objXMLReader.getXMLData("visaCard1"));
        paymentMethodsPage.getCardExpiryField().sendKeys(objXMLReader.getXMLData("cardExp"));
        paymentMethodsPage.getCardCvcField().sendKeys(objXMLReader.getXMLData("cardCSV"));
        paymentMethodsPage.getSaveButton().click();
        SharedMethods.threadSleep (3000);
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getCardInfo());
        Assert.assertTrue(paymentMethodsPage.getCardInfo().isDisplayed());

    }

    @Test(description = "Validate that the user is able to add new master card")
    public void validateThatTheUserCanAddNewMasterCard(){
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getUserAvatar());
        SharedMethods.clickAction(sKiHomePage.getUserAvatar());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPaymentOption());
        sKiHomePage.getPaymentOption().click();
        PaymentMethodsPage paymentMethodsPage= new PaymentMethodsPage(getDriver());
        SharedMethods.threadSleep (3000);
        //Old cards deletion
        try {

            if (paymentMethodsPage.getDeleteCardButton().isDisplayed()){
                while (paymentMethodsPage.getDeleteCardButton().isDisplayed()){
                    paymentMethodsPage.getDeleteCardButton().click();
                    SharedMethods.waitUntilElementVisible(paymentMethodsPage.getDeleteConfirmationButton());
                    paymentMethodsPage.getDeleteConfirmationButton().click();
                    SharedMethods.threadSleep (1000);
                }}}
        catch (Exception e){
            System.out.println("no added cards");
        }

        paymentMethodsPage.getAddCardRadio().click();
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getAddCardRadio());
        paymentMethodsPage.getCardNumberField().sendKeys(objXMLReader.getXMLData("masterCard1"));
        paymentMethodsPage.getCardExpiryField().sendKeys(objXMLReader.getXMLData("cardExp"));
        paymentMethodsPage.getCardCvcField().sendKeys(objXMLReader.getXMLData("cardCSV"));
        paymentMethodsPage.getSaveButton().click();
        SharedMethods.threadSleep (3000);
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getCardInfo());
        Assert.assertTrue(paymentMethodsPage.getCardInfo().isDisplayed());

    }

    @Test(description = "Validate that the user is unable to add Amex card")
    public void validateThatTheUserCantAddAmexCard(){
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getUserAvatar());
        SharedMethods.clickAction(sKiHomePage.getUserAvatar());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPaymentOption());
        sKiHomePage.getPaymentOption().click();
        PaymentMethodsPage paymentMethodsPage= new PaymentMethodsPage(getDriver());
        SharedMethods.threadSleep (3000);
        //Old cards deletion
        try {

            if (paymentMethodsPage.getDeleteCardButton().isDisplayed()){
                while (paymentMethodsPage.getDeleteCardButton().isDisplayed()){
                    paymentMethodsPage.getDeleteCardButton().click();
                    SharedMethods.waitUntilElementVisible(paymentMethodsPage.getDeleteConfirmationButton());
                    paymentMethodsPage.getDeleteConfirmationButton().click();
                    SharedMethods.threadSleep (1000);
                }}}
        catch (Exception e){
            System.out.println("no added cards");
        }

        paymentMethodsPage.getAddCardRadio().click();
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getAddCardRadio());
        paymentMethodsPage.getCardNumberField().sendKeys(objXMLReader.getXMLData("amexCard"));
        paymentMethodsPage.getCardExpiryField().sendKeys(objXMLReader.getXMLData("cardExp"));
        paymentMethodsPage.getCardCvcField().sendKeys(objXMLReader.getXMLData("cardCSV"));
        paymentMethodsPage.getSaveButton().click();
        SharedMethods.threadSleep (3000);
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getAuthenticationMsg());
        Assert.assertTrue(paymentMethodsPage.getAuthenticationMsg().isDisplayed());
    }

    @Test(description = "Validate that the user can set default card")
    public void validateThatTheUserCanSetDefaultCard(){
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getUserAvatar());
        SharedMethods.clickAction(sKiHomePage.getUserAvatar());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPaymentOption());
        sKiHomePage.getPaymentOption().click();
        PaymentMethodsPage paymentMethodsPage= new PaymentMethodsPage(getDriver());
        SharedMethods.threadSleep (3000);
        //Old cards deletion
        try {

            if (paymentMethodsPage.getDeleteCardButton().isDisplayed()){
                while (paymentMethodsPage.getDeleteCardButton().isDisplayed()){
                    paymentMethodsPage.getDeleteCardButton().click();
                    SharedMethods.waitUntilElementVisible(paymentMethodsPage.getDeleteConfirmationButton());
                    paymentMethodsPage.getDeleteConfirmationButton().click();
                    SharedMethods.threadSleep (1000);
                }}}
        catch (Exception e){
            System.out.println("no added cards");
        }

        paymentMethodsPage.getAddCardRadio().click();
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getAddCardRadio());
        paymentMethodsPage.getCardNumberField().sendKeys(objXMLReader.getXMLData("masterCard1"));
        paymentMethodsPage.getCardExpiryField().sendKeys(objXMLReader.getXMLData("cardExp"));
        paymentMethodsPage.getCardCvcField().sendKeys(objXMLReader.getXMLData("cardCSV"));
        paymentMethodsPage.getSaveButton().click();
        SharedMethods.threadSleep (3000);
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getCardInfo());
        paymentMethodsPage.getCardInfo().click();
        SharedMethods.threadSleep (3000);
        Assert.assertTrue(paymentMethodsPage.getDefaultLabel().isDisplayed());

    }

    @Test(description = "Validate that the user is able to delete card card")
    public void validateThatTheUserCanDeleteCard(){
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getUserAvatar());
        SharedMethods.clickAction(sKiHomePage.getUserAvatar());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPaymentOption());
        sKiHomePage.getPaymentOption().click();
        PaymentMethodsPage paymentMethodsPage= new PaymentMethodsPage(getDriver());
        SharedMethods.threadSleep (3000);
        //Old cards deletion
        try {

            if (paymentMethodsPage.getDeleteCardButton().isDisplayed()){
                while (paymentMethodsPage.getDeleteCardButton().isDisplayed()){
                    paymentMethodsPage.getDeleteCardButton().click();
                    SharedMethods.waitUntilElementVisible(paymentMethodsPage.getDeleteConfirmationButton());
                    paymentMethodsPage.getDeleteConfirmationButton().click();
                    SharedMethods.threadSleep (1000);
                }}}
        catch (Exception e){
            System.out.println("no added cards");
        }

        paymentMethodsPage.getAddCardRadio().click();
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getAddCardRadio());
        paymentMethodsPage.getCardNumberField().sendKeys(objXMLReader.getXMLData("visaCard1"));
        paymentMethodsPage.getCardExpiryField().sendKeys(objXMLReader.getXMLData("cardExp"));
        paymentMethodsPage.getCardCvcField().sendKeys(objXMLReader.getXMLData("cardCSV"));
        paymentMethodsPage.getSaveButton().click();
        SharedMethods.threadSleep (3000);
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getCardInfo());
        Assert.assertTrue(paymentMethodsPage.getCardInfo().isDisplayed());
        SharedMethods.threadSleep(5000);
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getDeleteCardButton());
        paymentMethodsPage.getDeleteCardButton().click();
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getDeleteConfirmationButton());
        paymentMethodsPage.getDeleteConfirmationButton().click();
        SharedMethods.threadSleep (1000);
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getAddCardRadio());
        Assert.assertTrue(paymentMethodsPage.getAddCardRadio().isDisplayed());

    }

    @Test(description = "Validate that the user is able to add new 3ds card")
    public void validateThatTheUserIsAbleToAddNew3dsCard(){
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getUserAvatar());
        SharedMethods.clickAction(sKiHomePage.getUserAvatar());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPaymentOption());
        sKiHomePage.getPaymentOption().click();
        PaymentMethodsPage paymentMethodsPage= new PaymentMethodsPage(getDriver());
        SharedMethods.threadSleep (3000);
        //Old cards deletion
        try {

            if (paymentMethodsPage.getDeleteCardButton().isDisplayed()){
                while (paymentMethodsPage.getDeleteCardButton().isDisplayed()){
                    paymentMethodsPage.getDeleteCardButton().click();
                    SharedMethods.waitUntilElementVisible(paymentMethodsPage.getDeleteConfirmationButton());
                    paymentMethodsPage.getDeleteConfirmationButton().click();
                    SharedMethods.threadSleep (1000);
                }}}
        catch (Exception e){
            System.out.println("no added cards");
        }

        paymentMethodsPage.getAddCardRadio().click();
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getAddCardRadio());
        paymentMethodsPage.getCardNumberField().sendKeys(objXMLReader.getXMLData("ThreeDSCard"));
        paymentMethodsPage.getCardExpiryField().sendKeys(objXMLReader.getXMLData("cardExp"));
        paymentMethodsPage.getCardCvcField().sendKeys(objXMLReader.getXMLData("cardCSV"));
        paymentMethodsPage.getSaveButton().click();
        SharedMethods.threadSleep (13000);
        paymentMethodsPage.clickSubmitButton(getDriver());
        SharedMethods.threadSleep(10000);
        SharedMethods.waitUntilElementVisible(paymentMethodsPage.getCardInfo());
        Assert.assertTrue(paymentMethodsPage.getCardInfo().isDisplayed());

    }



}
