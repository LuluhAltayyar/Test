package Day06;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import java.sql.SQLOutput;
import java.time.Duration;

public class temu {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public static void End() {
        driver.quit();
    }

    @Test
    public void Test01() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  1. Go to URL: https://www.temu.com/
        driver.get("https://www.temu.com");

        driver.navigate().back();
        // 2.Type "iphone" in the search bar and click ENTER.
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys("iphone", Keys.ENTER);
        //3.Print the result number.
        System.out.println("result: " + driver.findElements(By.cssSelector("div[class='_3GizL2ou']")).size());
        // 4.Click on the first product that appears.
        driver.findElements(By.cssSelector("div[class='_3GizL2ou']")).getFirst().click();

      //  5.Add to cart.
        driver.findElement(By.cssSelector("div[class='_2FknBe8R I7xxN3J_']")).click();

        //6.Click on the cart icon.
        driver.findElement(By.cssSelector("div[class='t3Pp2_fq']")).click();

       // 7.Print the product price
        driver.findElements(By.cssSelector("div[class='_1IVVCOls']")).get(1);


        //8.Complete your shopping..

        //    9.Turn off the driver.
        driver.quit();

    }
}
