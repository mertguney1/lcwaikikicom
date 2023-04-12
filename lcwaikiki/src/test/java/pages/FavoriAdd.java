package pages;
import methods.Methods;
import org.openqa.selenium.By;
public class FavoriAdd {
    Methods methods;
    public FavoriAdd(){
        methods = new Methods();
    }
    public void favoriyeEkle(){
        methods.findElement(By.cssSelector(".product-grid > div:nth-of-type(1) [data-name='like (1)']")).click();
        methods.waitBySeconds(3);
    }
}
