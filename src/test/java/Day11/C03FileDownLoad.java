package Day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C03FileDownLoad extends TestBase {

    @Test
    public void test() throws InterruptedException, IOException {

        String s = "/Users/loloo/Downloads";
        String separater = System.getProperty("file.separator");
        String pathOfFile = System.getProperty("user.home")+ separater+"Downloads"+separater+"Test.txt";

        //    Go to URL: https://the-internet.herokuapp.com/download
        driver.get("https://the-internet.herokuapp.com/download");

        //    Download selenium-snapshot.png
        Files.deleteIfExists(Path.of(pathOfFile));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);

        driver.findElement(By.linkText("test.txt")).click();
        Thread.sleep(500);
        //    Verify if the file downloaded successfully.


        boolean isExist = Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(isExist);

    }
}
