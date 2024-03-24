package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.Key;
import java.time.Duration;

public class task01 {

    static WebDriver driver;

   // Create the driver with BeforeClass and make it static inside the class.

   @BeforeClass
   public static void  setUp(){
       driver =new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // Go to http://www.google.com
       driver.get("http://www.google.com");
   }

   @AfterClass
   public static void End(){
       driver.quit();
   }
@Test
    public void Tes01(){
    // Type "Green Mile" in the search box and print the number of results.
   driver.findElement(By.name("q")).sendKeys("Green Mile"+ Keys.ENTER);
   System.out.println("result: "+ driver.findElement(By.id("result-stats")).getText() );
}
    @Test
    public void Tes02(){
        // Type "Premonition" in the search box and print the number of results.
        driver.findElement(By.name("q")).sendKeys("Premonition"+ Keys.ENTER);
        System.out.println("result: "+ driver.findElement(By.id("result-stats")).getText() );
    }
    @Test
    public void Tes03(){
        //Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
        driver.findElement(By.name("q")).sendKeys("The Curious Case of Benjamin Button"+ Keys.ENTER);
        System.out.println("result: "+ driver.findElement(By.id("result-stats")).getText() );
    }


}
