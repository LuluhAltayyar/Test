package Day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC04 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/");

        System.out.println("Position"+driver.manage().window().getPosition());
        System.out.println("Size"+driver.manage().window().getSize());


        driver.manage().window().setPosition(new Point(8,8));
        driver.manage().window().setSize(new Dimension(800,500));

        int x= driver.manage().window().getPosition().getX();
        int y= driver.manage().window().getPosition().getY();

        int Height= driver.manage().window().getSize().getHeight();
        int Width= driver.manage().window().getSize().getWidth();

        if(x==8 && y==8 && Height==500 && Width==800)
            System.out.println("Passe");
        else
            System.out.println("Failed");

        driver.quit();






    }
}
