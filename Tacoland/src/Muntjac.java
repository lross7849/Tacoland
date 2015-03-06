import java.awt.*;
import java.applet.*;
//Collin Norwood
public class Muntjac extends Applet{

        public void paint(Graphics g)
        {
                drawHabitat(g);
                drawAnimal(g);
        }
        private void drawHabitat(Graphics g)
        {
                
                g.setColor(new Color(100,200,255));
                g.fillRect(0, 0, 1200, 800);
                g.setColor(new Color(9,164,0));
                g.fillRect(0,550,1200,1000);
                g.fillOval(-100, 500, 700, 200);
                g.fillOval(300, 500, 500, 200);
                g.fillOval(380, 500, 700, 200);
                g.fillOval(800, 500, 400, 250);
                g.setColor(Color.yellow);
                g.fillOval(697,97,80,80);
                g.setColor(Color.orange);
                g.fillOval(700, 100, 75, 75);
        }
        private void drawAnimal(Graphics g)
        {
        	g.setColor(new Color(140, 115, 50));
        	g.fillRect(450, 100, 100, 100);	
        }


}

