import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.pages.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;


public class BaseTest {
    public WebDriver driver;
    public CartPage cartPage;
    public CheckoutPage checkoutPage;
    public MyAccountPage myAccountPage;
    public BasePage basePage;
    public ComparisonPage comparisonPage;
    public MenuPage menuPage;
    public LoginPage loginPage;
    public ForgottenPasswordPage forgottenPasswordPage;
    public EditAccountPage editAccountPage;
    public OrderHistoryPage orderHistoryPage;
    public WishlistPage wishlistPage;
    public RegisterAccountPage registerAccountPage;
    public AccountCreatedPage accountCreatedPage;
    public SubscribeNewsletterPage subscribeNewsletterPage;
    public SearchResultsPage searchResultsPage;
    public Actions action;


    @BeforeMethod
    public void beforeMethod() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        searchResultsPage= new SearchResultsPage(driver);
        action= new Actions(driver);
        registerAccountPage= new RegisterAccountPage(driver);
        accountCreatedPage= new AccountCreatedPage(driver);
        cartPage= new CartPage(driver);
        myAccountPage= new MyAccountPage(driver);
        checkoutPage= new CheckoutPage(driver);
        comparisonPage= new ComparisonPage(driver);
        menuPage= new MenuPage(driver);
        basePage= new BasePage(driver);
        loginPage= new LoginPage(driver);
        forgottenPasswordPage= new ForgottenPasswordPage(driver);
        wishlistPage= new WishlistPage(driver);
        editAccountPage= new EditAccountPage(driver);
        orderHistoryPage= new OrderHistoryPage(driver);
        subscribeNewsletterPage= new SubscribeNewsletterPage(driver);

    }
    @AfterTest
    public void tearDown() {
        System.out.println("Closing the driver ...");
        driver.quit();
    }
}
