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
public class AddOnsTest extends base {

    @Test(description = "Validate that user can fill add ons screen")
    public void validateThatTheUserCanFillAddOns ()  {

        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSlopeOption ());
        sKiHomePage.getSlopeOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSlopePassesHeader ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.waitUntilElementClickable (addOnsScreen.getAddMainAddOnsButton ());
        SharedMethods.mouseClickAction (addOnsScreen.getAddMainAddOnsButton());
        SharedMethods.mouseClickAction (addOnsScreen.getCalendarButton());
        SharedMethods.mouseClickAction (addOnsScreen.getNextMonthButton ());
        SharedMethods.mouseClickAction (addOnsScreen.getMonthSelection ());
        SharedMethods.waitTillElementDisAppear (addOnsScreen.getCalenderFrame ());
        SharedMethods.mouseClickAction (addOnsScreen.getAdultsDropDown());
        SharedMethods.threadSleep (7000);
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());

    }

    @Test(description = "Validate 'required Supervision ticket' for Slope on Add-Ons")
    public void validateThatTheUserSeeSupervisionTicketOnAddOns ()  {

        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSlopeOption ());
        sKiHomePage.getSlopeOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedMethods.threadSleep (1000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSlopePassesHeader ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.mouseClickAction (addOnsScreen.getAdultsDropDown());
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());
        SharedMethods.mouseClickAction (addOnsScreen.getRemoveAdultGuest ());
        SharedMethods.clickOn(addOnsScreen.getAddOnsLabel());
        Assert.assertTrue (addOnsScreen.getSupervisionAddOnsTicket().isDisplayed ());
        Assert.assertTrue (addOnsScreen.getNeedSupervisionTicketMsg().isDisplayed ());

    }


    @Test(description = "Validate 'required Adult ticket' for Slope on Add-Ons ")
    public void validateThatTheUserSeeAdultTicketOnAddOns ()  {

        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
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
        SharedMethods.waitUntilElementClickable (addOnsScreen.getAdultsDropDown ());
        SharedMethods.mouseClickAction (addOnsScreen.getAdultsDropDown ());
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());
        SharedMethods.mouseClickAction (addOnsScreen.getRemoveAdultGuest ());
        SharedMethods.clickOn(addOnsScreen.getAddOnsLabel());
        Assert.assertTrue (addOnsScreen.getNeedAdultTicketMsg().isDisplayed ());
    }

    @Test(description = "Validate User book 'Supervision ticket' with Slope on Add-Ons ")
    public void validateThatTheUserBookSupervisionTicketOnAddOns ()  {

        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedSteps.userLogInToTheSite( objXMLReader.getXMLData ("userName"),  objXMLReader.getXMLData ("passWord"));
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSlopeOption ());
        sKiHomePage.getSlopeOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        SharedMethods.waitUntilElementClickable (addOnsScreen.getAdultsDropDown ());
        SharedMethods.mouseClickAction (addOnsScreen.getAdultsDropDown ());
        SharedMethods.threadSleep (1000);
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());
        SharedMethods.mouseClickAction (addOnsScreen.getRemoveAdultGuest ());
        SharedMethods.threadSleep (1000);
        SharedMethods.clickOn(addOnsScreen.getAddOnsLabel());
        Assert.assertTrue (addOnsScreen.getSupervisionAddOnsTicket().isDisplayed ());
        Assert.assertTrue (addOnsScreen.getNeedSupervisionTicketMsg().isDisplayed ());
        SharedMethods.clickOn(addOnsScreen.getSupervisionTicketPlusButton ());
        Assert.assertTrue (addOnsScreen.getAddedSupervisionToBookingCard().isDisplayed ());

    }

    @Test(description = "Validate Booking Bar selected data reflects on Booking")
    public void validateTheBookingBarSelectedDateReflectsOnTheBooking(){
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        SharedMethods.threadSleep (2000);
        BookingBarPage bookingBarPage = new BookingBarPage(getDriver());
        bookingBarPage.getExperienceDll().click();
        SharedMethods.waitUntilElementVisible(bookingBarPage.getSnowParkExperience());
        bookingBarPage.getSnowParkExperience().click();
        SharedMethods.waitUntilElementVisible(bookingBarPage.getDateDll());
        bookingBarPage.getDateDll().click();
        String selectedDate = bookingBarPage.getDateSelection().getText();
        SharedMethods.mouseClickAction(bookingBarPage.getDateSelection());
        SharedMethods.mouseClickAction(bookingBarPage.getGuestsDll());
        SharedMethods.waitUntilElementVisible(bookingBarPage.getBookingButton());
        bookingBarPage.getBookingButton().click();
        SharedMethods.threadSleep (700);
        PassesAndPackages passesAndPackages=new PassesAndPackages(getDriver());
        SharedMethods.jsScrollDown(passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.clickOn(passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.threadSleep(700);
        AddOnsScreen addOnsScreen=new AddOnsScreen(getDriver());
        Assert.assertTrue(SharedMethods.elementContainsText(addOnsScreen.getCalendarButton(), selectedDate));
    }
}
