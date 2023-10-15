package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComparisonPage extends BasePage {
    public ComparisonPage(WebDriver driver) {super(driver);}
 private By compareMessage= By.xpath("//*[@id=\"content\"]/h1");

    private By noProductsResultMessage = By.xpath("//*[@id=\"content\"]/p");

    public String getNoProductsResultMessage() {return driver.findElement(noProductsResultMessage).getText();}
    public String getCompareMessage(){return driver.findElement(compareMessage).getText();}

}


