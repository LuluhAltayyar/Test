package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc03 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        String title = "Amazon.com. Spend less. Smile more.";
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        String title2= driver.getTitle();

        if(title.contains(title2))
            System.out.println("Pass Test");
        else
            System.out.println("Failed Test");

        driver.quit();




    }
}
