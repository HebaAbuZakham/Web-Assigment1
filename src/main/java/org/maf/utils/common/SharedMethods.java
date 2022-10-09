package org.maf.utils.common;

import org.apache.commons.lang3.RandomStringUtils;
import org.maf.core.instance.SelInstance;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;


public class SharedMethods extends SelInstance {
    public static String winHandleBefore ;



    public static String generateRandomString(){
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }


    public static void MouseOverAction(WebElement Locator)
    {
        String javaScript = "var evObj = document.createEvent('MouseEvents');" +
                "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);" +
                "arguments[0].dispatchEvent(evObj);";
        ((JavascriptExecutor)getDriver ()).executeScript(javaScript, Locator);
    }

    public static void MouseClickAction(WebElement Locator)
    {
        //JavascriptExecutor ex=(JavascriptExecutor)driver;
        //ex.executeScript("arguments[0].click()", Locator);
        JavascriptExecutor jse = (JavascriptExecutor)getDriver ();
        jse.executeScript("document.getElementByXpath('"+ Locator +"').click();");
    }


    public static void clickAction(WebElement Locator)
    {
        Actions actions = new Actions(getDriver ());
        actions.moveToElement(Locator).click().build().perform();
    }


    //small hint here please don't forget to switch back to your main tap after calling this method and do your test :)
    public static void SwitchToNewTap(WebElement element)
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

    public static void SwitchToNewTapUsingSelenium(WebElement element){

        element.click();

        for(String winHandle : getDriver ().getWindowHandles())
        {
            getDriver ().switchTo().window(winHandle);
        }
        getDriver ().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

      public static int getCurrentDay() {

        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        //Get Current Day as a number

          return calendar.get(Calendar.DAY_OF_MONTH);
    }


    public static void waitUntilElementVisible(WebElement webElement)
    {
        WebDriverWait wait = new WebDriverWait(getDriver (),30);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
    public static void waitUntilElementClickable(WebElement webElement)
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

    public static void jsScrollDown(WebElement Locator)
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


    public static void waitTillClickAble (WebElement Locator)
    {
        WebDriverWait wait = new WebDriverWait(getDriver (),20);
        wait.until(ExpectedConditions.elementToBeClickable((Locator)));
    }

    public static void waitTillElementDisAppear (WebElement Locator)
    {
        WebDriverWait wait = new WebDriverWait(getDriver (),10);
        wait.until(ExpectedConditions.invisibilityOf ((Locator)));
    }

    public static void changeAttire(WebElement locator){
        JavascriptExecutor js = (JavascriptExecutor) getDriver ();
        js.executeScript("arguments[0].removeAttribute('disabled','disabled')",locator);
    }

    public static void pageBottom(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

    }

    public static void threadSleep(int time){
        try {
            Thread.sleep (time);
        } catch (InterruptedException e) {
            throw new RuntimeException (e);
        }
    }

    public static boolean urlShouldInclude(String url){
        String URL = getDriver ().getCurrentUrl();
        return (URL.contains(url));
    }

}
