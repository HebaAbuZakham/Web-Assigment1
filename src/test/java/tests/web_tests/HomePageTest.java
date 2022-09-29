package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.HomePage;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.PropReader;
import org.maf.utils.error_handlers.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class HomePageTest extends base {



    @Test(description = "Validate that upon clicking on Maf logo then the user will be  redirected to the home page",retryAnalyzer = RetryAnalyzer.class)
    public void testLogoIsRedirectedTOHomePage() {
        getDriver().get (PropReader.readConfig("REN-leisure-URL"));
        HomePage objHomePage = new HomePage(getDriver());
        objHomePage.clickOnMafLogo();
        Assert.assertEquals (getDriver().getCurrentUrl(), PropReader.readConfig("REN-Home-URL"));
    }

}
