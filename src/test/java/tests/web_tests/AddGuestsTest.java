package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.*;
import org.maf.utils.Common_steps.SharedSteps;
import org.maf.utils.common.SharedMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddGuestsTest extends base {

    @Test(description = "Validate That The User Is Able To Add Adult Guest")
    public void validateThatTheUserIsAbleToAddAdultGuest() {
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
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData("visaCard1"),
                objXMLReader.getXMLData("cardExp"), objXMLReader.getXMLData("cardCSV"));
        SharedMethods.threadSleep(1000);
        SharedMethods.waitTillClickAble(paymentDetailsPage.getPay());
        paymentDetailsPage.getPay().click();
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver());
        SharedMethods.waitUntilElementVisible(confirmationPage.getAssignGuestButton());
        Assert.assertEquals(confirmationPage.getBookingConfirmation().getText(), "BOOKING CONFIRMED");
        confirmationPage.getAddGuestButton().click();
        AddGuestPage addGuestPage = new AddGuestPage(getDriver());
        SharedMethods.waitUntilElementVisible(addGuestPage.getDropDownListButton());
        addGuestPage.getDropDownListButton().click();
        SharedMethods.clickAction(addGuestPage.getAddNewGuest());
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
    }

    @Test(description = "Verify that guest user doesnt have assign guest step")
    public void verifyThatGuestUserDoesntHaveAssignGuestStep() {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitUntilElementVisible(sKiHomePage.getPassesAndPackages());
        SharedMethods.clickAction(sKiHomePage.getPassesAndPackages());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkOption());
        sKiHomePage.getSnowParkOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible(passesAndPackages.getSnowParkPassesHeader());
        SharedMethods.mouseClickAction(passesAndPackages.getFullDaySlopePassBuyButton());
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver());
        SharedMethods.waitTillClickAble(addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton().click();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver());
        SharedMethods.waitUntilElementVisible(personalDetailsPage.getPersonalDetailsHeader());
        personalDetailsPage.clickingMissRadioButton();
        personalDetailsPage.getFirstName().sendKeys(objXMLReader.getXMLData("firstName"));
        personalDetailsPage.getLastName().sendKeys(objXMLReader.getXMLData("lastName"));
        personalDetailsPage.getMobileNum().sendKeys(objXMLReader.getXMLData("phone"));
        personalDetailsPage.getEmail().sendKeys(objXMLReader.getXMLData("email"));
        personalDetailsPage.getCountryDropDownList().click();
        SharedMethods.mouseClickAction(personalDetailsPage.getAndoraCountry());
        SharedMethods.mouseClickAction(personalDetailsPage.getBookingInformation());
        SharedMethods.mouseClickAction(personalDetailsPage.getTermsConditonsCheckbox());
        SharedMethods.mouseClickAction(personalDetailsPage.getContinueToPayment());
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage(getDriver());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getCardCSV());
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData("visaCard1"),
                objXMLReader.getXMLData("cardExp"), objXMLReader.getXMLData("cardCSV"));
        SharedMethods.threadSleep(1000);
        SharedMethods.waitTillClickAble(paymentDetailsPage.getPay());
        paymentDetailsPage.getPay().click();
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver());
        SharedMethods.waitUntilElementVisible(confirmationPage.getBookingConfirmation());
        Assert.assertTrue(confirmationPage.getAddGuestButton().isDisplayed());
        Assert.assertEquals(confirmationPage.getNextStepTitle().getText(),"Add Gear");

    }

    @Test(description = "Validate That The user is create wrong guest type (age - Adult) from post booking")
    public void addWrongAgeGuest() {
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
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData("visaCard1"),
                objXMLReader.getXMLData("cardExp"), objXMLReader.getXMLData("cardCSV"));
        SharedMethods.threadSleep(1000);
        SharedMethods.waitTillClickAble(paymentDetailsPage.getPay());
        paymentDetailsPage.getPay().click();
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver());
        SharedMethods.waitUntilElementVisible(confirmationPage.getAssignGuestButton());
        Assert.assertEquals(confirmationPage.getBookingConfirmation().getText(), "BOOKING CONFIRMED");
        confirmationPage.getAddGuestButton().click();
        AddGuestPage addGuestPage = new AddGuestPage(getDriver());
        SharedMethods.waitUntilElementVisible(addGuestPage.getDropDownListButton());
        addGuestPage.getDropDownListButton().click();
        SharedMethods.clickAction(addGuestPage.getAddNewGuest());
        addGuestPage.getTitleMr().click();
        addGuestPage.getGuestFirstName().sendKeys(objXMLReader.getXMLData("guestFirstName"));
        addGuestPage.getGuestLastName().sendKeys(objXMLReader.getXMLData("guestLastName"));
        addGuestPage.getBirthOfDatePicker().click();
        addGuestPage.getYearsTab().click();
        addGuestPage.getBackArrow().click();
        addGuestPage.getYear().click();
        addGuestPage.getMonth().click();
        addGuestPage.getDay().click();
        addGuestPage.getConfirmInformationCheckbox().click();
        addGuestPage.getSaveButton().click();
        Assert.assertEquals(addGuestPage.getErrorMessage().getText(), "User age must be more than 14 years.");
    }

    @Test(description = "Validate That The user Is Able To Choose Guest From Drop-Down List")
    public void chooseGuestFromDropDown() {
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
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData("visaCard1"),
                objXMLReader.getXMLData("cardExp"), objXMLReader.getXMLData("cardCSV"));
        SharedMethods.threadSleep(1000);
        SharedMethods.waitTillClickAble(paymentDetailsPage.getPay());
        paymentDetailsPage.getPay().click();
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver());
        SharedMethods.waitUntilElementVisible(confirmationPage.getAssignGuestButton());
        Assert.assertEquals(confirmationPage.getBookingConfirmation().getText(), "BOOKING CONFIRMED");
        confirmationPage.getAddGuestButton().click();
        AddGuestPage addGuestPage = new AddGuestPage(getDriver());
        SharedMethods.waitUntilElementVisible(addGuestPage.getDropDownListButton());
        addGuestPage.getDropDownListButton().click();
        String GuestMember=addGuestPage.getGuestMember().getText();
        addGuestPage.getGuestMember().click();
        Assert.assertEquals(GuestMember,addGuestPage.getSelectedGuest().getText());
    }

    @Test(description = "Validate That The User Is Able To Add Junior Guest")
    public void validateThatTheUserIsAbleToAddJuniorGuest() {
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
        addOnsScreen.getAddJunior().click();
        addOnsScreen.getRemoveIcon().click();
        SharedMethods.threadSleep(7000);
        SharedMethods.waitTillClickAble(addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton().click();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver());
        SharedMethods.waitUntilElementVisible(personalDetailsPage.getContinueToPayment());
        Assert.assertTrue(personalDetailsPage.getContinueToPayment().isDisplayed());
        personalDetailsPage.getContinueToPayment().click();
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage(getDriver());
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData("visaCard1"),
                objXMLReader.getXMLData("cardExp"), objXMLReader.getXMLData("cardCSV"));
        SharedMethods.threadSleep(1000);
        SharedMethods.waitTillClickAble(paymentDetailsPage.getPay());
        paymentDetailsPage.getPay().click();
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver());
        SharedMethods.waitUntilElementVisible(confirmationPage.getAssignGuestButton());
        Assert.assertEquals(confirmationPage.getBookingConfirmation().getText(), "BOOKING CONFIRMED");
        confirmationPage.getAddGuestButton().click();
        AddGuestPage addGuestPage = new AddGuestPage(getDriver());
        SharedMethods.waitUntilElementVisible(addGuestPage.getDropDownListButton());
        addGuestPage.getDropDownListButton().click();
        SharedMethods.clickAction(addGuestPage.getAddNewGuest());
        addGuestPage.getTitleMr().click();
        addGuestPage.getGuestFirstName().sendKeys(objXMLReader.getXMLData("guestFirstName"));
        addGuestPage.getGuestLastName().sendKeys(objXMLReader.getXMLData("guestLastName"));
        addGuestPage.getBirthOfDatePicker().click();
        addGuestPage.getYearsTab().click();
        addGuestPage.getBackArrow().click();
        addGuestPage.getYear().click();
        addGuestPage.getMonth().click();
        addGuestPage.getDay().click();
        addGuestPage.getConfirmInformationCheckbox().click();
        addGuestPage.getSaveButton().click();
    }

    @Test(description = "Validate That The User Is Able To Add Child Guest")
    public void validateThatTheUserIsAbleToAddChildGuest() {
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
        addOnsScreen.getAddChild().click();
        addOnsScreen.getRemoveIcon().click();
        SharedMethods.threadSleep(7000);
        SharedMethods.waitTillClickAble(addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton().click();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver());
        SharedMethods.waitUntilElementVisible(personalDetailsPage.getContinueToPayment());
        Assert.assertTrue(personalDetailsPage.getContinueToPayment().isDisplayed());
        personalDetailsPage.getContinueToPayment().click();
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage(getDriver());
        SharedSteps.userFillCCPayment(objXMLReader.getXMLData("visaCard1"),
                objXMLReader.getXMLData("cardExp"), objXMLReader.getXMLData("cardCSV"));
        SharedMethods.threadSleep(1000);
        SharedMethods.waitTillClickAble(paymentDetailsPage.getPay());
        paymentDetailsPage.getPay().click();
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver());
        SharedMethods.waitUntilElementVisible(confirmationPage.getAssignGuestButton());
        Assert.assertEquals(confirmationPage.getBookingConfirmation().getText(), "BOOKING CONFIRMED");
        confirmationPage.getAddGuestButton().click();
        AddGuestPage addGuestPage = new AddGuestPage(getDriver());
        SharedMethods.waitUntilElementVisible(addGuestPage.getDropDownListButton());
        addGuestPage.getDropDownListButton().click();
        SharedMethods.clickAction(addGuestPage.getAddNewGuest());
        addGuestPage.getTitleMr().click();
        addGuestPage.getGuestFirstName().sendKeys(objXMLReader.getXMLData("guestFirstName"));
        addGuestPage.getGuestLastName().sendKeys(objXMLReader.getXMLData("guestLastName"));
        addGuestPage.getBirthOfDatePicker().click();
        addGuestPage.getYearsTab().click();
        addGuestPage.getBackArrow().click();
        addGuestPage.getChildYear().click();
        addGuestPage.getMonth().click();
        addGuestPage.getDay().click();
        addGuestPage.getConfirmInformationCheckbox().click();
        addGuestPage.getSaveButton().click();
    }
}


