package org.maf.core.instance.BetaDriver;

import org.maf.core.instance.SelInstance;
import org.maf.page_objects.SkiHomePage;
import org.maf.utils.common.SharedMethods;
import org.maf.utils.handler.ReengineeringXMLReader;
import org.maf.utils.handler.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.Random;


public class base extends SelInstance {

    public static final String xmlPathName = "reengineering";
    public static String randomEmail ;

    public base() {
        super(new ReengineeringXMLReader(xmlPathName));
    }

    @BeforeMethod
    public void navigateToLEcURL() {

        //get URL
        WebDriver driver = doBrowserSetup();
        WaitHelper.handleImplicit(driver);
        threadLocalDriver.set(driver);
        threadLocalDriver.get().get("https://abd-stg.skidxb.com/en-ae/ski-dubai/");
        SkiHomePage skiHomePage = new SkiHomePage(getDriver());
        skiHomePage.getAcceptAllCookieButton().click();
    }
    //get thread-safe driver
    @BeforeMethod
    public static void generateRandomEmail() {
        Random rand = new Random();
        randomEmail ="hiba" +rand.nextInt((999 - 100) + 1) + 100+".abuzakham@gmail.com";
    }
    @AfterMethod
    public void tearDown() {
        getDriver().quit();
        threadLocalDriver.remove();
    }

}
