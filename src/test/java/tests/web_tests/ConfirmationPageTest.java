package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.*;
import org.maf.utils.Common_steps.SharedSteps;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class ConfirmationPageTest  extends base {
    
    @Test(description = "Validate User book Add-Ons 'Supervision ticket' appears on booking confirmation")
    public void validateThatTheUserBookSupervisionTicketOnAddOns ()  {

        SKiHomePage sKiHomePage = new SKiHomePage(getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedSteps.userLogInToTheSite( objXMLReader.getXMLData ("userName"),  objXMLReader.getXMLData ("passWord"));
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSlopeOption ());
        sKiHomePage.getSlopeOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSlopePassesHeader ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.waitUntilElementClickable (addOnsScreen.getGuestsDropDownList ());
        SharedMethods.threadSleep (1000);
        SharedMethods.clickOn(addOnsScreen.getGuestsDropDownList ());
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());
        SharedMethods.mouseClickAction (addOnsScreen.getRemoveAdultGuest ());
        SharedMethods.clickOn(addOnsScreen.getGuestsDropDownList ());
        Assert.assertTrue (addOnsScreen.getSupervisionAddOnsTicket().isDisplayed ());
        Assert.assertTrue (addOnsScreen.getNeedSupervisionTicketMsg().isDisplayed ());
        SharedMethods.clickOn(addOnsScreen.getSupervisionTicketPlusButton ());
        Assert.assertTrue (addOnsScreen.getAddedSupervisionToBookingCard().isDisplayed ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible (paymentDetailsPage.getCardCSV ());
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData ("masterCard1"),
                objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        SharedMethods.clickOn(paymentDetailsPage.getPay ());
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
        Assert.assertTrue (confirmationPage.getSupervisionTicket ().isDisplayed ());

    }

    @Test(description = "Validate User book Pass - check ticket & date from booking confirmation")
    public void validateThatTheUserBookPass ()  {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedSteps.userLogInToTheSite( objXMLReader.getXMLData ("userName"),  objXMLReader.getXMLData ("passWord"));
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSlopeOption ());
        sKiHomePage.getSlopeOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSlopePassesHeader ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.clickOn(addOnsScreen.getContinueButton ());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.threadSleep (3000);
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData ("masterCard1"),
                objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        SharedMethods.clickOn(paymentDetailsPage.getPay ());
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        SharedMethods.threadSleep (2000);
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstActivityName(),objXMLReader.getXMLData("FullDaySlope")+"- 1 "+objXMLReader.getXMLData("AdultLabel")) );
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstActivityDate(), SharedMethods.findNextDay(1)) );
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstTicketNumber(), "1 " + objXMLReader.getXMLData("TicketLabel")) );

    }

    @Test(description = "Validate User book Pass - check Master Card payment method from booking confirmation")
    public void validateThatTheUserBookPassWithMasterCard ()  {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedSteps.userLogInToTheSite( objXMLReader.getXMLData ("userName"),  objXMLReader.getXMLData ("passWord"));
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSlopeOption ());
        sKiHomePage.getSlopeOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSlopePassesHeader ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.clickOn(addOnsScreen.getContinueButton ());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.threadSleep (3000);
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData ("masterCard1"),
                objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        SharedMethods.clickOn(paymentDetailsPage.getPay ());
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        SharedMethods.threadSleep (2000);
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstActivityName(),objXMLReader.getXMLData("FullDaySlope")) );
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getPaymentMethod(),objXMLReader.getXMLData("masterCard")) );

    }

    @Test(description = "Validate User book Pass - check Visa payment method from booking confirmation")
    public void validateThatTheUserBookPassWithVisa ()  {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedSteps.userLogInToTheSite( objXMLReader.getXMLData ("userName"),  objXMLReader.getXMLData ("passWord"));
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSlopeOption ());
        sKiHomePage.getSlopeOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSlopePassesHeader ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.clickOn(addOnsScreen.getContinueButton ());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.threadSleep (9000);
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData ("visaCard1"),
                objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        SharedMethods.clickOn(paymentDetailsPage.getPay ());
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        SharedMethods.threadSleep (2000);
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstActivityName(),objXMLReader.getXMLData("FullDaySlope")) );
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getPaymentMethod(),objXMLReader.getXMLData("visaCard")) );

    }

    @Test(description = "Validate User book Pass - check Price from booking confirmation")
    public void validateThatTheUserBookPassSeeRightPrice ()  {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedSteps.userLogInToTheSite( objXMLReader.getXMLData ("userName"),  objXMLReader.getXMLData ("passWord"));
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSlopeOption ());
        sKiHomePage.getSlopeOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSlopePassesHeader ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.waitUntilElementClickable (addOnsScreen.getGuestsDropDownList ());
        SharedMethods.threadSleep (1000);
        SharedMethods.clickOn(addOnsScreen.getGuestsDropDownList ());
        SharedMethods.clickOn(addOnsScreen.getAddAdultGuest ());
        SharedMethods.clickOn(addOnsScreen.getContinueButton ());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.threadSleep (3000);
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData ("masterCard1"),
                objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        SharedMethods.clickOn(paymentDetailsPage.getPay ());
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        SharedMethods.threadSleep (2000);
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstActivityName(), objXMLReader.getXMLData("FullDaySlope")) );
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getTotalPriceAmount(), String.format("%2d", Integer.parseInt(objXMLReader.getXMLData("FullDaySlopePrice"))*2)));
    }

    @Test(description = "Validate User book Pass with Promo Code 100% - check Payment method from booking confirmation")
    public void validateThatTheUserBookPassWithPromoCode ()  {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedSteps.userLogInToTheSite( objXMLReader.getXMLData ("userName"),  objXMLReader.getXMLData ("passWord"));

        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSnowParkOption ());
        sKiHomePage.getSnowParkOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedMethods.threadSleep (1000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSnowParkPassesHeader ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.jsScrollDown (passesAndPackages.getSnowParkPassBuyButton ());
        SharedMethods.mouseClickAction (passesAndPackages.getSnowParkPassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.clickOn(addOnsScreen.getContinueButton ());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.clickOn(personalDetailsPage.getContinueToPayment());
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.threadSleep (3000);
        SharedSteps.userFillPromoCodePayment(objXMLReader.getXMLData ("snowParkFullPromoCode"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        SharedMethods.clickOn(paymentDetailsPage.getPay ());
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        SharedMethods.threadSleep (2000);
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getPaymentMethod(),objXMLReader.getXMLData("coupon")) );
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getUsedPromoCode(),objXMLReader.getXMLData("snowParkFullPromoCode")) );

    }

}
