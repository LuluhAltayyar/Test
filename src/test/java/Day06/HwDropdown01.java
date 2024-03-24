package Day06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HwDropdown01 {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
       // Go to URL: https://the-internet.herokuapp.com/dropdown

        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    @AfterClass
    public static void tearDown(){
          driver.quit();
    }

    @Test
    public void dropdownTest() {

        // first locate the webElement
        WebElement element = driver.findElement(By.id("dropdown"));

        // Create select object
        Select select = new Select(element);

        // Select Option 1 using index .
        select.selectByIndex(1);

        // Select Option 2 by value.
        select.selectByValue("2");

        // Select Option 1 value by visible text.
        select.selectByVisibleText("Option 1");


        //Print all dropdown value.
        List<WebElement> options = select.getOptions();
        for (WebElement option:options)
            System.out.println(option.getText());

        //Verify the dropdown has Option 2 text.
        List<String> List = new ArrayList<>();

        for (WebElement option: options){
            List.add(option.getText());
        }

        Assert.assertTrue(List.contains("Option 2"));

        //Print first selected option.
        System.out.println(select.getFirstSelectedOption().getText());

        //Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
        if( options.size() != 3)
            System.out.println("Expected Is Not Equal Actual");
          /*Hw:1

     */


    }
}
