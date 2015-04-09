//Jacob Breland
import java.applet.Applet;
import java.awt.*;
import java.awt.geom.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

 

 public class Wolf extends Applet {

    private void DrawWolf(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g; }

	
	public void paint(Graphics g)
	{
		drawAnimal(g);
		drawHabitat(g);
	}

	private void drawAnimal(Graphics g)
	{   
		Graphics2D g2d = (Graphics2D) g;
	//Sky	
		g2d.setColor(new Color(7, 182, 248));
		GradientPaint gp4 = new GradientPaint(25, 25, 
			    Color.cyan, 2000, 2000, Color.white, true);
		g2d.fillRect(0, 0, 2000, 1000);
	//Grass
		g2d.setColor(Color.green);
		g2d.fillRect(0, 650, 2000, 300);
	//Wolf	
		g2d.setColor(Color.gray);
		g2d.fillRect(500, 650, 45, 70);
		g2d.fillRect(700, 650, 45, 70);
		g2d.fillRect(500, 600, 245, 75);
		g2d.fillRect(450, 575, 90, 90);
		g2d.fillRect(425, 615, 50, 50);
		g2d.fillRect(2000, 600, 150, 50);
		g2d.setColor(Color.black);
		g2d.fillRect(450, 620, 25, 25);
		g2d.setColor(Color.black);
		g2d.fillRect(425, 615, 12, 12);
		g2d.fillRect(720, 675, 2, 44);
		g2d.fillRect(520, 675, 2, 44);
		g2d.fillRect(425, 643, 30, 2);
		g2d.setColor(Color.white);
		g2d.fillOval(450, 590, 20, 20);
		g2d.setColor(Color.black);
		g2d.fillOval(450, 594, 10, 10);
	//Sun	
		g2d.setColor(Color.yellow);
		g2d.fillOval(1350, 20, 150, 150);
	//Clouds	
		g2d.setColor(Color.white);
		g2d.fillOval(75, 25, 250, 150);
		g2d.fillOval(175, 50, 250, 150);
		g2d.fillOval(275, 25, 250, 150);
		g2d.fillOval(675, 50, 250, 150);
		g2d.fillOval(775, 25, 250, 150);
		g2d.fillOval(875, 50, 250, 150);
	}
	
	private void drawHabitat(Graphics g)
	{
		
	}
}
