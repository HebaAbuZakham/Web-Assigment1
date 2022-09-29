package org.maf.page_objects;

import org.maf.utils.common.SharedMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.maf.core.instance.SelInstance.getDriver;


public class HomePage {

    WebDriver driver;
    SharedMethods objSharedMethods=new SharedMethods(getDriver());

    @FindBy(xpath = "(//img[@alt='MAF logo image'])[1]")
    WebElement mafLogo;
    @FindBy(linkText = "Shop Online")
    public WebElement shopMenu;
    @FindBy(xpath = "//a[@href='/en/accessories']")
    public WebElement accessoriesSubCategory;
    @FindBy(xpath = "//li[@class='hidden lg:inline-block cursor-pointer']")
    WebElement countryDropDownList;
    @FindBy(xpath = "//button[@name='العربية']")
    WebElement arabicButton;
    @FindBy(css = "[href='\\/en\\/wishlist'] [class='w-8 h-8 ']")
    WebElement wishlistButton;
    @FindBy(xpath = "//li[@class='inline-block cursor-pointer']//span[@class='mx-3 mf-icon items-center ']//*[name()='svg']")
    WebElement cartIcon;
    @FindBy(css = "a[title='#ResourceNotFound: profiletooltiplabel#'] .h-8.w-8")
    WebElement loginIcon;
    @FindBy(xpath = "//h1[contains(.,'SIGN-IN TO YOUR ACCOUNT')]")
    public WebElement sign;
    @FindBy(xpath = "//span[contains(@class,'mx-3 ayaglobal3')]//*[name()='svg']")
    WebElement searchIcon;
    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;
    @FindBy(xpath = "//header[@class='grid place-content-center text-center mt-84 relative']")
    public WebElement search;
    @FindBy(xpath = "//input[@name='digit_number']")
    public WebElement balanceTextBox;
    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    public WebElement reCAPTCHA;
    @FindBy(xpath = "//button[text()[normalize-space()='CHECK MY BALANCE']]")
    public WebElement getBalanceButton;
    @FindBy(xpath = "//h6[contains(.,'Card Balance* - AED')]")
    public WebElement cardBalance;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }

    public void clickOnMafLogo() {
        mafLogo.click();
    }
    public void clickOnShopMenu()
    {
        shopMenu.click();
    }
    public void clickOnBagsSubCategory()
    {
        accessoriesSubCategory.click();

    }
    public void clickOnCountryDropDownList()
    {
        countryDropDownList.click();
    }
    public void clickOnArabicButton()
    {
        arabicButton.click();
    }
    public void clickOnWishlistIcon()
    {
        wishlistButton.click();
    }
    public void clickOnCartIcon()
    {
        cartIcon.click();
    }
    public void clickOnLoginIcon()
    {

      loginIcon.click();

    }
    public void clickOnSearchIcon()
    {
        searchIcon.click();
        objSharedMethods.waitUntilElementVisible(search);

    }
    public void clickOnSearchBox()
    {
        searchBox.click();
    }

    public void clickOnBalanceBox()  {

        balanceTextBox.click();
        balanceTextBox.sendKeys("1234567812345678");
        getBalanceButton.click();
    }


}
