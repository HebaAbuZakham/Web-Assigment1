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
    public SignUpTest() {
    }

    @Test(
        description = "Validate that user is able to signup and fill all needed data properly"
    )
    public void validateThatUserIsAbleToSignUp() throws InterruptedException {
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble(sKiHomePage.getSignInButton());
        sKiHomePage.getSignInButton().click();
        SignUp signupPage = new SignUp(getDriver());
        signupPage.getSignUpButtton().click();
        signupPage.getRadiobutton().click();
        signupPage.getFirstName().sendKeys(new CharSequence[]{objXMLReader.getXMLData("firstName")});
        signupPage.getLastName().sendKeys(new CharSequence[]{objXMLReader.getXMLData("lastName")});
        signupPage.getEmail().sendKeys(new CharSequence[]{objXMLReader.getXMLData("email")});
        signupPage.getPhoneNumber().sendKeys(new CharSequence[]{objXMLReader.getXMLData("phoneNumber")});
        signupPage.getDateInput().click();
        signupPage.getSelectYear().click();
        signupPage.getYear().click();
        signupPage.getMonth().click();
        signupPage.getDay().click();
        signupPage.getNationality().click();
        signupPage.getDropdownNationality().click();
        signupPage.getCountryOfResidence().click();
        signupPage.getDropdownCountry().click();
        signupPage.getPassword().sendKeys(new CharSequence[]{objXMLReader.getXMLData("password")});
        signupPage.getSubmit().click();
    }
}
