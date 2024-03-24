package Day09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class D09_HW1 extends TestBase {

    @Test
    public void Test() throws InterruptedException {
        //Go to URL: http://demo.guru99.com/test/drag_drop.html
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        //Drag and drop the BANK button to the Account section in DEBIT SIDE
     /*   WebElement bankButton = driver.findElement(By.id("credit2"));
        WebElement accountDEBIT  = driver.findElement(By.id("bank"));
        actions.dragAndDrop(bankButton,accountDEBIT).perform();
*/
          /*
Drag and drop the BANK button to the Account section in DEBIT SIDE
Drag and drop the SALES button to the Account section in CREDIT SIDE
Drag and drop the 5000 button to the Amount section in DEBIT SIDE
Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
         */


        String id[]={"credit2","bank","fourth","amt7","credit1","loan","fourth","amt8"};

        for (int i = 0; i < id.length; i++) {
            WebElement Account = driver.findElement(By.id(id[i++]));
            WebElement Amount  = driver.findElement(By.id(id[i]));
            actions.dragAndDrop(Account,Amount).perform();

        }
//Verify the visibility of Perfect text.
        Assert.assertEquals(driver.findElement(By.id("equal")).getText(),"Perfect!");
    }
}
