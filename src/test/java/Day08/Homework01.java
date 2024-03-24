package Day08;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework01 {

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

        // Go to URL: http://demo.guru99.com/test/guru99home/
        driver.get("http://demo.guru99.com/test/guru99home/");

        //Find the number of iframes on the page.
        int numberiframes = driver.findElements(By.tagName("iframe")).size();
        System.out.println(numberiframes);

        ///Link to the third iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
        driver.switchTo().frame(2);
        driver.findElement(By.tagName("a")).click();

        //Exit the iframe and return to the main page
        driver.switchTo().defaultContent();



    }
}