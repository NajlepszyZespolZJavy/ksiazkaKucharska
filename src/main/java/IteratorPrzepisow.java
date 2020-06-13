import java.util.List;

/**
 * Klasa która pozwala iterować po otrzymanej liście.
 */
public class IteratorPrzepisow {

    private static int indeks = 0;
    private List <Przepis> listaPrzepisow;

    public IteratorPrzepisow(List <Przepis> lista) {
        listaPrzepisow = lista;
    }

    /**
     * Zwraca aktualny element listy.
     */
    public Przepis aktualnyPrzepis() {
        return listaPrzepisow.get(indeks);
    }

    /**
     * Przestawia iterator na poprzedni element listy.
     */
    public void poprzedni() {
        indeks--;
        if(indeks < 0)
            indeks = listaPrzepisow.size() - 1;
    }

    /**
     * Przestawia iterator na kolejny element listy.
     */
    public void nastepny() {
        indeks++;
        if(indeks > listaPrzepisow.size() - 1)
            indeks = 0;
    }
}
