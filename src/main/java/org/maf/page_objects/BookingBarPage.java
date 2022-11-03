package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingBarPage {

    @FindBy(xpath = "//*[@id=\"findTicketBar\"]/div/div/div[1]/div[1]/div[3]")
    private WebElement experienceDll;

    @FindBy(xpath = "//div[@id='findTicketBar']/div[1]/div[1]/div[2]/div[1]/div[3]")
    private WebElement dateDll;

    @FindBy(xpath = "//*[@id=\"findTicketBar\"]/div/div/div[3]/div[1]/div[2]")
    private WebElement guestsDll;

    @FindBy(xpath = "//*[@id=\"booking-bar-experience\"]/ul/li[3]/div/span[1]")
    private WebElement snowParkExperience;

    @FindBy(xpath = "//*[@id=\"booking-bar-date\"]/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[2]")
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
