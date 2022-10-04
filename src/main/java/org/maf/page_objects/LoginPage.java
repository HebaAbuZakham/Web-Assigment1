package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    @FindBy(xpath = "(//input[@id='email'])[1]")
    private WebElement userName;
    @FindBy(xpath = "(//input[@id='password'])[1]")
    private WebElement password;
    @FindBy(xpath = "//button[@id='submit-login-form']")
    private WebElement loginCTA;
    @FindBy(id = "submit-button")
    private WebElement gender;

    public WebElement getUserName () {
        return userName;
    }

    public void setUserName (WebElement userName) {
        this.userName = userName;
    }

    public WebElement getPassword () {
        return password;
    }

    public void setPassword (WebElement password) {
        this.password = password;
    }

    public WebElement getLoginCTA () {
        return loginCTA;
    }

    public void setLoginCTA (WebElement loginCTA) {
        this.loginCTA = loginCTA;
    }

    public WebElement getGender () {
        return gender;
    }

    public void setGender (WebElement gender) {
        this.gender = gender;
    }

    public LoginPage (WebDriver driver) {

        PageFactory.initElements (driver, this);
    }
}
