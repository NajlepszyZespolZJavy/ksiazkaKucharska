import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Obsługuje wejście od użytkownika. Kontroluje komunikację View z Modelem pozwalając by
 * każde było niezależną klasą.
 */
public class KsiazkaKucharskaController implements ActionListener, KeyListener, FocusListener {

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
        this.theView.getPrzyciskLewo().requestFocus(); // żeby wyszukiwarka nie dostała domyślnie focusu
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
            theModel.zmienNaPoprzedni();
            aktualnyPrzepis = theModel.getAktualnyPrzepis();
            theView.wyswietlPrzepis(aktualnyPrzepis);
        }

        else if (source == theView.getPrzyciskPrawo()) {
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
        Object source = evt.getSource();

        if (source == theView.getPrzyciskLewo() || source == theView.getPrzyciskPrawo()) {
            if (key == KeyEvent.VK_LEFT) {
                theModel.zmienNaPoprzedni();
                aktualnyPrzepis = theModel.getAktualnyPrzepis();
                theView.wyswietlPrzepis(aktualnyPrzepis);
            }
            else if (key == KeyEvent.VK_RIGHT) {
                theModel.zmienNaNastepny();
                aktualnyPrzepis = theModel.getAktualnyPrzepis();
                theView.wyswietlPrzepis(aktualnyPrzepis);
            }
        }
        if (key == KeyEvent.VK_ENTER) {
            theModel.znajdzPrzepis(theView.getPoleWyszukiwania());
            aktualnyPrzepis = theModel.getAktualnyPrzepis();
            theView.wyswietlPrzepis(aktualnyPrzepis);
        }
    }

    @Override
    public void keyPressed(KeyEvent evt) {}

    @Override
    public void keyTyped(KeyEvent evt) {}

    /**
     * Wywoływana gdy komponent zyska focus (np. zostanie zaznaczony myszą).
     * Czyści w rezultacie zawartość pola tekstowego wyszukiwarki.
     */
    @Override
    public void focusGained(FocusEvent e) {
        theView.wyczyscPoleWyszukiwania();
    }

    @Override
    public void focusLost(FocusEvent e) {}
}
