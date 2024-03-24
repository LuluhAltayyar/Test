package Day08;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ch6 {

    static WebDriver driver;
    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com/?app=desktop&gl=SA&hl=ar");
    }
    @Test
    public void Test() throws InterruptedException {
        // Click "Alert with OK" and click 'click the button to display an alert box:'
        driver.findElement(By.id("search")).sendKeys("testing", Keys.ENTER);

        // Accept Alert
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        Assert.assertEquals(driver.findElement(By.id("result")).getText(),"You successfully clicked an alert");

    }
}
