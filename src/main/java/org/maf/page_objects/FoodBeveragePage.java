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
public class FoodBeveragePage {
    @FindBy(css = ".text-container.without-img > .title")
    @CacheLookup
    private WebElement foodBeverageHeader;

    public FoodBeveragePage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

}
