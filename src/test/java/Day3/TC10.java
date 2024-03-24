package Day3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC10 {
    static WebDriver driver;

    @BeforeClass
    public static void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
    }
    @AfterClass
    public static void tearDown()
    {
        driver.quit();
    }
    @Test
    public void findHome() {

        WebElement homeButton = driver.findElement(By.linkText("Home"));
        homeButton.click();
        }

    @Test
    public void findProducts() {

        WebElement ProductButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]"));
        ProductButton.click();
    }
    @Test
    public void findCart() {

        WebElement  CartButton = driver.findElement(By.linkText("Cart"));
        CartButton.click();
    }

    @Test
    public void findSignupLogin() {

        WebElement  Button = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        Button.click();
    }

    @Test
    public void findTestCases() {

        WebElement  Button = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
        Button.click();
    }

    @Test
    public void findAPITesting() {

        WebElement  Button = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[6]/a"));
        Button.click();
    }
    @Test
    public void findVideoTutorials() {

        WebElement  Button = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[7]/a"));
        Button.click();
    }

    @Test
    public void findContact() {

        WebElement  Button = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a"));
        Button.click();
    }


}
