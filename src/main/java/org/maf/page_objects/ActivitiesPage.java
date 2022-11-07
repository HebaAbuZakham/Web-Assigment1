package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivitiesPage extends BookingSharedComponent{

    @FindBy(xpath = "//h1[contains(text(),'activities')]")
    private WebElement activitiesTitle;

    @FindBy(xpath = "//*[@class=\"time-slot-table\"]")
    private WebElement timeSlotTable;

    @FindBy(xpath = "(//*[@class=\"time-slot-table-container\"]/p)[last()]")
    private WebElement lastTableTitle;

    @FindBy(xpath = "//*[@class=\"time-slot-table\"]//li[last()]")
    private WebElement lastActivityTimeSlot;

    @FindBy(xpath = "//button[contains(text(), \"Add tickets\")]")
    private WebElement addTicketButton;

    @FindBy(xpath = "//*[@class=\"activity-content\"][p[contains(text(),\"2 Hours Slope Pass\")]]//button")
    private WebElement packageSlopePassAddButton;

    @FindBy(xpath = "//*[@class=\"activity-content\"][p[contains(text(),\"Snow Bullet Rides\")]]//button")
    private WebElement packageSnowBulletRidesPassAddButton;





    public ActivitiesPage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public WebElement getActivitiesTitle(){return activitiesTitle;}

    public void setActivitiesTitle(WebElement activitiesTitle){
        this.activitiesTitle=activitiesTitle;
    }

    public WebElement getTimeSlotTable() {
        return timeSlotTable;
    }

    public void setTimeSlotTable(WebElement timeSlotTable) {
        this.timeSlotTable = timeSlotTable;
    }

    public WebElement getLastTableTitle() {
        return lastTableTitle;
    }

    public void setLastTableTitle(WebElement lastTableTitle) {
        this.lastTableTitle = lastTableTitle;
    }

    public WebElement getLastActivityTimeSlot() {
        return lastActivityTimeSlot;
    }

    public void setLastActivityTimeSlot(WebElement lastActivityTimeSlot) {
        this.lastActivityTimeSlot = lastActivityTimeSlot;
    }

    public WebElement getAddTicketButton() {
        return addTicketButton;
    }

    public void setAddTicketButton(WebElement addTicketButton) {
        this.addTicketButton = addTicketButton;
    }

    public WebElement getPackageSlopePassAddButton() {
        return packageSlopePassAddButton;
    }

    public void setPackageSlopePassAddButton(WebElement packageSlopePassAddButton) {
        this.packageSlopePassAddButton = packageSlopePassAddButton;
    }

    public WebElement getPackageSnowBulletRidesPassAddButton() {
        return packageSnowBulletRidesPassAddButton;
    }

    public void setPackageSnowBulletRidesPassAddButton(WebElement packageSnowBulletRidesPassAddButton) {
        this.packageSnowBulletRidesPassAddButton = packageSnowBulletRidesPassAddButton;
    }
}
