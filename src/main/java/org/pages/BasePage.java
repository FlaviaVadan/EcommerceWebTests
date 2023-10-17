package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


public class BasePage {
    WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForElementToBeClickable(By byLocator) {
        return new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(byLocator));
    }

    public void waitForElementToHaveText(By locator) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Boolean element = wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return driver.findElement(locator).getText().length() > 0;
            }
        });
    }

    public void waitForElementToNotHaveText(By locator, String text) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Boolean element = wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return driver.findElement(locator).getText() != text;
            }
        });
    }


}
