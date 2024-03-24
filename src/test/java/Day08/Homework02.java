package Day08;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework02 {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public static void end() {
        driver.quit();
    }


    @Test
    public void test() {

        // Go to URL: https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows");

        //Verify the text: “Opening a new window”
        Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(),"Opening a new window");

        //Verify the title of the page is “The Internet”
        Assert.assertEquals(driver.getTitle(),"The Internet");

        // Get the handle of the main window
        String mainWindowHandle = driver.getWindowHandle();

       // Click on the “Click Here” button
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        //Verify the new window title is “New Window”
        // Switch to the new window
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

       Assert.assertEquals(driver.getTitle(),"New Window");

        //Go back to the previous window and then verify the title: “The Internet”
        driver.switchTo().window(mainWindowHandle);
        Assert.assertEquals(driver.getTitle(),"The Internet");




        /*

     */
    }
}