import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.util.Random;

public class FirstExample extends JPanel {

	
	
    public void paintComponent(Graphics g) {
       super.paintComponent(g);
       
       Graphics2D g2d = (Graphics2D) g;
       g2d.setColor(Color.blue);
       
       Dimension size = getSize();
       Insets insets = getInsets();
       
       int w = size.width - insets.left - insets.right;
       int h = size.height - insets.bottom - insets.top;
       
       Random r = new Random();
       
       for(int i=0; i<1000; i++)
       {
    	   int x = Math.abs(r.nextInt()) % w;
    	   int y = Math.abs(r.nextInt()) % h;
    	   g2d.drawOval(x, y, 2, 2);
       }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("The game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new FirstExample());
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}