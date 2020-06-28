import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Obsługuje wejście od użytkownika. Kontroluje komunikację View z Modelem pozwalając by
 * każde było niezależną klasą.
 */
public class KsiazkaKucharskaController implements ActionListener, KeyListener {

    private KsiazkaKucharskaView theView;
    private KsiazkaKucharskaModel theModel;

    private Przepis aktualnyPrzepis;

    /**
     * Konfiguruje controller: wyświetla pierwszy przepis, dodaje słuchacze komponentów.
     */
    public KsiazkaKucharskaController(KsiazkaKucharskaView theView, KsiazkaKucharskaModel theModel) {

        this.theView = theView;
        this.theModel = theModel;

        // wyświetla dane pierwszego przepisu
        this.aktualnyPrzepis = this.theModel.getAktualnyPrzepis();
        this.theView.wyswietlPrzepis(this.aktualnyPrzepis);

        this.theView.addListeners(this);
    }

    /**
     * Wywoływana gdy nastąpi zdarzenie zwiazane z myszą. Pobiera źródło zdarzenia i
     * porównuje z referencjami przycisków. Jeśli któryś z warunków został spełniony to
     * podejmuje odpowiednią akcje.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == theView.getPrzyciskLewo()) {
            System.out.println("Naciśnięto lewy przycisk!");
            theModel.zmienNaPoprzedni();
            aktualnyPrzepis = theModel.getAktualnyPrzepis();
            theView.wyswietlPrzepis(aktualnyPrzepis);
        }

        else if (source == theView.getPrzyciskPrawo()) {
            System.out.println("Naciśnięto prawy przycisk!");
            theModel.zmienNaNastepny();
            aktualnyPrzepis = theModel.getAktualnyPrzepis();
            theView.wyswietlPrzepis(aktualnyPrzepis);
        }
    }

    /**
     * Wywoływana gdy puścimy wciśnięty uprzednio przycisk na klawiaturze. Sprawdza czy
     * naciśnięty przycisk jest strzałką w lewo lub prawo. Jeśli tak to podejmuje
     * odpowiednią akcje.
     */
    @Override
    public void keyReleased(KeyEvent evt) {
        int key = evt.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            System.out.println("Naciśnięto strzałkę w lewo!");
            theModel.zmienNaPoprzedni();
            aktualnyPrzepis = theModel.getAktualnyPrzepis();
            theView.wyswietlPrzepis(aktualnyPrzepis);
        }
        else if (key == KeyEvent.VK_RIGHT) {
            System.out.println("Naciśnięto strzałkę w prawo!");
            theModel.zmienNaNastepny();
            aktualnyPrzepis = theModel.getAktualnyPrzepis();
            theView.wyswietlPrzepis(aktualnyPrzepis);
        }
        else if (key == KeyEvent.VK_ENTER) {
            System.out.println("Naciśnięto ENTER!");
            System.out.println("Wpisano: " + theView.getPoleWyszukiwania());

            theModel.znajdzPrzepis(theView.getPoleWyszukiwania());
            aktualnyPrzepis = theModel.getAktualnyPrzepis();
            theView.wyswietlPrzepis(aktualnyPrzepis);
        }
    }

    @Override
    public void keyPressed(KeyEvent evt) {}

    @Override
    public void keyTyped(KeyEvent evt) {}
}
