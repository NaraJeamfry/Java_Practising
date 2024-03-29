import javax.swing.*;

import org.w3c.dom.Element;

import java.awt.*;
import java.util.*;

public class GamePanel extends JPanel 
{

	public static void main(String[] args)
	{
		JFrame parentWindow = new JFrame("The game");
		
		parentWindow.getContentPane().add(new GamePanel());
		
		parentWindow.setSize(800, 600);
		parentWindow.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		parentWindow.setVisible(true);
	}
	
	private Collection<Element> elements = new ArrayList<Element>();
	
	public GamePanel()
	{
		elements.add(new Rectangle(10, 10, 32, 32));
		elements.add(new Rectangle(20, 20, 32, 32));
	}
	
	public void paint(Graphics g)
	{
		Iterator iterator = elements.iterator();
		
		while(iterator.hasNext())
			((Element) iterator.next()).draw(g);
	}
	
}
