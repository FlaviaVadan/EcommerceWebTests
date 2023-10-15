import org.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static util.TestUtil.generateRandomEmail;

public class LoginTest extends BaseTest{


    @Test
    public void invalidCredentialsTest() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        loginPage.insertEmail(generateRandomEmail());
        loginPage.insertPassword("randomPassword");
        loginPage.clickLogin();
        String actualValue = loginPage.getErrorMessage();
        String expectedValue = "Warning: No match for E-Mail Address and/or Password.";
        Assert.assertEquals(actualValue, expectedValue, "This message is not the expected one");
    }

    @Test
    public void invalidPassword() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.insertEmail("monimaria@yahoo.com");
        loginPage.insertPassword("123");
        loginPage.clickLogin();
        String actualValue = loginPage.getErrorMessage();
        String expectedValue = "Warning: No match for E-Mail Address and/or Password.";
        Assert.assertEquals(actualValue, expectedValue, "This message is not the one you want!");
    }

    @Test
    public void invalidEmail() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        loginPage.insertEmail("monimaria@.com");
        loginPage.insertPassword("1234");
        loginPage.clickLogin();
        String actualValue = loginPage.getErrorMessage();
        String expectedValue = "Warning: No match for E-Mail Address and/or Password.";
        Assert.assertEquals(actualValue, expectedValue, "This message is not the one you want!");

    }

}

