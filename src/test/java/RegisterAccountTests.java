import org.testng.Assert;
import org.testng.annotations.*;
import static util.TestUtil.generateRandomEmail;

public class RegisterAccountTests extends BaseTest{

    @Test
    public void registerNewAccountMandatoryFieldsTest() throws Exception {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        registerAccountPage.insertFirstName("John");
        registerAccountPage.insertLastName("Doe");
        registerAccountPage.insertEmail(generateRandomEmail());
        registerAccountPage.insertPhoneNumber("0745168174");
        registerAccountPage.setPassword("Password123");
        registerAccountPage.setPasswordConfirmInput("Password123");
        registerAccountPage.checkPrivacyPolicy();
        registerAccountPage.clickContinue();
        Thread.sleep(2000);
        String actualText = accountCreatedPage.getParagraphText();
        String expectedText = "Congratulations! Your new account has been successfully created!";
        Assert.assertEquals(actualText, expectedText, "Actual text is not the expected one.");

    }


    @Test
    public void registerWithoutPrivacyPolicyTest() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        registerAccountPage.insertFirstName("John");
        registerAccountPage.insertLastName("Doe");
        registerAccountPage.insertEmail(generateRandomEmail());
        registerAccountPage.insertPhoneNumber("0745168174");
        registerAccountPage.setPassword("Password123");
        registerAccountPage.setPasswordConfirmInput("Password123");
        registerAccountPage.clickContinue();
        String actualValue = registerAccountPage.getErrorMessage();
        String expectedValue = "Warning: You must agree to the Privacy Policy!";
        Assert.assertEquals(actualValue, expectedValue, "Error message is not the expected one");
    }

    @Test
    public void registerAccountWithoutFirstNameTest() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        registerAccountPage.insertLastName("Doe");
        registerAccountPage.insertEmail(generateRandomEmail());
        registerAccountPage.insertPhoneNumber("0745168174");
        registerAccountPage.setPassword("Password123");
        registerAccountPage.setPasswordConfirmInput("Password123");
        registerAccountPage.checkPrivacyPolicy();
        registerAccountPage.clickContinue();
        String actualText = registerAccountPage.getFirstNameErrorMessage();
        String expectedText = "First Name must be between 1 and 32 characters!";
        Assert.assertEquals(actualText, expectedText, "Actual text is not the expected one.");
    }

    @Test
    public void registerAccountWithoutLastName() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        registerAccountPage.insertFirstName("John");
        registerAccountPage.insertEmail(generateRandomEmail());
        registerAccountPage.insertPhoneNumber("0745168174");
        registerAccountPage.setPassword("Password123");
        registerAccountPage.setPasswordConfirmInput("Password123");
        registerAccountPage.clickContinue();
        String actualText = registerAccountPage.getLastNameErrorMessage();
        String expectedText = "Last Name must be between 1 and 32 characters!";
        Assert.assertEquals(actualText, expectedText, "Actual text is not the expected one.");
    }

    @Test
    public void registerAccountWithoutEmail() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        registerAccountPage.insertFirstName("John");
        registerAccountPage.insertLastName("Doe");
        registerAccountPage.insertPhoneNumber("0745168174");
        registerAccountPage.setPassword("Password123");
        registerAccountPage.setPasswordConfirmInput("Password123");
        registerAccountPage.checkPrivacyPolicy();
        registerAccountPage.clickContinue();
        String actualText = registerAccountPage.getEmailErrorMessage();
        String expectedText = "E-Mail Address does not appear to be valid!";
        Assert.assertEquals(actualText, expectedText, "Actual text is not the expected one.");
    }

    @Test
    public void registerAccountWithoutTelephone() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        registerAccountPage.insertFirstName("John");
        registerAccountPage.insertLastName("Doe");
        registerAccountPage.insertEmail(generateRandomEmail());
        registerAccountPage.setPassword("Password123");
        registerAccountPage.setPasswordConfirmInput("Password123");
        registerAccountPage.checkPrivacyPolicy();
        registerAccountPage.clickContinue();
        String actualText = registerAccountPage.getTelephoneErrorMessage();
        String expectedText = "Telephone must be between 3 and 32 characters!";
        Assert.assertEquals(actualText, expectedText, "Actual text is not the expected one.");

    }

    @Test
    public void registerAccountWithoutPasswordConfirmation() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        registerAccountPage.insertFirstName("John");
        registerAccountPage.insertLastName("Doe");
        registerAccountPage.insertEmail(generateRandomEmail());
        registerAccountPage.insertPhoneNumber("0745168174");
        registerAccountPage.setPassword("Password123");
        registerAccountPage.checkPrivacyPolicy();
        registerAccountPage.clickContinue();
        String actualText = registerAccountPage.getPasswordErrorMessage();
        String expectedText = "Password confirmation does not match password!";
        Assert.assertEquals(actualText, expectedText, "Actual text is not the expected one.");
    }

}
