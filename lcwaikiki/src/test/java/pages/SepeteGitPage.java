package pages;
import methods.Methods;
import org.openqa.selenium.By;
public class SepeteGitPage {
    Methods methods;
    public SepeteGitPage() {
        methods = new Methods();
    }
    public void sepeteGit() {
        methods.findElement(By.cssSelector(".header-dropdown-toggle[href='https://www.lcwaikiki.com/tr-TR/TR/sepetim'] > .dropdown-label")).click();
        methods.waitBySeconds(3);
    }
    public void textControl() {
        String text = methods.getText(By.cssSelector(".rd-cart-item-title"));
        System.out.println("alinan text: " + text);
        methods.waitBySeconds(3);
    }
}
