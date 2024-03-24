package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
    public class HW1 {
        public static void main(String[] args) {
            // Create chrome driver
            WebDriver driver = new ChromeDriver();

            // Open Google
            driver.get("https://www.google.com");

            // Print title of the page
           // System.out.println("Title of the page: " + driver.getTitle());

            String title = driver.getTitle();
            System.out.println("title = " + title);

            // Print current URL of the page
            System.out.println("URL: " + driver.getCurrentUrl());

            // Close the browser
            driver.quit();
    }
}
