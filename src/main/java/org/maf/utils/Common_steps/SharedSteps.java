package org.maf.utils.Common_steps;

import org.apache.commons.lang3.RandomStringUtils;
import org.maf.page_objects.*;
import org.maf.utils.common.SharedMethods;
import org.openqa.selenium.WebElement;

import static org.maf.core.instance.SelInstance.getDriver;
import static org.maf.core.instance.SelInstance.objXMLReader;

public class SharedSteps {

  public static void userLogInToTheSite(String userName, String passWord){
      SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
//      sKiHomePage.getAcceptCookiesButton ().click ();
      SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
      sKiHomePage.getSignInButton ().click ();
      LoginPage loginPage = new LoginPage (getDriver ());
      loginPage.getUserName ().sendKeys (userName );
      loginPage.getPassword ().sendKeys (passWord );
      loginPage.getLoginCTA ().click ();
      SharedMethods.threadSleep (12000);
  }

    public static void userFillCCPayment(String Card, String cardExp, String cardCSV){
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        paymentDetailsPage.getCardNumberField ().sendKeys (Card);
        paymentDetailsPage.getCardExpiry ().sendKeys (cardExp);
        paymentDetailsPage.getCardCSV ().sendKeys (cardCSV);
    }

    public static void userFillPromoCodePayment(String code){
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.clickOn(paymentDetailsPage.getPromoCodeLabel());
        paymentDetailsPage.getCouponCodeInput ().sendKeys (code);
        SharedMethods.clickOn(paymentDetailsPage.getApplyPromoCode());
    }
    public static void userFillCCInfo( String cardExp, String cardCSV){
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        paymentDetailsPage.getCardExpiry ().sendKeys (objXMLReader.getXMLData ("cardExp"));
        paymentDetailsPage.getCardCSV ().sendKeys (objXMLReader.getXMLData ("cardCSV"));
    }

    public static void userApplyPromoCode (String promoCode){
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.clickAction(paymentDetailsPage.getPromoCodeRadio());
        paymentDetailsPage.getPromoCodeField ().sendKeys (objXMLReader.getXMLData ("promoCode"));
        paymentDetailsPage.getApplyPromoCode().click();

    }
    public static void newUserSignup()
    {
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

