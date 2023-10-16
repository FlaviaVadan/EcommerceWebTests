import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.DashboardPage;
import org.pages.RegisterAccountPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static util.TestUtil.generateRandomEmail;

public class DashboardTests {
    private WebDriver driver;

    private RegisterAccountPage registerAccountPage;
    private DashboardPage dashboardPage;
    private String registerUrl = "https://ecommerce-playground.lambdatest.io/index.php?route=account/register";

    @BeforeClass
    public void setUpPreconditions() {
        driver= new ChromeDriver();
        System.out.println("Creating new account to be logged in...");
        registerAccountPage =  new RegisterAccountPage(driver);
        createAccount();
        System.out.println("Creating new account to be logged in ... Done");
        dashboardPage = new DashboardPage(driver);

    }

    @Test
    public void verifyDashboardFirstSection() throws InterruptedException {
        String expectedFirstSectionHeaderText = "My Account";
        String expectedEditAccountElementText = "Edit your account information";
        Thread.sleep(2000);
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/account");
        Assert.assertEquals(dashboardPage.getFirstSectionHeaderText(), expectedFirstSectionHeaderText, "First section header text is not the expected one");
        Assert.assertEquals(dashboardPage.getEditAccountElementText(), expectedEditAccountElementText, "Edit account element text is not the expected one");
    }
    public void createAccount(){
            driver.navigate().to(registerUrl);
            registerAccountPage.insertFirstName("John");
            registerAccountPage.insertLastName("Doe");
            registerAccountPage.insertEmail( generateRandomEmail());
            registerAccountPage.insertPhoneNumber("0745168174");
            registerAccountPage.setPassword("Password123");
            registerAccountPage.setPasswordConfirmInput("Password123");
            registerAccountPage.checkPrivacyPolicy();
            registerAccountPage.clickContinue();
    }
    @AfterTest
    public void tearDown() {
        System.out.println("Closing the driver ...");
        driver.quit();
    }



}
