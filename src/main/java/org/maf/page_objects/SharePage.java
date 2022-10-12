package org.maf.page_objects;


import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


@Getter
@Setter
public class SharePage {

    @FindBy(css = "div#BannerModule h1")
    @CacheLookup
    private WebElement title;

    @FindBy(css = "body > div.wrapper > header > div.section-container > div > div.logo")
    @CacheLookup
    private WebElement shareLogo;

    @FindBy(css = "#cookie-law > div > div.close-cookies-button > div")
    @CacheLookup
    private WebElement closeCookiesPopUpButton;

    public SharePage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public void getPageURL(){

    }


}
