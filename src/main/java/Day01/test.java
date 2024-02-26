package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable

          WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");


/*
          driver= new ChromeDriver();
       // WebDriver driver= new EdgeDriver();
        driver.get("https://www.google.com");

        String title= driver.getTitle();
        System.out.println("title ="+ title);

        String url= driver.getCurrentUrl();
        System.out.println("url ="+ url);

        String pagSource= driver.getPageSource();
        System.out.println("pagSource ="+ pagSource);

        driver.close();
*/

    }

    public static class Facebook {
        public static void main(String[] args) {

            WebDriver driver= new ChromeDriver();
           // driver.get("https://www.facebook.com/");
            driver.navigate().to("https://www.facebook.com/");

            // Verify expected URL equals to the actual URL
            String expectedUrl = "https://www.facebook.com/";
            String actualUrl = driver.getCurrentUrl();
            if (expectedUrl.equals(actualUrl)) {
                System.out.println("Expected URL matches actual URL: " + expectedUrl);
            } else {
                System.out.println("Expected URL does not match actual URL!");
            }

            // Verify page source of Day01.test.Facebook contains "Day01.test.Facebook"
            String pageSource = driver.getPageSource();
            if (pageSource.contains("Day01.test.Facebook")) {
                System.out.println("Page source contains 'Day01.test.Facebook'.");
            } else {
                System.out.println("Page source does not contain 'Day01.test.Facebook'.");
            }
        }
    }
}
