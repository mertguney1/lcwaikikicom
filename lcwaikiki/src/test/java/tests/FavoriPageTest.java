package tests;
import driver.BaseTest;
import org.junit.Test;
import pages.*;
public class FavoriPageTest extends BaseTest {
    @Test
    public void favoriPageTest(){
        CookieClosePage cookieClosePage = new CookieClosePage();
        cookieClosePage.cookieClosePage();
        ProductSearchBar productSearchBar = new ProductSearchBar();
        productSearchBar.productSearchBar();
        UrunleriFiltrele urunleriFiltrele = new UrunleriFiltrele();
        urunleriFiltrele.urunleriFiltreleUcuzdanPahaliya();
        FavoriAdd favoriAdd = new FavoriAdd();
        favoriAdd.favoriyeEkle();
        FavoriPage favoriPage = new FavoriPage();
        favoriPage.favoriPage();
    }
}
