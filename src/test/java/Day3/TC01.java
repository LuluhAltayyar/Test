package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/");
        driver.get("https://stackoverflow.com/");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();


        driver.quit();


    }
}
