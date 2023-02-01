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
public class ActivitiesTests extends base {

    @Test(description = "Validate The User Add 5 Guest To Breakfast With Penguin", groups = {"smoke_test","regression_test"})
    public void validateThatTheUserAdd5GuestToBreakfastWithPenguin ()  {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.clickOn(sKiHomePage.getAcceptCookiesButton ());
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedSteps.userBookPassForm(sKiHomePage.getPenguinEncounterOption (), passesAndPackages.getBreakfastWithPenguinPassBuyButton());
        SharedMethods.threadSleep (1000);
        SharedSteps.userAddGuestsAs(0,3,1);
        ActivitiesPage activityPage = new ActivitiesPage (getDriver ());
        Assert.assertTrue(SharedMethods.elementContainsText(activityPage.getLastTableTitle(), objXMLReader.getXMLData("Table") + " 2"));
    }

    @Test(description =  "Validate The User Add 4 Guest To Breakfast With Penguin")
    public void validateThatTheUserAdd4GuestToBreakfastWithPenguin ()  {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.clickOn(sKiHomePage.getAcceptCookiesButton ());
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedSteps.userBookPassForm(sKiHomePage.getPenguinEncounterOption (), passesAndPackages.getBreakfastWithPenguinPassBuyButton());
        SharedMethods.threadSleep (1000);
        SharedSteps.userAddGuestsAs(0,3,0);
        ActivitiesPage activityPage = new ActivitiesPage (getDriver ());
        Assert.assertTrue(SharedMethods.elementContainsText(activityPage.getLastTableTitle(), objXMLReader.getXMLData("Table") + " 1"));
    }


    @Test(description = "Validate user add card with 14 as min age - child & junior option not on the Add Guest DDL")
    public void validateThatMinAgeReflectOnTheAggGuestsDDL  ()  {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.clickOn (sKiHomePage.getAcceptCookiesButton ());
        SharedMethods.clickOn (sKiHomePage.getWhatsOnNav ());
        SharedMethods.mouseClickAction(sKiHomePage.getLadiesNightCard());
        ActivitiesPage activitiesPage = new ActivitiesPage (getDriver ());
        SharedMethods.clickOn(activitiesPage.getActivitiesTitle());
        SharedMethods.clickOn(activitiesPage.getGuestsDropDownList());
        SharedMethods.threadSleep (2000);
        ExpectedConditions.invisibilityOf ((activitiesPage.getAddChildGuest()));
        ExpectedConditions.invisibilityOf ((activitiesPage.getNumberOfJuniors()));
        Assert.assertTrue (activitiesPage.getAddAdultGuest ().isEnabled ());
    }

    @Test(description = "Validate 'required Supervision ticket' for Package on Add-Ons ")
    public void validateThatTheUserSeeSupervisionTicketOnAddOnsForPackage ()  {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.clickOn(sKiHomePage.getAcceptCookiesButton ());
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedSteps.userBookPassForm(sKiHomePage.getPenguinEncounterOption (), passesAndPackages.getSnowPremiumPassBuyButton());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        ActivitiesPage activitiesPage = new ActivitiesPage(getDriver ());
        SharedMethods.waitUntilElementClickable (activitiesPage.getGuestsDropDownList ());
        activitiesPage.getGuestsDropDownList ().click ();
        SharedMethods.mouseClickAction (activitiesPage.getNumberOfJuniors ());
        SharedMethods.mouseClickAction (activitiesPage.getRemoveAdultGuest ());
        SharedMethods.waitUntilElementClickable (activitiesPage.getGuestsDropDownList ());
        SharedMethods.clickOn(activitiesPage.getLastActivityTimeSlot());
        SharedMethods.clickOn(activitiesPage.getPackageSlopePassAddButton());
        SharedMethods.clickOn(activitiesPage.getAddTicketButton());
        SharedMethods.threadSleep (3000);
        SharedMethods.clickOn(addOnsScreen.getSupervisionTicketPlusButton ());
        Assert.assertTrue (addOnsScreen.getAddedSupervisionToBookingCard().isDisplayed ());
    }

    @Test(description = "Validate 'required Adult ticket' for Package on Add-Ons ")
    public void validateThatTheUserSeeNeedAdultTicketOnAddOnsForPackage ()  {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.clickOn(sKiHomePage.getAcceptCookiesButton ());
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedSteps.userBookPassForm(sKiHomePage.getPenguinEncounterOption (), passesAndPackages.getSnowDaycationPassBuyButton());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen (getDriver ());
        ActivitiesPage activitiesPage = new ActivitiesPage(getDriver ());
        SharedMethods.waitUntilElementClickable (activitiesPage.getGuestsDropDownList ());
        activitiesPage.getGuestsDropDownList ().click ();
        SharedMethods.mouseClickAction (activitiesPage.getNumberOfJuniors ());
        SharedMethods.mouseClickAction (activitiesPage.getRemoveAdultGuest ());
        SharedMethods.waitUntilElementClickable (activitiesPage.getGuestsDropDownList ());
        SharedMethods.clickOn(activitiesPage.getPackageSnowBulletRidesPassAddButton());
        Assert.assertTrue (addOnsScreen.getNeedAdultTicketMsg().isDisplayed ());
    }
}
