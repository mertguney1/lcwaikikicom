package tests;
import driver.BaseTest;
import org.junit.Test;
import pages.*;
public class SepeteEklemeTest extends BaseTest {
    @Test
    public void sepeteEkle(){
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
        SizeSelectedPage sizeSelectedPage = new SizeSelectedPage();
        sizeSelectedPage.sizeSelected();
        SepeteEkleme sepeteEkleme = new SepeteEkleme();
        sepeteEkleme.sepeteEkleme();
    }
}
