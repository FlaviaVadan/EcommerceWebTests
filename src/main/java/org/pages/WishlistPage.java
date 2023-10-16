package org.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WishlistPage extends BasePage {
    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    private By noResultsElement = By.xpath(".//div[@id='content']/p");
    private By searchButton = By.xpath(".//button[@class='type-text']");
    private By removeButton = By.xpath(".//a[@data-original-title='Remove']");
    private By itemsTableRow = By.xpath(".//table[@class = 'table table-hover border']/tbody/tr");
    private By removeItemFromWishlist = By.xpath(".//a[contains(@href, 'remove')]");
    private By wishlistMessage = By.xpath("//*[@id=\"account-wishlist\"]/div[1]");
    private By wishList = By.xpath("//*[@id=\"column-right\"]/div/a[5]");


    public String getNoResultsElementText() {
        return driver.findElement(noResultsElement).getText();
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void clickRemoveButton() {
        driver.findElement(removeButton).click();
    }

    public String getWishlistMessage() {
        return driver.findElement(wishlistMessage).getText().split("\n")[0];
    }

    public List<WebElement> getWishlistItems() {
        return driver.findElements(itemsTableRow);
    }

    public void clickRemoveItemFromWishlistButton() {
        driver.findElement(removeItemFromWishlist).click();
    }

    public void enterTextToSearch(String s) {
    }

    public void clickWishList() {
        driver.findElement(wishList).click();
    }


}
