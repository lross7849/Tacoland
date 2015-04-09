
import javax.swing.*;

import java.awt.*;

final public class Zebra {

JFrame frame;

DrawZebra DrawZebra;

private int oneX = 7;

private int x=440;
private int y=150;

private int oneY = 7;

boolean up = false;

boolean down = true;

boolean left = false;

boolean right = true;

public static void main(String[] args) {

new Zebra().go();

}

private void go() {

frame = new JFrame("Zebra");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

DrawZebra = new DrawZebra();

frame.getContentPane().add(BorderLayout.CENTER, DrawZebra);

frame.setVisible(true);

//frame.setResizable(false);

frame.setSize(2000, 2000);

frame.setLocation(0, 0);

moveIt();

}

class DrawZebra extends JPanel {

public void paintComponent(Graphics g) {
	
	doDrawing(g);
	
/*
g.setColor(Color.BLUE);

g.fillRect(0, 0, this.getWidth(), this.getHeight());

g.setColor(Color.RED);

g.fillRect(3, 3, this.getWidth()-6, this.getHeight()-6);

g.setColor(Color.WHITE);

g.fillRect(6, 6, this.getWidth()-12, this.getHeight()-12);

g.setColor(Color.BLACK);

g.fillRect(oneX, oneY, 6, 6);
*/
}

private void doDrawing(Graphics g) {
	
	
	 Graphics2D g2d = (Graphics2D) g;



   g2d.setColor(new Color(32, 142, 35));
   g2d.fillRect(0, 500, 2000, 400);

   g2d.setColor(new Color(42, 179, 231));
   g2d.fillRect(0, 0, 2000, 500);

   //tree
   g.setColor(new Color(152, 137, 58));
	g.fillRect(1300, 250, 100, 300);
	//leaves
	g.setColor(new Color(6, 179, 109));
	g.fillOval(1300, 150, 100, 100);
	g.fillOval(1250, 250, 100, 100);
	g.fillOval(1235, 200, 100, 100);
	g.fillOval(1375, 175, 100, 100);
	g.fillOval(1368, 200, 100, 100);
	g.fillOval(1300, 240, 100, 100);
	g.fillOval(1370, 250, 100, 100);
	g.fillOval(1260, 160, 100, 100);
	//hole in tree
	g.setColor(Color.black);
	g.fillOval(1325, 375, 50, 75);
	//sun
	g.setColor(Color.yellow);
	g.fillOval(25, 50, 100, 100);
	//cloud
	g.setColor(Color.white);
	g.fillOval(500, 50, 100, 50);
	g.fillOval(550, 70, 100, 50);
	g.fillOval(475, 70
			, 100, 50);
	g.fillOval(1000, 50, 100, 50);
	g.fillOval(1050, 25, 100, 50);

   //body
   GradientPaint gp1 = new GradientPaint(5, 20,
           Color.white, 20, 20, Color.black, true);
   	g2d.setPaint(gp1);
   	g2d.fillOval(x+160, y+150, 300, 150);
   	g2d.fillRect(x+185, y+265, 25, 100);
		g2d.fillRect(x+235, y+265, 25, 100);
		g2d.fillRect(x+340, y+265, 25, 100);
		g2d.fillRect(x+410, y+265, 25, 100);
		// Hooves
		g.setColor(Color.black);
		g.fillRect(x+185, y+365, 25, 15);
		g.fillRect(x+235, y+365, 25, 15);
		g.fillRect(x+340, y+365, 25, 15);
		g.fillRect(x+410, y+365, 25, 15);
		// Neck
		  GradientPaint gp2 = new GradientPaint(5, 20,
	                Color.white, 20, 20, Color.black, true);
	        	g2d.setPaint(gp2);
	    Polygon p = new Polygon();
		p.addPoint(x+200, y+200);
		p.addPoint(x+140, y+125);
		p.addPoint(x+120, y+150);
		p.addPoint(x+190, y+275);
		g.fillPolygon(p);
			//Face
		 GradientPaint gp4 = new GradientPaint(5, 20,
	                Color.white, 20, 20, Color.black, true);
	        	g2d.setPaint(gp4);
			g2d.fillOval(x+55, y+115, 100, 50);
			g.setColor(Color.black);
			g.fillOval(x+110, y+120, 20, 20);
			g.setColor(Color.white);
			g.fillOval(x+111, y+128, 10, 10);
			g.setColor(Color.blue);
			g.fillOval(x+111, y+132, 5, 5);
			g.setColor(Color.black);
			g.fillOval(x+55, y+130, 20, 20);
			
			g.setColor(new Color(42, 179, 231));
			g.fillOval(x+0, y+0, 130, 130);
			g.fillOval(x+205, y+70, 260, 100);
		//mouth	//g.setColor(Color.red);
			//g.drawLine(x-70, y-158, x+530, y+295);
			//Tail
			  GradientPaint gp3 = new GradientPaint(5, 20,
		                Color.white, 20, 20, Color.black, true);
		        	g2d.setPaint(gp3);
			g.fillRect(x+450, y+210, 125, 20);
			g.setColor(Color.black);
			g.fillOval(x+558, y+207, 75, 25);
			//ears
			 GradientPaint gp5 = new GradientPaint(5, 20,
		                Color.white, 20, 20, Color.black, true);
		        	g2d.setPaint(gp5);
			g2d.fillOval(x+114, y+80, 25, 40);
			g2d.fillOval(x+100, y+80, 25, 40);
			g.setColor(Color.pink);
			g.fillOval(x+114, y+85, 15, 35);
			g.fillOval(x+100, y+85, 15, 35);
}
}

private void moveIt() {

while(true){

if(x >= 650){

right = false;

left = true;

}

if(x <= 7){

right = true;



left = false;

}

if(y >= 259){

up = true;

down = false;

}

if(y <= 150){

up = false;

down = true;

}

if(up){

y--;

}

if(down){

y++;

}

if(left){

x--;

}

if(right){

x++;

}

try{

Thread.sleep(10);

} catch (Exception exc){}

frame.repaint();

}

}

}