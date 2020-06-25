import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * Klasa odpowiada za panel. Pokrywa się on z rozmiarem ramki. Domyślnie wyświetla pierwszy
 * dostępny przepis. Panel jest słuchaczem: będzie powiadamiany za każdym razem gdy zostanie
 * wciśnięty jeden z przycisków za pomocą myszy lub użyta zostanie klawiatura; wywoła wtedy
 * odpowiednio metodę actionPerformed() (dla myszy) lub keyReleased() (dla klawiatury).
 * Metody te pozwalają na zmianę przepisu w zależności od tego który z przycisków lub która
 * ze strzałek została naciśnięta.
 */
public class Panel extends JPanel implements ActionListener, KeyListener {

    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;

    private JButton przyciskLewo;
    private JButton przyciskPrawo;

    private Przepis aktualnyPrzepis;
    private IteratorPrzepisow iterator;

    private JTextField poleWyszukiwania;

    private JLabel tytul;
    private JLabel grafika;
    private JLabel czasWykonania;
    private JLabel trudnoscWykonania;
    private JLabel skladniki;
    private JLabel instrukcje;

    /**
     * Konstruktor domyślny: tworzy tło, oraz niezbędnę komponenty i wczytuje dane pierwszego przepisu. Przyciski
     * pozwalają na zmianę aktualnie wyświetlanego przepisu. Ponadto zmiana wyświetlanego przepisu możliwa jest
     * również przy użyciu strzałek na klawiaturze.
     */
    public Panel() {

        // stworzenie panelu
        setBounds(0, 0, WIDTH, HEIGHT);
        JLabel tlo = new JLabel();
        tlo.setBounds(0, 0, WIDTH, HEIGHT);
        setBackground(Color.LIGHT_GRAY);
        tlo.setIcon(new ImageIcon("src\\main\\java\\grafiki\\tlo.jpg"));
        setLayout(null);

        // strzałka w lewo
        przyciskLewo = new JButton();
        przyciskLewo.setBounds(25, 650, 100, 100);
        przyciskLewo.setIcon(new ImageIcon("src\\main\\java\\grafiki\\lewo.png"));
        przyciskLewo.setContentAreaFilled(true);
        przyciskLewo.addActionListener(this);
        przyciskLewo.addKeyListener(this);
        tlo.add(przyciskLewo);

        // strzałka w prawo
        przyciskPrawo = new JButton();
        przyciskPrawo.setBounds(1075, 650, 100, 100);
        przyciskPrawo.setIcon(new ImageIcon("src\\main\\java\\grafiki\\prawo.png"));
        przyciskPrawo.setContentAreaFilled(true);
        przyciskPrawo.addActionListener(this);
        przyciskPrawo.addKeyListener(this);
        tlo.add(przyciskPrawo);

        AgregatPrzepisow agregat = new AgregatPrzepisow();
        iterator = agregat.iterator();
        aktualnyPrzepis = iterator.aktualnyPrzepis();

        //pole wyszukiwania przepisów
        poleWyszukiwania = new JTextField("Przepis którego szukam to: ");
        poleWyszukiwania.setBounds(400, 700, 400,40);
        poleWyszukiwania.addKeyListener(this);
        tlo.add(poleWyszukiwania);

        // tytuł przepisu
        tytul = new JLabel();
        tytul.setBounds(0,0,600,50);
        tytul.setText(aktualnyPrzepis.getTytul());
        tytul.setFont(new Font(Font.SERIF, Font.BOLD,30));
        tytul.setHorizontalAlignment(SwingConstants.CENTER);
        tytul.setText(aktualnyPrzepis.getTytul());
        tlo.add(tytul);

        // grafika przepisu
        grafika = new JLabel();
        grafika.setBounds(5, 50, 600, 200);
        grafika.setIcon(new ImageIcon(aktualnyPrzepis.getSciezkaGrafiki()));
        tlo.add(grafika);

        // czas wykonania
        czasWykonania = new JLabel();
        czasWykonania.setBounds(10,260,600,40);
        czasWykonania.setFont(new Font(Font.SERIF, Font.PLAIN,20));
        czasWykonania.setVerticalAlignment(SwingConstants.TOP);
        czasWykonania.setText(aktualnyPrzepis.getCzasWykonania());
        tlo.add(czasWykonania);

        // trudność wykonania
        trudnoscWykonania = new JLabel();
        trudnoscWykonania.setBounds(10,300,600,40);
        trudnoscWykonania.setFont(new Font(Font.SERIF, Font.PLAIN,20));
        trudnoscWykonania.setVerticalAlignment(SwingConstants.TOP);
        trudnoscWykonania.setText(aktualnyPrzepis.getTrudnoscWykonania());
        tlo.add(trudnoscWykonania);

        // składniki
        skladniki = new JLabel();
        skladniki.setBounds(10,350,600,550);
        skladniki.setFont(new Font(Font.SERIF, Font.PLAIN,20));
        skladniki.setVerticalAlignment(SwingConstants.TOP);
        skladniki.setText(aktualnyPrzepis.getSkladniki());
        tlo.add(skladniki);

        // instrukcje
        instrukcje = new JLabel();
        instrukcje.setBounds(610,10,600,800);
        instrukcje.setFont(new Font(Font.SERIF, Font.PLAIN,20));
        instrukcje.setVerticalAlignment(SwingConstants.TOP);
        instrukcje.setText(aktualnyPrzepis.getInstrukcje());
        tlo.add(instrukcje);

        add(tlo);
        setVisible(true);
    }

    /**
     * Zmienia aktualnie ustawiony Przepis na poprzedni w Agregacie przy pomocy Iteratora.
     */
    private void poprzedniPrzepis() {

        // aktualizuje bieżący przepis
        iterator.poprzedni();
        aktualnyPrzepis = iterator.aktualnyPrzepis();

        // aktualizuje zawartość komponentów Panelu
        tytul.setText(aktualnyPrzepis.getTytul());
        grafika.setText(aktualnyPrzepis.getSciezkaGrafiki());
        czasWykonania.setText(aktualnyPrzepis.getCzasWykonania());
        trudnoscWykonania.setText(aktualnyPrzepis.getTrudnoscWykonania());
        skladniki.setText(aktualnyPrzepis.getSkladniki());
        instrukcje.setText(aktualnyPrzepis.getInstrukcje());
    }

    /**
     * Zmienia aktualnie ustawiony Przepis na następny w Agregacie przy pomocy Iteratora.
     */
    private void nastepnyPrzepis() {

        // aktualizuje bieżący przepis
        iterator.nastepny();
        aktualnyPrzepis = iterator.aktualnyPrzepis();

        // aktualizuje zawartość komponentów Panelu
        tytul.setText(aktualnyPrzepis.getTytul());
        grafika.setText(aktualnyPrzepis.getSciezkaGrafiki());
        czasWykonania.setText(aktualnyPrzepis.getCzasWykonania());
        trudnoscWykonania.setText(aktualnyPrzepis.getTrudnoscWykonania());
        skladniki.setText(aktualnyPrzepis.getSkladniki());
        instrukcje.setText(aktualnyPrzepis.getInstrukcje());
    }

    /**
     * Wywoływana gdy nastąpi zdarzeneie zwiazane z myszą. Pobiera źródło zdarzenia i
     * porównuje z referencjami przycisków. Jeśli któryś z warunków został spełniony to
     * podejmuje odpowiednią akcje.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == przyciskLewo) {
            System.out.println("Naciśnięto lewy przycisk!");
            poprzedniPrzepis();
        }

        else if (source == przyciskPrawo) {
            System.out.println("Naciśnięto prawy przycisk!");
            nastepnyPrzepis();
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
            poprzedniPrzepis();
        }
        else if (key == KeyEvent.VK_RIGHT) {
            System.out.println("Naciśnięto strzałkę w prawo!");
            nastepnyPrzepis();
        }
        else if (key == KeyEvent.VK_ENTER) {
            System.out.println("Naciśnięto ENTER!");
            String trescWyszukania = poleWyszukiwania.getText();
            System.out.println("Wpisano: " + trescWyszukania);
        }
    }

    @Override
    public void keyPressed(KeyEvent evt) {}

    @Override
    public void keyTyped(KeyEvent evt) {}
}
