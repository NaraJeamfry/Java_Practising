import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FirstExample extends JFrame {

    public FirstExample() {
       setTitle("Simple example");
       setSize(300, 200);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FirstExample ex = new FirstExample();
                ex.setVisible(true);
            }
        });
    }
}