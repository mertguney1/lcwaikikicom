package tests;
import driver.BaseTest;
import org.junit.Test;
import pages.CookieClosePage;
public class CookieCloseTest extends BaseTest {
    @Test
    public void cookieCloseTest(){
        CookieClosePage cookieClosePage = new CookieClosePage();
        cookieClosePage.cookieClosePage();
    }
}
