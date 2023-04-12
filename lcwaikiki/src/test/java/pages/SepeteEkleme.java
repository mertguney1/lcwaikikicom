package pages;
import methods.Methods;
import org.openqa.selenium.By;
public class SepeteEkleme {
    Methods methods;
    public SepeteEkleme(){
        methods = new Methods();
    }
    public void sepeteEkleme(){
        methods.findElement(By.cssSelector(".sizeAndCart > .add-to-cart")).click();
        methods.waitBySeconds(3);
    }
}
