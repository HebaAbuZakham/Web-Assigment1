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

    @FindBy(xpath = "//span[contains(@class,'mr-2 ml-2')]/following-sibling::p[1]")
    private WebElement wrongMessage;

    @FindBy(xpath = "(//div[contains(@class,'text-left rtl:text-right')])[2]")
    private WebElement notFilledEmail;

    @FindBy(xpath = "(//div[contains(@class,'text-left rtl:text-right')])[3]")
    private WebElement notFilledPassword;
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

    public WebElement getWrongMessage () {
        return wrongMessage;
    }

    public void setWrongMessage (WebElement wrongMessage) {
        this.wrongMessage = wrongMessage;
    }

    public WebElement getNotFilledEmail () {
        return notFilledEmail;
    }

    public void setNotFilledEmail (WebElement notFilledEmail) {
        this.notFilledEmail = notFilledEmail;
    }

    public WebElement getNotFilledPassword () {
        return notFilledPassword;
    }

    public void setNotFilledPassword (WebElement notFilledPassword) {
        this.notFilledPassword= notFilledPassword;
    }
    public LoginPage (WebDriver driver) {

        PageFactory.initElements (driver, this);
    }
}
