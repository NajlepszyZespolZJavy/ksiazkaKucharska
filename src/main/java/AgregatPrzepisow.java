import java.util.ArrayList;
import java.util.List;

public class AgregatPrzepisow {

    private List <Przepis> listaPrzepisow = new ArrayList<Przepis>();

    public AgregatPrzepisow() {
        listaPrzepisow.add(new PrzykladowyPrzepis());
        listaPrzepisow.add(new PrzykladowyPrzepis2());
    }

    public List <Przepis> getListaPrzepisow() {
        return listaPrzepisow;
    }
}