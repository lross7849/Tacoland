import java.awt.*;
import java.applet.*;

public class Elephant extends Applet
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g)
	{
		drawHabitat(g);
		drawAnimal(g);
		
	}
	
	
	private void drawHabitat(Graphics g)
	{
		//sky
		g.setColor(new Color(65, 185, 250));
		g.drawRect(0, 0, 1600, 1600);
		g.fillRect(0, 0, 1600, 1600);
		
		//sun
		g.setColor(new Color(230, 220, 0));
		g.drawOval(20, 20, 150, 150);
		g.fillOval(20, 20, 150, 150);
		
		//grass
		g.setColor(new Color(128, 128, 64));
		g.fillRect(0, 600, 1600, 350);
		
		//clouds
		g.setColor(new Color(255, 255, 255));
		// top right
		g.drawOval(300, 20, 150, 50); g.fillOval(300, 20, 150, 50);
		g.drawOval(400, 20, 150, 50); g.fillOval(400, 20, 150, 50);
		g.drawOval(500, 20, 150, 50); g.fillOval(500, 20, 150, 50);
		g.drawOval(600, 20, 150, 50); g.fillOval(600, 20, 150, 50);
		g.drawOval(700, 20, 150, 50); g.fillOval(700, 20, 150, 50);
		// top left
		g.drawOval(1000, 20, 150, 50); g.fillOval(1000, 20, 150, 50);
		g.drawOval(1100, 20, 150, 50); g.fillOval(1100, 20, 150, 50);
		g.drawOval(1200, 20, 150, 50); g.fillOval(1200, 20, 150, 50);
		//bottom right
		g.drawOval(250, 40, 150, 50); g.fillOval(250, 40, 150, 50);
		g.drawOval(350, 40, 150, 50); g.fillOval(350, 40, 150, 50);
		g.drawOval(450, 40, 150, 50); g.fillOval(450, 40, 150, 50);
		g.drawOval(550, 40, 150, 50); g.fillOval(550, 40, 150, 50);
		g.drawOval(650, 40, 150, 50); g.fillOval(650, 40, 150, 50);
		g.drawOval(750, 40, 150, 50); g.fillOval(750, 40, 150, 50);
		//bottom left
		g.drawOval(950, 40, 150, 50); g.fillOval(950, 40, 150, 50);
		g.drawOval(1050, 40, 150, 50); g.fillOval(1050, 40, 150, 50);
		g.drawOval(1150, 40, 150, 50); g.fillOval(1150, 40, 150, 50);
		g.drawOval(1250, 40, 150, 50); g.fillOval(1250, 40, 150, 50);
		
		//tree trunks
		// #1
		g.setColor(new Color(101, 70, 24));
		g.drawRect(100, 450, 50, 150); g.fillRect(100, 450, 50, 150);
		// #2
		g.drawRect(250, 450, 50, 150); g.fillRect(250, 450, 50, 150);
		// #3
		g.drawRect(400, 450, 50, 150); g.fillRect(400, 450, 50, 150);
		// #4
		g.drawRect(1000, 450, 50, 150); g.fillRect(1000, 450, 50, 150);
		// #5
		g.drawRect(1150, 450, 50, 150); g.fillRect(1150, 450, 50, 150);
		
		
		//tree tops
		// #1
		g.setColor(new Color(63, 100, 24));
		g.drawOval(80, 400, 60, 45); g.fillOval(80, 400, 60, 45);
		g.drawOval(110, 400, 60, 45); g.fillOval(110, 400, 60, 45);
		g.drawOval(70, 420, 60, 45); g.fillOval(70, 420, 60, 45);
		g.drawOval(100, 420, 60, 45); g.fillOval(100, 420, 60, 45);
		g.drawOval(130, 420, 60, 45); g.fillOval(130, 420, 60, 45);
		// #2
		g.drawOval(230, 400, 60, 45); g.fillOval(230, 400, 60, 45);
		g.drawOval(270, 400, 60, 45); g.fillOval(270, 400, 60, 45);
		g.drawOval(220, 420, 60, 45); g.fillOval(220, 420, 60, 45);
		g.drawOval(250, 420, 60, 45); g.fillOval(250, 420, 60, 45);
		g.drawOval(280, 420, 60, 45); g.fillOval(280, 420, 60, 45);
		//#3
		g.drawOval(370, 400, 60, 45); g.fillOval(370, 400, 60, 45);
		g.drawOval(415, 400, 60, 45); g.fillOval(415, 400, 60, 45);
		g.drawOval(360, 420, 60, 45); g.fillOval(360, 420, 60, 45);
		g.drawOval(390, 420, 60, 45); g.fillOval(390, 420, 60, 45);
		g.drawOval(430, 420, 60, 45); g.fillOval(430, 420, 60, 45);
		//#4
		g.drawOval(970, 400, 60, 45); g.fillOval(970, 400, 60, 45);
		g.drawOval(1000, 400, 60, 45); g.fillOval(1000, 400, 60, 45);
		g.drawOval(960, 420, 60, 45); g.fillOval(960, 420, 60, 45);
		g.drawOval(990, 420, 60, 45); g.fillOval(990, 420, 60, 45);
		g.drawOval(1020, 420, 60, 45); g.fillOval(1020, 420, 60, 45);
		//#5
		g.drawOval(1120, 400, 60, 45); g.fillOval(1120, 400, 60, 45);
		g.drawOval(1150, 400, 60, 45); g.fillOval(1150, 400, 60, 45);
		g.drawOval(1110, 420, 60, 45); g.fillOval(1110, 420, 60, 45);
		g.drawOval(1140, 420, 60, 45); g.fillOval(1140, 420, 60, 45);
		g.drawOval(1170, 420, 60, 45); g.fillOval(1170, 420, 60, 45);
	}
	private void drawAnimal(Graphics g) 
	{
		//BODY
		g.setColor(new Color(128, 128, 128));
		g.drawRoundRect(600, 450, 300, 200, 150, 125); g.fillRoundRect(600, 450, 300, 200, 150, 125);
		//LEGS
		//-----left
		g.drawRoundRect(600, 600, 75, 100, 20, 20); g.fillRoundRect(600, 600, 75, 100, 20, 20);
		g.drawRoundRect(625, 575, 75, 100, 20, 20); g.fillRoundRect(625, 575, 75, 100, 20, 20);
		//-----right
		g.drawRoundRect(825, 600, 75, 100, 20, 20); g.fillRoundRect(825, 600, 75, 100, 20, 20);
		g.drawRoundRect(800, 575, 75, 100, 20, 20); g.fillRoundRect(800, 575, 75, 100, 20, 20);
		//HEAD
		g.drawOval(525, 390, 150, 150); g.fillOval(525, 390, 150, 150); 
		//EARS
		g.setColor(new Color(128, 128, 128));
		g.drawOval(590, 380, 170, 170); g.fillOval(590, 380, 170, 170);
		g.setColor(Color.pink);
		g.drawOval(590, 385, 160, 160); g.fillOval(590, 385, 160, 160);
		//TRUNK
		//TAIL
		
		
	}
	
}
