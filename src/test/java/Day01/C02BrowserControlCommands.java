package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

        /*
         You might see the syntax of creating a driver object different forms :
                1)
                        -----   System.setProperty("WebDriver.Chrome.driver","resource/drivers/chromedriver"); --> first parameter name of the driver, second is its path
                                WebDriver driver = new ChromeDriver()

                                As time goes above syntax is simplified as below (2nd option)

                2)          We use Maven to simplify creation of driver object by using    "WebDriverManager"
                            WebDriverManager.ChromeDriver().setup;
                            WebDriver driver = new ChromeDriver()

                    BUT NOW we don't neeed to use any of them. By adding Selenium dependency of the latest release we can create driver
                    object directly...
*/

public class C02BrowserControlCommands {

    public static void main(String[] args) {

           /*
    Selenium automates browsers. That's it!
    What you do with that power is entirely up to you.
     */

        WebDriver driver = new ChromeDriver();

        //If we want to open a website with a driver, we use the get() method of our driver object.
        driver.get("https://google.com");
        // BROWSER CONTROL COMMANDS

        //getTitle() returns the title of the current tab. It returns a String.
        String title = driver.getTitle();
        System.out.println("title = " + title);

        //getCurrentURL() returns the URL of the current tab. It returns a String.
        String url =driver.getCurrentUrl();
        System.out.println("url = " + url);

        // getPageSource() retrieves the source HTML code of the current page. It returns a String.
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);

        // close() closes the current tab. If it's the only tab open, it also closes the browser.
        driver.close();

        // quit() closes all tabs and the browser.
        driver.quit();
    }

}
