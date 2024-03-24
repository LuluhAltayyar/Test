package Day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.time.Duration;

public class D09_HW02 extends TestBase {

    @Test
    public void Test(){
        //Go to URL: https://rangeslider.js.org/
        driver.get("https://rangeslider.js.org/");

        //Shift 100 units to the right and 100 units to the left on the horizontal axis.
        WebElement sliderButton = driver.findElement(By.id("js-rangeslider-0"));
        actions
                .dragAndDropBy(sliderButton,100,0)
                .pause(Duration.ofSeconds(2))
                .dragAndDropBy(sliderButton,-100,0)
                .build()
                .perform();
    }
}
