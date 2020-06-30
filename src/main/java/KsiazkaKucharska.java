import java.awt.EventQueue;

/**
 * Główna klasa łącząca w całość pozostałe klasy występujące w programie
 */
public class KsiazkaKucharska {

    /**
     * Główna metoda od której zaczyna się praca programu. Aplikacja tworzy Controller, oraz
     * View i Model które mu wysyła.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new KsiazkaKucharskaController(new KsiazkaKucharskaView(), new KsiazkaKucharskaModel());
            }
        });
    }
}
