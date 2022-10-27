package tests.web_tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.LoginPage;
import org.maf.page_objects.ProfilePage;
import org.maf.page_objects.SKiHomePage;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class ProfileTest extends base {

    @Test(description = "Validate that user can add new guest")
    public void validateThatUserCanAddNewGuest(){
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (10000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getUserAvatar());
        SharedMethods.clickAction(sKiHomePage.getUserAvatar());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getProfileOption());
        sKiHomePage.getProfileOption().click();
        ProfilePage profilePage = new ProfilePage(getDriver());
        SharedMethods.threadSleep(600);
        SharedMethods.waitUntilElementClickable(profilePage.getAddIcon());
        profilePage.getAddIcon().click();
        profilePage.getTitleMR().click();
        profilePage.getFirstName().sendKeys(objXMLReader.getXMLData("subFirstName"));
        profilePage.getLastName().sendKeys(objXMLReader.getXMLData("subLastName"));
        profilePage.getBirthDate().click();
        profilePage.getYear().click();
        profilePage.getBackIcon().click();
        profilePage.getDesiredYear().click();
        profilePage.getMonth().click();
        profilePage.getDay().click();
        profilePage.getMobileNumber().sendKeys(objXMLReader.getXMLData("phone"));
        profilePage.getEmail().sendKeys(objXMLReader.getXMLData("guestEmail"));
        profilePage.getCountryOfResident().click();
        profilePage.getUae().click();
        profilePage.getNationality().click();
        profilePage.getUae().click();
        profilePage.getSubmitButton().click();
        SharedMethods.threadSleep(5000);
        Assert.assertTrue(profilePage.getPageTitle().isDisplayed());



    }

    @Test(description = "Validate that choose gear leading user to choose gear ")
    private void validateThatChooseGearLeadingUserToChooseGear(){
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (10000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getUserAvatar());
        SharedMethods.clickAction(sKiHomePage.getUserAvatar());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getProfileOption());
        sKiHomePage.getProfileOption().click();
        ProfilePage profilePage = new ProfilePage(getDriver());
        SharedMethods.threadSleep(300);
        profilePage.getGearButton().click();
        SharedMethods.waitUntilElementVisible(profilePage.getGearPageTitle());
        Assert.assertTrue(profilePage.getGearPageTitle().isDisplayed());

    }

    @Test(description = "Validate that choose buy membership leading user to the correct screen ")
    private void validateThatChooseBuyMembershipLeadingTheUserToTheCorrectScreen(){
        SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (10000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getUserAvatar());
        SharedMethods.clickAction(sKiHomePage.getUserAvatar());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getProfileOption());
        sKiHomePage.getProfileOption().click();
        ProfilePage profilePage = new ProfilePage(getDriver());
        SharedMethods.threadSleep(300);
        profilePage.getBuyMembershipButton().click();
        SharedMethods.waitUntilElementVisible(profilePage.getBuyMembershipTitle());
        Assert.assertTrue(profilePage.getBuyMembershipTitle().isDisplayed());

    }
}
