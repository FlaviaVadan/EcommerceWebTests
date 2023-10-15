import org.testng.Assert;
import org.testng.annotations.Test;
public class SubscribeNewsletterTest extends BaseTest{



    @Test
    public void subscribeNewsletterTest(){
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        loginPage.insertEmail("enimaria@yahoo.com");
        loginPage.insertPassword("1234");
        loginPage.clickLogin();
        myAccountPage.clickSubscribeNewsletter();
        subscribeNewsletterPage.clickChooseNoButton();
        subscribeNewsletterPage.clickContinueButton();
        String actualValue= subscribeNewsletterPage.getConfirmationMessage();
        String expectedValue="Success: Your newsletter subscription has been successfully updated!";
        Assert.assertEquals(actualValue, expectedValue, "Error message is not the expected one");
    }

}
