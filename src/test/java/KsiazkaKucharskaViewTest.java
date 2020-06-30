import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KsiazkaKucharskaViewTest {

    @Test
    void testDefaultValues() {

        KsiazkaKucharskaView theView = new KsiazkaKucharskaView();

        Assertions.assertNotNull(theView.getTitle());
        Assertions.assertEquals(theView.getTitle(), "Książka Kucharska");
        theView.setTitle("Nowa nazwa");
        Assertions.assertEquals(theView.getTitle(), "Nowa nazwa");

        Assertions.assertTrue(theView.getWidth() > 0);
        Assertions.assertTrue(theView.getHeight() > 0);
    }

    @Test
    void testWyswietlPrzepis() {

        KsiazkaKucharskaView theView = new KsiazkaKucharskaView();

        Przepis przykladowyPrzepis = new Karpatka();
        theView.wyswietlPrzepis(przykladowyPrzepis);
        Assertions.assertEquals(theView.getTytul(), przykladowyPrzepis.getTytul());
        Assertions.assertEquals(theView.getCzasWykonania(), przykladowyPrzepis.getCzasWykonania());
        Assertions.assertEquals(theView.getTrudnoscWykonania(), przykladowyPrzepis.getTrudnoscWykonania());
        Assertions.assertEquals(theView.getSkladniki(), przykladowyPrzepis.getSkladniki());
        Assertions.assertEquals(theView.getInstrukcje(), przykladowyPrzepis.getInstrukcje());
    }

    @Test
    void testWyczyscPoleWyszukiwania() {

        KsiazkaKucharskaView theView = new KsiazkaKucharskaView();

        theView.wyczyscPoleWyszukiwania();
        Assertions.assertEquals(theView.getPoleWyszukiwania(), "");
    }

    @Test
    void testGetTytul() {
        KsiazkaKucharskaView theView = new KsiazkaKucharskaView();

        Przepis przykladowyPrzepis = new Karpatka();
        theView.wyswietlPrzepis(przykladowyPrzepis);
        Assertions.assertEquals(theView.getTytul(), przykladowyPrzepis.getTytul());

        przykladowyPrzepis = new MakaronZPesto();
        theView.wyswietlPrzepis(przykladowyPrzepis);
        Assertions.assertEquals(theView.getTytul(), przykladowyPrzepis.getTytul());
    }

    @Test
    void testGetSkladniki() {
        KsiazkaKucharskaView theView = new KsiazkaKucharskaView();

        Przepis przykladowyPrzepis = new Karpatka();
        theView.wyswietlPrzepis(przykladowyPrzepis);
        Assertions.assertEquals(theView.getSkladniki(), przykladowyPrzepis.getSkladniki());

        przykladowyPrzepis = new MakaronZPesto();
        theView.wyswietlPrzepis(przykladowyPrzepis);
        Assertions.assertEquals(theView.getSkladniki(), przykladowyPrzepis.getSkladniki());
    }

    @Test
    void testGetInstrukcje() {
        KsiazkaKucharskaView theView = new KsiazkaKucharskaView();

        Przepis przykladowyPrzepis = new Karpatka();
        theView.wyswietlPrzepis(przykladowyPrzepis);
        Assertions.assertEquals(theView.getInstrukcje(), przykladowyPrzepis.getInstrukcje());

        przykladowyPrzepis = new MakaronZPesto();
        theView.wyswietlPrzepis(przykladowyPrzepis);
        Assertions.assertEquals(theView.getInstrukcje(), przykladowyPrzepis.getInstrukcje());

    }
}