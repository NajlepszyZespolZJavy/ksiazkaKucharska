import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KsiazkaKucharskaModelTest {

    @Test
    void testZnajdzPrzepis() {
        KsiazkaKucharskaModel theModel = new KsiazkaKucharskaModel();

        String przykladowaNazwa = "k";
        theModel.znajdzPrzepis(przykladowaNazwa);
        Assertions.assertTrue(theModel.getAktualnyPrzepis().getTytul().toLowerCase().contains(przykladowaNazwa.toLowerCase()));

        przykladowaNazwa = "123";
        theModel.znajdzPrzepis(przykladowaNazwa);
        Assertions.assertFalse(theModel.getAktualnyPrzepis().getTytul().toLowerCase().contains(przykladowaNazwa.toLowerCase()));

        przykladowaNazwa = "\t";
        theModel.znajdzPrzepis(przykladowaNazwa);
        Assertions.assertFalse(theModel.getAktualnyPrzepis().getTytul().toLowerCase().contains(przykladowaNazwa.toLowerCase()));
    }

    @Test
    void testGetAktualnyPrzepis() {
        KsiazkaKucharskaModel theModel = new KsiazkaKucharskaModel();
        Assertions.assertTrue(theModel.getAktualnyPrzepis() instanceof Przepis);
    }

    @Test
    void testZmienNaPoprzedni() {
        KsiazkaKucharskaModel theModel = new KsiazkaKucharskaModel();
        int wartosc = theModel.getIterator().getIndeks();
        theModel.zmienNaPoprzedni();
        Assertions.assertEquals(theModel.getIterator().getIndeks(), wartosc - 1);
    }

    @Test
    void testZmienNaNastepny() {
        KsiazkaKucharskaModel theModel = new KsiazkaKucharskaModel();
        int wartosc = theModel.getIterator().getIndeks();
        theModel.zmienNaNastepny();
        Assertions.assertEquals(theModel.getIterator().getIndeks(), wartosc + 1);
    }
}
