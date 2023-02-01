package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionsPage {

    @FindBy(xpath = "//a[contains(@href,\"/accounts/dashboard\")]")
    private WebElement dashboard;

    @FindBy(className = "side-list-category")
    private WebElement sideList;

    @FindBy(xpath = "//a[contains(@href,\"/accounts/transactions\")]")
    private WebElement transactionLeftSide;

    @FindBy(xpath = "(//li[@class='cta-link-wrapper']//a)[3]")
    private WebElement transactionBtn;

    @FindBy(xpath = "//h1[@class='title']")
    private WebElement transactionTitle;

    @FindBy(xpath = "//a[contains(@href,'/accounts/dashboard')]")
    private WebElement yourDashboard;

    @FindBy(xpath = "//a[contains(@href,'/accounts/profile/personal-details')]")
    private WebElement profile;

    @FindBy(xpath = "(//a[contains(@href,'/accounts/profile/personal-details')])[2]")
    private WebElement yourDetails;

    @FindBy(xpath = "//a[contains(@href,'/accounts/profile/waiver-form')]")
    private WebElement waiver;

    @FindBy(xpath = "//a[contains(@href,'/accounts/profile/set-your-gear')]")
    private WebElement gear;

    @FindBy(xpath = "//a[contains(@href,'/accounts/profile/memberships')]")
    private WebElement membership;

    @FindBy(xpath = "//a[contains(@href,'/accounts/payments')]")
    private WebElement payment;

    @FindBy(xpath = "//a[contains(@href,'/accounts/share')]")
    private WebElement share;

    @FindBy(xpath = "//a[contains(@href,'/accounts/ski-school/ski-passport')]")
    private WebElement skiPassport;

    @FindBy(xpath = "//a[contains(@href,'/accounts/ski-school/snowboard-passport')]")
    private WebElement snowboardPassport;

    @FindBy(css = ".empty-transactions-title")
    private WebElement noTransaction;

    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/div/main/section/div/div/div/div[2]/a")
    private WebElement haveALookLink;

    @FindBy(xpath = "//div[@class=\"transaction-record-container\"]")
    private WebElement transactionCards;


    @FindBy(xpath = "//div[@class=\"transaction-record-container\"]//div[contains(@class, \"arrow-wrapper\")]")
    private WebElement transactionCardExpandArrow;

    private String transaction_cards = "//div[@class=\"transaction-record-container\"]";

    @FindBy(xpath = "//div[contains(@class,'flex gap-x-2')]/following-sibling::div")
    private WebElement arrowButton;

    @FindBy(xpath = "//div[@class='location-name']")
    private WebElement locationName;


    @FindBy(xpath = "//span[@class='time']")
    private WebElement timeValue;

    @FindBy(xpath = "//button[@class='gs-base-button-default-styles w-fit']")
    private WebElement viewMore;

    @FindBy(xpath = "//div[div[contains(text(), \"Penguin Encounter\")]]//p[contains(text(), \"all guest\")]")
    private WebElement bonusTicket;

    @FindBy(xpath = "//p[text()[normalize-space()='1 Adult']]")
    private WebElement adultGuest;

    public WebElement getDashboard () {
        return dashboard;
    }

    public void setDashboard (WebElement dashboard) {
        this.dashboard = dashboard;
    }

    public WebElement getSkiPassport () {
        return skiPassport;
    }

    public void setSkiPassport(WebElement skiPassport) {
        this.skiPassport = skiPassport;
    }

    public WebElement getSnowboardPassport() {
        return snowboardPassport;
    }

    public void setSnowboardPassport (WebElement snowboardPassport) {
        this.snowboardPassport = snowboardPassport;
    }

    public WebElement getSideList() {return sideList;}

    public void setSideList (WebElement sideList) {this.sideList = sideList;}

    public WebElement getTransactionBtn () {
        return transactionBtn;
    }

    public void setTransactionBtn(WebElement transactionBtn) {
        this.transactionBtn = transactionBtn;
    }

    public WebElement getTransactionLeftSide () {
        return transactionLeftSide;
    }

    public void setTransactionLeftSide (WebElement transactionLeftSide) {
        this.transactionLeftSide = transactionLeftSide;
    }

    public WebElement getTransactionTitle() {
        return transactionTitle;
    }

    public void setTransactionTitle (WebElement transactionTitle) {
        this.transactionTitle = transactionTitle;
    }

    public WebElement getProfile() {
        return profile;
    }

    public void setProfile(WebElement profile) {
        this.profile = profile;
    }
    public WebElement getPayment() {
        return payment;
    }

    public void setPayment (WebElement payment) {
        this.payment = payment;
    }
    public WebElement getShare() {
        return share;
    }

    public void setShare(WebElement share) {
        this.share = share;
    }
    public WebElement getMembership() {
        return membership;
    }

    public void setMembership(WebElement membership) {
        this.membership = membership;
    }
    public WebElement getWaiver() {
        return waiver;
    }

    public void setWaiver (WebElement waiver) {
        this.waiver = waiver;
    }
    public WebElement getGear() {
        return gear;
    }

    public void setGear (WebElement gear) {
        this.gear = gear;
    }
    public WebElement getYourDetails() {
        return yourDetails;
    }

    public void setYourDetails (WebElement yourDetails) {
        this.yourDetails = yourDetails;
    }
    public WebElement getYourDashboard() {
        return yourDashboard;
    }

    public void setYourDashboard (WebElement yourDashboard) {
        this.yourDashboard = yourDashboard;
    }

    public WebElement getNoTransaction() {
        return noTransaction;
    }
    public void setNoTransaction (WebElement noTransaction) {
        this.noTransaction = noTransaction;
    }

    public WebElement getHaveALookLink() {
        return haveALookLink; }
    public void setHaveALookLink (WebElement haveALookLink) {
        this.haveALookLink = haveALookLink;
    }
    public TransactionsPage (WebDriver driver) {

        PageFactory.initElements (driver, this);

    }

    public WebElement getArrowButton() {
        return arrowButton; }
    public void setArrowButton (WebElement arrowButton) {
        this.arrowButton = arrowButton;
    }

    public WebElement getLocationName() {
        return locationName; }
    public void setLocationName (WebElement locationName) {
        this.locationName = locationName;}

    public WebElement getTimeValue() {
        return timeValue; }

    public void setTimeValue (WebElement timeValue) {
        this.timeValue = timeValue;}

    public WebElement getViewMore() {
        return viewMore; }

    public void setViewMore (WebElement viewMore) {
        this.viewMore = viewMore;}


    public WebElement getBonusTicket() {
        return bonusTicket; }

    public void setBonusTicket (WebElement bonusTicket) {
        this.bonusTicket = bonusTicket;}

    public WebElement getAdultGuest() {
        return adultGuest; }

    public void setAdultGuest (WebElement adultGuest) {
        this.adultGuest = adultGuest;}


    public WebElement getTransactionCards() {
        return transactionCards;
    }

    public void setTransactionCards(WebElement transactionCards) {
        this.transactionCards = transactionCards;
    }

    public String getTransaction_cards() {
        return transaction_cards;
    }

    public void setTransaction_cards(String transaction_cards) {
        this.transaction_cards = transaction_cards;
    }

    public WebElement getTransactionCardExpandArrow() {
        return transactionCardExpandArrow;
    }

    public void setTransactionCardExpandArrow(WebElement transactionCardExpandArrow) {
        this.transactionCardExpandArrow = transactionCardExpandArrow;
    }
}
