package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.LoginPage;
import org.maf.page_objects.SKiHomePage;
import org.maf.utils.common.SharedMethods;
import org.maf.utils.handler.XMLReader;
import org.testng.annotations.Test;

public class FindYourBookingTest extends base {



    @Test(description = "Logged in user- Verify that the user is able to search on valid booking reference")
    public void ValidateValidBookingForLoggedinUser() {

        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPlanYourVisitNav ());
        SharedMethods.clickAction (sKiHomePage.getPlanYourVisitNav ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getFindYourBookingLink());
        sKiHomePage.getFindYourBookingLink().click();
        SharedMethods.threadSleep (120000);

    }



}
