import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class Panel extends JPanel {

    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;

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
        JButton strzalkaLewo = new JButton();
        strzalkaLewo.setBounds(25, 650, 100, 100);
//        ImageIcon strzalkaLewoGrafika = new ImageIcon("src\\main\\java\\grafiki\\strzalka_lewo.png");
//        strzalkaLewo.setIcon(strzalkaLewoGrafika);
        strzalkaLewo.setContentAreaFilled(true);
        tlo.add(strzalkaLewo);

        // strzałka w prawo
        JButton strzalkaPrawo = new JButton();
        strzalkaPrawo.setBounds(1075, 650, 100, 100);
//        ImageIcon strzalkaPrawoGrafika = new ImageIcon("src\\main\\java\\grafiki\\strzalka_prawo.png");
//        strzalkaPrawo.setIcon(strzalkaPrawoGrafika);
        strzalkaPrawo.setContentAreaFilled(true);
        tlo.add(strzalkaPrawo);

        add(tlo);
        setVisible(true);
    }
}
