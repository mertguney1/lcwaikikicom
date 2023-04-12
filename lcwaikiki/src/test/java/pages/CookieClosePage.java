package pages;
import methods.Methods;
import org.openqa.selenium.By;
public class CookieClosePage {
    Methods methods;
public CookieClosePage(){ methods = new Methods(); }
public void cookieClosePage(){
methods.findElement(By.cssSelector(".cookieseal-banner-body > button:nth-of-type(2)")).click();
methods.waitBySeconds(3);
    }
}
