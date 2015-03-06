import java.awt.*;
import java.applet.*;

public class flamingo extends Applet{
	
	public void paint(Graphics g)
	{
		drawAnimal(g);
		drawHabitat(g);
	}
//Carla Carmona, 8th period Computer Science (JFRAME+ANIMATION+GRADIENT ON ANOTHER FILE)
	
	private void drawAnimal(Graphics g)
	{
	
		
	}
	private void drawHabitat(Graphics g)
	{
		//applet window is 200 x 200
		
		//Sky
		g.setColor(new Color (100,200,255));
		g.fillRect(0, 0, 1600, 800);
		//Grass
		g.setColor(Color.green);
		g.fillRect(0,550,1600,300);
		//Small Pond
		g.setColor(new Color(100,250,255));
		g.fillOval(800,615,770,175);
		//Fence
		g.setColor(Color.black);
		int x = 0;
		for (x=0; x<2000; x=x+50)
		g.fillRect(x,200,20,350);
		
		g.fillRect(0,200,2000,40);
		
		//Trees
		g.setColor(new Color (128,64,0));
		g.fillRect(90, 250, 70, 450);
		g.fillRect(400, 250, 70, 450);
		g.setColor(new Color (0,128,0));
		g.fillOval(5, 150, 250,200);
		g.fillOval(310, 150, 250, 200);
		//Sun
		g.setColor(Color.yellow);
		g.fillOval(1400,30,150,150);
		
		
		
		//Flamingo
		
		g.setColor(Color.pink);
		
		g.fillOval(900,560,120,90);
		
		g.setColor(Color.pink);
		
		g.fillRect(1000, 500, 20,100);
		//head (x, y, width, length  x and width, y and length)
		g.fillOval(993, 460, 60, 50);
		
		g.setColor(Color.black);
		g.fillOval(1035,475,5,5);
		
		//beak
		
		g.setColor(Color.orange);
	g.fillRect(1045, 480, 30, 20);
		
		
		
		
		g.setColor(new Color (128,64,64));
		g.fillRect(940, 647, 5, 100);
		g.fillRect(980,647,5,100);
		
		
	}
	
		
		
		
	}

