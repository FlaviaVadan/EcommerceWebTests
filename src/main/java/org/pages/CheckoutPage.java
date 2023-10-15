package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage{
    public CheckoutPage (WebDriver driver){super(driver);}

    private By firstName= By.xpath("//input[@id='input-payment-firstname']");
    private By lastName= By.xpath("//*[@id=\"input-payment-lastname\"]");
    private By addressOne= By.xpath("//*[@id=\"input-payment-address-1\"]");
    private By city= By.xpath("//*[@id=\"input-payment-city\"]");
    private By country= By.xpath(".//select[@id='input-payment-country']");
    private By region= By.xpath(".//select[@id='input-payment-zone']");
    private By privacyPolicy= By.xpath("//*[@id=\"form-checkout\"]/div/div[2]/div/div[4]/label");
    private By termsConditions= By.xpath("//*[@id=\"form-checkout\"]/div/div[2]/div/div[5]/label");
    private By continueButton= By.xpath("//*[@id=\"button-save\"]");;
    private By confirmOrder= By.xpath("//*[@id=\"button-confirm\"]");
    private By confirmOrderMessage= By.xpath("//*[@id=\"content\"]/h1");
    private By guestCheckout= By.xpath("//*[@id=\"form-checkout\"]/div/div[1]/div/div[1]/div/div[3]/label");
    private By email= By.xpath(".//input[@id='input-payment-email']");
    private By telephone= By.xpath(".//input[@id='input-payment-telephone']");
    private By noOfItems= By.xpath("//input[starts-with(@id, 'quantity')]");


public void clickFirstName(){driver.findElement(firstName).click();}
    public void enterFirstName(String s){driver.findElement(firstName).sendKeys(s);}
    public void enterLastName(String s){driver.findElement(lastName).sendKeys(s);}
    public void enterAddressOne(String s){driver.findElement(addressOne).sendKeys(s);}
    public void enterCity(String s){driver.findElement(city).sendKeys(s);}
    public void selectCountry(String s){Select dropdown= new Select (driver.findElement(country));dropdown.selectByVisibleText(s);}
    public void selectRegion(String s){Select dropdown = new Select(driver.findElement(region));
                dropdown.selectByVisibleText(s);}


    public void clickPrivacyPolicy(){driver.findElement(privacyPolicy).click();}
    public void clickTermsConditions(){driver.findElement(termsConditions).click();}
    public void clickContinueButton(){driver.findElement(continueButton).click();}
    public void clickConfirmOrder(){driver.findElement(confirmOrder).click();}
    public String getConfirmOrderMessage(){return driver.findElement(confirmOrderMessage).getText();}
    public void clickGuestCheckout(){driver.findElement(guestCheckout).click();}
    public void enterEmail(String s){driver.findElement(email).sendKeys(s);}
    public void enterTelephone(String s){driver.findElement(telephone).sendKeys(s);}
    public Integer getNoOfItems() {return Integer.parseInt(driver.findElement(noOfItems).getAttribute("value"));}



}
