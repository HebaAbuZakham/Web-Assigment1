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
public class AddGuestPage {
    @FindBy(css = ".open-drop-list")
    @CacheLookup
    private WebElement dropDownListButton;

    @FindBy(css = "div#layout li.add-new > button[type=\"button\"]")
    @CacheLookup
    private WebElement addNewGuest;

    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/div[2]/div[2]/div/div/div/span/div[1]/span[1]/label/span[1]")
    @CacheLookup
    private WebElement titleMr;

    @FindBy(id = "firstName")
    @CacheLookup
    private WebElement guestFirstName;

    @FindBy(id = "LastName")
    @CacheLookup
    private WebElement guestLastName;

    @FindBy(css = "div#layout div.absolute.left-0.right-0.top-0.bottom-0.lg\\3a cursor-pointer")
    @CacheLookup
    private WebElement birthOfDatePicker;

    @FindBy(css = ".mx-calendar-header > span > button.mx-btn.mx-btn-text.mx-btn-current-year")
    @CacheLookup
    private WebElement yearsTab;

    @FindBy(css = ".mx-btn.mx-btn-icon-double-left.mx-btn-text > .mx-icon-double-left")
    @CacheLookup
    private WebElement backArrow;

    @FindBy(css = "div#booking-bar-date tr:nth-child(1) > td:nth-child(1) > div")
    @CacheLookup
    private WebElement year;

    @FindBy(css = "#booking-bar-date > div > div > div > div > div > div.mx-calendar-content > table > tr:nth-child(5) > td:nth-child(2)")
    @CacheLookup
    private WebElement childYear;

    @FindBy(css = "div#booking-bar-date tr:nth-child(1) > td:nth-child(2) > div")
    @CacheLookup
    private WebElement month;

    @FindBy(css = "div#booking-bar-date tr:nth-child(1) > td:nth-child(3) > div")
    @CacheLookup
    private WebElement day;

    @FindBy(id = "confirm")
    @CacheLookup
    private WebElement confirmInformationCheckbox;

    @FindBy(css = "div#layout div.flex.justify-end > button[type=\"button\"]")
    @CacheLookup
    private WebElement saveButton;

    @FindBy(css = ".selected-guest:nth-child(1)")
    @CacheLookup
    private WebElement selectedGuest;

    @FindBy(css = ".absolute.bg-white.guest-drop-down.pt-2.z-20")
    @CacheLookup
    private WebElement guestsDropDownList;

    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/div[2]/div[2]/div/div/div/span/div[3]/div/div/div[1]/div/span/div[1]")
    @CacheLookup
    private WebElement errorMessage;

    @FindBy(css = "div#layout div.group.inline-block > ul > li:nth-child(1) > span")
    @CacheLookup
    private WebElement guestMember;





    public AddGuestPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
