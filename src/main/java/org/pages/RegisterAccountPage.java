package org.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterAccountPage extends BasePage {
    public RegisterAccountPage(WebDriver driver) {
        super(driver);
    }

    private By firstNameInput = By.id("input-firstname");
    private By lastNameInput = By.id("input-lastname");
    private By emailInput = By.id("input-email");
    private By telephoneInput = By.id("input-telephone");
    private By passwordInput = By.id("input-password");
    private By passwordConfirmInput = By.id("input-confirm");
    private By privacyPolicyCheckbox = By.xpath("//label[@for='input-agree']");
    private By continueButton = By.xpath("//input[@value='Continue']");
    private By firstNameErrorElement = By.xpath("//input[@name= 'firstname']/following-sibling::div");
    private By lastNameErrorElement = By.xpath("//*[@id=\"account\"]/div[3]/div/div");
    private By emailErrorMessage = By.xpath("//*[@id=\"account\"]/div[4]/div/div");
    private By telephoneErrorMessage = By.xpath("//*[@id=\"account\"]/div[5]/div/div");
    private By passwordErrorMessage = By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div");
    private By errorMessage = By.xpath("//*[@id=\"account-register\"]/div[1]");

    public void insertFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void insertLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void insertEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void insertPhoneNumber(String phoneNumber) {
        driver.findElement(telephoneInput).sendKeys(phoneNumber);
    }

    public void setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void setPasswordConfirmInput(String passwordConfirm) {
        driver.findElement(passwordConfirmInput).sendKeys(passwordConfirm);
    }

    public void checkPrivacyPolicy() {
        driver.findElement(privacyPolicyCheckbox).click();
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public String getFirstNameErrorMessage() {
        return driver.findElement(firstNameErrorElement).getText();
    }

    public String getLastNameErrorMessage() {
        return driver.findElement(lastNameErrorElement).getText();
    }

    public String getEmailErrorMessage() {
        return driver.findElement(emailErrorMessage).getText();
    }

    public String getTelephoneErrorMessage() {
        return driver.findElement(telephoneErrorMessage).getText();
    }

    public String getPasswordErrorMessage() {
        return driver.findElement(passwordErrorMessage).getText();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }


}


