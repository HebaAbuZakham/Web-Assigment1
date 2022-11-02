package tests.web_tests;


import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.*;
import org.maf.utils.Common_steps.SharedSteps;
import org.maf.utils.common.SharedMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddGearTests extends base {

    @Test(description = "Validate That The Guest User Is Able To Add Gear")
    public void validateThatTheUserIsAbleToAddGear() {
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
//        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getCardCSV());
//        SharedSteps.userFillCCPayment(objXMLReader.getXMLData("visaCard1"),
//                objXMLReader.getXMLData("cardExp"), objXMLReader.getXMLData("cardCSV"));
        SharedSteps.userApplyPromoCode(objXMLReader.getXMLData("snowParkFullPromoCode"));
        SharedMethods.threadSleep(1000);
        SharedMethods.waitTillClickAble(paymentDetailsPage.getPay());
        paymentDetailsPage.getPay().click();
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver());
        SharedMethods.waitUntilElementVisible(confirmationPage.getBookingConfirmation());
        Assert.assertEquals(confirmationPage.getBookingConfirmation().getText(), "BOOKING CONFIRMED");
        Assert.assertTrue(confirmationPage.getAddGuestButton().isDisplayed());
        Assert.assertEquals(confirmationPage.getNextStepTitle().getText(), "Add Gear");
        confirmationPage.getAddGearButton().click();
        AddGearPage addGearPage = new AddGearPage(getDriver());
        SharedMethods.waitUntilElementVisible(addGearPage.getAddMember());
        addGearPage.getAddMember().click();
        addGearPage.getFirstName().sendKeys(objXMLReader.getXMLData("guestFirstName"));
        addGearPage.getLastName().sendKeys(objXMLReader.getXMLData("guestLastName"));
        addGearPage.getBirthOfDatePicker().click();
        addGearPage.getYearsTab().click();
        addGearPage.getBackArrow().click();
        addGearPage.getBackArrow().click();
        addGearPage.getYear().click();
        addGearPage.getMonth().click();
        addGearPage.getDay().click();
//        addGearPage.getAddGearCheckbox().click();
        SharedMethods.mouseClickAction(addGearPage.getLongJacket());
        addGearPage.getLongJacketSize().click();
        addGearPage.getBoots().click();
        addGearPage.getBootsSizeChartMenu().click();
        addGearPage.getBootsSize().click();
        addGearPage.getAddedUser().isDisplayed();
        addGearPage.getCheckedGearBox().isDisplayed();
    }

    @Test(description = "Validate That The Logged In User Is Able To Add Gear")
    public void validateThatTheLoggedUserIsAbleToAddGear() {
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
        SharedMethods.mouseClickAction(addOnsScreen.getCalendarButton());
        SharedMethods.mouseClickAction(addOnsScreen.getNextMonthButton());
        SharedMethods.mouseClickAction(addOnsScreen.getMonthSelection());
        SharedMethods.waitTillElementDisAppear(addOnsScreen.getCalenderFrame());
        SharedMethods.mouseClickAction(addOnsScreen.getAdultsDropDown());
        SharedMethods.threadSleep(7000);
        SharedMethods.waitTillClickAble(addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton().click();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver());
        SharedMethods.waitUntilElementVisible(personalDetailsPage.getContinueToPayment());
        Assert.assertTrue(personalDetailsPage.getContinueToPayment().isDisplayed());
        personalDetailsPage.getContinueToPayment().click();
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage(getDriver());
//        SharedSteps.userFillCCPayment(objXMLReader.getXMLData("visaCard1"),
//                objXMLReader.getXMLData("cardExp"), objXMLReader.getXMLData("cardCSV"));
        SharedSteps.userApplyPromoCode(objXMLReader.getXMLData("snowParkFullPromoCode"));
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
        addGuestPage.getGuestMember().click();
        confirmationPage.getAddGearButton().click();
        AddGearPage addGearPage = new AddGearPage(getDriver());
        SharedMethods.waitUntilElementVisible(addGearPage.getAddMember());
        addGearPage.getAddedUser().click();
        SharedMethods.moveToElement(addGearPage.getSaveButton());
        addGearPage.getLongJacket().click();
        addGearPage.getLongJacketSize();
        addGearPage.getBoots();
        addGearPage.getBootsSizeChartMenu();
        addGearPage.getBootsSize();
        addGearPage.getAddedUser().isDisplayed();
        addGearPage.getCheckedGearBox().isDisplayed();
    }

}
