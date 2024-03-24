package day04;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import java.time.Duration;

public class task05 {
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

        //   Go to URL: https://www.linkedin.com/
        driver.get("https://www.linkedin.com");

//Locate the "Email or phone", "password", "Sign in" button using absolute xpath and relative xpath.
        driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("lulu@gmail.com");
        driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys("12313");
        driver.findElement(By.xpath("//button[@data-id=\"sign-in-form__submit-btn\"]")).click();
    }
}
