
// Levi Ross
import javax.swing.*;
import java.awt.GradientPaint;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
	final public class Bunbun {

	    JFrame frame;
	    DrawPanel drawPanel;

	    private int oneX = -45;

	    boolean up = false;
	    boolean down = true;
	    boolean left = false;
	    boolean right = true;

	    public static void main(String[] args) {
	        new Bunbun().go();
	    }

	    private void go() {
	        frame = new JFrame("Bun Bun");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        drawPanel = new DrawPanel();

	        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

	        frame.setVisible(true);
	        frame.setResizable(false);
	        frame.setSize(900, 835);
	        frame.setLocation(5, 5);
	        moveIt();
	    }

	    class DrawPanel extends JPanel {
	        public void paintComponent(Graphics g) {
	       //sky
	        	Graphics2D g2d = (Graphics2D) g;
	        	 Graphics2D gd2 = (Graphics2D) g;
	  		   GradientPaint gp1 = new GradientPaint(25, 1500,
	          new Color(100,200,255), 1, 1,  new Color(10,190,255), true);
	  	       gd2.setPaint(gp1);
	           g.fillRect(0, 0, 90000, 6000000);	
	       	//Sun Sun
				GradientPaint gp3 = new GradientPaint(5, 25,
		                Color.yellow, 2, 2, Color.orange, true);
				g2d.setPaint(gp3);
					g2d.fillOval(697,97-90,80,80);   
	       //clouds
	           g.setColor(Color.white);
	   		g.fillOval(oneX-2,59,400,50);
	   		g.fillOval(oneX+295,109,400,50);
	   		g.fillOval(oneX-380,9,400,50);
	   		g.fillOval(oneX+390,12,400,50);
	   		g.fillOval(oneX-430,100,400,50);
	   		g.fillOval(oneX-744,48,400,50);
	   	//Rainbow bow
	        GradientPaint gpRO = new GradientPaint(5, 25,
	                Color.red, 2, 2, Color.orange, true);
			g2d.setPaint(gpRO);
	      			g2d.fillOval(200, 200, 400, 300);
	      			GradientPaint gpOY = new GradientPaint(5, 25,
	      	                Color.yellow, 2, 2, Color.orange, true);
	      			g2d.setPaint(gpOY);
	      			g.fillOval(200+5, 200+10, 400-10, 300-10);
	      			GradientPaint gpYG = new GradientPaint(5, 25,
	      	                Color.green, 2, 2, Color.yellow, true);
	      			g2d.setPaint(gpYG);
	      			g2d.fillOval(200+10,200+20, 400-20, 300-20);
	      			GradientPaint gpGB = new GradientPaint(5, 25,
	      	                Color.blue, 2, 2, Color.green, true);
	      			g2d.setPaint(gpGB);		
	      			g.fillOval(200+15,200+30, 400-30, 300-30);
	      			GradientPaint gpBI = new GradientPaint(5, 25,
	      	                Color.cyan, 2, 2, Color.blue, true);
	      			g2d.setPaint(gpBI);
	      			g.fillOval(200+20,200+40, 400-40, 300-40);
	      			GradientPaint gpIV = new GradientPaint(5, 25,
	      					new Color(131,6,255), 2, 2, Color.cyan, true);
	      			g2d.setPaint(gpIV);
	      			g.fillOval(200+25,200+50, 400-50, 300-50);
	      			GradientPaint gpVV = new GradientPaint(5, 25,
	      					new Color(161,16,255), 2, 2,new Color(131,6,255), true);
	      			g2d.setPaint(gpVV);
	      			g.fillOval(200+30,200+60, 400-60, 300-60);
	      			gd2.setPaint(gp1);
	      		gd2.fillOval(200+35,200+70, 400-70, 300-70);
	        //grass
	        g.setColor(new Color(9,164,0));
	        g.fillRect(0,500, 900000, 600000);
	        g.fillRect(0,350,10000,10000);
			g.fillOval(-100, 300, 500, 200);
			g.fillOval(300, 300, 300, 200);
			g.fillOval(380, 300, 500, 200);
			g.fillOval(800, 300, 300, 200);
			//tree
			//g2d.setColor(new Color(10,152,10));
			//g2d.fillOval(565,470,220,150);
			g.setColor(new Color(77,50,30));
			Polygon tree = new Polygon();
			tree.addPoint(650,540);
			tree.addPoint(658,248+50);
			tree.addPoint(695,250+50);
			tree.addPoint(703,538);
			g.fillPolygon(tree);
			g.setColor(new Color(0,132,0));
			g.fillOval(550,470-300,250,200);
		
			
			
			/** Brown Bun Bun
				 	Light Brown RGB (new Color(112,67,39))
				 	Dark Brown RGB(new Color(77,50,30))
				 	Darker Brown RGB(new Color(40,19,6)); */
				
				g.setColor(new Color(112,67,39));
					g.fillOval(248,500,50,60);
				g.setColor(new Color(77,50,30));
					g.drawOval(248,500,50,60);
					g.drawOval(253, 450, 15, 55);
					g.drawOval(278, 450, 15, 55);
				g.setColor(new Color(112,67,39));
					g.fillOval(253,480,40,40);
				g.setColor(new Color(77,50,30));
					g.drawOval(253,480,40,40);
				g.setColor(new Color(112,67,39));
					g.fillOval(253, 450, 15, 55);
					g.fillOval(278, 450, 15, 55);
					g.fillOval(242,515,20,25);
					g.fillOval(285,515,20,25);
					g.fillOval(240,545,30,25);
					g.fillOval(272,545,30,25);
				g.setColor(new Color(77,50,30));
					g.drawOval(242,515,20,25);
					g.drawOval(285,515,20,25);
					g.drawOval(240,545,30,25);
					g.drawOval(272,545,30,25);
				g.setColor(Color.white);
					g.fillOval(259,489,10,9);
					g.fillOval(277,489,10,9);
				g.setColor(Color.black);
					g.fillOval(265,491,5,5);
					g.fillOval(283,491,5,5);
				g.setColor(new Color(40,19,6));
					g.drawOval(273,498,15,15);
					g.drawOval(257,498,15,15);
				g.setColor(new Color(112,67,39));
					g.fillRect(257, 498, 33,5 );
				g.setColor(new Color(40,19,6));
					g.fillRect(270, 500, 6,6);
					
					//White Bun bun
				g.setColor(Color.white);
					g.fillOval(248+300,500,50,60);
				g.setColor(Color.gray);
					g.drawOval(248+300,500,50,60);
					g.drawOval(253+300, 450, 15, 55);
					g.drawOval(278+300, 450, 15, 55);
				g.setColor(Color.white);
					g.fillOval(253+300,480,40,40);
				g.setColor(Color.gray);
					g.drawOval(253+300,480,40,40);
				g.setColor(Color.white);
					g.fillOval(253+300, 450, 15, 55);
					g.fillOval(278+300, 450, 15, 55);
					g.fillOval(242+300,515,20,25);
					g.fillOval(285+300,515,20,25);
					g.fillOval(240+300,545,30,25);
					g.fillOval(272+300,545,30,25);
				g.setColor(Color.gray);
					g.drawOval(242+300,515,20,25);
					g.drawOval(285+300,515,20,25);
					g.drawOval(240+300,545,30,25);
					g.drawOval(272+300,545,30,25);
				g.setColor(Color.gray);
					g.drawOval(259+300,489+4,10,1);
					g.drawOval(277+300,489,10,9);
				g.setColor(Color.black);
					g.fillOval(279+300,491,4,5);
					g.fillOval(277+300,491,4,5);
				g.setColor(Color.black);
					g.drawOval(273+300,498+1,15,15);
					g.drawOval(260+300-1,498+1,15,15);
				g.setColor(Color.white);
					g.fillRect(257+300, 498+1, 33,5 );
				g.setColor(Color.black);
					g.fillRect(270+301, 500, 6,6);         
	        }
	    }

	    private void moveIt() {
	        while(true){
	            if(oneX >= 800){
	            	oneX =-45;
	              right = false;
	              left = true;
	            }
	           if(oneX <= 7){
	                right = true;
	                left = false;
	            }
	            if(left){
	                oneX--;
	            }
	            if(right){
	                oneX++;
	            } 
	            try{
	                Thread.sleep(70);
	            } catch (Exception exc){}
	            frame.repaint();
	        }
	    }
	}
