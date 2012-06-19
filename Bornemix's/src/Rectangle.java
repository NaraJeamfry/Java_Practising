import java.awt.*;

public class Rectangle extends Element {

	public Rectangle(int x, int y, int width, int height) 
	{
		super(x, y, width, height);
	}
	
	void draw(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawRect(getX(), getY(), getWidth(), getHeight());
	}
	
}
