
import javax.swing.*;

import java.awt.GradientPaint;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;

// Gryphon Skaggs
final public class dragon {
	
	public static final JFrame jframe = null;
	JFrame frame;
	DrawCow drawPanel;
	
	private int x = 600;
	private int y = 400;
	
	
	boolean up = false;
	boolean down = true;
	boolean left = false;
	boolean right = true;
	
	public static void main(String[] args) {
		new dragon().go();
		
	}
	
	private void go() {
		frame = new JFrame("cowwwwwwwwww");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		drawPanel = new DrawCow();
		
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(800, 800);
		frame.setLocation(375, 55);
		moveIt();
		
		
	}

	
	class DrawCow extends JPanel {
		

		public void paintComponent(Graphics g) {
			
			
//habatate
			 
		      			
						g.setColor(new Color (0,94,0));
						g.fillRect(0,500,5000,5000);
						g.setColor(new Color (80,180,210));
						g.fillRect(0,0,5000,500);
						g.setColor(new Color (232,220,0));
						g.fillOval(15, 5,125, 125);
			        
			 
			g.setColor(new Color(113,70,47));
			//body
			g.fillRect(x, y, 160, 80);
			//head
			g.fillRect(x-50, y-50, 70, 70);
			//legs
			g.fillRect(x+110, y+20, 50, 120);
			g.fillRect(x, y+20, 50, 120);
			//face
			g.setColor(Color.black);
			g.fillRect(x-45, y-35, 10, 5);
			g.fillRect(x-45, y, 50, 5);
			g.fillRect(x, y-35, 10, 5);
	
			
				
			        
				
		}
	}
	
	private void moveIt() {
		while(true){
			//the moving componet 
			if(x >= 283){
				right = false;
				left = true;
			}
			if (x <= 7){
				right = true;
				left = false;
			}
			if (y >= 259){
				up = true;
				down = false;
			}
			if (y <= 7){
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
//not here
class Rain
{
	int X;
	int Y;
	
	public Rain()
	{
		X = (int) (Math.random() * 800);
		Y = (int) (Math.random() * 800);
		
	}
	
	public void drawIt(Graphics g)
	{
    g.drawArc(X, Y, 40, 40, 100, 360);
    g.fillOval(X, Y, 20, 20);
    g.fillOval(X+20,Y+20, 5, 5);
	}
	
	public void moveIt(Graphics g)
	{
		if (Y <= 1)
		{
			Y+=800;
			X = (int)(Math.random() * 800);
		}
		Y--;
		drawIt(g);
	}
	
}

	
	
	
	
	