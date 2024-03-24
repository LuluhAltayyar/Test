package Day11;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.io.File;

public class HW03 extends TestBase {

    @Test
    public void test() throws InterruptedException {

        //    Go to URL: https://opensource-demo.orangehrmlive.com/
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //Login page valid credentials.
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Click PIM on the left side bar
        driver.findElement(By.linkText("PIM")).click();

        //Click Configuration and select Data Import
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")).click();
        driver.findElement(By.linkText("Data Import")).click();

        //Download sample CSV file.
        driver.findElement(By.linkText("Download")).click();

        //Verify if the file downloaded successfully.
        String userHome = System.getProperty("user.home");
        String sepertor = System.getProperty("file.separator");

        Thread.sleep(5000);

        String path= userHome+sepertor+ "Downloads"+sepertor+"importData.csv";

        File file = new File(path);

        // Verify that the file exists
        if (file.exists())
            System.out.println("The file downloaded successfully.");
        else
            System.out.println("The file download failed");


        System.out.println();


    }
}
