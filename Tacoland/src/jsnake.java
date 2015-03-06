
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
//Julia Singer
public class jsnake extends JFrame {

    class DrawSnakePanel extends JPanel {
	    int x=1000;
	    int y=500;
	
	    private void doDrawing(Graphics g) {
	        
	        Graphics2D g2 = (Graphics2D) g;      	   
	        drawHabitat(g2);  
	    	//g.setColor(new Color(109,66,22));
	        
	        GradientPaint gp1 = new GradientPaint(5, 5,
	                Color.red, 20, 20, Color.YELLOW, true);
	        g2.setPaint(gp1);
	
	    	g2.fill(new Ellipse2D.Double(x,y,50,50));
			g2.fill(new Ellipse2D.Double(x-25,y-25,50,50));
			g2.fill(new Ellipse2D.Double(x-50,y-50,50,50));
			g2.fill(new Ellipse2D.Double(x-75,y-50,50,50));
			g2.fill(new Ellipse2D.Double(x-100,y-35,50,50));
			g2.fill(new Ellipse2D.Double(x-125,y-25,50,50));
			g2.fill(new Ellipse2D.Double(x-150,y-25,50,50));
			g2.fill(new Ellipse2D.Double(x-175,y-35,50,50));
			
			g.setColor(Color.BLACK);
			g2.fill(new Ellipse2D.Double(x-165, y-25, 5, 5));
			g2.fill(new Ellipse2D.Double(x-155, y-25, 5, 5));
			g2.fill(new Rectangle2D.Double(x-180, y-0, 20, 5));
			
		}
	   	  
	   	   private void start() {
			// TODO Auto-generated method stub
			
		}
	
		public void run() {
	  
	        	
	    }
		private void drawHabitat(Graphics2D g2)
		{
			//g2.setColor(Color.BLUE);
		    GradientPaint gp3 = new GradientPaint(5, 25,
	                Color.blue, 2, 2, (new Color(0,225,225)), true);
		    g2.setPaint(gp3);
			g2.fill(new Rectangle2D.Double(0,0,2000,400));
			g2.setColor(Color.green);
			g2.fill(new Rectangle2D.Double(0,400,2000,600));
			
			g2.setColor(new Color(74,64,28));//tree
			g2.fill(new Rectangle2D.Double(245, 480, 100, 200));
			g2.setColor(new Color(32,94,39));
			g2.fill(new Ellipse2D.Double(200, 300, 200, 200)); 
			
		}
	    @Override
	    public void paintComponent(Graphics g) {
	        
	        super.paintComponent(g);
	        doDrawing(g);
	    }
	}

	public jsnake() {
        initUI();
    }

    public final void initUI() {

        DrawSnakePanel dpnl = new DrawSnakePanel();
        add(dpnl);

        setSize(360, 300);
        setTitle("Rectangles");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                jsnake ex = new jsnake();
                ex.setVisible(true);
                
                
            }
        });
    }
}