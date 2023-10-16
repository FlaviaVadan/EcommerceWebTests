package org.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscribeNewsletterPage extends BasePage {
    public SubscribeNewsletterPage(WebDriver driver) {
        super(driver);
    }

    private By chooseNoButton = By.xpath("//*[@id=\"content\"]/form/fieldset/div/div/div[2]/label");
    private By continueButton = By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
    private By confirmationMessage = By.xpath("//*[@id=\"account-account\"]/div[1]");


    public void clickChooseNoButton() {
        driver.findElement(chooseNoButton).click();
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }


}

