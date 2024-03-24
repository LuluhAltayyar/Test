package day04;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;

public class automationexercise {
    static WebDriver driver;

    @Test
    public void test01(){
        driver = new ChromeDriver();
        System.out.println("Browser is opened");
        driver.quit();

    }
    @Test
    public void test02(){
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        WebElement h2Element = driver.findElement(By.xpath("//h2[contains(text(), 'Full-Fledged practice website for Automation Engineers')]"));

        Assert.assertTrue(h2Element.isDisplayed());
        driver.quit();
    }

    @Test
    public void test03() {
        driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        login.click();
        WebElement h2Element = driver.findElement(By.xpath("//h2[contains(text(), 'Login to your account')]"));

        Assert.assertTrue(h2Element.isDisplayed());
        driver.quit();

    }
        @Test
        public void test04(){
            driver = new ChromeDriver();

            driver.get("https://automationexercise.com/login");

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("sda@test.com");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("sdainclasstask");


        driver.quit();

    }

    @Test
    public void test05(){
        driver = new ChromeDriver();

        driver.get("https://automationexercise.com/login");

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("sda@test.com");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("sdainclasstask");


        WebElement Logout = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        Logout.click();

        driver.quit();

    }





    }
