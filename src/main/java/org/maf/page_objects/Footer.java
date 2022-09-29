package org.maf.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Footer {
    WebDriver driver;

    @FindBy(xpath = "//button[@name='Back To Top']")
    WebElement backToTopButton;

    @FindBy(xpath = "//a[@title='SHOP']")
   public WebElement shop;

    @FindBy(xpath = "//a[contains(.,'Chat with Us')]")
    public WebElement chatWithUS;

    @FindBy(xpath = "//a[@title='Facebook']//img[@alt='image']\n")
    public WebElement facebookIcon;


    @FindBy(xpath = "//a[@title='https://play.google.com/store/apps/details?id=com.belongi.moe']//img[@alt='image']")
    public WebElement googleAppIcon;

    public Footer(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }

    public void clickOnBackToTopButton()
    {
        JavascriptExecutor Js1 = (JavascriptExecutor) driver;
        Js1.executeScript("window.scrollBy(0,4000)");
        backToTopButton.click();
    }

}
