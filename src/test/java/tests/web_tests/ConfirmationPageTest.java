package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.*;
import org.maf.utils.Common_steps.SharedSteps;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Locale;

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

    @Test(description = "Validate user book Pass - check ticket & date from booking confirmation")
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

    @Test(description = "Validate user book Pass - check Master Card payment method from booking confirmation")
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

    @Test(description = "Validate user book Pass - check Visa payment method from booking confirmation")
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

    @Test(description = "Validate user book Pass - check Price from booking confirmation")
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

    @Test(description = "Validate user book Pass with Promo Code 100% - check Payment method from booking confirmation")
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

    @Test(description = "Validate user book Pass with Promo Code 50% - check Payment method from booking confirmation")
    public void validateThatTheUserBookPassWithPartialPromoCode ()  {
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
        SharedSteps.userFillPromoCodePayment(objXMLReader.getXMLData ("snowParkPartialPromoCode"));
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData ("masterCard1"),
                objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        SharedMethods.clickOn(paymentDetailsPage.getPay ());
        SharedMethods.threadSleep (20000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        SharedMethods.threadSleep (2000);
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getUsedPromoCode(),objXMLReader.getXMLData("snowParkPartialPromoCode")) );
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getPaymentMethod(),objXMLReader.getXMLData("masterCard")) );

    }

    @Test(description =  "Validate The user books event - see selected time & date from confirmation screen")
    public void validateUserBookEvent ()  {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.clickOn(sKiHomePage.getAcceptCookiesButton ());
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedSteps.userBookPassForm(sKiHomePage.getPenguinEncounterOption (), passesAndPackages.getPenguinEncounterPassBuyButton());
        ActivitiesPage activityPage = new ActivitiesPage (getDriver ());
        SharedSteps.userAddGuestsAs(0,1,1);
        String selectedTimeSlot = activityPage.getLastActivityTimeSlot().getText();
        SharedMethods.clickOn(activityPage.getLastActivityTimeSlot());
        SharedMethods.clickOn(activityPage.getAddTicketButton());
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver());
        SharedMethods.clickOn(addOnsScreen.getContinueButton());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver());
        SharedSteps.userFillGuestFormWithRandomData();
        SharedMethods.clickOn(personalDetailsPage.getContinueToPayment());
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getCardCSV());
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData("visaCard1"), objXMLReader.getXMLData("cardExp"), objXMLReader.getXMLData("cardCSV"));
        SharedMethods.threadSleep(1000);
        SharedMethods.waitTillClickAble(paymentDetailsPage.getPay());
        paymentDetailsPage.getPay().click();
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.threadSleep (3000);
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstActivityName(),objXMLReader.getXMLData("PenguinEncounter")+"- 1 "+objXMLReader.getXMLData("AdultLabel")) );
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstActivityDate(), SharedMethods.findNextDay(1)) );
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstActivityDate(), selectedTimeSlot.toLowerCase(Locale.ROOT) ));
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstTicketNumber(), "3 " + objXMLReader.getXMLData("TicketLabel")) );

    }

    @Test(description =  "Validate The user books event with add ons - see selected time & date from confirmation screen")
    public void validateUserBookEventWithAddOns ()  {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.clickOn(sKiHomePage.getAcceptCookiesButton ());
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedSteps.userBookPassForm(sKiHomePage.getPenguinEncounterOption (), passesAndPackages.getPenguinEncounterPassBuyButton());
        ActivitiesPage activityPage = new ActivitiesPage (getDriver ());
        SharedSteps.userAddGuestsAs(0,1,1);
        String selectedTimeSlot = activityPage.getLastActivityTimeSlot().getText();
        SharedMethods.clickOn(activityPage.getLastActivityTimeSlot());
        SharedMethods.clickOn(activityPage.getAddTicketButton());
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver());
        SharedMethods.clickOn(addOnsScreen.getMobileLanyardTicketPlusButton());
        SharedMethods.clickOn(addOnsScreen.getContinueButton());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver());
        SharedSteps.userFillGuestFormWithRandomData();
        SharedMethods.clickOn(personalDetailsPage.getContinueToPayment());
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getCardCSV());
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData("visaCard1"), objXMLReader.getXMLData("cardExp"), objXMLReader.getXMLData("cardCSV"));
        SharedMethods.threadSleep(1000);
        SharedMethods.waitTillClickAble(paymentDetailsPage.getPay());
        paymentDetailsPage.getPay().click();
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.threadSleep (3000);
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstActivityName(),objXMLReader.getXMLData("PenguinEncounter")+"- 1 "+objXMLReader.getXMLData("AdultLabel")) );
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstActivityDate(), SharedMethods.findNextDay(1)) );
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstActivityDate(), selectedTimeSlot.toLowerCase(Locale.ROOT) ));
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstTicketNumber(), "3 " + objXMLReader.getXMLData("TicketLabel")) );
    }
    
    @Test(description = "Validate 'required Supervision ticket' for Package on Add-Ons appears on Confirmation Screen")
    public void validateThatTheUserSeeSupervisionTicketOnAddOnsForPackageAppearsOnConfirmationScreen ()  {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.clickOn(sKiHomePage.getAcceptCookiesButton ());
        SharedSteps.userLogInToTheSite( objXMLReader.getXMLData ("userName2"),  objXMLReader.getXMLData ("passWord2"));
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedSteps.userBookPassForm(sKiHomePage.getPenguinEncounterOption (), passesAndPackages.getSnowPremiumPassBuyButton());
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        ActivitiesPage activitiesPage = new ActivitiesPage(getDriver ());
        SharedMethods.threadSleep (5000);
        SharedMethods.waitUntilElementClickable (activitiesPage.getGuestsDropDownList ());
        SharedMethods.clickOn(activitiesPage.getGuestsDropDownList());
        SharedMethods.mouseClickAction (activitiesPage.getNumberOfJuniors ());
        SharedMethods.mouseClickAction (activitiesPage.getRemoveAdultGuest ());
        SharedMethods.waitUntilElementClickable (activitiesPage.getGuestsDropDownList ());
        String selectedTimeSlot = activitiesPage.getLastActivityTimeSlot().getText();
        SharedMethods.clickOn(activitiesPage.getLastActivityTimeSlot());
        SharedMethods.clickOn(activitiesPage.getPackageSlopePassAddButton());
        SharedMethods.clickOn(activitiesPage.getAddTicketButton());
        SharedMethods.threadSleep (4000);
        SharedMethods.clickOn(addOnsScreen.getSupervisionTicketPlusButton ());
        Assert.assertTrue (addOnsScreen.getAddedSupervisionToBookingCard().isDisplayed ());
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
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.threadSleep (5000);
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
        Assert.assertTrue (confirmationPage.getSupervisionTicket ().isDisplayed ());
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstActivityDate(), selectedTimeSlot.toLowerCase(Locale.ROOT) ));
        Assert.assertTrue (SharedMethods.elementContainsText(
                confirmationPage.getFirstBookingPackageLine (),
                objXMLReader.getXMLData ("PenguinEncounter") + " - " + objXMLReader.getXMLData ("AllGuests")));
        Assert.assertTrue (SharedMethods.elementContainsText(
                confirmationPage.getSecondBookingPackageLine (),
                objXMLReader.getXMLData ("TwoHoursSlopePass") + " - 1 " + objXMLReader.getXMLData ("JuniorLabel")));
    }

    @Test(description = "Validate user book Package appears on Confirmation Screen  ")
    public void validateThatTheUserBookedPackageAppearsOnConfirmationScreen ()  {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.clickOn(sKiHomePage.getAcceptCookiesButton ());
        SharedSteps.userLogInToTheSite( objXMLReader.getXMLData ("userName2"),  objXMLReader.getXMLData ("passWord2"));
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedSteps.userBookPassForm(sKiHomePage.getPenguinEncounterOption (), passesAndPackages.getSnowPremiumPassBuyButton());
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        ActivitiesPage activitiesPage = new ActivitiesPage(getDriver ());
        SharedMethods.threadSleep (5000);
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
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.threadSleep (5000);
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
        Assert.assertTrue(SharedMethods.elementContainsText(confirmationPage.getFirstActivityDate(), selectedTimeSlot.toLowerCase(Locale.ROOT) ));
        Assert.assertTrue (SharedMethods.elementContainsText(
                confirmationPage.getFirstBookingPackageLine (),
                objXMLReader.getXMLData ("PenguinEncounter") + " - " + objXMLReader.getXMLData ("AllGuests")));
        Assert.assertTrue (SharedMethods.elementContainsText(
                confirmationPage.getSecondBookingPackageLine (),
                objXMLReader.getXMLData ("TwoHoursSlopePass") + " - 1 " + objXMLReader.getXMLData ("AdultLabel")));
    }

    @Test(description = "Validate that the guest user add user info same as registered user")
    public void validateThatTheGuestUserAddUserInfoSamAsRegisteredUser(){
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkOption());
        sKiHomePage.getSnowParkOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible(passesAndPackages.getSnowParkPassesHeader());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(personalDetailsPage.getPersonalDetailsHeader());
        personalDetailsPage.clickingMissRadioButton();
        personalDetailsPage.getFirstName().sendKeys(objXMLReader.getXMLData ("firstName"));
        personalDetailsPage.getLastName().sendKeys (objXMLReader.getXMLData ("lastName"));
        personalDetailsPage.getMobileNum().sendKeys (objXMLReader.getXMLData ("phone"));
        personalDetailsPage.getEmail().sendKeys (objXMLReader.getXMLData ("email"));
        personalDetailsPage.getCountryDropDownList().click();
        SharedMethods.mouseClickAction(personalDetailsPage.getAndoraCountry());
        SharedMethods.mouseClickAction (personalDetailsPage.getBookingInformation());
        SharedMethods.mouseClickAction (personalDetailsPage.getTermsConditonsCheckbox());
        SharedMethods.mouseClickAction(personalDetailsPage.getContinueToPayment ());
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible (paymentDetailsPage.getCardCSV ());
        Assert.assertTrue (paymentDetailsPage.getCardCSV ().isDisplayed ());
    }

    @Test(description = "Validate that the guest user add user email same as registered user but diff name")
    public void validateThatTheGuestUserAddUserEmailSameAsRegisteredUserButDiffName(){
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkOption());
        sKiHomePage.getSnowParkOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible(passesAndPackages.getSnowParkPassesHeader());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(personalDetailsPage.getPersonalDetailsHeader());
        personalDetailsPage.clickingMissRadioButton();
        personalDetailsPage.getFirstName().sendKeys(objXMLReader.getXMLData ("firstName")+"test");
        personalDetailsPage.getLastName().sendKeys (objXMLReader.getXMLData ("lastName")+"test");
        personalDetailsPage.getMobileNum().sendKeys (objXMLReader.getXMLData ("phone"));
        personalDetailsPage.getEmail().sendKeys (objXMLReader.getXMLData ("email"));
        personalDetailsPage.getCountryDropDownList().click();
        SharedMethods.mouseClickAction(personalDetailsPage.getAndoraCountry());
        SharedMethods.mouseClickAction (personalDetailsPage.getBookingInformation());
        SharedMethods.mouseClickAction (personalDetailsPage.getTermsConditonsCheckbox());
        SharedMethods.mouseClickAction(personalDetailsPage.getContinueToPayment ());
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible (paymentDetailsPage.getCardCSV ());
        Assert.assertTrue (paymentDetailsPage.getCardCSV ().isDisplayed ());
    }

}
