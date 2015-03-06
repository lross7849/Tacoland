import java.awt.Color;
import java.awt.Graphics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Tyrannosaurus_Rex extends JFrame {
	
	public Tyrannosaurus_Rex(){
        super("Tyrannosaurus_Rex");
        
        setContentPane(new DrawPane());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400, 400);

        setVisible(true); 
   }
	
	class DrawPane extends JPanel{
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		drawHabitat(g);
		drawAnimal(g2d);
	}

	private void drawAnimal(Graphics2D g)
	{
		 GradientPaint gp1 = new GradientPaint(5, 5,
	                Color.red, 20, 20, Color.black, true);
		
		g.setPaint(gp1);
		int b = 20;
		int x = 150;
		int y = -175;
		Polygon p = new Polygon();
		p.addPoint(23*b+x,  31*b+y);
		p.addPoint(24*b+x,  32*b+y);
		p.addPoint(24*b+x,  33*b+y);
		p.addPoint(26*b+x,  35*b+y);
		p.addPoint(27*b+x,  35*b+y);
		p.addPoint(29*b+x,  33*b+y);
		p.addPoint(29*b+x,  24*b+y);
		p.addPoint(32*b+x,  21*b+y);
		p.addPoint(34*b+x,  21*b+y);
		p.addPoint(35*b+x,  22*b+y);
		p.addPoint(38*b+x,  22*b+y);
		p.addPoint(38*b+x,  23*b+y);
		p.addPoint(35*b+x,  23*b+y);
		p.addPoint(36*b+x,  24*b+y);
		p.addPoint(35*b+x,  24*b+y);
		p.addPoint(38*b+x,  25*b+y);
		p.addPoint(33*b+x,  25*b+y);
		p.addPoint(32*b+x,  25*b+y);
		p.addPoint(31*b+x,  24*b+y);
		p.addPoint(32*b+x,  25*b+y);
		p.addPoint(33*b+x,  25*b+y);
		p.addPoint(33*b+x,  25*b+y);
		p.addPoint(34*b+x,  29*b+y);
		p.addPoint(35*b+x,  29*b+y);
		p.addPoint(34*b+x,  30*b+y);
		p.addPoint(33*b+x,  29*b+y);
		p.addPoint(33*b+x,  30*b+y);
		p.addPoint(34*b+x,  31*b+y);
		p.addPoint(35*b+x,  31*b+y);
		p.addPoint(34*b+x,  32*b+y);
		p.addPoint(33*b+x,  31*b+y);
		p.addPoint(33*b+x,  33*b+y);
		p.addPoint(34*b+x,  33*b+y);
		p.addPoint(35*b+x,  34*b+y);
		p.addPoint(35*b+x,  36*b+y);
		p.addPoint(36*b+x,  36*b+y);
		p.addPoint(36*b+x,  37*b+y);
		p.addPoint(33*b+x,  37*b+y);
		p.addPoint(33*b+x,  36*b+y);
		p.addPoint(31*b+x,  34*b+y);
		p.addPoint(30*b+x,  34*b+y);
		p.addPoint(31*b+x,  34*b+y);
		p.addPoint(32*b+x,  35*b+y);
		p.addPoint(32*b+x,  37*b+y);
		p.addPoint(33*b+x,  37*b+y);
		p.addPoint(33*b+x,  38*b+y);
		p.addPoint(30*b+x,  38*b+y);
		p.addPoint(30*b+x,  37*b+y);
		p.addPoint(29*b+x,  36*b+y);
		p.addPoint(26*b+x,  36*b+y);
		p.addPoint(23*b+x,  33*b+y);
		g.fillPolygon(p);
	}
		
	
	private void drawHabitat(Graphics g)
	{
		g.setColor(new Color(68,233,247));
		g.fillRect(0,0,2000,400);
		g.setColor(new Color(27,129,34));
		g.fillRect(0,400,2000,600);
	}
}
}
