package org.maf.utils.Common_steps;

import org.apache.commons.lang3.RandomStringUtils;
import org.maf.page_objects.LoginPage;
import org.maf.page_objects.PassesAndPackages;
import org.maf.page_objects.PaymentDetailsPage;
import org.maf.page_objects.SKiHomePage;
import org.maf.utils.common.SharedMethods;
import org.openqa.selenium.WebElement;

import static org.maf.core.instance.SelInstance.getDriver;
import static org.maf.core.instance.SelInstance.objXMLReader;

public class SharedSteps {

  public static void userLogInToTheSite(String userName, String passWord){
      SKiHomePage sKiHomePage = new SKiHomePage (getDriver ());
      sKiHomePage.getAcceptCookiesButton ().click ();
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
}
