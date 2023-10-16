package org.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    private By subscribeNewsletter = By.xpath("//*[@id=\"content\"]/div[1]/div/div/div[5]/a");

    private By editYourAccountInformation = By.xpath("//*[@id=\"content\"]/div[1]/div/div/div[1]/a");
    private By ViewOrderHistory = By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[1]/a");
    private By modifyWishlist = By.xpath("//*[@id=\"content\"]/div[1]/div/div/div[4]/a");
    private By shopByCategory = By.xpath("//*[@id=\"entry_217832\"]/a");
    private By camerasCategory = By.xpath("//*[@id=\"widget-navbar-217841\"]/ul/li[2]/a");
    private By firstItem = By.xpath("//*[@id=\"entry_212408\"]/div/div[1]/div/div[2]/h4/a");
    private By starButton = By.xpath("//*[@id=\"form-review\"]/div[1]/span/label[1]");
    private By writeReviewButton = By.xpath("//*[@id=\"button-review\"]");
    private By warningMessage = By.xpath("//*[@id=\"form-review\"]/div[2]");
    private By compareButtonFirstElement = By.xpath("//*[@id=\"entry_216844\"]/button");
    private By compareButtonSecondElement = By.xpath("//*[@id=\"entry_216844\"]/button");
    private By secondItem = By.xpath("//*[@id=\"entry_212408\"]/div/div[2]/div/div[2]/h4/a");
    private By closePopupButton = By.xpath("//*[@id=\"notification-box-top\"]/div/div[1]/button");
    private By addToCartButton = By.xpath("//*[@id=\"entry_216842\"]/button");
    private By popUpButton = By.xpath("//*[@id=\"notification-box-top\"]/div/div[1]/button/span");
    private By cartIcon = By.xpath("//*[@id=\"entry_217825\"]/a/div[1]");
    private By plusIcon = By.xpath("//*[@id=\"entry_216841\"]/div/div[2]/button/i");
    private By returnRequests = By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[4]/a");
    private By messageReturn = By.xpath("//*[@id=\"content\"]/p");


    public void clickSubscribeNewsletter() {
        driver.findElement(subscribeNewsletter).click();
    }

    public void clickEditYourAccountInformation() {
        driver.findElement(editYourAccountInformation).click();
    }

    public void clickViewOrderHistory() {
        driver.findElement(ViewOrderHistory).click();
    }

    public void clickModifyWishlist() {
        driver.findElement(modifyWishlist).click();
    }

    public void clickShopByCategory() {
        driver.findElement(shopByCategory).click();
    }

    public void clickCamerasCategory() {
        driver.findElement(camerasCategory).click();
    }

    public void clickFirstItem() {
        driver.findElement(firstItem).click();
    }

    public void clickStarButton() {
        driver.findElement(starButton).click();
    }

    public void clickWriteReviewButton() {
        driver.findElement(writeReviewButton).click();
    }

    public String getWarningMessage() {
        return driver.findElement(warningMessage).getText();
    }

    public void clickCompareButtonFirstElement() {
        driver.findElement(compareButtonFirstElement).click();
    }

    public void clickCompareButtonSecondElement() {
        driver.findElement(compareButtonSecondElement).click();
    }

    public void clickSecondItem() {
        driver.findElement(secondItem).click();
    }

    public void clickClosePopupButton() {
        driver.findElement(closePopupButton).click();
    }

    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    public void clickPopUpButton() {
        driver.findElement(popUpButton).click();
    }

    public void clickCartIcon() {
        driver.findElement(cartIcon).click();
    }

    public void clickPlusIcon() {
        driver.findElement(plusIcon).click();
    }

    public void clickReturnRequests() {
        driver.findElement(returnRequests).click();
    }

    public String getMessageReturn() {
        return driver.findElement(messageReturn).getText();
    }


}



