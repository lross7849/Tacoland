import java.awt.*;
import java.applet.*;

public class dragon extends Applet{
	
	public void paint(Graphics g)
	{
		drawAnimal(g);
		drawHabitat(g);
	}

	private void drawAnimal(Graphics g)
	{
		g.setColor(Color.green);
		g.fillRect(100, 100, 100, 100);
	}
	
	private void drawHabitat(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawRect(100, 100, 100, 100);
		
	}
}
