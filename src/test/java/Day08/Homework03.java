package Day08;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Homework03 {
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

        // Go to URL: https://demoqa.com/browser-windows
        driver.get("https://demoqa.com/browser-windows");

        //Click on the windows - "WindowButton"
        driver.findElement(By.id("WindowButton")).click();

        // Get handles of all windows
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();

        // Print heading of the parent window
        System.out.println("Heading of Parent Window:");
        System.out.println(driver.findElement(By.className("main-header")).getText());

        // Iterate through all windows
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(mainWindowHandle)) {
                // Switch to child window
                driver.switchTo().window(windowHandle);

                // Print text present on the child window
                System.out.println("Text present on Child Window:");
                List<WebElement> elements = driver.findElements(By.xpath("//body//h1"));
                if (elements.size() > 0) {
                    System.out.println(elements.get(0).getText());
                }

                // Close child window
                driver.close();
            }
        }

        // Switch back to the main window
        driver.switchTo().window(mainWindowHandle);



    /*

Click on all the child windows.
Print the text present on all the child windows in the console.
Print the heading of the parent window in the console.
     */
    }
}
