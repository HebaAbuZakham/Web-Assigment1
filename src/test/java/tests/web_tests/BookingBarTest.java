package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.*;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

@Listeners(TestListener.class)
public class BookingBarTest extends base {

    @Test(description = "Verify that the selected data reflect on the booking")
    public void validateTheSelectedDateGotReflectedOnTheBooking(){
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        BookingBarPage bookingBarPage = new BookingBarPage(getDriver());
        bookingBarPage.getExperienceDll().click();
        SharedMethods.waitUntilElementVisible(bookingBarPage.getSnowParkExperience());
        bookingBarPage.getSnowParkExperience().click();
        SharedMethods.waitUntilElementVisible(bookingBarPage.getDateDll());
        bookingBarPage.getDateDll().click();
        SharedMethods.mouseClickAction(bookingBarPage.getDateSelection());
        SharedMethods.mouseClickAction(bookingBarPage.getGuestsDll());
        SharedMethods.waitUntilElementVisible(bookingBarPage.getBookingButton());
        bookingBarPage.getBookingButton().click();
        SharedMethods.threadSleep (700);
        PassesAndPackages passesAndPackages=new PassesAndPackages(getDriver());
        SharedMethods.jsScrollDown(passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.waitUntilElementVisible(passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.waitUntilElementClickable(passesAndPackages.getSnowParkPassBuyButton());
        passesAndPackages.getSnowParkPassBuyButton().click();
        SharedMethods.threadSleep(700);
        AddOnsScreen addOnsScreen=new AddOnsScreen(getDriver());
        Assert.assertEquals(addOnsScreen.getPackageTitle().getText(),"Snow Park");
    }

    @Test(description = "Verify that the guest can use the bar")
    public void validateTheGuestCanUseTheBar(){
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.threadSleep(10000);
        BookingBarPage bookingBarPage = new BookingBarPage(getDriver());
        bookingBarPage.getExperienceDll().click();
        SharedMethods.waitUntilElementVisible(bookingBarPage.getSnowParkExperience());
        bookingBarPage.getSnowParkExperience().click();
        SharedMethods.waitUntilElementVisible(bookingBarPage.getDateDll());
        bookingBarPage.getDateDll().click();
        SharedMethods.mouseClickAction(bookingBarPage.getDateSelection());
        SharedMethods.mouseClickAction(bookingBarPage.getGuestsDll());
        SharedMethods.waitUntilElementVisible(bookingBarPage.getBookingButton());
        bookingBarPage.getBookingButton().click();
        SharedMethods.threadSleep (700);
        PassesAndPackages passesAndPackages=new PassesAndPackages(getDriver());
        SharedMethods.jsScrollDown(passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.waitUntilElementVisible(passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.waitUntilElementClickable(passesAndPackages.getSnowParkPassBuyButton());
        passesAndPackages.getSnowParkPassBuyButton().click();
        SharedMethods.threadSleep(700);
        AddOnsScreen addOnsScreen=new AddOnsScreen(getDriver());
        Assert.assertEquals(addOnsScreen.getPackageTitle().getText(),"Snow Park");
    }

    @Test(description = "Verify that the selected data reflect on the bar")
    public void validateTheSelectedDateGotReflectedOnTheBar(){
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.threadSleep(10000);
        BookingBarPage bookingBarPage = new BookingBarPage(getDriver());
        bookingBarPage.getExperienceDll().click();
        SharedMethods.waitUntilElementVisible(bookingBarPage.getSnowParkExperience());
        bookingBarPage.getSnowParkExperience().click();
        SharedMethods.waitUntilElementVisible(bookingBarPage.getDateDll());
        bookingBarPage.getDateDll().click();
        SharedMethods.mouseClickAction(bookingBarPage.getDateSelection());
        SharedMethods.mouseClickAction(bookingBarPage.getGuestsDll());
        SharedMethods.waitUntilElementVisible(bookingBarPage.getBookingButton());
        bookingBarPage.getBookingButton().click();
        SharedMethods.threadSleep (10000);
        String data= Arrays.toString(bookingBarPage.getDateValue().getText().split(" 2022")) .replace("[","").replace("]","")+", "+bookingBarPage.getGuestsDll().getText().replaceAll("[^0-9]", "")+" GUEST"+"   [UPDATE]";
        Assert.assertEquals(bookingBarPage.getBookingButton().getText().toLowerCase(), data.toLowerCase());
    }
}
