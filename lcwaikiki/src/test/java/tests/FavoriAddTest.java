package tests;
import driver.BaseTest;
import org.junit.Test;
import pages.CookieClosePage;
import pages.FavoriAdd;
import pages.ProductSearchBar;
import pages.UrunleriFiltrele;
public class FavoriAddTest extends BaseTest {
    @Test
    public void favoriAddTest(){
        CookieClosePage cookieClosePage = new CookieClosePage();
        cookieClosePage.cookieClosePage();
        ProductSearchBar productSearchBar = new ProductSearchBar();
        productSearchBar.productSearchBar();
        UrunleriFiltrele urunleriFiltrele = new UrunleriFiltrele();
        urunleriFiltrele.urunleriFiltreleUcuzdanPahaliya();
        FavoriAdd favoriAdd = new FavoriAdd();
        favoriAdd.favoriyeEkle();
    }
}
