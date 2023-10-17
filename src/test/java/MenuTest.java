import org.testng.Assert;
import org.testng.annotations.Test;
import static util.TestUtil.generateRandomEmail;

public class MenuTest extends BaseTest{

    @Test
    public void specialOffers() {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        menuPage.clickSpecialOffers();
        String actualResults = menuPage.getMessageSpecialOffers();
        String expectedResult = "There are no special offer products to list.";
        Assert.assertEquals(actualResults, expectedResult, "There are several offer products to the list!");
    }

    @Test
    public void leaveCommentForAProduct() throws InterruptedException {
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        menuPage.clickBlog();
        menuPage.clickFirstItem();
        menuPage.insertTextToYourName("randomName");
        menuPage.insertTextToEmail(generateRandomEmail());
        menuPage.insertTextToYourComment("The product that I've ordered is not as good as I expected!");
        menuPage.clickPostComment();
        String actualValue = menuPage.getApprovalComment();
        String expectedValue = "Thank you for your comment. It has been submitted to the webmaster for approval.";
        Assert.assertEquals(actualValue, expectedValue, "Your comment cannot be posted!");
    }
    @Test
    public void searchItemsThatDoNotExist(){
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        menuPage.clickSearch();
        menuPage.enterText("Toys");
        menuPage.clickSearchButton();
        String actualResult= menuPage.getNoResult();
        String expectedResult= "There is no product that matches the search criteria.";
        Assert.assertEquals(actualResult, expectedResult, "We found several items for you!");


    }


}