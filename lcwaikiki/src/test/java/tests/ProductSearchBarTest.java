package tests;
import driver.BaseTest;
import org.junit.Test;
import pages.ProductSearchBar;
public class ProductSearchBarTest extends BaseTest {
    @Test
    public void ProductSearchBar(){
        ProductSearchBar productSearchBar = new ProductSearchBar();
        productSearchBar.productSearchBar();
    }
}
