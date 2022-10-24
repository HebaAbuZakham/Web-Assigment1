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

    @Test(description = "Validate The User Add 5 Guest To Breakfast With Penguin")
    public void validateThatTheUserAdd5GuestToBreakfastWithPenguin ()  {
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.clickOn(sKiHomePage.getAcceptCookiesButton ());
        PassesAndPackages passesAndPackages = new PassesAndPackages (getDriver ());
        SharedSteps.userBookPassForm(sKiHomePage.getPenguinEncounterOption (), passesAndPackages.getBreakfastWithPenguinPassBuyButton());
        SharedMethods.threadSleep (1000);
        SharedSteps.userAddGuestsAs(0,3,1);
        ActivitiesPage activityPage = new ActivitiesPage (getDriver ());
        Assert.assertTrue(SharedMethods.elementContainsText(activityPage.getLastTableTitle(), "Table 2"));
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
        Assert.assertTrue(SharedMethods.elementContainsText(activityPage.getLastTableTitle(), "Table 1"));
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

}
