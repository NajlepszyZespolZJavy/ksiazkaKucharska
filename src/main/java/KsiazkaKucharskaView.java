import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/**
 * Odpowiada za wyświetlanie interfejsu i jego aktualizację.
 */
public class KsiazkaKucharskaView extends JFrame {

    /**
     * Wymiary ramki i panelu.
     */
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;

    private JButton przyciskLewo;
    private JButton przyciskPrawo;

    private JTextField poleWyszukiwania;

    private JLabel tytul;
    private JLabel grafika;
    private JLabel czasWykonania;
    private JLabel trudnoscWykonania;
    private JLabel skladniki;
    private JLabel instrukcje;

    /**
     * Tworzy ramkę o podanej rozdzielczości, ustawia jej nagłówek, wyłącza możliwość
     * zmiany rozmiaru okna, wyłącza menadżera układów, ustawia działanie krzyżyka w oknie
     * (wyłącza program), tworzy nowy panel, dodaje do panelu komponenty, panel dodaje
     * do ramki i wyświetla zmiany.
     */
    public KsiazkaKucharskaView() {
        // konfiguracja Ramki
        setBounds(0, 0, WIDTH, HEIGHT);
        setTitle("Książka Kucharska");
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        // konfiguracja Panelu
        panel.setBounds(0, 0, WIDTH, HEIGHT);
        JLabel tlo = new JLabel();
        tlo.setBounds(0, 0, WIDTH, HEIGHT);
        tlo.setIcon(new ImageIcon("src/main/java/grafiki/tlo.jpg"));
        panel.setLayout(null);

        // strzałka w lewo
        przyciskLewo = new JButton();
        przyciskLewo.setBounds(25, 650, 100, 100);
        przyciskLewo.setIcon(new ImageIcon("src/main/java/grafiki/lewo.png"));
        przyciskLewo.setContentAreaFilled(true);
        tlo.add(przyciskLewo);

        // strzałka w prawo
        przyciskPrawo = new JButton();
        przyciskPrawo.setBounds(1075, 650, 100, 100);
        przyciskPrawo.setIcon(new ImageIcon("src/main/java/grafiki/prawo.png"));
        przyciskPrawo.setContentAreaFilled(true);
        tlo.add(przyciskPrawo);

        // pole wyszukiwania przepisów
        poleWyszukiwania = new JTextField("Wyszukaj przepis... ");
        poleWyszukiwania.setBounds(400, 700, 400, 40);
        tlo.add(poleWyszukiwania);

        // tytuł przepisu
        tytul = new JLabel();
        tytul.setBounds(0, 0, 600, 50);
        tytul.setFont(new Font(Font.SERIF, Font.BOLD, 30));
        tytul.setHorizontalAlignment(SwingConstants.CENTER);
        tlo.add(tytul);

        // grafika przepisu
        grafika = new JLabel();
        grafika.setBounds(5, 50, 580, 200);
        tlo.add(grafika);

        // czas wykonania
        czasWykonania = new JLabel();
        czasWykonania.setBounds(10, 260, 580, 40);
        czasWykonania.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
        czasWykonania.setVerticalAlignment(SwingConstants.TOP);
        tlo.add(czasWykonania);

        // trudność wykonania
        trudnoscWykonania = new JLabel();
        trudnoscWykonania.setBounds(10, 300, 580, 40);
        trudnoscWykonania.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
        trudnoscWykonania.setVerticalAlignment(SwingConstants.TOP);
        tlo.add(trudnoscWykonania);

        // składniki
        skladniki = new JLabel();
        skladniki.setBounds(10, 350, 580, 550);
        skladniki.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
        skladniki.setVerticalAlignment(SwingConstants.TOP);
        tlo.add(skladniki);

        // instrukcje
        instrukcje = new JLabel();
        instrukcje.setBounds(610, 10, 600, 800);
        instrukcje.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
        instrukcje.setVerticalAlignment(SwingConstants.TOP);
        tlo.add(instrukcje);

        panel.add(tlo);

        this.add(panel);
        setVisible(true);
    }

    /**
     * Wyświetla w okienku informację o przesłanym przepisie i jego grafikę.
     *
     * @param aktualnyPrzepis: obiekt klasy Przepis którego dane zostaną wyświetlone na ekranie.
     */
    public void wyswietlPrzepis(Przepis aktualnyPrzepis) {

        tytul.setText(aktualnyPrzepis.getTytul());
        grafika.setIcon(new ImageIcon(aktualnyPrzepis.getSciezkaGrafiki()));
        czasWykonania.setText(aktualnyPrzepis.getCzasWykonania());
        trudnoscWykonania.setText(aktualnyPrzepis.getTrudnoscWykonania());
        skladniki.setText(aktualnyPrzepis.getSkladniki());
        instrukcje.setText(aktualnyPrzepis.getInstrukcje());
    }

    /**
     * Dodaje do komponentów przesłany słuchacz. Odpowiednie jego metody
     * zostaną wywołane gdy nastąpi zdarzenie dla któregoś z komponentów.
     *
     * @param listener: słuchacz komponentów
     */
    public void addListeners(KsiazkaKucharskaController listener) {
        przyciskLewo.addActionListener(listener);
        przyciskLewo.addKeyListener(listener);
        przyciskPrawo.addActionListener(listener);
        przyciskPrawo.addKeyListener(listener);
        poleWyszukiwania.addKeyListener(listener);
        poleWyszukiwania.addFocusListener(listener);
    }

    /**
     * Zwraca komponent przycisku w lewo.
     */
    public JButton getPrzyciskLewo() {
        return this.przyciskLewo;
    }

    /**
     * Zwraca komponent przycisku w prawo.
     */
    public JButton getPrzyciskPrawo() {
        return this.przyciskPrawo;
    }

    /**
     * Zwraca aktualną zawartość pola tekstowego wyszukiwarki.
     */
    public String getPoleWyszukiwania() {
        return poleWyszukiwania.getText();
    }

    /**
     * Czyści zawartość pola tekstowego wyszukiwarki.
     */
    public void wyczyscPoleWyszukiwania() {
            poleWyszukiwania.setText("");
    }
}
