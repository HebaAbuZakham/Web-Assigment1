package org.maf.utils.common;

import org.apache.commons.lang3.RandomStringUtils;
import org.maf.core.instance.BetaDriver.WebBase;
import org.maf.core.instance.SelInstance;
import org.maf.utils.PropReader;
import org.maf.utils.handler.ElementHelper;
import org.maf.web_pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import static org.maf.core.instance.BetaDriver.WebBase.*;

public class SharedMethods extends SelInstance {
    WebDriver driver;
    public String winHandleBefore ;

    public SharedMethods(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }

    public static String generateRandomString(){
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }


    public void MouseOverAction(WebElement Locator)
    {
        String javaScript = "var evObj = document.createEvent('MouseEvents');" +
                "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);" +
                "arguments[0].dispatchEvent(evObj);";
        ((JavascriptExecutor)getDriver ()).executeScript(javaScript, Locator);
    }

    public void MouseClickAction(WebElement Locator)
    {
        //JavascriptExecutor ex=(JavascriptExecutor)driver;
        //ex.executeScript("arguments[0].click()", Locator);
        JavascriptExecutor jse = (JavascriptExecutor)getDriver ();
        jse.executeScript("document.getElementByXpath('"+ Locator +"').click();");
    }


    public void clickAction(WebElement Locator)
    {
        Actions actions = new Actions(getDriver ());
        actions.moveToElement(Locator).click().build().perform();
    }


    //small hint here please don't forget to switch back to your main tap after calling this method and do your test :)
    public void SwitchToNewTap(WebElement element)
    {
        JavascriptExecutor Js1 = (JavascriptExecutor) getDriver ();

        Js1.executeScript("window.scrollBy(0,4000)");
        element.click();

        winHandleBefore=getDriver ().getWindowHandle();
        for(String winHandle : getDriver ().getWindowHandles())
        {
            getDriver ().switchTo().window(winHandle);
        }
        getDriver ().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void SwitchToNewTapUsingSelenium(WebElement element){

        element.click();

        for(String winHandle : getDriver ().getWindowHandles())
        {
            getDriver ().switchTo().window(winHandle);
        }
        getDriver ().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

      public  int getCurrentDay() {

        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        //Get Current Day as a number

          return calendar.get(Calendar.DAY_OF_MONTH);
    }


    public void waitUntilElementVisible(WebElement webElement)
    {
        WebDriverWait wait = new WebDriverWait(getDriver (),30);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
    public void waitUntilElementClickable(WebElement webElement)
    {
        WebDriverWait wait = new WebDriverWait(getDriver (),30);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static void mouseOverAction(WebElement Locator)
    {
        String javaScript = "var evObj = document.createEvent('MouseEvents');" +
                "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);" +
                "arguments[0].dispatchEvent(evObj);";
        ((JavascriptExecutor)getDriver ()).executeScript(javaScript, Locator);
    }

    public static void jsScrollUp(WebElement Locator)
    {
        JavascriptExecutor js = (JavascriptExecutor) getDriver ();
        js.executeScript("window.scrollBy(0,-350)", Locator);
    }

    public void jsScrollDown(WebElement Locator)
    {
        JavascriptExecutor js = (JavascriptExecutor) getDriver ();
        js.executeScript("window.scrollBy(0,350)", Locator);
    }

    public static void mouseClickAction(WebElement Locator)
    {
        JavascriptExecutor js = (JavascriptExecutor) getDriver ();
        js.executeScript("arguments[0].scrollIntoView()", Locator);
        //js.executeScript("document.getElementByXpath('"+ Locator +"').click();");
        js.executeScript("arguments[0].click()", Locator);
    }


    public void waitElement(WebElement Locator)
    {
        WebDriverWait wait = new WebDriverWait(getDriver (),10);
        wait.until(ExpectedConditions.elementToBeClickable((Locator)));
    }

    public void changeAttire(WebElement locator){
        JavascriptExecutor js = (JavascriptExecutor) getDriver ();
        js.executeScript("arguments[0].removeAttribute('disabled','disabled')",locator);
    }

    public static void pageBottom(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

    }

    public static void addProductToTheCart() {
        HomePage homePage = new HomePage(getDriver());
        waitElementToBecomeClickable(homePage.shopLink);
        pageBottom();
        mouseClickAction(homePage.findStoreLink);
        FindStorePage findStorePage = new FindStorePage(getDriver());
        findStorePage.getSearchIcon().click();
        findStorePage.getSearchField ().click ();
        findStorePage.getSearchField().sendKeys("Automation");
        findStorePage.getFirstAutomationStore().click();
        ProductListingPage productListingPage = new ProductListingPage(getDriver());
        waitElementToBecomeClickable (productListingPage.addToCartCTA);
        productListingPage.addToCartCTA.click();
        WebBase.waitElementTillAppear(productListingPage.confirmMSG);
    }

    public static void addNewAddressAndPayment(){
        HomePage homePage = new HomePage(getDriver());
        doLogin(emailGenerator);
        ProfilePage profilePage = new ProfilePage(getDriver());
        waitElementToBecomeClickable (profilePage.paymentsMethods);
        getDriver().navigate().refresh();
        waitElementToBecomeClickable (profilePage.paymentsMethods);
        profilePage.paymentsMethods.click();
        ifElementAppears(profilePage.addNewCardEmpty);
        ifElementAppears(profilePage.addNewCard);
        profilePage.cardHolderName.sendKeys(objXMLReader.getXMLData ("firstname"));
        profilePage.cardNumber.sendKeys(objXMLReader.getXMLData ("masterCard1"));
        profilePage.cardExpiry.sendKeys("1234");
        profilePage.cardCVV.sendKeys("123");
        profilePage.submitPayment.click();
        waitElementToBecomeClickable(profilePage.formSubmit);
        profilePage.switchToForm();
        waitElementToBecomeClickable(profilePage.myAddresses);
        getDriver().navigate().refresh();
        waitElementToBecomeClickable(profilePage.myAddresses);
        profilePage.myAddresses.click();
        ifElementAppears(profilePage.addNewAddressEmptyState);
        ifElementAppears(profilePage.addNewAddress);
        profilePage.fillAddress(generateRandomString(),"test","test","12","abdallah",
                "501234567",objXMLReader.getXMLData("username"));
        profilePage.selectCity();
        profilePage.saveAddress.click();
        waitElementToBecomeClickable(profilePage.confirmMSGAddresses);
        jsScrollUp(homePage.logoTag);
        getDriver ().quit ();
        SelInstance.threadLocalDriver.remove ();
    }

    public static void doLogin(String userName){
        LoginPage loginPage;
        loginPage= new LoginPage(getDriver ());
        HomePage homePage = new HomePage(getDriver ());
        ProfilePage profilePage = new ProfilePage(getDriver());
        waitElementToBecomeClickable(homePage.loginIcon);
        homePage.loginIcon.click();
        loginPage.userName.click();
        loginPage.userName.sendKeys(userName);
        loginPage.password.click();
        loginPage.password.sendKeys(objXMLReader.getXMLData ("password"));
        loginPage.loginCTA.click();
        ElementHelper.elementWaitSeconds(2);
        ifElementAppears(loginPage.gender);
        waitElementToBecomeClickable(profilePage.myWishlistTab);
    }

    public static void verifyUser(){
        SignupPage signupPage = new SignupPage(getDriver());
        GmailPage gmailPage = new GmailPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        signupPage.makeSignup();
        getDriver().navigate().to(objXMLReader.getXMLData ("googleURL"));
        gmailPage.languageChange.click();
        getDriver().navigate().to(objXMLReader.getXMLData ("gmailURL"));
        gmailPage.gMailSignInCTA.click();
        gmailPage.gMailUsername.sendKeys(objXMLReader.getXMLData ("gmailUserName"));
        gmailPage.gMailNext.click();
        if(PropReader.readConfig("is-headless") .equals("false")){
            gmailPage.gMailPassword.click();
            gmailPage.gMailPassword.sendKeys(objXMLReader.getXMLData ("password"));
        }
        else{

            gmailPage.gMailPasswordHeadless.click();
            gmailPage.gMailPasswordHeadless.sendKeys(objXMLReader.getXMLData ("password"));
        }
        gmailPage.gMailNext.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gmailPage.gMailFirstEmail.click();
        try {
            gmailPage.emailThread.click();
        }catch (Exception e){}
        gmailPage.verifyEmail.click();
        waitElementToBecomeClickable(homePage.loginIcon);
        getDriver().quit();
        SelInstance.threadLocalDriver.remove ();
    }



}
