import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void addToCart() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        cartPage.clickSearchForProducts();
        cartPage.enterTextToSearch("HTC Touch HD");
        cartPage.clickSearchButton();
        cartPage.clickFirstItem();
        cartPage.clickAddToCartButton();
        cartPage.clickPopUpButton();
        cartPage.clickCartIcon();
        cartPage.getTotalToPay();
        String actualValue = cartPage.getTotalToPay();
        String expectedValue = "$146.00";
        Assert.assertEquals(actualValue, expectedValue, "You have nothing to pay!");

    }

    @Test
    public void updateItemsFromTheCart() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        cartPage.clickSearchForProducts();
        cartPage.enterTextToSearch("HTC Touch HD");
        cartPage.clickSearchButton();
        cartPage.clickFirstItem();
        cartPage.clickAddToCartButton();
        cartPage.clickPopUpButton();
        cartPage.clickCartIcon();
        cartPage.clickEditCartButton();
        cartPage.clearEditQuantity();
        cartPage.enterTextToQuantity("2");
        cartPage.clickUpdateButton();
        String actualValue = cartPage.getConfirmModifiedCart();
        String expectedValue = "Success: You have modified your shopping cart!";
        Assert.assertEquals(actualValue, expectedValue, "Your cart wasn't updated!");
    }

    @Test
    public void invalidCouponCode() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        cartPage.clickSearchForProducts();
        cartPage.enterTextToSearch("HTC Touch HD");
        cartPage.clickSearchButton();
        cartPage.clickFirstItem();
        cartPage.clickAddToCartButton();
        cartPage.clickPopUpButton();
        cartPage.clickCartIcon();
        cartPage.clickEditCartButton();
        cartPage.clickUseCouponCode();
        cartPage.clickEnterCoupon();
        cartPage.enterTextToCoupon("BLACKFRIDAYDISCOUNT");
        cartPage.clickApplyCoupon();
        String actualValue = cartPage.getWarningMessage();
        String expectedValue = "Warning: Coupon is either invalid, expired or reached its usage limit!";
        Assert.assertEquals(actualValue, expectedValue, "Your coupon is used successfully!");

    }

    @Test
    public void estimateShippingAndTaxes() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        cartPage.clickSearchForProducts();
        cartPage.enterTextToSearch("HTC Touch HD");
        cartPage.clickSearchButton();
        cartPage.clickFirstItem();
        cartPage.clickAddToCartButton();
        cartPage.clickPopUpButton();
        cartPage.clickCartIcon();
        cartPage.clickEditCartButton();
        cartPage.clickEstimateShipping();
        cartPage.selectCountry("Australia");
        cartPage.selectRegion("Tasmania");
        cartPage.clickGetQuotes();
        cartPage.clickFlatRate();
        cartPage.clickApplyShipping();
        String actualValue = cartPage.getConfirmMessage();
        String expectedValue = "Success: Your shipping estimate has been applied!";
        Assert.assertEquals(actualValue, expectedValue, "Your order will be successfully delivered in time!");
    }

    @Test
    public void useGiftCertificate() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        cartPage.clickSearchForProducts();
        cartPage.enterTextToSearch("HTC Touch HD");
        cartPage.clickSearchButton();
        cartPage.clickFirstItem();
        cartPage.clickAddToCartButton();
        cartPage.clickPopUpButton();
        cartPage.clickCartIcon();
        cartPage.clickEditCartButton();
        cartPage.clickUseGiftCertificate();
        cartPage.clickInputGiftCode();
        cartPage.enterTextToGiftCode("GIFT");
        cartPage.clickApplyCertificate();
        String actualValue = cartPage.getWarningCertificate();
        String expectedValue = "Warning: Gift Certificate is either invalid or the balance has been used up!";
        Assert.assertEquals(actualValue, expectedValue, "Your gift code has been successfully applied!");

    }

    @Test
    public void checkNoOfItems() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        myAccountPage.clickShopByCategory();
        myAccountPage.clickCamerasCategory();
        myAccountPage.clickFirstItem();
        myAccountPage.clickAddToCartButton();
        myAccountPage.clickPopUpButton();
        myAccountPage.clickCartIcon();
        cartPage.clickCheckoutButton();
        int actualValue = checkoutPage.getNoOfItems();
        int expectedValue = 1;
        Assert.assertEquals(actualValue,expectedValue, "The no of items is the same!";
    }

    @Test
    public void checkThePrice() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        myAccountPage.clickShopByCategory();
        myAccountPage.clickCamerasCategory();
        myAccountPage.clickFirstItem();
        myAccountPage.clickAddToCartButton();
        myAccountPage.clickPopUpButton();
        myAccountPage.clickCartIcon();
        String actualValue = cartPage.getItemPrice();
        String expectedValue = "$146.00";
        Assert.assertEquals(actualValue, expectedValue, "The price doesn't match!");
    }

    @Test
    public void increaseNoOfItems() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        myAccountPage.clickShopByCategory();
        myAccountPage.clickCamerasCategory();
        myAccountPage.clickFirstItem();
        myAccountPage.clickPlusIcon();
        myAccountPage.clickAddToCartButton();
        myAccountPage.clickPopUpButton();
        myAccountPage.clickCartIcon();
        cartPage.clickCheckoutButton();
        int actualValue = checkoutPage.getNoOfItems();
        Assert.assertNotNull(actualValue, "The number of items is not null");

    }

}