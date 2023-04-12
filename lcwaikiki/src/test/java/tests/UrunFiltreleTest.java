package tests;
import driver.BaseTest;
import org.junit.Test;
import pages.CookieClosePage;
import pages.ProductSearchBar;
import pages.UrunleriFiltrele;
public class UrunFiltreleTest extends BaseTest {
    @Test
    public void urunFiltreleTest(){
        CookieClosePage cookieClosePage = new CookieClosePage();
        cookieClosePage.cookieClosePage();
        ProductSearchBar productSearchBar = new ProductSearchBar();
        productSearchBar.productSearchBar();
        UrunleriFiltrele urunleriFiltrele = new UrunleriFiltrele();
        urunleriFiltrele.urunleriFiltreleUcuzdanPahaliya();
    }
}
