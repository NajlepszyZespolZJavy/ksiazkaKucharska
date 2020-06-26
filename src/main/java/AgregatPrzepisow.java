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
        listaPrzepisow.add(new PlackiZiemniaczane());
        listaPrzepisow.add(new Nalesniki());
        listaPrzepisow.add(new GulaszWolowy());
        listaPrzepisow.add(new Churros());
        listaPrzepisow.add(new CroqueMadame());
        listaPrzepisow.add(new Zurek());
        listaPrzepisow.add(new Chlodnik());
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
