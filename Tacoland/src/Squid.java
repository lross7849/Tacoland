import javax.swing.*;

import java.awt.*;

final public class Squid {
	
// sets up the code for the area where the animal is drawn
	JFrame frame;
	DrawSquid DrawSquid;

	
//sets value for oneX and oneY
	private int oneX = 7;
	private int oneY = 7;

	
//sets up boolean for making the loop to make the animal move
	boolean up = false;
	boolean down = true;
	boolean left = false;
	boolean right = true;

	
//makes new squid
public static void main(String[] args) {

new Squid().go();

}


//makes frame
private void go() {

frame = new JFrame("Squid");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

DrawSquid = new DrawSquid();

frame.getContentPane().add(BorderLayout.CENTER, DrawSquid);

frame.setVisible(true);

frame.setResizable(false);

frame.setSize(1200, 800);

frame.setLocation(375, 55);

moveIt();

}


// contains all code for drawing animal
class DrawSquid extends JPanel {

	//sets up the paint code
public void paintComponent(Graphics g) {
Graphics2D g2d = (Graphics2D) g;
drawHabitat(g2d);
drawAnimal(g2d);
}

	//draws animal
public void drawAnimal(Graphics2D g)
	{
		//squid head
		g.setColor(Color.white);
		Polygon p = new Polygon();
		p.addPoint(oneX+500, oneY+200);
		p.addPoint(oneX+350, oneY+400);
		p.addPoint(oneX+650, oneY+400);
		g.fillPolygon(p);
	
		//squid body
		g.fillRect(oneX+390, oneY+350, 220, 300);
		
		//squid tenticles
		g.setColor(Color.white);
		g.fillRect(oneX+395, oneY+600, 50, 150);
		g.fillRect(oneX+450, oneY+600, 50, 150);
		g.fillRect(oneX+505, oneY+600, 50, 150);
		g.fillRect(oneX+560, oneY+600, 50, 150);
		g.fillRect(oneX+390, oneY+550, -150, 50);
		g.fillRect(oneX+590, oneY+550, 150, 50);
		
		//squid "mask"
		g.setColor(Color.black);
		g.fillOval(oneX+388, oneY+393, 224, 90);
		//squid eyes
		g.setColor(Color.white);
		g.drawOval(oneX+410, oneY+400, 75, 75);
		g.fillOval(oneX+410, oneY+400, 75, 75);
		g.fillOval(oneX+510, oneY+400, 75, 75);
		//squid pupils
		g.setColor(Color.black);
		g.fillOval(oneX+435, oneY+420, 25, 25);
		g.fillOval(oneX+535, oneY+420, 25, 25);
		

}

	//draws habitat 
private void drawHabitat(Graphics2D g)
{
	//water
	g.setColor(new Color(100,200,255));
	g.fillRect(0, 0, 80000, 80000);
	
	//bubbles
	// oval: X1:distance out on x axis, y1: how far down the sphere is x2: how wide the sphere is y2 how tall the sphere is
	g.setColor(new Color(255, 255, 255));
	g.fillOval(oneX+1200,200,50,50);
	g.fillOval(1100,oneY+500,50,50);
	g.fillOval(oneX+100,500,50,50);
	g.fillOval(200,oneY+700,50,50);
	g.fillOval(oneX+300,200,100,100);
	g.fillOval(1000,oneY+500,100,100);
	
}
}


// contains all code for moving animal
private void moveIt() {

while(true){

	//lateral movement
if(oneX >= 283){

right = false;

left = true;

}

	//lateral movement con.
if(oneX <= 7){

right = true;


left = false;

}

	//vertical movement
if(oneY >= 259){

up = true;

down = false;

}
	//vertical movement con.
if(oneY <= 7){

up = false;

down = true;

}
// controls the X and Y values for the control of the animal
if(up){

oneY--;

}

if(down){

oneY++;

}

if(left){

oneX--;

}

if(right){

oneX++;

}


try{

	//animation speed
Thread.sleep(10);

} catch (Exception exc){}

frame.repaint();

}

}

}