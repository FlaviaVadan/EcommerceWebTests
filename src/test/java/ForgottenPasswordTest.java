import org.testng.Assert;
import org.testng.annotations.Test;



public class ForgottenPasswordTest extends BaseTest{

    @Test
    public void forgottenPasswordTest() throws InterruptedException {
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        loginPage.insertEmail("monimaria@yahoo.com");
        loginPage.clickForgottenPassword();
        forgottenPasswordPage.insertEmail("monimaria@yahoo.com");
        forgottenPasswordPage.clickContinueButton();
        Thread.sleep(2000);
        String actualValue = forgottenPasswordPage.getConfirmationMessage();
        String expectedValue = "An email with a confirmation link has been sent your email address.";
        Assert.assertEquals(actualValue, expectedValue, "Error message is not the expected one");
    }
}
