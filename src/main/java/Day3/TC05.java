package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC05 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.w3schools.com/");

        driver.manage().window().maximize();

        System.out.println("Position: "+ driver.manage().window().getPosition());
        System.out.println("Size: "+ driver.manage().window().getSize());

        driver.manage().window().minimize();
        Thread.sleep(7000);

        System.out.println("Position: "+ driver.manage().window().getPosition());
        System.out.println("Size: "+ driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        driver.quit();
    }
}