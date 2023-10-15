import org.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ComparisonTest extends BaseTest{

    @Test
    public void comparisonNoProductsTest() {
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        menuPage.clickCompareButton();
        comparisonPage.getNoProductsResultMessage();
        String actualResult = comparisonPage.getNoProductsResultMessage();
        String expectedResult = "You have not chosen any products to compare.";
        Assert.assertEquals(actualResult, expectedResult, "Text text is not the expected one!");
    }
    @Test
    public void comparisonProducts() throws InterruptedException {
       driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        myAccountPage.clickShopByCategory();
        myAccountPage.clickCamerasCategory();
        myAccountPage.clickFirstItem();
        myAccountPage.clickCompareButtonFirstElement();
        Thread.sleep(3000);
        driver.navigate().back();
        myAccountPage.clickSecondItem();
        myAccountPage.clickCompareButtonSecondElement();
        Thread.sleep(7000);
        myAccountPage.clickClosePopupButton();
        menuPage.clickCompareButton();
        ComparisonPage comparisonPage= new ComparisonPage(driver);
        comparisonPage.getCompareMessage();
        String actualResult= comparisonPage.getCompareMessage();
        String expectedResult="Product Comparison";
        Assert.assertEquals(actualResult, expectedResult, "Text text is not the one you want!");
    }

}