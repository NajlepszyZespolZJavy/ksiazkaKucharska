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

        listaPrzepisow.add(new Chlodnik());
        listaPrzepisow.add(new Churros());
        listaPrzepisow.add(new CroqueMadame());
        listaPrzepisow.add(new GulaszWolowy());
        listaPrzepisow.add(new Karpatka());
        listaPrzepisow.add(new KremDyniowy());
        listaPrzepisow.add(new KurczakWZiolach());
        listaPrzepisow.add(new Lasagne());
        listaPrzepisow.add(new MakaronZPesto());
        listaPrzepisow.add(new Nalesniki());
        listaPrzepisow.add(new PierogiRuskie());
        listaPrzepisow.add(new PlackiZiemniaczane());
        listaPrzepisow.add(new PureeWarzywne());
        listaPrzepisow.add(new SorbetTruskawkowy());
        listaPrzepisow.add(new Spaghetti());
        listaPrzepisow.add(new Szarlotka());
        listaPrzepisow.add(new TartaJablkowa());
        listaPrzepisow.add(new Tatar());
        listaPrzepisow.add(new ZupaMinestrone());
        listaPrzepisow.add(new Zurek());
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
