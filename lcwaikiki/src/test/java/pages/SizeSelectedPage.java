package pages;
import methods.Methods;
import org.openqa.selenium.By;
public class SizeSelectedPage {
    Methods methods;
    public SizeSelectedPage(){
        methods = new Methods();
    }
    public void sizeSelected(){
        methods.findElement(By.cssSelector(".sizeHeight")).click();
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector("[key='1']")).click();
        methods.waitBySeconds(3);
    }
}
