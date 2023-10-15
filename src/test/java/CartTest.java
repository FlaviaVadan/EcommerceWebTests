
import org.testng.Assert;

import org.testng.annotations.Test;

public class CartTest extends BaseTest{



    @Test
    public void addToCart() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        cartPage.clickSearchForProducts();
        cartPage.enterTextToSearch("HTC Touch HD");
        Thread.sleep(5000);
        cartPage.clickSearchButton();
        cartPage.clickFirstItem();
        cartPage.clickAddToCartButton();
        Thread.sleep(5000);
        cartPage.clickPopUpButton();
        cartPage.clickCartIcon();
        cartPage.getTotalToPay();
        Thread.sleep(3000);
        String actualValue = cartPage.getTotalToPay();
        String expectedValue = "$146.00";
        Assert.assertEquals(actualValue, expectedValue, "You have nothing to pay!");

    }

    @Test
    public void updateItemsFromTheCart() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        cartPage.clickSearchForProducts();
        cartPage.enterTextToSearch("HTC Touch HD");
        Thread.sleep(5000);
        cartPage.clickSearchButton();
        cartPage.clickFirstItem();
        cartPage.clickAddToCartButton();
        Thread.sleep(5000);
        cartPage.clickPopUpButton();
        cartPage.clickCartIcon();
        cartPage.clickEditCartButton();
        cartPage.clearEditQuantity();
        cartPage.enterTextToQuantity("2");
        cartPage.clickUpdateButton();
        Thread.sleep(5000);
        String actualValue = cartPage.getConfirmModifiedCart();
        String expectedValue = "Success: You have modified your shopping cart!";
        Assert.assertEquals(actualValue, expectedValue, "Your cart wasn't updated!");
    }

    @Test
    public void invalidCouponCode() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        cartPage.clickSearchForProducts();
        cartPage.enterTextToSearch("HTC Touch HD");
        Thread.sleep(5000);
        cartPage.clickSearchButton();
        cartPage.clickFirstItem();
        cartPage.clickAddToCartButton();
        Thread.sleep(5000);
        cartPage.clickPopUpButton();
        cartPage.clickCartIcon();
        Thread.sleep(2000);
        cartPage.clickEditCartButton();
        cartPage.clickUseCouponCode();
        cartPage.clickEnterCoupon();
        cartPage.enterTextToCoupon("BLACKFRIDAYDISCOUNT");
        cartPage.clickApplyCoupon();
        Thread.sleep(5000);
        String actualValue = cartPage.getWarningMessage();
        String expectedValue = "Warning: Coupon is either invalid, expired or reached its usage limit!";
        Assert.assertEquals(actualValue, expectedValue, "Your coupon is used successfully!");

    }

    @Test
    public void estimateShippingAndTaxes() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        cartPage.clickSearchForProducts();
        cartPage.enterTextToSearch("HTC Touch HD");
        Thread.sleep(5000);
        cartPage.clickSearchButton();
        cartPage.clickFirstItem();
        cartPage.clickAddToCartButton();
        Thread.sleep(5000);
        cartPage.clickPopUpButton();
        cartPage.clickCartIcon();
        Thread.sleep(2000);
        cartPage.clickEditCartButton();
        cartPage.clickEstimateShipping();
        Thread.sleep(3000);
        cartPage.selectCountry("Australia");
        Thread.sleep(3000);
        cartPage.selectRegion("Tasmania");
        Thread.sleep(2000);
        cartPage.clickGetQuotes();
        Thread.sleep(3000);
        cartPage.clickFlatRate();
        cartPage.clickApplyShpping();
        Thread.sleep(2000);
        String actualValue = cartPage.getConfirmMessage();
        String expectedValue = "Success: Your shipping estimate has been applied!";
        Assert.assertEquals(actualValue, expectedValue, "Your order will be successfully delivered in time!");
    }

    @Test
    public void useGiftCertificate() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        cartPage.clickSearchForProducts();
        cartPage.enterTextToSearch("HTC Touch HD");
        Thread.sleep(5000);
        cartPage.clickSearchButton();
        cartPage.clickFirstItem();
        cartPage.clickAddToCartButton();
        Thread.sleep(5000);
        cartPage.clickPopUpButton();
        cartPage.clickCartIcon();
        cartPage.clickEditCartButton();
        cartPage.clickUseGiftCertificate();
        cartPage.clickInputGiftCode();
        cartPage.enterTextToGiftCode("GIFT");
        cartPage.clickApplyCertificate();
        Thread.sleep(3000);
        String actualValue = cartPage.getWarningCertificate();
        String expectedValue = "Warning: Gift Certificate is either invalid or the balance has been used up!";
        Assert.assertEquals(actualValue, expectedValue, "Your gift code has been successfully applied!");

    }

    @Test
    public void checkNoOfItems() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        myAccountPage.clickShopByCategory();
        Thread.sleep(3000);
        myAccountPage.clickCamerasCategory();
        myAccountPage.clickFirstItem();
        myAccountPage.clickAddToCartButton();
        Thread.sleep(3000);
        myAccountPage.clickPopUpButton();
        myAccountPage.clickCartIcon();
        Thread.sleep(4000);
        cartPage.clickCheckoutButton();
        Thread.sleep(5000);
        int actualValue = checkoutPage.getNoOfItems();
        int expectedValue = 1;
        Assert.assertEquals(actualValue, expectedValue, "The number of items is not the same");
    }

    @Test
    public void checkThePrice() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        myAccountPage.clickShopByCategory();
        Thread.sleep(3000);
        myAccountPage.clickCamerasCategory();
        myAccountPage.clickFirstItem();
        Thread.sleep(3000);
        myAccountPage.clickAddToCartButton();
        Thread.sleep(3000);
        myAccountPage.clickPopUpButton();
        myAccountPage.clickCartIcon();
        Thread.sleep(4000);
        String actualValue = cartPage.getItemPrice();
        String expectedValue = "$146.00";
        Assert.assertEquals(actualValue, expectedValue, "The price doesn't match!");
    }

    @Test
    public void increaseNoOfItems() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        myAccountPage.clickShopByCategory();
        Thread.sleep(3000);
        myAccountPage.clickCamerasCategory();
        myAccountPage.clickFirstItem();
        Thread.sleep(3000);
        myAccountPage.clickPlusIcon();
        Thread.sleep(3000);
        myAccountPage.clickAddToCartButton();
        Thread.sleep(3000);
        myAccountPage.clickPopUpButton();
        myAccountPage.clickCartIcon();
        Thread.sleep(4000);
        cartPage.clickCheckoutButton();
        Thread.sleep(5000);
        int actualValue = checkoutPage.getNoOfItems();
        int expectedValue = 2;
        Assert.assertEquals(actualValue, expectedValue, "The number of items is not the same");

    }

}