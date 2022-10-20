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

    @FindBy(css = "#list-15691 > li.add-new")
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

    @FindBy(id = "date")
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

    @FindBy(css = ".selected-guest")
    @CacheLookup
    private WebElement selectedGuest;















    public AddGuestPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
