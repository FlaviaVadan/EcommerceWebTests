package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgottenPasswordPage extends BasePage {
    public ForgottenPasswordPage(WebDriver driver) {super(driver);}

    private By insertEmailAddress = By.xpath("//*[@id=\"input-email\"]");
    private By continueButton= By.xpath("//*[@id=\"content\"]/form/div/div[2]/button");
    private By confirmationMessage= By.xpath("//*[@id=\"account-login\"]/div[1]");

    public void insertEmail(String email) {driver.findElement(insertEmailAddress).sendKeys(email);}
    public void clickContinueButton() {driver.findElement(continueButton).click();}
    public String getConfirmationMessage(){return driver.findElement(confirmationMessage).getText();}
}