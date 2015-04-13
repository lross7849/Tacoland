
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities; 
//Jordan Harris 

final public class MeerKat {
	
	public static final JFrame jframe = null;
	JFrame frame;
	DrawMeerKat drawPanel;
	
	private int oneX = 7;
	private int oneY = 7;
	
	
	boolean up = false;
	boolean down = true;
	boolean left = false;
	boolean right = true;
	
	public static void main(String[] args) {
		new MeerKat().go();
		
	}
	
	private void go() {
		frame = new JFrame("MeerKat");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		drawPanel = new DrawMeerKat();
		
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);  
		
		frame.setVisible(true);
		//frame.setResizable(false);
		frame.setSize(800, 800);
		frame.setLocation(375, 55);
		moveIt();
		 
		GradientPaint sk8 = new GradientPaint(25, 1500,
		new Color(230,220,104), 100, 100,  new Color(35,85,150), true);

		
		
	}

	
	class DrawMeerKat extends JPanel {

		public void paintComponent(Graphics g) {
		
		        
		        Graphics2D g2d = (Graphics2D) g;
                     //habitat
		       
		      g2d.setColor(new Color(125, 167, 116));
		            g2d.setColor(new Color(100,200,255)); 
				   g2d.fillRect(0,0,2000,550); 
		    	   g2d. setColor(Color.ORANGE);  
			       g2d.fillRect(0, 350, 3000, 350); 
			       g2d.setColor(Color.BLACK); 
			       g2d.fillOval(20, 500, 77, 30); 
			       g2d.setColor(Color.BLUE); 
			       g2d.fillOval(100, 500, 200, 95); 
			       g2d.setColor(Color.BLACK); 
			       g2d.fillOval(50,475, 77, 40);  
			       g2d.setColor(new Color(85,62,36)); 
			       g2d.fillRect(1100, 97, 63, 300);
			       g2d.setColor(new Color(84,103,18)); 
			       g2d.fillOval(994, 94, 300, 100);  
			       g2d.setColor(Color.YELLOW); 
			       g2d.fillOval(98, 98, 200, 200); 
			       g2d.setColor(new Color(186,198,199)); 
			       g2d.fillOval(1198, 300, 200, 200); 
			       g2d.setColor(Color.ORANGE); 
			       g2d.fillRect(1198, 370, 200, 200); 
			       g2d.setColor(new Color(186,198,208)); 
			       g2d.fillOval(1380, 300, 100, 100);  
			       g2d.setColor(Color.ORANGE); 
			       g2d.fillRect(1380, 370, 200, 200);  
                       //MeerKat 
			       //Body
					 g2d.setColor(new Color(152, 137, 58));   
					 g2d.fillOval(700+oneX, 390+oneY, 15, 15);  
					 g2d.setColor(new Color(152, 137, 58));  
					 g2d.fillOval(730+oneX, 390+oneY, 15, 15); 
					 g2d.setColor(new Color(152, 137, 58));  
					 g2d.fillRect(700+oneX, 400+oneY, 50, 50); 
					 g2d.setColor(new Color(152, 137, 58));  
					 g2d.fillRect(700+oneX, 450+oneY, 50, 50);  
				       //eyes
					 g2d.setColor(Color.WHITE);  
					 g2d.fillOval(705+oneX, 417+oneY, 10, 10); 
					 g2d.setColor(Color.WHITE);  
					 g2d.fillOval(730+oneX, 417+oneY, 10, 10);  
					 g2d.setColor(Color.BLACK); 
					 g2d.fillOval(708+oneX,420+oneY,5,5); 
					 g2d.setColor(Color.BLACK); 
					 g2d.fillOval(731+oneX,420+oneY,5,5);
					  //mouth
					 g2d.setColor(Color.RED);  
					 g2d.fillOval(712+oneX, 440+oneY, 20, 20);  
					 //Arms Legs 
					 g2d.setColor(new Color(152, 137, 58));  
					 g2d.fillOval(730+oneX, 490+oneY, 20, 20);  
					 g2d.setColor(new Color(152, 137, 58));  
					 g2d.fillOval(702+oneX, 490+oneY, 20, 20); 
					 g2d.setColor(new Color(152, 137, 58));   
					 g2d.fillOval(689+oneX, 437+oneY, 20, 30); 
					 g2d.setColor(new Color(152, 137, 58));  
					 g2d.fillOval(740+oneX, 437+oneY, 20, 30);  
					 //Mouth 2
					 g2d.setColor(Color.BLACK); 
					 g2d.fillOval(715+oneX, 446+oneY, 14, 14);   
				     g2d.setColor(new Color(152, 137, 58));  
					 g2d.fillRect(712+oneX, 453+oneY, 20, 20);   
				     //Tail
					 g2d.setColor(new Color(152, 137, 58)); 
					 g2d.fillRect(750+oneX, 490+oneY, 40, 10); 
					 g2d.setColor(Color.BLACK); 
					 g2d.fillRect(780+oneX,490+oneY,10,10);
		    }
	        
	        
	        
			
	  
	}
	
	private void moveIt() {
		while(true){
			if(oneX >= 283){
				right = false;
				left = true;
			}
			if (oneX <= 7){
				right = true;
				left = false;
			}
			if (oneY >= 259){
				up = true;
				down = false;
			}
			if (oneY <= 7){
				up = false;
				down = true;
			}
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
				Thread.sleep(10);
			} catch (Exception exc){}
			frame.repaint();
				
			}
		}
		
	}



