import java.util.List;

public class IteratorPrzepisow {

    private static int indeks = 0;
    private List <Przepis> listaPrzepisow;

    public IteratorPrzepisow(List <Przepis> lista) {
        listaPrzepisow = lista;
    }

    public Przepis aktualnyPrzepis() {
        return listaPrzepisow.get(indeks);
    }

    public void poprzedni() {
        indeks--;
        if(indeks < 0)
            indeks = listaPrzepisow.size() - 1;
    }

    public void nastepny() {
        indeks++;
        if(indeks > listaPrzepisow.size() - 1)
            indeks = 0;
    }
}