package day04;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import java.time.Duration;

public class task04 {
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
    public void Test01() {
        driver = new ChromeDriver();
        //  Navigate to https://testpages.herokuapp.com/styled/index.html

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //Click on Simple Calculator under Micro Apps.
        driver.findElement(By.id("calculatetest")).click();
        //Type any number in the first input.
        driver.findElement(By.id("number1")).sendKeys("1");
        //Type any number in the second input.
        driver.findElement(By.id("number2")).sendKeys("1");
        //Click on Calculate.
        driver.findElement(By.id("calculate")).click();
        //Get the result.
        String answer = driver.findElement(By.id("answer")).getText();
        //Print the result.
        System.out.println("Result: " + answer);
    }
}
