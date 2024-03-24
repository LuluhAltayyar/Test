package Day11;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class HW01 extends TestBase {

    @Test
    public void test() {
        //Go to URL: https://facebook.com
        driver.get("https://facebook.com");
        //getCookies,
        Set<Cookie> cookies = driver.manage().getCookies();

        for (Cookie w: cookies){
            System.out.println(w);
        }
        System.out.println();

        //addCookie,
        Cookie newCookie= new Cookie("Test", "new test");
        driver.manage().addCookie(newCookie);
        driver.manage().getCookies().forEach(t-> System.out.println(t + " --------------"));

        System.out.println();
        //deleteCookieNamed,
        driver.manage().deleteCookie(newCookie);
        driver.manage().getCookies().forEach(t-> System.out.println(t+ "************"));

        //deleteAllCookies
        driver.manage().deleteAllCookies();
    }
}
