package day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02Example {
    /*
    http://the-internet.herokuapp.com/add_remove_elements/
    Click on the "Add Element" button 100 times.
    Write a function that takes a number, and clicks the "Delete" button.
    Given number of times, and then validates that given number of buttons was deleted.

        1. Method: createButtons(100)
        2. Method: DeleteButtonsAndValidate()
     */
    WebDriver driver;

    @Test
    public void createDeleteTest(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        createButtons(1);
        deleteButtons(2);

    }

    public void createButtons(int numberOfButtons){



        WebElement button =driver.findElement(By.xpath("//*[.='Add Element']"));

        for (int i=0; i<numberOfButtons; i++){

            //button.click();
           // driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
            driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        }
    }

    public void deleteButtons(int x)
    {
        // Find elements using CSS selector with the desired attribute value
        java.util.List<WebElement> elements = driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));

        // Get the size of the list, which corresponds to the number of elements found
        int numberOfElements = elements.size();

        System.out.println(numberOfElements);
        if(x<= numberOfElements)
        for (int i = 0; i < x; i++)
            driver.findElement(By.cssSelector("button[onclick='deleteElement()']")).click();

        else System.out.println("number Of Elements less from "+ x);

    }
}
