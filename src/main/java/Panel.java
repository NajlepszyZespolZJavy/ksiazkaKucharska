import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Panel extends JPanel implements ActionListener, KeyListener {

    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;

    private JButton przyciskLewo;
    private JButton przyciskPrawo;

    public Panel() {

        // stworzenie panelu
        setBounds(0, 0, WIDTH, HEIGHT);
        JLabel tlo = new JLabel();
        tlo.setBounds(0, 0, WIDTH, HEIGHT);
        setBackground(Color.LIGHT_GRAY);
//        ImageIcon tlo_grafika = new ImageIcon("src\\main\\java\\grafiki\\tlo.jpg");
//        tlo.setIcon(tlo_grafika);
        setLayout(null);

        // strzałka w lewo
        przyciskLewo = new JButton();
        przyciskLewo.setBounds(25, 650, 100, 100);
//        ImageIcon przyciskLewoGrafika = new ImageIcon("src\\main\\java\\grafiki\\przycisk_lewo.png");
//        przyciskLewo.setIcon(przyciskLewoGrafika);
        przyciskLewo.setContentAreaFilled(true);
        przyciskLewo.addActionListener(this);
        przyciskLewo.addKeyListener(this);
        tlo.add(przyciskLewo);

        // strzałka w prawo
        przyciskPrawo = new JButton();
        przyciskPrawo.setBounds(1075, 650, 100, 100);
//        ImageIcon przyciskPrawoGrafika = new ImageIcon("src\\main\\java\\grafiki\\przycisk_prawo.png");
//        przyciskPrawo.setIcon(przyciskPrawoGrafika);
        przyciskPrawo.setContentAreaFilled(true);
        przyciskPrawo.addActionListener(this);
        przyciskPrawo.addKeyListener(this);
        tlo.add(przyciskPrawo);

        PrzykladowyPrzepis aktualnyPrzepis = new PrzykladowyPrzepis();

        // tytuł przepisu
        JLabel tytul = new JLabel();
        tytul.setBounds(0,0,600,50);
        tytul.setText(aktualnyPrzepis.getTytul());
        tytul.setFont(new Font(Font.SERIF, Font.BOLD,30));
        tytul.setHorizontalAlignment(SwingConstants.CENTER);
        tytul.setText(aktualnyPrzepis.getTytul());
        tlo.add(tytul);

        // grafika przepisu
        JLabel grafika = new JLabel();
        grafika.setBounds(5, 50, 600, 200);
        grafika.setIcon(new ImageIcon(aktualnyPrzepis.getSciezkaGrafiki()));
        tlo.add(grafika);

        // czas wykonania
        JLabel czasWykonania = new JLabel();
        czasWykonania.setBounds(10,260,600,40);
        czasWykonania.setFont(new Font(Font.SERIF, Font.PLAIN,20));
        czasWykonania.setVerticalAlignment(SwingConstants.TOP);
        czasWykonania.setText(aktualnyPrzepis.getCzasWykonania());
        tlo.add(czasWykonania);

        // trudność wykonania
        JLabel trudnoscWykonania = new JLabel();
        trudnoscWykonania.setBounds(10,300,600,40);
        trudnoscWykonania.setFont(new Font(Font.SERIF, Font.PLAIN,20));
        trudnoscWykonania.setVerticalAlignment(SwingConstants.TOP);
        trudnoscWykonania.setText(aktualnyPrzepis.getTrudnoscWykonania());
        tlo.add(trudnoscWykonania);

        // składniki
        JLabel skladniki = new JLabel();
        skladniki.setBounds(10,350,600,550);
        skladniki.setFont(new Font(Font.SERIF, Font.PLAIN,20));
        skladniki.setVerticalAlignment(SwingConstants.TOP);
        skladniki.setText(aktualnyPrzepis.getSkladniki());
        tlo.add(skladniki);

        // instrukcje
        JLabel instrukcje = new JLabel();
        instrukcje.setBounds(610,10,600,800);
        instrukcje.setFont(new Font(Font.SERIF, Font.PLAIN,20));
        instrukcje.setVerticalAlignment(SwingConstants.TOP);
        instrukcje.setText(aktualnyPrzepis.getInstrukcje());
        tlo.add(instrukcje);

        add(tlo);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == przyciskLewo) {
            System.out.println("Naciśnięto lewy przycisk!");
        }

        else if (source == przyciskPrawo) {
            System.out.println("Naciśnięto prawy przycisk!");
        }
    }

    @Override
    public void keyReleased(KeyEvent evt) {
        int key = evt.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            System.out.println("Naciśnięto strzałkę w lewo!");
        }
        else if (key == KeyEvent.VK_RIGHT) {
            System.out.println("Naciśnięto strzałkę w prawo!");
        }
    }

    @Override
    public void keyPressed(KeyEvent evt) {}

    @Override
    public void keyTyped(KeyEvent evt) {}
}
