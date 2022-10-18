//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.SKiHomePage;
import org.maf.page_objects.SignUp;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
public class SignUpTest extends base {

    @Test(description = "Validate that user is able to signup and fill all needed data properly")
    public void validateThatUserIsAbleToSignUp()  {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        SignUp signupPage = new SignUp(getDriver());
        signupPage.getSignUpButtton().click();
        SharedMethods.waitUntilElementVisible (signupPage.getRadiobutton ());
        signupPage.getRadiobutton().click();
        signupPage.getFirstname().sendKeys(objXMLReader.getXMLData("firstName"));
        signupPage.getLastname().sendKeys(objXMLReader.getXMLData("lastName"));
        signupPage.getEmail().sendKeys(SharedMethods.generateRandomString()+objXMLReader.getXMLData("randomEmailDomain"));
        signupPage.getPhoneNumber().sendKeys(objXMLReader.getXMLData("phoneNumber"));
        signupPage.getDate().click();
        signupPage.getSelectYear().click();
        signupPage.getYear().click();
        signupPage.getOkButton().click();
        signupPage.getNationality().click();
        signupPage.getDropdownNationality().click();
        signupPage.getCountryOfResidence().click();
        signupPage.getDropdownCountry().click();
        signupPage.getPassword().sendKeys(objXMLReader.getXMLData("password"));
        signupPage.getSubmit().click();
    }
}
