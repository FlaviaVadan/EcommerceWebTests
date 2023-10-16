package org.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    private By searchButton = By.xpath("//*[@id=\"search\"]/div[2]/button");
    private By searchProducts = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div[2]/input");
    private By firstItem = By.xpath(".//a[@class='text-ellipsis-2']");
    private By addToCartButton = By.xpath("//*[@id=\"entry_216842\"]/button");
    private By cartIcon = By.xpath("//*[@id=\"entry_217825\"]/a/div[1]");
    private By totalToPay = By.xpath("//*[@id=\"entry_217847\"]/table/tbody/tr[4]/td[2]");
    private By popUpButton = By.xpath("//*[@id=\"notification-box-top\"]/div/div[1]/button/span");
    private By editCartButton = By.xpath(".//div[@class='entry-design design-button gutters ']");
    private By editQuantity = By.xpath(".//input[@class='form-control']");
    private By updateButton = By.xpath(".//i[@class='fas fa-sync-alt']");
    private By confirmModifiedCart = By.xpath("//div[contains(@class, 'alert-success')]");
    private By useCouponCode = By.xpath("//h5[contains(text(), 'Use Coupon Code')]");
    private By enterCoupon = By.xpath("//*[@id=\"input-coupon\"]");
    private By applyCoupon = By.xpath("//*[@id=\"button-coupon\"]");
    private By warningMessage = By.xpath("//*[@id=\"collapse-coupon\"]/div/div[1]");
    private By estimateShipping = By.xpath("//h5[contains(text(), 'Estimate Shipping & Taxes ')]");
    private By introduceCountry = By.xpath("//*[@id=\"input-country\"]");
    private By chooseAustralia = By.xpath("//*[@id=\"input-country\"]/option[17]");
    private By selectRegion = By.xpath("//*[@id=\"input-zone\"]");
    private By getQuotes = By.xpath("//*[@id=\"button-quote\"]");
    private By confirmMessage = By.xpath(".//div[@class='alert alert-success alert-dismissible']");
    private By useGiftCertificate = By.xpath("//h5[contains(text(), 'Use Gift Certificate ')]");
    private By inputGiftCode = By.xpath("//*[@id=\"input-voucher\"]");
    private By applyCertificate = By.xpath("//*[@id=\"button-voucher\"]");
    private By warningCertificate = By.xpath(".//div[contains (text(), ' Warning: Gift Certificate is either invalid or the balance has been used up! ')]");
    private By checkoutButton = By.xpath("//a[contains(.,'Checkout')]");
    private By itemPrice = By.xpath("//*[@id=\"entry_217847\"]/table/tbody/tr[4]/td[2]/strong");
    private By flatRate = By.xpath(".//input[@name='shipping_method']");
    private By applyShipping = By.xpath(".//button[@id='button-shipping']");


    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void clickApplyShipping() {
        driver.findElement(applyShipping).click();
    }

    public void enterTextToSearch(String s) {
        driver.findElement(searchProducts).sendKeys(s);
    }

    public void clickFlatRate() {
        driver.findElement(flatRate).click();
    }

    public void clickSearchForProducts() {
        driver.findElement(searchProducts).click();
    }

    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    public void clickCartIcon() {
        driver.findElement(cartIcon).click();
    }

    public void clickFirstItem() {
        driver.findElement(firstItem).click();
    }

    public String getTotalToPay() {
        return driver.findElement(totalToPay).getText();
    }

    public void clickPopUpButton() {
        driver.findElement(popUpButton).click();
    }

    public void clickEditCartButton() {
        driver.findElement(editCartButton).click();
    }


    public void clearEditQuantity() {
        driver.findElement(editQuantity).clear();
    }

    public void enterTextToQuantity(String s) {
        driver.findElement(editQuantity).sendKeys(s);
    }

    public void clickUpdateButton() {
        driver.findElement(updateButton).click();
    }

    public String getConfirmModifiedCart() {
        return driver.findElement(confirmModifiedCart).getText().split("\n")[0];
    }

    public void clickUseCouponCode() {
        driver.findElement(useCouponCode).click();
    }

    public void clickEnterCoupon() {
        driver.findElement(enterCoupon).click();
    }

    public void enterTextToCoupon(String s) {
        driver.findElement(enterCoupon).sendKeys(s);
    }

    public void clickApplyCoupon() {
        driver.findElement(applyCoupon).click();
    }

    public String getWarningMessage() {
        return driver.findElement(warningMessage).getText().split("\n")[0];
    }

    public void clickEstimateShipping() {
        driver.findElement(estimateShipping).click();
    }

    public void selectCountry(String s) {
        Select country = new Select(driver.findElement(introduceCountry));
        country.selectByVisibleText(s);
    }

    public void selectRegion(String s) {
        Select region = new Select(driver.findElement(selectRegion));
        region.selectByVisibleText(s);
    }


    public void clickGetQuotes() {
        driver.findElement(getQuotes).click();
    }

    public String getConfirmMessage() {
        return driver.findElement(confirmMessage).getText().split("\n")[0];
    }

    public void clickUseGiftCertificate() {
        driver.findElement(useGiftCertificate).click();
    }

    public void clickInputGiftCode() {
        driver.findElement(inputGiftCode).click();
    }

    public void enterTextToGiftCode(String s) {
        driver.findElement(inputGiftCode).sendKeys(s);
    }

    public void clickApplyCertificate() {
        driver.findElement(applyCertificate).click();
    }

    public String getWarningCertificate() {
        return driver.findElement(warningCertificate).getText().split("\n")[0];
    }

    public void clickCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }

    public String getItemPrice() {
        return driver.findElement(itemPrice).getText();
    }


}
