package TC;

import Strane.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class Prvi {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tehnomanija.rs");

        driver.manage().window().maximize();

        HomePage home = new HomePage(driver);

        Thread.sleep(1000);

        home.hoverToLogIn();

        home.enterEmail("joyace6197@boldhut.com");

        home.enterPass("Jehs9277!");

        Thread.sleep(1000);

        home.logIn();

        home.mojNalogText();

        home.enterData("UE50TU8502UXXH");

        home.clickOnProduct();

        Thread.sleep(2000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        Thread.sleep(2000);

        home.getTextFromButton();

        home.clickToBuy();

        driver.close();
        driver.quit();




    }


}