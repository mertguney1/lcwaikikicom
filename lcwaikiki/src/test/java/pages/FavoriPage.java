package pages;
import methods.Methods;
import org.openqa.selenium.By;
public class FavoriPage {
    Methods methods;
    public FavoriPage(){
        methods = new Methods();
    }
    public void favoriPage(){
        methods.findElement(By.cssSelector("[href='/tr-TR/TR/favorilistem'] > .dropdown-label")).click();
        methods.waitBySeconds(2);
        methods.scrolWithJavaScript(By.cssSelector(".next-image"));
        methods.waitBySeconds(1);
    }
}
