import javax.swing.JFrame;

/**
 * Klasa tworzy interfejs graficzny. Najpierw tworzy i ustawia Ramkę, następnie tworzy obiekt Panel.
 */
public class Ramka extends JFrame {
    /**
     * Wymiary ramki (okna programu).
     */
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;
    /**
     * Konstruktor domyślny. Tworzy ramkę o podanej rozdzielczości, ustawia jej nagłówek, wyłącza możliwość
     * zmiany rozmiaru okna, wyłącza menadżera układów, ustawia działanie krzyżyka w oknie (wyłącza program),
     * tworzy nowy panel, dodaje go do ramki i wyświetla zmiany.
     */
    public Ramka() {
        setBounds(0,0, WIDTH, HEIGHT);
        setTitle("Książka Kucharska");
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();
        add(panel);
        setVisible(true);
    }
}
