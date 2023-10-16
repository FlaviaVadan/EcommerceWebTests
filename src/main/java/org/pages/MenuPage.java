package org.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MenuPage extends BasePage {
    public MenuPage(WebDriver driver) {
        super(driver);
    }

    private By searchInput = By.name("search");
    private By compareButton = By.xpath("//*[@id=\"entry_217823\"]/a");
    private By specialOffers = By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[2]/a/div/span");
    private By messageSpecialOffers = By.xpath("//*[@id=\"entry_212499\"]/p");
    private By blog = By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[3]/a/div/span");
    private By firstItem = By.xpath(".//img[@class='lazy-load']");
    private By yourName = By.xpath("//*[@id=\"input-name\"]");
    private By email = By.xpath("//*[@id=\"input-email\"]");
    private By yourComment = By.xpath("//*[@id=\"input-comment\"]");
    private By postComment = By.xpath("//*[@id=\"button-comment\"]");
    private By approvalComment = By.xpath(".//div[contains( text(),' Thank you for your comment. It has been submitted to the webmaster for approval.')]");
    private By search = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div[2]/input");
    private By searchButton = By.xpath("//*[@id=\"search\"]/div[2]/button");
    private By text = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div[2]/input");
    private By noResult = By.xpath("//*[@id=\"entry_212469\"]/p");

    public void clickCompareButton() {
        driver.findElement(compareButton).click();
    }

    public void clickSpecialOffers() {
        driver.findElement(specialOffers).click();
    }

    public String getMessageSpecialOffers() {
        return driver.findElement(messageSpecialOffers).getText();
    }

    public void clickBlog() {
        driver.findElement(blog).click();
    }

    public void clickFirstItem() {
        driver.findElement(firstItem).click();
    }

    public void insertTextToYourName(String s) {
        driver.findElement(yourName).sendKeys(s);
    }

    public void insertTextToEmail(String s) {
        driver.findElement(email).sendKeys(s);
    }

    public void insertTextToYourComment(String s) {
        driver.findElement(yourComment).sendKeys(s);
    }

    public void clickPostComment() {
        driver.findElement(postComment).click();
    }

    public String getApprovalComment() {
        return driver.findElement(approvalComment).getText();
    }

    public void clickSearch() {
        driver.findElement(search).click();
    }

    public void enterText(String s) {
        driver.findElement(text).sendKeys(s);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public String getNoResult() {
        return driver.findElement(noResult).getText();
    }
}
