import java.applet.*;
import java.awt.*;

public class snake extends Applet {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	}

	public void paint(Graphics g)
	{
		drawAnimal(g);
		drawHabitat(g);
	}

	private void drawAnimal(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.drawOval(20,20,20,20);
	}
	
	private void drawHabitat(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(0,0,2000,400);
		g.setColor(Color.green);
		g.fillRect(0,400,2000,600);
	}
} 


