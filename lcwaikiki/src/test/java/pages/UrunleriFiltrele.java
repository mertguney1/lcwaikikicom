package pages;
import methods.Methods;
import org.openqa.selenium.By;
public class UrunleriFiltrele {
    Methods methods;
    public UrunleriFiltrele(){
        methods = new Methods();
    }
    public void urunleriFiltreleUcuzdanPahaliya(){
        methods.findElement(By.cssSelector(".dropdown-button__button")).click();
        methods.waitBySeconds(4);
        methods.findElement(By.cssSelector(".dropdown-button__dropdown > a:nth-of-type(2)")).click();
        methods.waitBySeconds(5);
    }
}
