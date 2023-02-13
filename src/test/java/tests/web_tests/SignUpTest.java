package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.LoginPage;
import org.maf.page_objects.ProfilePage;
import org.maf.page_objects.SignUpPage;
import org.maf.page_objects.SkiHomePage;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static org.maf.core.instance.SelInstance.objXMLReader;


import static org.apache.commons.lang3.RandomStringUtils.*;
import static org.maf.utils.common.SharedMethods.MouseClickAction;
import static org.maf.utils.common.SharedMethods.waitUntilElementVisible;

@Listeners(TestListener.class)
public class SignUpTest extends base {
    SoftAssert softAssert = new SoftAssert();
    @Test(description = "validate that the user can sign up" ,priority = 1)
    public void ValidateThatTheUserCanSignUp() {
        LoginPage loginPage = new LoginPage(getDriver());
        SignUpPage signUpPage = new SignUpPage(getDriver());
        SkiHomePage skiHomePage = new SkiHomePage(getDriver());

        SharedMethods.waitUntilElementVisible(skiHomePage.getSignInButton());
        skiHomePage.getSignInButton().click();
        //Assert that sign-in button redirect to sign in page
        softAssert.assertTrue(loginPage.getSignInToYouAccountLabel().getText().equalsIgnoreCase("SIGN-IN TO YOUR ACCOUNT"));

        loginPage.getSignUpLink().click();
        //Assert that sign-up button redirect to sign up page
        softAssert.assertTrue(signUpPage.getSkiDubaiLogo().isDisplayed());
        //choose the title
        signUpPage.getMissTitle().click();
        //Set the First name
        signUpPage.getFirstName().sendKeys(objXMLReader.getXMLData("firstName"));
        //Set the Last name
        signUpPage.getLastName().sendKeys(objXMLReader.getXMLData("lastName"));
        //Set the password
        signUpPage.getPassword().sendKeys(objXMLReader.getXMLData("password"));
        //set the phone number
        signUpPage.getPhoneNumber().sendKeys(objXMLReader.getXMLData("phone"));
        //Set the email with random email
        signUpPage.getEmail().sendKeys(randomEmail);
        //Choose the nationality UAE
        SharedMethods.waitUntilElementVisible(signUpPage.getNationality());
        signUpPage.getNationality().click();
        SharedMethods.waitUntilElementVisible(signUpPage.getNationalityUAE());
        signUpPage.getNationalityUAE().click();

        //Choose the country of residence after searching for it
        SharedMethods.waitUntilElementVisible(signUpPage.getCountryOfResidence());
        signUpPage.getCountryOfResidence().click();
        SharedMethods.threadSleep(3000);
        SharedMethods.waitUntilElementVisible(signUpPage.getSearchCountryOfResidence());
        signUpPage.getSearchCountryOfResidence().sendKeys(objXMLReader.getXMLData("CountryOfResidence"));
        SharedMethods.waitUntilElementVisible(signUpPage.getSearchedCountryOfResidence());
        signUpPage.getSearchedCountryOfResidence().click();
        SharedMethods.threadSleep(3000);

        //Fill the date with the birthdate
        SharedMethods.waitUntilElementVisible(signUpPage.getCalenderList());
        signUpPage.getCalenderList().click();
        SharedMethods.threadSleep(3000);
        SharedMethods.waitUntilElementVisible(signUpPage.getYear());
        signUpPage.getYear().click();
        SharedMethods.jsScrollUp(signUpPage.getYearOfBirth());
        SharedMethods.waitUntilElementVisible(signUpPage.getYearOfBirth());
        signUpPage.getYearOfBirth().click();
        SharedMethods.waitUntilElementVisible( signUpPage.getMonthOfBirth());
        signUpPage.getMonthOfBirth().click();
        SharedMethods.waitUntilElementVisible( signUpPage.getDateOfBirth());
        signUpPage.getDateOfBirth().click();
        signUpPage.getCalenderOkButton().click();

        //Click on create account button
        signUpPage.getCreateAccountButton().click();
        SharedMethods.threadSleep(100);
        if(signUpPage.getConfirmEmailButton().isDisplayed()){
            signUpPage.getConfirmEmailButton().click();
            signUpPage.getCreateAccountButton().click();
        }


        waitUntilElementVisible(skiHomePage.getProfileAvatar());
        softAssert.assertTrue(skiHomePage.getProfileAvatar().isDisplayed());
        softAssert.assertAll();
    }
    @Test(description = "Validate that the user can go to profile after sign up",priority = 2)
    public void ValidateThatTheUserCanGoToProfile(){
        SkiHomePage skiHomePage = new SkiHomePage(getDriver());
        ProfilePage profilePage = new ProfilePage(getDriver());

        ValidateThatTheUserCanSignUp();
        SharedMethods.threadSleep(30000);
        SharedMethods.waitUntilElementVisible(skiHomePage.getProfileAvatar());
        skiHomePage.getProfileAvatar().click();
        SharedMethods.waitUntilElementVisible(skiHomePage.getProfileButton());
        skiHomePage.getProfileButton().click();
        waitUntilElementVisible(profilePage.getYourDetails());
        profilePage.getYourDetails().click();
        waitUntilElementVisible(profilePage.getChangeDetailsButton());
        softAssert.assertTrue(profilePage.getYourDetailsLabel().getText().equalsIgnoreCase("YOUR DETAILS"));
        softAssert.assertAll();
    }

}
