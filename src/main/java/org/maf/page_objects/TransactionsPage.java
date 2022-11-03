package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionsPage {

    @FindBy(xpath = "//a[@class='cta-link']")
    private WebElement dashboard;

    @FindBy(className = "side-list-category")
    private WebElement sideList;

    @FindBy(xpath = "//a[@href='/en/accounts/transactions']")
    private WebElement transactionLeftSide;

    @FindBy(xpath = "(//li[@class='cta-link-wrapper']//a)[3]")
    private WebElement transactionBtn;

    @FindBy(xpath = "//h1[@class='title']")
    private WebElement transactionTitle;

    @FindBy(xpath = "//a[@href='/en/accounts/dashboard']")
    private WebElement yourDashboard;

    @FindBy(xpath = "//a[@href='/en/accounts/profile/personal-details']")
    private WebElement profile;

    @FindBy(xpath = "(//a[@href='/en/accounts/profile/personal-details'])[2]")
    private WebElement yourDetails;

    @FindBy(xpath = "//a[@href='/en/accounts/profile/waiver-form']")
    private WebElement waiver;

    @FindBy(xpath = "//a[@href='/en/accounts/profile/set-your-gear']")
    private WebElement gear;

    @FindBy(xpath = "//a[@href='/en/accounts/profile/memberships']")
    private WebElement membership;

    @FindBy(xpath = "//a[@href='/en/accounts/payments']")
    private WebElement payment;

    @FindBy(xpath = "//a[@href='/en/accounts/share']")
    private WebElement share;

    @FindBy(xpath = "//a[@href='/en/accounts/ski-school/ski-passport']")
    private WebElement skiPassport;

    @FindBy(xpath = "//a[@href='/en/accounts/ski-school/snowboard-passport']")
    private WebElement snowboardPassport;

    @FindBy(xpath = "empty-transactions-title")
    private WebElement noTransaction;

    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/div/main/section/div/div/div/div[2]/a")
    private WebElement haveALookLink;



    @FindBy(xpath = "//div[contains(@class,'flex gap-x-2')]/following-sibling::div")
    private WebElement arrowButton;




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

}
