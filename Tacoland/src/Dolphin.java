/*Computer Science Pre-AP
8th period
David Castenada Tamez
*/

import java.awt.*;
import java.applet.*;

public class Dolphin extends Applet{
	
	public void paint(Graphics g)
	{
			drawHabitat(g);
			drawAnimal(g);
	}

	
	private void drawHabitat(Graphics g)
	{
		g.setColor (Color.CYAN);
		g.fillRect(0,0,5000,5000);

	}
	
	private void drawAnimal(Graphics g)
	{
		g.setColor (Color.gray);
		g.fillOval(400, 400, 300, 100);
		g.setColor (Color.gray);
		g.fillOval(500, 370, 50, 200);
		g.setColor (Color.gray);
		g.fillOval(550, 440, 200, 50);
		g.setColor (Color.black);
		g.fillOval(650, 440, 10, 10);
		g.setColor (Color.gray);
		g.fillOval(300, 430, 200, 50);
		g.setColor (Color.gray);
		g.fillOval(300, 405, 50, 100);
		g.setColor (Color.black);
		g.fillOval(672, 463, 80, 3);
		g.setColor (Color.white);
		g.fillOval(900, 500  , 50, 50);
		g.setColor (Color.white);
		g.fillOval(900, 500  , 50, 50);
		g.setColor (Color.white);
		g.fillOval(1100, 500 , 30, 30);
		g.setColor (Color.white);
		g.fillOval(1000, 400 , 70, 70);
		g.setColor (Color.white);
		g.fillOval(1100, 300 , 20, 20);
		g.setColor (Color.white);
		g.fillOval(950, 350 , 50, 50);
		g.setColor (Color.white);
		g.fillOval(900, 250 , 60, 60);
	
		
		
	}
	
}




