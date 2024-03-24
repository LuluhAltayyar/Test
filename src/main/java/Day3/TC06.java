package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TC06 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();
        String title = "video";

        if(driver.getTitle().contains(title))
            System.out.println("Pass");
        else
            System.out.println("Failed");

        driver.manage().window().minimize();

        if(driver.getTitle().contains(title))
            System.out.println("Pass");
        else
            System.out.println("Failed");

        driver.manage().window().fullscreen();
        driver.quit();

    }


}
