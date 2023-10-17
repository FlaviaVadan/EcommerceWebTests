import org.testng.Assert;
import org.testng.annotations.Test;
public class CheckoutTest extends BaseTest{

    @Test
    public void checkoutOrder() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        cartPage.clickSearchForProducts();
        cartPage.enterTextToSearch("HTC Touch HD");
        cartPage.clickSearchButton();
        cartPage.clickFirstItem();
        cartPage.clickAddToCartButton();
        cartPage.clickPopUpButton();
        cartPage.clickCartIcon();
        cartPage.clickCheckoutButton();
        checkoutPage.clickGuestCheckout();
        checkoutPage.clickFirstName();
        checkoutPage.enterFirstName("Damian");
        checkoutPage.enterLastName("Victor");
        checkoutPage.enterEmail("nfjlngvijrutu@email.com");
        checkoutPage.enterTelephone("0745128548");
        checkoutPage.enterAddressOne("Calea Victoriei 56");
        checkoutPage.enterCity("Bucuresti");
        checkoutPage.selectCountry("Albania");
        checkoutPage.selectRegion("Berat");
        checkoutPage.clickTermsConditions();
        checkoutPage.clickContinueButton();
        checkoutPage.clickConfirmOrder();
        Thread.sleep(3000);
        String actualValue = checkoutPage.getConfirmOrderMessage();
      String expectedValue= "Your order has been placed!";
      Assert.assertEquals(actualValue,expectedValue,"Your order was not placed!");
    }

}
