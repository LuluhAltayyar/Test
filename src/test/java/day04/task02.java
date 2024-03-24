package day04;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import java.time.Duration;

public class task02 {
    static WebDriver driver;

    @BeforeClass
    public static void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterClass
    public static void End(){
        driver.quit();
    }

    @Test
    public void Test01()
    {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        // Click on Locators - Find By Playground Test Page
        driver.findElement(By.partialLinkText("Locators - Find")).click();

        // Print the URL
        String url1 = driver.getCurrentUrl();
        System.out.println("url1 = " + url1);

        // Navigate back
        driver.navigate().back();

        // Print the URL
        String url2 = driver.getCurrentUrl();
        System.out.println("url2 = " + url2);

        // Click on WebDriver Example Page
        driver.findElement(By.id("webdriverexamplepage")).click();

        // Print the URL
        String url3 = driver.getCurrentUrl();
        System.out.println("url3 = " + url3);

        // Enter value 🡪 20 and Enter to "Enter Some Numbers inputBox"
        driver.findElement(By.id("numentry")).sendKeys("20");
        driver.findElement(By.id("submit-to-server")).click();



        // And then verify 'two, zero' message is displayed on page
        Assert.assertEquals(driver.findElement(By.id("message")).getText(),"two, zero");


    }
/*

    Under the Examples
    Click on Locators - Find By Playground Test Page
    Print the URL
    Navigate back
    Print the URL
    Click on WebDriver Example Page
    Print the URL
    Enter value 🡪 20 and Enter to "Enter Some Numbers inputBox"
    And then verify 'two, zero' message is displayed on page
    Close driver.

 */
}
