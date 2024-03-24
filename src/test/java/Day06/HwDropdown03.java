package Day06;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HwDropdown03 {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        // Go to URL: "https://demoqa.com/select-menu"
        driver.get("https://demoqa.com/select-menu");
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    @Test
    public void dropdownTest() throws InterruptedException {

        //  Select the Standard Multi-Select using the element id.
        WebElement element = driver.findElement(By.id("cars"));

        // Create select object
        Select select = new Select(element);

        //Verifying that the element is multi-select.
        Assert.assertTrue(select.isMultiple());

        //Select 'Opel' using the index and deselect the same using index.
        select.selectByIndex(2);
        Thread.sleep(1000);
        select.deselectByIndex(2);

        //Select 'Saab' using value and deselect the same using value.
        select.selectByValue("saab");
        Thread.sleep(1000);
        select.deselectByValue("saab");



        //Deselect all the options.
        select.deselectAll();
        Thread.sleep(1000);
    }


}
