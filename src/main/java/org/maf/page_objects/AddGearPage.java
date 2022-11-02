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
public class AddGearPage {

    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/section/div/div[3]/div/div[1]/div/div[2]/div/div[2]/div")
    @CacheLookup
    private WebElement addMember;

    @FindBy(id = "firstName")
    @CacheLookup
    private WebElement firstName;

    @FindBy(id = "LastName")
    @CacheLookup
    private WebElement lastName;


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

    @FindBy(css = ".gears-items-list-wrapper > div:nth-of-type(1)")
    @CacheLookup
    private WebElement longJacket;

    @FindBy(css = ".gears-items-list-wrapper > div:nth-of-type(1) .sizes-container > div:nth-of-type(1)")
    @CacheLookup
    private WebElement longJacketSize;

    @FindBy(css = ".gears-items-list-wrapper > div:nth-of-type(2)")
    @CacheLookup
    private WebElement trousers;

    @FindBy(css = "div:nth-of-type(2) > .gear-wrapper > .product-wrapper > .sizes-wrapper > .sizes-container > div:nth-of-type(2)")
    @CacheLookup
    private WebElement trousersSize;

    @FindBy(css = ".gears-items-list-wrapper > div:nth-of-type(3)")
    @CacheLookup
    private WebElement shortJacket;

    @FindBy(css = "div:nth-of-type(3) > .gear-wrapper > .product-wrapper > .sizes-wrapper > .sizes-container > div:nth-of-type(2)")
    @CacheLookup
    private WebElement shortJacketSize;

    @FindBy(css = ".gears-items-list-wrapper > div:nth-of-type(4)")
    @CacheLookup
    private WebElement boots;

    @FindBy(css = ".ddl-input.px-4.py-4")
    @CacheLookup
    private WebElement bootsSizeChartMenu;

    @FindBy(css = "li:nth-of-type(2) > .card-info-content")
    @CacheLookup
    private WebElement bootsSize;

    @FindBy(css = ".gs-base-button-default-styles.w-fit")
    @CacheLookup
    private  WebElement saveButton;

    @FindBy(id = "gearCheckbox")
    @CacheLookup
    private WebElement addGearCheckbox;

    @FindBy(css = "div[class='flex items-center w-[200px] mobiles:mb-2']")
    @CacheLookup
    private WebElement addedUser;

    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/main/section/div/div[3]/div/div[1]/div/div[2]/div/div[2]/div/div/div[2]")
    @CacheLookup
    private WebElement checkedGearBox;











    public AddGearPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
