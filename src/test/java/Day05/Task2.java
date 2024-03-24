package Day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
       Task 2:
     * breakout task: (in a separate class)
     * navigate to this url https://www.saucedemo.com/v1/inventory.html
     * add the first item you find to your cart
     * open your cart*
     * assert that the item name is correct inside the cart

     */
   static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Go to URL: https://www.saucedemo.com/v1/inventory.html
        driver.get("https://www.saucedemo.com/v1/inventory.html");
    }

    @AfterClass
    public static void tearDown()
    {
        driver.quit();
    }

    @Test
    public void Test() throws InterruptedException {

        driver.findElement(By.xpath("(//*[@class='btn_primary btn_inventory'])[1]")).click();

        String name= driver.findElement(By.xpath("(//*[@class='inventory_item_name'])[1]")).getText();
        System.out.println(name);
        driver.findElement(By.xpath("//*[@class='shopping_cart_link fa-layers fa-fw']")).click();
      //  driver.findElement(By.xpath("//*[@class='svg-inline--fa fa-shopping-cart fa-w-18 fa-3x']"));

        Assert.assertEquals( driver.findElement(By.xpath("//*[@class='inventory_item_name']")).getText(),name);

    }
}
