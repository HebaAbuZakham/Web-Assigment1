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
public class SkiAcademy {

    @FindBy(css = ".mt-\\[-44px\\].section-content-wrapper  .tabs-list > li:nth-of-type(1)")
    @CacheLookup
    private WebElement exploreSkiAcademyTab;

    @FindBy(css = ".activity-tab-events-header > .title")
    @CacheLookup
    private WebElement exploreSkiAcademyHeader;

    @FindBy(css = ".mt-\\[-44px\\].section-content-wrapper  .tabs-list > li:nth-of-type(2)")
    @CacheLookup
    private WebElement skiLessonsTab;

    @FindBy(css = "div#layout div.w-1\\2f 2.mobiles\\3a w-full.mobiles\\3a mb-4 > div")
    @CacheLookup
    private WebElement skiLessonsHeader;

    @FindBy(css = ".mt-\\[-44px\\].section-content-wrapper  .tabs-list > li:nth-of-type(3)")
    @CacheLookup
    private WebElement snowboardLessonsTab;

    @FindBy(css = "[class='w-1\\/2 mobiles\\:w-full mobiles\\:mb-4'] .title")
    @CacheLookup
    private WebElement snowboardLessonsHeader;

    public SkiAcademy (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }


}
