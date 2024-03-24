package Day3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC08 {

    static WebDriver driver;

    @BeforeClass
    public static void setUp()
    {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @AfterClass
    public static void tearDown()
    {
        driver.quit();
    }

    @Before
    public void beforeClass() {
        System.out.println("Tests are starting to run"); }

    @After
    public void afterClass() {
        System.out.println("Tests have finished running");
    }

public void TestTitle()
{
    // Test if the title is the same when the page window is maximize and minimize
    driver.manage().window().maximize();
    String titleMax= driver.getTitle();

    driver.manage().window().minimize();
    String titleMin= driver.getTitle();

    Assert.assertEquals(titleMin,titleMax);
}

@Test
    public void Test01Title()
{
    // Test if the title does not contain "Video" when the page window is fullscreen
    driver.manage().window().fullscreen();
    boolean title = driver.getTitle().contains("Video");
    Assert.assertFalse(title);
}
    @Test
    public void TestURL()
    {
        // Test if the URL contains "google"
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }


}
