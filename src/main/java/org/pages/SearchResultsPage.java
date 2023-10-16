package org.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    private By resultItems = By.xpath(".//div[@class = 'carousel-item active']/img[contains(@title, 'Apple Cinema')]");
    private By closePopupButton = By.xpath("//*[@id=\"notification-box-top\"]/div/div[1]/button");
    private By wishlist = By.xpath("//*[@id=\"entry_217824\"]/a");
    private By wishHeart = By.xpath("//*[@id=\"image-gallery-216811\"]/div[1]/button");


    public void clickFirstItem() {
        driver.findElements(resultItems).get(0).click();
    }

    public WebElement getFirstItem() {
        return driver.findElements(resultItems).get(0);
    }

    public void clickClosePopupButton() {
        driver.findElement(closePopupButton).click();
    }

    public void clickWishlist() {
        driver.findElement(wishlist).click();
    }

    public void clickWishHeart() {
        driver.findElement(wishHeart).click();
    }


}

