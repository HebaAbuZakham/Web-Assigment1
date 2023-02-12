package org.maf.page_objects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class SignInPage {
    @FindBy(xpath = "//span[text()='Sign Up']")
    private WebElement signUpLink;
    @FindBy(xpath = "//h1[text()[normalize-space()='SIGN-IN TO YOUR ACCOUNT']]")
    private WebElement signInToYouAccountLabel;
    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
