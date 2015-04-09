//charlie rodriguez


import java.awt.*;
import java.applet.*;

public class monkey extends Applet{
	
	public void paint(Graphics g)
	{
		drawHabitat(g);
		drawAnimal(g);
		
	}

	private void drawAnimal(Graphics g)
	{
		g.setColor(new Color (128,64,0));
		g.fillOval(500, 100, 300, 200);
		g.setColor(Color.white);
		g.fillOval(515, 70, 70, 70);
		g.fillOval(655, 70, 70, 70);
		
	}
	
	private void drawHabitat(Graphics g)
	{
		g.setColor(new Color (80,180,210));
		g.fillRect(0, 0, 3000, 500);
		g.setColor(Color.green);
		g.fillRect(0, 400, 3000, 500);
		
	}
}
