package Day14;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class test extends TestBase {


        @Test
        public void test1()  {
            driver.get("https://www.google.com/");

            WebElement interArea= driver.findElement(By.id("APjFqb"));
            interArea.sendKeys("selenium ex"+ Keys.ENTER);

            interArea= driver.findElement(By.id("APjFqb"));
            interArea.clear();

            driver.quit();

            driver.get("https://www.google.com/");
        }

        @Test
    public void Test02()
        {
            driver.get("https://demoqa.com/radio-button");

        }
}
