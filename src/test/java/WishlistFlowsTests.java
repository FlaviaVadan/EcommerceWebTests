import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static util.TestUtil.generateRandomEmail;

public class WishlistFlowsTests extends  BaseTest{

    @Test
    public void addItemToWishlist() throws Exception {
        createAccount();
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        String expectedResult = "No results!";
        wishlistPage.clickWishList();
        Thread.sleep(5000);
        String actualResult = wishlistPage.getNoResultsElementText();
        Assert.assertEquals(actualResult, expectedResult, "Text from element is not the expected one.");
        wishlistPage.enterTextToSearch("Apple Cinema 30");
        wishlistPage.clickSearchButton();
        Thread.sleep(1000);
        WebElement item = searchResultsPage.getFirstItem();
        searchResultsPage.clickFirstItem();
        Thread.sleep(5000);
        searchResultsPage.clickWishHeart();
        Thread.sleep(1000);
        searchResultsPage.clickClosePopupButton();
        searchResultsPage.clickWishlist();
        Thread.sleep(4000);
        int noOfItems = wishlistPage.getWishlistItems().size();
        Assert.assertTrue(noOfItems == 1, "Wishlist is empty");
        wishlistPage.clickRemoveItemFromWishlistButton();
        actualResult = wishlistPage.getNoResultsElementText();
        Assert.assertEquals(actualResult, expectedResult, "Text from element is not the expected one.");
    }

    public void createAccount() {
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        registerAccountPage.insertFirstName("John");
        registerAccountPage.insertLastName("Doe");
        registerAccountPage.insertEmail(generateRandomEmail());
        registerAccountPage.insertPhoneNumber("01233456");
        registerAccountPage.setPassword("Password123!");
        registerAccountPage.setPasswordConfirmInput("Password123!");
        registerAccountPage.checkPrivacyPolicy();
        registerAccountPage.clickContinue();
    }


    @Test
    public void registerNewAccountMandatoryFieldsTest() throws Exception {
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
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


}





