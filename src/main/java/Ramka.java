import javax.swing.JFrame;

public class Ramka extends JFrame {

    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;

    public Ramka() {
        setBounds(0,0, WIDTH, HEIGHT);
        setTitle("Książka Kucharska");
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        Panel panel = new Panel();
//        add(panel);
        setVisible(true);
    }
}
