
import java.applet.Applet;
import java.awt.*;


public class Whale extends Applet{

	public void paint(Graphics g)
	{
				g.setColor(Color.CYAN);
				g.fillRect(0, 0, 1700, 1700);
				//water
				g.setColor(new Color (7, 68, 226));
				g.fillRect(0, 0, 1700, 1700);
				//whale
				g.setColor(new Color (109, 120, 169));
				g.fillOval(600, 200, 600, 375);
				//plants
				g.setColor(new Color (17, 193, 56));
				g.fillRect(150, 540, 20, 250);
				g.fillRect(250, 540, 20, 250);
				g.fillRect(400, 540, 20, 250);
				g.fillRect(440, 540, 20, 250);
				g.fillRect(650, 540, 20, 250);
				g.fillRect(950, 540, 20, 250);
				g.fillRect(1010, 540, 20, 250);
				g.fillRect(1130, 540, 20, 250);
				g.fillRect(1450, 540, 20, 250);
				//tail
				g.setColor(new Color (109, 120, 169));
				g.fillRect(470, 275, 200, 225);
				//eye
				g.setColor(new Color (255, 255, 255));
				g.fillOval(1050, 275, 50, 50);
				g.setColor(new Color (8, 8, 8));
				g.fillOval(1055, 285, 25, 25);
				//mouth
				g.setColor(new Color (0, 0, 0));
				g.fillRect(1100, 400, 100, 5);
				
				
				
	}


	{
		
		
		
		
	}
}