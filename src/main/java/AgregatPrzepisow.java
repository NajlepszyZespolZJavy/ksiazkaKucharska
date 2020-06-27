import java.util.ArrayList;
import java.util.List;

/**
 * Klasa agregująca wszystkie przepisy znajdujące się w książce kucharskiej
 */
public class AgregatPrzepisow {

    private List <Przepis> listaPrzepisow = new ArrayList<Przepis>();

    /**
     * Konstruktor zapełnia listę wszystkimi przepisami
     */
    public AgregatPrzepisow() {
        listaPrzepisow.add(new PrzykladowyPrzepis());
        listaPrzepisow.add(new PrzykladowyPrzepis2());
        listaPrzepisow.add(new Lasagne());
        listaPrzepisow.add(new PureeWarzywne());
        listaPrzepisow.add(new SorbetTruskawkowy());
        listaPrzepisow.add(new TartaJablkowa());
    }

    /**
     * Zwraca listePrzepisow.
     */
    public List <Przepis> getListaPrzepisow() {
        return listaPrzepisow;
    }

    /**
     * Tworzy iterator po lisciePrzepisow.
     */
    public IteratorPrzepisow iterator() {
        return new IteratorPrzepisow(getListaPrzepisow());
    }
}
