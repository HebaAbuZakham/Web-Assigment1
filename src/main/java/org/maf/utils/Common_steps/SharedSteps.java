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


}

