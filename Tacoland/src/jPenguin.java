//Jesse Contreras [Period 8]



import javax.swing.*;
import java.awt.*;

final public class jPenguin {

    JFrame pegJframe;
    DrawPenguinPanel drawPenguinPanel;

    private short oneX = 7;
    private short oneY = 967;
    
    boolean up = false;
    boolean down = true;
    boolean left = false;
    boolean right = true;

    public static void main(String[] args) {
        new jPenguin().go();
    }

    private void go() {
        pegJframe = new JFrame("jframe Penguin");
        pegJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPenguinPanel = new DrawPenguinPanel();

        pegJframe.getContentPane().add(BorderLayout.CENTER, drawPenguinPanel);

        pegJframe.setVisible(true);
        pegJframe.setResizable(false);
        pegJframe.setSize(960, 900);
        pegJframe.setLocation(375, 55);
        moveIt();
    }

    class DrawPenguinPanel extends JPanel 
    {
        
    	public void paintComponent(Graphics g) 
        {
        	  // Draw Habitat
			// Snow Floor
			g.setColor(Color. white);
			g.fillRect(0,500,5000,5000);
			
			// Sky
			/*The sky is set to an interval to cycle throughout the day.
			 * these are the different gradient colors used for the sky.
			 */
			Graphics2D sk1 = (Graphics2D) g;
			GradientPaint sk2 = new GradientPaint(25, 1500,
			new Color(230,220,104), 100, 100,  new Color(80,180,225), true);
		
			Graphics2D sk3 = (Graphics2D) g;
			GradientPaint sk4 = new GradientPaint(25, 1500,
			new Color(230,220,104), 100, 100,  new Color(65,145,200), true);
			
			Graphics2D sk5 = (Graphics2D) g;
			GradientPaint sk6 = new GradientPaint(25, 1500,
			new Color(230,220,104), 100, 100,  new Color(50,110,175), true);
			
			Graphics2D sk7 = (Graphics2D) g;
			GradientPaint sk8 = new GradientPaint(25, 1500,
			new Color(230,220,104), 100, 100,  new Color(35,85,150), true);
			
			Graphics2D sk9 = (Graphics2D) g;
			GradientPaint sk10 = new GradientPaint(25, 1500,
			new Color(230,220,104), 100, 100,  new Color(20,40,125), true);
			
			//Set upon coordinates of oneX till when the sky will change
			if (-192<= oneX && oneX<=192)
				sk1.setPaint(sk2);
				
			if (-193>=oneX && oneX>=-384 || 193<=oneX && oneX<=384 )
				sk3.setPaint(sk4);
				
			if (-385>=oneX && oneX>=-576 || 385<=oneX && oneX<=576 ) 
				sk5.setPaint(sk6);
				
			if (-577>=oneX && oneX>=-768 || 577<=oneX && oneX<=768 ) 
				sk7.setPaint(sk8);
				
			if (-769>=oneX && oneX>=-960 || 769<=oneX && oneX<=960 ) 
				sk9.setPaint(sk10);
				
			
			g.fillRect(0,0,5000,500);
				
			
			//1st set of Clouds
			g.setColor(new Color(240,240,240));
			g.fillOval(oneX    , 100, 200, 89);
			g.fillOval(oneX+240, 170, 110, 60);
			g.fillOval(oneX+220,  50, 200, 75);
			g.fillOval(oneX+460, 120, 230, 100);
			g.fillOval(oneX+680,  25, 200, 95);
			g.fillOval(oneX+760, 180, 200, 55);
			//2nd Set of Clouds
			g.fillOval(oneY    , 100, 200, 89);
			g.fillOval(oneY+240, 170, 110, 60);
			g.fillOval(oneY+220,  50, 200, 75);
			g.fillOval(oneY+460, 120, 230, 100);
			g.fillOval(oneY+680,  25, 200, 95);
			g.fillOval(oneY+760, 180, 200, 55);
			
			//Fishing Hole
			g.setColor(new Color(172,218,232));
			g.fillOval(100, 550, 225, 75);
	        Graphics2D gd1 = (Graphics2D) g;
			GradientPaint gp3 = new GradientPaint(25, 200,
	        new Color(70,116,172), 100, 100, Color.white, true);
		    gd1.setPaint(gp3);
		    g.fillOval(100, 560, 225, 65);
		    
		  
		    	//Draw Penguin
		    //Body

			
			
			
			
		    g.setColor(Color.black);
			g.fillOval(400, 400, 150, 220);

			//Wings
			g.setColor(Color.black);
			g.fillOval(310, 460, 150, 35);
			g.fillOval(520, 450, 35, 130);
							
			//Feet
			g.setColor(new Color(233,153,65));
			g.fillOval(425, 610, 35,20);
			g.fillOval(490, 610, 35,20);
					
			//Stomach
			Graphics2D gd3 = (Graphics2D) g;
			GradientPaint gp5 = new GradientPaint(25, 10,
			Color.white, 100, 100,  new Color(150,150,150), true);
			gd3.setPaint(gp5);
			g.fillOval(420, 400, 110, 190);
					
			//Head
			g.setColor(Color.black);
			g.fillOval(415, 370, 120, 120);
					
			//Beak
			g.setColor(new Color(233,166,27));
			Polygon T=new Polygon();
			T.addPoint(460, 450-5);
			T.addPoint(490, 450-5);
			T.addPoint(475, 466-5);
			g.fillPolygon(T);

			//Eye Shape
			g.setColor(Color. white);
			g.fillOval(435, 400, 25, 25);
			g.fillRect(491, 415, 24, 11);
			g.fillOval(490, 400, 25, 25);
			g.fillRect(436, 415, 24, 11);
			
			//Pupils
			g.setColor(new Color(92,92,92));
			g.fillOval(440, 410, 15, 15);
			g.fillOval(495, 410, 15, 15);

			
				//Draw Fish
			Graphics2D gd8 = (Graphics2D) g;
			GradientPaint gp8 = new GradientPaint(15, 100,
			new Color(172,188,213), 100, 100,new Color(75,75,75) , true);
			gd8.setPaint(gp8);
			g.fillOval(320, 450, 35, 120);
			g.fillOval(310, 450, 55, 12);
			g.setColor(Color. white);
			g.fillOval(325, 550, 10, 10);
			g.setColor(Color. black);
			g.fillOval(325, 555, 6, 6);
			
        }
    }

    private void moveIt() {
        while(true){
            if(oneX >= 960){
                oneX= -960;
            }            
            if(oneY >= 960){
                oneY = -960;
            }
            if(oneY <= 7){
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
            pegJframe.repaint();
        }
    }
}

