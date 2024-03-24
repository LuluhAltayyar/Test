package Day3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC09 {

     static WebDriver driver;

    @BeforeClass
    public static  void setUp()
    {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");
    }


    @AfterClass
    public static  void tearDown()
    {
        driver.quit();
    }

    @Before
    public void beforeClass() {
        System.out.println("STARTED");
        System.out.println("Test has started");
    }

    @After
    public void afterClass() {
        System.out.println("FINISHED");
        System.out.println("Test finished");
    }


    @Test
    public void Test01Title(){
        // Test if the title contains "w3school" when the page window is minimize
        driver.manage().window().minimize();
       // Assert.assertTrue(driver.getTitle().contains("w3school"));

        boolean isTitleContain = driver.getTitle().contains("W3Schools");
        Assert.assertTrue(isTitleContain);


    }

@Test
public void Test02Title(){
// Test if the title does not contain "boss" when the page window is fullscreen
    driver.manage().window().fullscreen();
    Assert.assertFalse(driver.getTitle().contains("boss"));

}
}
