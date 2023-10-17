import org.testng.Assert;
import org.testng.annotations.Test;


public class MyAccountTests extends BaseTest{

    @Test
    public void editYourFirstName() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        loginPage.insertEmail("cristinaflavialupse@yahoo.com");
        loginPage.insertPassword("1234");
        loginPage.clickLogin();
        myAccountPage.clickEditYourAccountInformation();
        editAccountPage.clearFirstName();
        editAccountPage.insertFirstName("Magdalena");
        editAccountPage.clickContinueButton();
        String actualValue = editAccountPage.getConfirmationMessage();
        String expectedValue = "Success: Your account has been successfully updated.";
        Assert.assertEquals(actualValue, expectedValue, "Error message is not the expected one");
    }

    @Test
    public void editYourLastName() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        loginPage.insertEmail("cristinaflavialupse@yahoo.com");
        loginPage.insertPassword("1234");
        loginPage.clickLogin();
        myAccountPage.clickEditYourAccountInformation();
        editAccountPage.clearLastName();
        editAccountPage.insertLastName("Monica");
        editAccountPage.clickContinueButton();
        String actualValue = editAccountPage.getConfirmationMessage();
        String expectedValue = "Success: Your account has been successfully updated.";
        Assert.assertEquals(actualValue, expectedValue, "Error message is not the expected one");
    }

    @Test
    public void editEmailAddress() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        loginPage.insertEmail("ioanairus@yahoo.com");
        loginPage.insertPassword("1234");
        loginPage.clickLogin();
        myAccountPage.clickEditYourAccountInformation();
        editAccountPage.clearEditEmailAddress();
        editAccountPage.insertEditEmailAddress("flaviavadan9@yahoo.com");
        editAccountPage.clickContinueButton();
        String actualValue = editAccountPage.getConfirmationMessage();
        String expectedValue = "Success: Your account has been successfully updated.";
        Assert.assertEquals(actualValue, expectedValue, "Error message is not the expected one");
    }

    @Test
    public void editEmailAddressWithAnEmailAlreadyRegistered() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        loginPage.insertEmail("ioanamirelarus@yahoo.com");
        loginPage.insertPassword("1234");
        loginPage.clickLogin();
        myAccountPage.clickEditYourAccountInformation();
        editAccountPage.clearEditEmailAddress();
        editAccountPage.insertEditEmailAddress("mariarus@yahoo.com");
        editAccountPage.clickContinueButton();
        String actualValue = editAccountPage.getWarningEmailRegistered();
        String expectedValue = "Warning: E-Mail address is already registered!";
        Assert.assertEquals(actualValue, expectedValue, "Error message is not the expected one");
    }

    @Test
    public void editTelephone() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        loginPage.insertEmail("flaviavadan1@yahoo.com");
        loginPage.insertPassword("1234");
        loginPage.clickLogin();
        myAccountPage.clickEditYourAccountInformation();
        editAccountPage.clearEditTelephone();
        editAccountPage.insertEditTelephone("+40745162194");
        editAccountPage.clickContinueButton();
        String actualValue = editAccountPage.getConfirmationMessage();
        String expectedValue = "Success: Your account has been successfully updated.";
        Assert.assertEquals(actualValue, expectedValue, "Error message is not the expected one");
    }

    @Test
    public void viewOrderHistory() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        loginPage.insertEmail("monimaria@yahoo.com");
        loginPage.insertPassword("1234");
        loginPage.clickLogin();
        myAccountPage.clickViewOrderHistory();
        orderHistoryPage.clickViewButton();
        String actualValue = orderHistoryPage.getOrderDetails();
        String expectedValue = "Order Details";
        Assert.assertEquals(actualValue, expectedValue, "Error message is not the expected one");

    }

    @Test
    public void writeReview() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        loginPage.insertEmail("monimaria@yahoo.com");
        loginPage.insertPassword("1234");
        loginPage.clickLogin();
        myAccountPage.clickShopByCategory();
        myAccountPage.clickCamerasCategory();
        myAccountPage.clickFirstItem();
        myAccountPage.clickStarButton();
        myAccountPage.clickWriteReviewButton();
        String actualValue = myAccountPage.getWarningMessage();
        String expectedValue = "Warning: Review Text must be between 25 and 1000 characters!";
        Assert.assertEquals(actualValue, expectedValue, "Error message is not the expected one");

    }

    @Test

    public void modifyWishList() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        loginPage.insertEmail("monimaria@yahoo.com");
        loginPage.insertPassword("1234");
        loginPage.clickLogin();
        myAccountPage.clickModifyWishlist();
        wishlistPage.clickRemoveButton();
        String actualValue = wishlistPage.getWishlistMessage();
        String expectedValue = "Success: You have modified your wish list!";
        Assert.assertEquals(actualValue, expectedValue, "Error message is not the expected one");
    }

    @Test
    public void viewReturnRequests() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        loginPage.insertEmail("monimaria@yahoo.com");
        loginPage.insertPassword("1234");
        loginPage.clickLogin();
        myAccountPage.clickReturnRequests();
        String actualResult = myAccountPage.getMessageReturn();
        String expectedResult = "No results!";
        Assert.assertEquals(actualResult, expectedResult, "You have two products returned!");


    }

}




