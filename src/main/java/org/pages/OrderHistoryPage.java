package org.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistoryPage extends BasePage {
    public OrderHistoryPage(WebDriver driver) {
        super(driver);
    }

    private By ViewButton = By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[7]/a/i");
    private By OrderDetailes = By.xpath("//*[@id=\"content\"]/table[1]/thead/tr/td");


    public void clickViewButton() {
        driver.findElement(ViewButton).click();
    }

    public String getOrderDetails() {
        return driver.findElement(OrderDetailes).getText();
    }

}
