package org.maf.core.instance.BetaDriver;

import org.maf.core.instance.SelInstance;
import org.maf.utils.PropReader;
import org.maf.utils.handler.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import static org.maf.utils.common.SharedMethods.*;


public class WebBase extends SelInstance {


    public static final String xmlPathName = "web";
    public static final String emailGenerator="automation5514+"+generateRandomString() +"@gmail.com";
    public static final String CART = "cart";
    public static final String REMOVE = "remove";
    public static final String COUNTRYCODE = "countrycode";


    public WebBase() {
        super(new WebXMLReader(xmlPathName));
    }

    @BeforeSuite
    public void navigateToHomePage (){
        NavigateToSTGURL();
        verifyUser();
    }


    @BeforeMethod
    public void NavigateToSTGURL() {
        WebDriver driver = doBrowserSetup();
        WaitHelper.handleImplicit(driver);
        threadLocalDriver.set(driver);
        getDriver().get(PropReader.readConfig("SMBU-Web"));
    }
    @BeforeGroups("Logged-In")
    public void prepareInfo(){
        NavigateToSTGURL();
        addNewAddressAndPayment();
    }



    public void mouseOverAction(WebElement locator) {
        String javaScript = "var evObj = document.createEvent('MouseEvents');" +
                "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);" +
                "arguments[0].dispatchEvent(evObj);";
        ((JavascriptExecutor) getDriver()).executeScript(javaScript, locator);
    }

    public void jsScrollUp(WebElement locator) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,-750)", locator);
    }

    public void jsScrollDown(WebElement locator, int Pixel) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView()", locator);
        js.executeScript("window.scrollBy(0," + Pixel + ")", locator);
    }

    public void mouseClickAction(WebElement locator) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView()", locator);
        js.executeScript("arguments[0].click()", locator);
    }

    public static void waitElementToBecomeClickable(WebElement locator) {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), 30);
            wait.until(ExpectedConditions.elementToBeClickable((locator)));
        } catch (Exception e) {
        }
    }

    public static void waitElementTillAppear(WebElement locator) {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), 10);
            wait.until(ExpectedConditions.visibilityOf((locator)));
        } catch (Exception e) {
        }
    }

    public ElementHelper elementHelper;

    public static void ifElementAppears(WebElement locator) {
        ElementHelper.elementWaitSeconds (3);
        try {
            locator.click();
        } catch (Exception e) {
            System.out.println(e + " caught");
        }
    }

    public void loadJQueryLib() {
        String jsString = "var script =  document.createElement(\"script\");" +
                "script.src = \"https://code.jquery.com/jquery-3.6.0.min.js\";" +
                "document.head.append(script);";
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript(jsString);
    }

    public void jQueryClickAction(String targetPage) {
        loadJQueryLib();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        if (targetPage == CART) {
            String jQuerySelector = "$(\"._cart-item button:nth-child(2)\")[0].click()";
            js.executeScript(jQuerySelector);
        } else if (targetPage == REMOVE) {
            String jQuerySelector = "$(\"._cart-item button:first\")[0].click()";
            js.executeScript(jQuerySelector);
        }else if(targetPage == COUNTRYCODE){
            String jQuerySelector = "$(\".country-selector__list__item__calling-code:contains('+971')\")[0].click()";
            js.executeScript(jQuerySelector);
        }
        else {
            String jQuerySelector = "$(\".product__card:first .product__image span\")[0].click()";
            js.executeScript(jQuerySelector);
        }
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
        threadLocalDriver.remove();
    }
}

