package day04;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import java.time.Duration;

public class task03 {

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
        driver = new ChromeDriver();
      //  Go to https://id.heroku.com/login.
        driver.get("https://id.heroku.com/login");

    //Enter an e-mail address.
        driver.findElement(By.id("email")).sendKeys("luluh@gmail.com");

           // Enter a password.
        driver.findElement(By.id("password")).sendKeys("123123");
       // Click on the Login button.
        driver.findElement(By.name("commit")).click();

       if(driver.findElement(By.className("alert-danger")).getText().equals("There was a problem with your login.") )
            System.out.println("Registration Failed");
        else
            System.out.println("Registered");

    }

}