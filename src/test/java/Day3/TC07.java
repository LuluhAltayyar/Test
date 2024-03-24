package Day3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC07 {

        static WebDriver driver;

        @BeforeClass
        public static void setUp()
        {
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.youtube.com/");
        }
        @AfterClass
        public static void tearDown()
        {
            driver.quit();
        }

        @Before
        public void beforeClass () {
            System.out.println("Test is running");
        }

        @After
        public void afterClass () {
            System.out.println("Test finished");
        }
        // Test if the currentURL contains "youtube"
        @Test
        public void TestcurrentURL()
        {
            Assert.assertTrue(driver.getCurrentUrl().contains("youtube"));

        }
        // Test if the title does not contain "Video".
        @Test
        public void TestTitle(){
            Assert.assertFalse(driver.getTitle().contains("Video"));
        }

        // Test if the URL contains "youtube".
        @Test
        public void TestURL(){
            Assert.assertTrue(driver.getCurrentUrl().contains("youtube"));
        }
        // Test if the sourcePage contains "youtube".
        @Test
        public void TestSourcePage(){
            Assert.assertTrue(driver.getPageSource().contains("youtube"));
        }


}
