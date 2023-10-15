package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){super(driver);}
    private By emailInput= By.id("input-email");
    private By passwordInput= By.id("input-password");
    private By loginButton= By.xpath(("//input[@value='Login']"));
    private By forgottenPassword= By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/div[2]/a");
    private By insertEmailAddress= By.xpath("//*[@id=\"input-email\"]");
    private By continueButton= By.xpath("//*[@id=\"content\"]/form/div/div[2]/button");
    private By errorMessage= By.xpath("//*[@id=\"account-login\"]/div[1]");



    public void insertEmail(String firstName) {driver.findElement(emailInput).sendKeys(firstName);}
    public void insertPassword(String firstName) {driver.findElement(passwordInput).sendKeys(firstName);}
    public void clickLogin(){driver.findElement(loginButton).click();}
    public void clickForgottenPassword(){driver.findElement(forgottenPassword).click();}
    public String getErrorMessage(){return driver.findElement(errorMessage).getText();}


}
