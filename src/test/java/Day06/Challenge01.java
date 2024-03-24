package Day06;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Challenge01 {
    static WebDriver driver;


    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        // new user
        driver.findElement(By.id("signup")).click();

        // Initialize Faker
        Faker faker = new Faker();

        String email = faker.internet().emailAddress();
        String password = faker.internet().password();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        Thread.sleep(2000);
        // Fill out the form
        driver.findElement(By.id("firstName")).sendKeys((firstName));
        driver.findElement(By.id("lastName")).sendKeys((lastName));
        driver.findElement(By.id("email")).sendKeys((email));
        driver.findElement(By.id("password")).sendKeys((password));
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        // add new contact
        driver.findElement(By.id("add-contact")).click();

        System.out.println("User is directed to create contact page successfully");

        // Fill out the form
        driver.findElement(By.id("firstName")).sendKeys((firstName));
        driver.findElement(By.id("lastName")).sendKeys((lastName));
        driver.findElement(By.id("birthdate")).sendKeys(("1997-02-02"));
        driver.findElement(By.id("lastName")).sendKeys((lastName));
        driver.findElement(By.id("email")).sendKeys((email));
        driver.findElement(By.id("phone")).sendKeys((faker.numerify("##########")));
        driver.findElement(By.id("street1")).sendKeys((faker.address().streetAddress()));
        driver.findElement(By.id("street2")).sendKeys((faker.address().streetAddress()));
        driver.findElement(By.id("city")).sendKeys((faker.address().city()));
        driver.findElement(By.id("stateProvince")).sendKeys(faker.address().state());
        driver.findElement(By.id("postalCode")).sendKeys(faker.address().zipCode());
        driver.findElement(By.id("country")).sendKeys(faker.address().country());

        Thread.sleep(2000);

        // Submit the form
        driver.findElement(By.id("submit")).click();

        Thread.sleep(5000);

        Assert.assertEquals(driver.getCurrentUrl(),("https://thinking-tester-contact-list.herokuapp.com/contactList"));
        System.out.println("Contact has been created successfully");

    }

}