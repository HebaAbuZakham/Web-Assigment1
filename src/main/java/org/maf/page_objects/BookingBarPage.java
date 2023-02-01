package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingBarPage {

    @FindBy(xpath = "//div[@id='experience-text-booking-bar']")
    private WebElement experienceDll;

    @FindBy(xpath = "//div[@id='findTicketBar']/div[1]/div[1]/div[2]/div[1]/div[3]")
    private WebElement dateDll;

    @FindBy(xpath = "//*[@id=\"findTicketBar\"]/div/div/div[3]/div[1]/div[2]")
    private WebElement guestsDll;

    @FindBy(xpath = "//*[@id=\"booking-bar-experience\"]/ul/li[contains(.,\"Park\")]")
    private WebElement snowParkExperience;

    @FindBy(xpath = "(//*[@id=\"booking-bar-date\"]//tr/td[not(contains(@class, \"disabled\"))])[1]")
    private WebElement dateSelection;

    @FindBy(css = "div#date-text-booking-bar>p:nth-of-type(3)")
    private WebElement dateValue;


    @FindBy(xpath = "//*[@id=\"findTicketBar\"]/div/div/div[4]/button")
    private WebElement bookingButton;

    public BookingBarPage(WebDriver driver){ PageFactory.initElements(driver, this);}


    public WebElement getExperienceDll(){return experienceDll;}

    public WebElement getDateDll(){return dateDll;}

    public WebElement getGuestsDll(){return guestsDll;}

    public WebElement getSnowParkExperience(){return snowParkExperience;}

    public WebElement getDateSelection(){return dateSelection;}

    public WebElement getBookingButton(){return bookingButton;}

    public WebElement getDateValue(){return dateValue;}


}
