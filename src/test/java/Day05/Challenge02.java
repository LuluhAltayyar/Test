package Day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge02 {

    static WebDriver driver;
    Actions actions = new Actions(driver);

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Go to URL:
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
    }

    @AfterClass
    public static void tearDown()
    {
        driver.quit();
    }

    @Test
    public void browserTest() {
       Assert.assertEquals( driver.getCurrentUrl(),"https://webdriveruniversity.com/To-Do-List/index.html");
        System.out.println("page is visible successfully");
    }

    @Test
    public void addTest() throws InterruptedException {
        int beforeAdd= driver.findElements(By.tagName("li")).size();
        System.out.println(beforeAdd);
        driver.findElement(By.xpath("//*[@placeholder='Add new todo']")).sendKeys("Lulu "+ Keys.ENTER);
       Thread.sleep(1000);
        Assert.assertTrue(driver.findElements(By.tagName("li")).size()>beforeAdd);
        System.out.println("TODO has been added to the list");

        }

    @Test
    public void removeTest() throws InterruptedException {
        addTest();
        int beforeremove= driver.findElements(By.tagName("li")).size();

        driver.findElement(By.xpath("(//*[@class='fa fa-trash'])["+beforeremove+"]")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElements(By.tagName("li")).size()<beforeremove);
        System.out.println("TODO has been removed from the list");

    }

    @Test
    public void markTest() throws InterruptedException {
        int beforeremove= driver.findElements(By.tagName("li")).size();

        driver.findElement(By.tagName("li")).click();
        Thread.sleep(1000);
        System.out.println("TODO has been marked as completed successfully");

    }

}
