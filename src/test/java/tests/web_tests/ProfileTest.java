package tests.web_tests;

import org.maf.page_objects.LoginPage;
import org.maf.page_objects.ProfilePage;
import org.maf.page_objects.SignUpPage;
import org.maf.page_objects.SkiHomePage;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.maf.core.instance.BetaDriver.base;
import org.testng.asserts.SoftAssert;

@Listeners(TestListener.class)
public class ProfileTest extends base{

    SoftAssert softAssert = new SoftAssert();
    @Test(description = "Validate the data in the profile")
    public void ValidateProfileData(){//test1233232@gmail.com
        SignUpTest signUpTest = new SignUpTest();
        ProfilePage profilePage = new ProfilePage(getDriver());
        SkiHomePage skiHomePage = new SkiHomePage(getDriver());
        signUpTest.ValidateThatTheUserCanSignUp();
        SharedMethods.threadSleep(30000);
        SharedMethods.waitUntilElementVisible(skiHomePage.getProfileAvatar());
        skiHomePage.getProfileAvatar().click();
        SharedMethods.waitUntilElementVisible(skiHomePage.getProfileButton());
        skiHomePage.getProfileButton().click();
        SharedMethods.waitUntilElementVisible(profilePage.getChangeDetailsButton());
        SharedMethods.threadSleep(1000);
        //Assert the First name
        softAssert.assertTrue(profilePage.getFirstNameValue().getText().equalsIgnoreCase(objXMLReader.getXMLData("firstName")));
        //Assert the Last name
        softAssert.assertTrue(profilePage.getLastNameValue().getText().equalsIgnoreCase(objXMLReader.getXMLData("lastName")));
        //Assert  date of birth
        softAssert.assertTrue(profilePage.getDateOfBirthValue().getText().equalsIgnoreCase(objXMLReader.getXMLData("birthDate")));
        //Assert the phone number
        softAssert.assertTrue(profilePage.getEmailValue().getText().equalsIgnoreCase(randomEmail));
        //Assert the phone number
        softAssert.assertTrue((profilePage.getPhoneNumberValue().getText()).equals("+971"+objXMLReader.getXMLData("phone")));
        //Assert the nationality
        softAssert.assertTrue((profilePage.getNationalityValue().getText()).equalsIgnoreCase(objXMLReader.getXMLData("UAENationality")));
        //Assert the Country Of Residence
        softAssert.assertTrue((profilePage.getCountryOfResidenceValue().getText()).equalsIgnoreCase(objXMLReader.getXMLData("CountryOfResidence")));
        //Assert that the password is hidden
        softAssert.assertTrue(profilePage.getPasswordValue().getText().equalsIgnoreCase("*********"));
        softAssert.assertAll();
    }
    @Test(description = "Validate the user can reset the password successfully")
    public void ValidateResetPassword() throws InterruptedException{//test1233232@gmail.com

       SignUpTest signUpTest = new SignUpTest();
       ProfilePage profilePage = new ProfilePage(getDriver());
       SkiHomePage skiHomePage = new SkiHomePage(getDriver());
       signUpTest.ValidateThatTheUserCanSignUp();
       SharedMethods.threadSleep(30000);
       SharedMethods.waitUntilElementVisible(skiHomePage.getProfileAvatar());
       skiHomePage.getProfileAvatar().click();
       SharedMethods.waitUntilElementVisible(skiHomePage.getProfileButton());
       skiHomePage.getProfileButton().click();
       SharedMethods.waitUntilElementVisible(profilePage.getChangeDetailsButton());
       profilePage.getChangeDetailsButton().click();
       profilePage.getResetPasswordButton().click();
       SharedMethods.waitUntilElementVisible(profilePage.getResetPasswordSuccessPopUp());
       profilePage.getResetPasswordSuccessPopUp().getText().contains("Password reset code sent!");
       softAssert.assertAll();
    }
}
