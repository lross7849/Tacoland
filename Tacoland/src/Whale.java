
import java.awt.*;


public class Whale {

	public void paint(Graphics g)
	{
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 1700, 1700);
	}

private void drawAnimal(Graphics g)
	{
		//ocean
		g.setColor(new Color (69, 86, 241));
		g.fillRect(0, 0, 1700, 1700);
		//draw whale
		g.setColor(new Color (182, 182, 182));
		g.fillOval(200, 500, 1000, 600);
		
		
	}
}