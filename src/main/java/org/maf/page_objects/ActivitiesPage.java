package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivitiesPage {

    @FindBy(xpath = "//h1[contains(text(),'activities')]")
    private WebElement activitiesTitle;

    public ActivitiesPage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public WebElement getActivitiesTitle(){return activitiesTitle;}

    public void setActivitiesTitle(WebElement activitiesTitle){
        this.activitiesTitle=activitiesTitle;
    }
}
