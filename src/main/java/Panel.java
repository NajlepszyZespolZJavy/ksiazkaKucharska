import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
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
