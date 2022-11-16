package org.maf.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingSharedComponent {

    @FindBy(xpath = "//div[@class='field-row']//button")
    private WebElement calendarButton;

    @FindBy(className = "mx-icon-right")
    private WebElement nextMonthButton;

    @FindBy(xpath = "//div[text()='10']")
    private WebElement monthSelection;

    @FindBy(xpath = "//p[text()[normalize-space()='1 adult']]")
    private WebElement adultsDropDown;

    @FindBy(css = "ul#booking-bar-guest-ddl>li:nth-of-type(2)>div>div:nth-of-type(2)>button:nth-of-type(2)")
    private WebElement numberOfJuniors;

    @FindBy(css = "ul#booking-bar-guest-ddl>li:nth-of-type(1)>div>div:nth-of-type(2)>button:nth-of-type(2)")
    private WebElement addAdultGuest;

    @FindBy(css = "ul#booking-bar-guest-ddl>li:nth-of-type(3)>div>div:nth-of-type(2)>button:nth-of-type(2)")
    private WebElement addChildGuest;


    @FindBy(xpath = "//*[@id=\"tickets-container\"]/div[3]/div[2]")
    private WebElement guestsDropDownList;

    @FindBy(css = "ul#booking-bar-guest-ddl>li:nth-of-type(1)>div>div:nth-of-type(2)>button:nth-of-type(1)")
    private WebElement removeAdultGuest;



    public WebElement getCalendarButton () {
        return calendarButton;
    }

    public void setCalendarButton (WebElement calendarButton) {
        this.calendarButton = calendarButton;
    }

    public WebElement getNextMonthButton () {
        return nextMonthButton;
    }

    public void setNextMonthButton (WebElement nextMonthButton) {
        this.nextMonthButton = nextMonthButton;
    }

    public WebElement getMonthSelection () {
        return monthSelection;
    }

    public void setMonthSelection (WebElement monthSelection) {
        this.monthSelection = monthSelection;
    }

    public WebElement getAdultsDropDown () {
        return adultsDropDown;
    }

    public void setAdultsDropDown (WebElement adultsDropDown) {
        this.adultsDropDown = adultsDropDown;
    }

    public WebElement getNumberOfJuniors () {
        return numberOfJuniors;
    }

    public void setNumberOfJuniors (WebElement numberOfJuniors) {
        this.numberOfJuniors = numberOfJuniors;
    }

    public WebElement getGuestsDropDownList () {return guestsDropDownList;}

    public  void setGuestsDropDownList (WebElement guestsDropDownList){ this.guestsDropDownList = guestsDropDownList;}

    public WebElement getRemoveAdultGuest () {return removeAdultGuest;}

    public void setRemoveAdultGuest(WebElement removeAdultGuest) {
        this.removeAdultGuest = removeAdultGuest;
    }

    public WebElement getAddAdultGuest() {
        return addAdultGuest;
    }

    public void setAddAdultGuest(WebElement addAdultGuest) {
        this.addAdultGuest = addAdultGuest;
    }

    public WebElement getAddChildGuest() {
        return addChildGuest;
    }

    public void setAddChildGuest(WebElement addChildGuest) {
        this.addChildGuest = addChildGuest;
    }
}
