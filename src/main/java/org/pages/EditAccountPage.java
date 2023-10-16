package org.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditAccountPage extends BasePage {
    public EditAccountPage(WebDriver driver) {
        super(driver);
    }

    private By firstNameInput = By.xpath("//*[@id=\"input-firstname\"]");
    private By continueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input");
    private By confirmationMessage = By.xpath("//*[@id=\"account-account\"]/div[1]");
    private By lastNameInput = By.xpath("//*[@id=\"input-lastname\"]");
    private By editEmailAddress = By.xpath("//*[@id=\"input-email\"]");
    private By editTelephone = By.xpath("//*[@id=\"input-telephone\"]");
    private By warningEmailRegistered = By.xpath("//*[@id=\"account-edit\"]/div[1]");


    public void clearFirstName() {
        driver.findElement(firstNameInput).clear();
    }

    public void insertFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }

    public void clearLastName() {
        driver.findElement(lastNameInput).clear();
    }

    public void insertLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void clearEditEmailAddress() {
        driver.findElement(editEmailAddress).clear();
    }

    public void insertEditEmailAddress(String editEmailAddressText) {
        driver.findElement(editEmailAddress).sendKeys(editEmailAddressText);
    }

    public void clearEditTelephone() {
        driver.findElement(editTelephone).clear();
    }

    public void insertEditTelephone(String editTelephoneNumber) {
        driver.findElement(editTelephone).sendKeys(editTelephoneNumber);
    }

    public String getWarningEmailRegistered() {
        return driver.findElement(warningEmailRegistered).getText();
    }


}
