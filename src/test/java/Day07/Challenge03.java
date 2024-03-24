package Day07;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge03 {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Go to URL: https://clarusway.getlearnworlds.com/sda-test-registration-form
        driver.get("https://clarusway.getlearnworlds.com/sda-test-registration-form");
    }

    @AfterClass
    public static void tearDown()
    {
        driver.quit();
    }

    @Test
    public void TestName()
    {
       String Fname= driver.findElement(By.xpath("input[complink=\"Name_First\"]")).getText();
       String LName= driver.findElement(By.xpath("input[complink=\"Name_Last\"]")).getText();

        Assert.assertEquals(driver.findElement(By.id("error-Name")).getText(),"Enter a value for this field." );

    }
}
