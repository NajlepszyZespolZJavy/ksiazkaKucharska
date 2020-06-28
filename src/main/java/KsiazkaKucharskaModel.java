/**
 * Przechowuje wszystkie dane i funkcjonalności.
 */
public class KsiazkaKucharskaModel {

    private IteratorPrzepisow iterator;

    /**
     * Tworzy agregat przepisów i iterator po nim.
     */
    public KsiazkaKucharskaModel() {

        // stworzenie agregatu na Przepisy oraz jego iteratora
        AgregatPrzepisow agregat = new AgregatPrzepisow();
        iterator = agregat.iterator();
    }

    /**
     * Szuka w liście przepisu którego nazwa zawiera podany ciąg tekstowy
     * jeśli go znajdzie to ustawia na niego iterator.
     *
     * @param wyszukanie: łańcuch tekstowy z szukaną nazwą przepisu
     */
    public void znajdzPrzepis(String wyszukanie) {
        iterator.szukajPrzepisu(wyszukanie);
    }

    /**
     * Zwraca obiekt będący aktualnym przepisem.
     */
    public Przepis getAktualnyPrzepis() {
        return iterator.aktualnyPrzepis();
    }

    /**
     * Ustawia iterator na poprzedni przepis.
     */
    public void zmienNaPoprzedni() {
        iterator.poprzedni();
    }

    /**
     * Ustawia iterator na następny przepis.
     */
    public void zmienNaNastepny() {
        iterator.nastepny();
    }
}
