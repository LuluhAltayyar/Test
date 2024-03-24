package Day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.List;

public class Task01 {

    static WebDriver driver;
    Actions actions = new Actions(driver);

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Go to URL: https://demoqa.com/radio-button
        driver.get("https://demoqa.com/radio-button");
    }

    @AfterClass
    public static void tearDown()
    {
        driver.quit();
    }

    /*
    Verify whether all 3 options given to the question can be selected.
    When each option is selected, print the following texts on the console.
 */

    @Test
    public void yesRadioTest() throws InterruptedException {
        Thread.sleep(2000);

        WebElement yesRadio= driver.findElement(By.id("yesRadio"));
        // Scroll into view
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yesRadio);
        if(yesRadio.isEnabled()) {
            if (!yesRadio.isSelected()) {
               // yesRadio.click();
                actions.moveToElement(yesRadio).click().perform();
                System.out.println("Radio is selected...");
            } else
                System.out.println("Radio is already selected...");

        }
        else System.out.println("Radio yesRadio is not Enabled");
        Assert.assertTrue(yesRadio.isSelected());
    }


    @Test
    public void impressiveRadioTest(){
        WebElement impressiveRadio= driver.findElement(By.id("impressiveRadio"));
        if(impressiveRadio.isEnabled()) {
            if (!impressiveRadio.isSelected()) {
                actions.moveToElement(impressiveRadio).click().perform();

                // impressiveRadio.click();
                System.out.println("Radio is selected...");
            } else {
                System.out.println("Radio is already selected...");

            }
        }
        System.out.println("Radio yesRadio is not Enabled");
        Assert.assertTrue(impressiveRadio.isSelected());
    }



    @Test
    public void noRadioTest(){
        WebElement noRadio= driver.findElement(By.id("noRadio"));
        if(noRadio.isEnabled()) {
            if (!noRadio.isSelected()) {
                noRadio.click();
                System.out.println("Radio is selected...");
            } else {
                System.out.println("Radio is already selected...");
            }
        }
        System.out.println("Radio yesRadio is not Enabled");

           Assert.assertFalse(noRadio.isSelected());
    }

}
