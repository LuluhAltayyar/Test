package Day07;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge04 {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigate to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
    }

    @AfterClass
    public static void tearDown()
    {
        driver.quit();
    }

    @Test
    public void Test() throws InterruptedException {
        // click on "Click me, to Open an alert after 5 seconds" button
        driver.findElement(By.id("alert")).click();
        Thread.sleep(5000);
        //click on accept alert
        driver.switchTo().alert().accept();

        //click on "Change Text to Selenium Webdriver"
        driver.findElement(By.id("populate-text")).click();
        Thread.sleep(10000);
        //verify "Selenium Webdriver" message is displayed
        Assert.assertEquals( driver.findElement(By.id("h2")).getText(),"Selenium Webdriver");

        //6. click on "Display button after 10 seconds" button
        driver.findElement(By.id("display-other-button")).click();
        Thread.sleep(10000);

        //7. verify the button is displayed
        Assert.assertEquals(driver.findElement(By.id("hidden")).getText(), "Enabled");

        //8. click on "Enable button after 10 seconds" button
        driver.findElement(By.id("enable-button")).click();
        Thread.sleep(10000);

        //9. verify the button is enabled
        Assert.assertTrue(driver.findElement(By.id("disable")).isEnabled());

        //10. click on "Check Checkbox after 10 seconds" button
        driver.findElement(By.id("checkbox")).click();
        Thread.sleep(10000);
        //11. verify the check box is checked
        Assert.assertTrue(driver.findElement(By.id("ch")).isSelected());

    }
}
