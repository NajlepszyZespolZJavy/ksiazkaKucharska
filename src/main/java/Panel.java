import javax.swing.JPanel;
import javax.swing.JLabel;
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

        add(tlo);
        setVisible(true);
    }
}
