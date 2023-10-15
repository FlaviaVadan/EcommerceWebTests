package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscribeNewsletterPage extends BasePage {
    public SubscribeNewsletterPage(WebDriver driver) {super(driver);}
    private By insertEmailAddress = By.xpath("//*[@id=\"input-email\"]");
    private By insertPassword= By.xpath("//*[@id=\"input-password\"]");
    private By loginButton= By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input");

    private By chooseNoButton= By.xpath("//*[@id=\"content\"]/form/fieldset/div/div/div[2]/label");
    private By continueButton= By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
    private By confirmationMessage= By.xpath("//*[@id=\"account-account\"]/div[1]");

    public void insertEmailAddress(String email) {driver.findElement(insertEmailAddress).sendKeys(email);}
    public void insertPassword(String password) {driver.findElement(insertPassword).sendKeys(password);}
    public void clickLogin(){driver.findElement(loginButton).click();}
    public void clickChooseNoButton(){driver.findElement(chooseNoButton).click();}
    public void clickContinueButton(){driver.findElement(continueButton).click();}
    public String getConfirmationMessage(){return driver.findElement(confirmationMessage).getText();}



}

