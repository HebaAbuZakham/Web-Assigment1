package org.maf.page_objects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SkiHomePage {
    public SkiHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[text()='Accept All']")
    @CacheLookup
    private WebElement acceptAllCookieButton;
    @FindBy(xpath = "//button[contains(text(),'Sign In')]")
    @CacheLookup
    private WebElement signInButton;
    @FindBy(xpath = "//div[@class='user-avatar-container']//div[1]")
    @CacheLookup
    private WebElement profileAvatar;
    @FindBy(xpath = "//*[contains(@href,'/accounts/profile/personal-details')]")
    private WebElement profileButton;
    public WebElement getAcceptAllCookieButton() {
        return acceptAllCookieButton;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getProfileAvatar() {
        return profileAvatar;
    }

    public WebElement getProfileButton() {
        return profileButton;
    }
}
