package pages;
import methods.Methods;
import org.openqa.selenium.By;
public class ProductSearchBar {
    Methods methods;
    public ProductSearchBar(){
        methods = new Methods();
    }
    public void productSearchBar(){
        methods.findElement(By.cssSelector("#search-form__input-field__search-input")).click();
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector("#search-form__input-field__search-input")).sendKeys("Ayakkabı");
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector(".search-form__input-field__btn-search")).click();
        methods.waitBySeconds(4);
    }
}
