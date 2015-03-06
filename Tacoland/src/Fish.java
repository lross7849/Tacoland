
 import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
 public class Fish extends Applet
{
	
	
	
	public void paint(Graphics g)
	{
	

		//sky
		g.setColor(new Color (94,175,242));
		g.fillRect(0, 0, 1700, 400);
		//sun
		g.setColor(new Color (254,209,29));
		g.fillOval(100,100,200,200);
		//clouds
		g.setColor(new Color(193,193,193));
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
		
		
		
		//ocean
		g.setColor(new Color (0,56,249));
		g.fillRect(0,400,1700,400);
		//fish
		g.setColor(new Color (249,107,2));
		g.fillOval(500,600,100,60);
		//fin
		g.setColor(new Color (253,139,55));
		g.fillRect(515,620,45,20);
		//eyeball 
		g.setColor(new Color (0,0,0));
		g.fillOval(575,610,15,15);
		//plants
		g.setColor(new Color (56,163,41));
		g.fillRect(50,700,30,200);
		g.fillRect(250,650,30,250);
		g.fillRect(450,700,10,165);
		g.fillRect(520,620,20,400);
		g.fillRect(580,670,15,350);
		g.fillRect(700,500,25,350);
		g.fillRect(850,600,15,350);
		g.fillRect(920,700,30,200);
		g.fillRect(1000,600,20,350);
		g.fillRect(1200,460,23,700);
		g.fillRect(1400,600,20,250);
		//boat
		g.setColor(new Color (85,99,80));
		g.fillArc(700,140,700,400,180,180);
		g.setColor(new Color (243,7,26));
		g.fillRect(750,170,600,170);
		
		//g.setColor
		g.fillRect(800,120,50,100);
		//pollution
		g.setColor(new Color (46,47,48));
		g.fillOval(750,100,80,20);
		g.setColor(new Color (208,209,210));
		g.fillOval(710,100,80,20);
		g.fillOval(730,110,80,20);
		g.setColor(new Color (46,47,48));
		g.fillOval(780,110,80,20);
		//window
		g.setColor(new Color (171,230,252));
		g.fillRect(1240,190,60,100);
		g.setColor(new Color (0,0,0));
		g.fillRect(1265,190,10,100);
		g.fillRect(1240,235,60,10);
		}
	
	
}