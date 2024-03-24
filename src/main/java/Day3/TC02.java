package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();


        driver.quit();
    }
}
