package Day07;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task01 {
    static WebDriver driver;
    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }
    @Test
    public void alertTest() throws InterruptedException {
        // Click "Alert with OK" and click 'click the button to display an alert box:'
        driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();
        // Accept Alert
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        Assert.assertEquals(driver.findElement(By.id("result")).getText(),"You successfully clicked an alert");

    }

    @Test
    public void JSconfirmTest() throws InterruptedException {
        // Click "Alert with OK" and click 'click the button to display an alert box:'
        driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();
        // Accept Alert
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        Assert.assertEquals(driver.findElement(By.id("result")).getText(),"You clicked: Ok" );

    }
    @Test
    public void JSconfirmCancelTest() throws InterruptedException {
        // Click "Alert with OK" and click 'click the button to display an alert box:'
        driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();
        // Accept Alert
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();

        Assert.assertEquals(driver.findElement(By.id("result")).getText(),"You clicked: Cancel" );

    }

    @Test
    public void JSPromptTest() throws InterruptedException {
        // Click "Alert with OK" and click 'click the button to display an alert box:'
        driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();
        // Accept Alert
        Thread.sleep(1000);
        String enter = "luluh";

        driver.switchTo().alert().sendKeys(enter);
        driver.switchTo().alert().accept();

        Assert.assertEquals(driver.findElement(By.id("result")).getText(),"You entered: "+enter );

    }
    @Test
    public void JSPromptCancelTest() throws InterruptedException {
        // Click "Alert with OK" and click 'click the button to display an alert box:'
        driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();
        // Accept Alert
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();

        Assert.assertEquals(driver.findElement(By.id("result")).getText(),"You entered: null");

    }
}
