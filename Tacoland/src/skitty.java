import java.awt.*;
import java.applet.*;

public class skitty extends Applet{
	
	public void paint(Graphics g)
	{
		drawHabitat(g);
		drawAnimal(g);
	
	}

	private void drawAnimal(Graphics g)
	{
		int a = 252 ;int b = 230 ; int c = 201 ;
		
		Polygon LEar = new Polygon();
		Polygon REar = new Polygon();
	
		g.setColor(Color.pink);
		g.fillOval(445, 453, 200 , 150);
		g.fillOval(550, 269, 235, 215);
		
		g.setColor(new Color(a,b,c));
		g.fillOval(566, 329, 205, 155);
		//body
		g.fillOval(515, 475, 130, 100);
		g.fillOval(495, 495, 137, 100);
		g.fillOval(468, 500, 130, 100);
		g.fillOval(516, 475, 130, 100);
	
		//legs
		g.fillOval(595, 482, 50, 130);//R
		g.setColor(Color.black);
		g.drawOval(445, 453, 200 , 150);
		g.setColor(new Color(a,b,c));
		g.fillOval(530, 500, 55, 130);//M
		g.fillOval(450, 535, 45, 100);//L
		
		//face
		g.setColor(Color.pink);
		g.fillOval(622, 318, 100, 75);
		g.setColor(Color.black);
		g.drawArc(600, 395, 50, 50, 0, 180);
		g.drawArc(680, 395, 50, 50, 0, 180);
		g.fillOval(663, 435, 3, 3);
		g.drawArc(620, 430, 100, 30, 180, 180);
		g.drawOval(550, 269, 235, 215);
		//tail
		g.setColor(new Color(a,b,c));
		Polygon tail = new Polygon();
		tail.addPoint(350, 450);
		tail.addPoint(355, 460);
		tail.addPoint(455, 515 );
		tail.addPoint(450,520);
		g.fillPolygon(tail);
		
		g.setColor(Color.pink);
		g.fillOval(335, 259, 125, 235);
		g.setColor(Color.black);
		g.drawOval(335, 259, 125, 235);
		g.drawLine(360, 280, 300, 250);
		g.drawLine(400, 260, 400, 200);
		g.drawLine(430, 280, 480, 250);
		
		g.setColor(new Color(a,b,c));
		g.fillOval(285, 220, 45, 45);
		g.fillOval(375, 180, 45, 45);
		g.fillOval(460, 225, 45, 45);
		
		g.setColor(Color.black);
		g.drawOval(285, 220, 45, 45);
		g.drawOval(375, 180, 45, 45);
		g.drawOval(460, 225, 45, 45);
		
		//Ears
		
		g.setColor(Color.pink);
		LEar.addPoint(530, 220);
		LEar.addPoint(630, 278);
		LEar.addPoint(560, 340);
		g.fillPolygon(LEar);
	
		REar.addPoint(800,220);
		REar.addPoint(700,278);
		REar.addPoint(780,345);
	    g.fillPolygon(REar);
	    
		g.setColor(new Color(165, 41, 210));
	    Polygon LEFill = new Polygon();
	    LEFill.addPoint(540, 230);
	    LEFill.addPoint(615, 278);
	    LEFill.addPoint(565, 315);
	    g.fillPolygon(LEFill);
	    
	    Polygon REFill = new Polygon();
	    REFill.addPoint(792, 230);
	    REFill.addPoint(715, 278);
	    REFill.addPoint(770, 330);
	    g.fillPolygon(REFill);
	    
		
	}
	
	private void drawHabitat(Graphics g)
	{
		g.setColor(Color.green);
		g.fillRect(200, 350, 1000, 1000);
		
		g.setColor(Color.blue);
		g.fillRect(200, 0, 1000 ,350 );
		
		
	}
}
