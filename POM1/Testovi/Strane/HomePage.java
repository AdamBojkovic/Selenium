package Strane;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //locator for search box
    By searchBox = By.id("fnc-search_field");

    //locator for log in
    By login = By.xpath("/html/body/header/div[2]/div/div/div/div[2]/div/div[2]/div[1]/span");

    //locator for email box
    By emailBox = By.cssSelector("#login_dropdown > form > ul > li:nth-child(1) > input");

    //locator for pass field
    By passBox = By.name("password");

    //locator for pass field
    By logInButton = By.className("login-button");

    //locator for MojNalog text
    By mojNalog = By.linkText("Moj nalog");

    //locator for product
    By product = By.cssSelector("body > div.content-wrap > div.main-col > div.products-wrap > div > div:nth-child(2) > a");

    //locator for bay button
    By bayButton = By.xpath("/html/body/div[1]/div[4]/div[4]/div[2]/div[3]/div[1]/div[2]/a");


    //enter to log in form
    public void hoverToLogIn(){
        WebElement nekiElement = driver.findElement(login);
        new Actions(driver).moveToElement(nekiElement).build().perform();
    }

    //enter email in email box
    public void enterEmail (String email){
        driver.findElement(emailBox).sendKeys(email);
    }

    //enter pass in box
    public void enterPass (String pass){
        driver.findElement(passBox).sendKeys(pass);
    }

    //click on log in button
    public void logIn(){
        driver.findElement(logInButton).click();
    }

    public void mojNalogText(){
        String actual = driver.findElement(mojNalog).getText();
        String expected = "Moj nalog";
        Assertions.assertEquals(expected, actual);
    }

    //enter data in search box and submit
    public void enterData (String proizvod){
        driver.findElement(searchBox).sendKeys(proizvod + Keys.ENTER);
    }

    //click on product
    public void clickOnProduct(){
        driver.findElement(product).click();
    }

    //take text from buy button
    public void getTextFromButton() {
        String button = driver.findElement(bayButton).getText();
        //System.out.print(button);
        String expected = "DODAJ U KORPU";
        Assertions.assertEquals(expected, button);
    }

    //click on buy button
    public  void clickToBuy(){
        driver.findElement(bayButton).click();
    }

}

