package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.*;
import org.maf.utils.Common_steps.SharedSteps;
import org.maf.utils.common.SharedMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddGuestsTest extends base {

    @Test(description = "Validate That The User Is Able To Add Adult Guest")
    public void ValidateThatTheUserIsAbleToAddAdultGuest() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.getUserName().sendKeys(objXMLReader.getXMLData("userName"));
        loginPage.getPassword().sendKeys(objXMLReader.getXMLData("passWord"));
        loginPage.getLoginCTA().click();
        SharedMethods.threadSleep(9000);
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPassesAndPackages());
        SharedMethods.clickAction(sKiHomePage.getPassesAndPackages());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkPackage());
        sKiHomePage.getSnowParkPackage().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.threadSleep(1000);
        SharedMethods.waitUntilElementVisible(passesAndPackages.getSlopePassesHeader());
        SharedMethods.waitUntilElementClickable(passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.jsScrollDown(passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.mouseClickAction(passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.threadSleep(3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver());
        SharedMethods.waitUntilElementClickable(addOnsScreen.getAddMainAddOnsButton());
        addOnsScreen.getAddMainAddOnsButton().click();
        SharedMethods.mouseClickAction(addOnsScreen.getCalendarButton());
        SharedMethods.mouseClickAction(addOnsScreen.getNextMonthButton());
        SharedMethods.mouseClickAction(addOnsScreen.getMonthSelection());
        SharedMethods.waitTillElementDisAppear(addOnsScreen.getCalenderFrame());
        SharedMethods.mouseClickAction(addOnsScreen.getAdultsDropDown());
        SharedMethods.threadSleep(7000);
        SharedMethods.mouseClickAction(addOnsScreen.getNumberOfJuniors());
        SharedMethods.waitTillClickAble(addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton().click();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver());
        SharedMethods.waitUntilElementVisible(personalDetailsPage.getContinueToPayment());
        Assert.assertTrue(personalDetailsPage.getContinueToPayment().isDisplayed());
        personalDetailsPage.getContinueToPayment().click();
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage(getDriver());
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData("masterCard1"),
                objXMLReader.getXMLData("cardExp"), objXMLReader.getXMLData("cardCSV"));
        SharedMethods.threadSleep(1000);
        SharedMethods.waitTillClickAble(paymentDetailsPage.getPay());
        paymentDetailsPage.getPay().click();
        ConfirmationPage confirmationPage=new ConfirmationPage(getDriver());
        SharedMethods.waitUntilElementVisible(confirmationPage.getAddGuestButton());
       Assert.assertEquals(confirmationPage.getBookingConfirmation().getText(), "BOOKING CONFIRMED");
        confirmationPage.getAddGuestButton().click();
        AddGuestPage addGuestPage=new AddGuestPage(getDriver());
        SharedMethods.waitUntilElementVisible(addGuestPage.getDropDownListButton());
        addGuestPage.getDropDownListButton().click();
        addGuestPage.getAddNewGuest().click();
        addGuestPage.getTitleMr().click();
        addGuestPage.getGuestFirstName().sendKeys(objXMLReader.getXMLData("guestFirstName"));
        addGuestPage.getGuestLastName().sendKeys(objXMLReader.getXMLData("guestLastName"));
        addGuestPage.getBirthOfDatePicker().click();
        addGuestPage.getYearsTab().click();
        addGuestPage.getBackArrow().click();
        addGuestPage.getBackArrow().click();
        addGuestPage.getYear().click();
        addGuestPage.getMonth().click();
        addGuestPage.getDay().click();
        addGuestPage.getConfirmInformationCheckbox().click();
        addGuestPage.getSaveButton().click();
        SharedMethods.threadSleep(7000);
        Assert.assertEquals(addGuestPage.getSelectedGuest().getText(), objXMLReader.getXMLData("guestFirstName") + " "+ objXMLReader.getXMLData("guestLastName"));

    }
}
