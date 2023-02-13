package org.maf.page_objects;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
@Setter
public class LoginPage {
    public WebElement getSignUpLink() {
        return signUpLink;
    }

    public WebElement getSignInToYouAccountLabel() {
        return signInToYouAccountLabel;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    @FindBy(xpath = "//span[text()='Sign Up']")
    private WebElement signUpLink;
    @FindBy(xpath = "//h1[text()[normalize-space()='SIGN-IN TO YOUR ACCOUNT']]")
    private WebElement signInToYouAccountLabel;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "submit-login-form")
    private WebElement signInButton;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
