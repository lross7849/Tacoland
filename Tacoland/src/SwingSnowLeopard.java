import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.applet.*;



public class SwingSnowLeopard {
	final public static class Tester {

		JFrame frame;

		DrawSnowLeopard DrawSnowLeopard;

		private int oneX = 7;

		private int oneY = 7;

		boolean up = false;

		boolean down = true;

		boolean left = false;

		boolean right = true;

		public static void main(String[] args) {

		new Tester().go();

		}

		private void go() {

		frame = new JFrame("SnowLeopard");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DrawSnowLeopard = new DrawSnowLeopard();

		frame.getContentPane().add(BorderLayout.CENTER, DrawSnowLeopard);

		frame.setVisible(true);

		frame.setResizable(false);

		frame.setSize(1600, 1600);

		frame.setLocation(3, 4);

		

		}



		class DrawSnowLeopard extends JPanel {

		public void paintComponent(Graphics g) {

			Graphics2D g2d= (Graphics2D) g;
			//Sky
			GradientPaint cyantoblue = new GradientPaint(0, 0, Color.cyan, 1600, 0, Color.blue);
			g2d.setPaint(cyantoblue);
			g2d.fillRect(0, 0, 1600, 1600);
			
			
			//Sun
			g2d.setColor(new Color(243, 253, 55));
			g2d.fillOval(15, 5, 125, 125);
			
			//Gate
			g2d.setColor(new Color(0, 0, 0));
			g2d.fillRect(0, 200, 1600, 300);
			
			//Bars in the Gate
			g2d.setPaint(cyantoblue);
			g2d.fillRect(15, 230, 10, 250);
			g2d.fillRect(41, 230, 10, 250);
			g2d.fillRect(67, 230, 10, 250);
			g2d.fillRect(93, 230, 10, 250);
			g2d.fillRect(119, 230, 10, 250);
			g2d.fillRect(145, 230, 10, 250);
			g2d.fillRect(171, 230, 10, 250);
			g2d.fillRect(197, 230, 10, 250);
			g2d.fillRect(223, 230, 10, 250);
			g2d.fillRect(249, 230, 10, 250);
			g2d.fillRect(275, 230, 10, 250);
			g2d.fillRect(301, 230, 10, 250);
			g2d.fillRect(327, 230, 10, 250);
			g2d.fillRect(353, 230, 10, 250);
			g2d.fillRect(379, 230, 10, 250);
			g2d.fillRect(405, 230, 10, 250);
			g2d.fillRect(431, 230, 10, 250);
			g2d.fillRect(457, 230, 10, 250);
			g2d.fillRect(483, 230, 10, 250);
			g2d.fillRect(509, 230, 10, 250);
			g2d.fillRect(535, 230, 10, 250);
			g2d.fillRect(561, 230, 10, 250);
			g2d.fillRect(587, 230, 10, 250);
			g2d.fillRect(613, 230, 10, 250);
			g2d.fillRect(639, 230, 10, 250);
			g2d.fillRect(665, 230, 10, 250);
			g2d.fillRect(691, 230, 10, 250);
			g2d.fillRect(717, 230, 10, 250);
			g2d.fillRect(743, 230, 10, 250);
			g2d.fillRect(769, 230, 10, 250);
			g2d.fillRect(795, 230, 10, 250);
			g2d.fillRect(821, 230, 10, 250);
			g2d.fillRect(847, 230, 10, 250);
			g2d.fillRect(873, 230, 10, 250);
			g2d.fillRect(899, 230, 10, 250);
			g2d.fillRect(925, 230, 10, 250);
			g2d.fillRect(951, 230, 10, 250);
			g2d.fillRect(977, 230, 10, 250);
			g2d.fillRect(1003, 230, 10, 250);
			g2d.fillRect(1029, 230, 10, 250);
			g2d.fillRect(1055, 230, 10, 250);
			g2d.fillRect(1081, 230, 10, 250);
			g2d.fillRect(1107, 230, 10, 250);
			g2d.fillRect(1133, 230, 10, 250);
			g2d.fillRect(1159, 230, 10, 250);
			g2d.fillRect(1185, 230, 10, 250);
			g2d.fillRect(1211, 230, 10, 250);
			g2d.fillRect(1237, 230, 10, 250);
			g2d.fillRect(1263, 230, 10, 250);
			g2d.fillRect(1289, 230, 10, 250);
			g2d.fillRect(1315, 230, 10, 250);
			g2d.fillRect(1341, 230, 10, 250);
			g2d.fillRect(1367, 230, 10, 250);
			g2d.fillRect(1393, 230, 10, 250);
			g2d.fillRect(1419, 230, 10, 250);
			g2d.fillRect(1445, 230, 10, 250);
			g2d.fillRect(1471, 230, 10, 250);
			g2d.fillRect(1497, 230, 10, 250);
			g2d.fillRect(1523, 230, 10, 250);
			g2d.fillRect(1549, 230, 10, 250);
			g2d.fillRect(1575, 230, 10, 250);
			 
			//Floor of Habitat
			g2d.setColor(new Color (220, 192, 135));
			g2d.fillRect(0, 500, 1600, 295);
			
			//bushes
			g2d.setColor(new Color (15, 150, 7));
			g2d.fillOval(197, 630, 50, 50);
			g2d.fillOval(175, 660, 50, 50);
			g2d.fillOval(220, 660, 50, 50);
			
			//Body
			g2d.setColor(new Color (250, 250, 250));
			g2d.fillRoundRect(560, 460, 250, 85, 20, 20);
			
			//Animal Head
			g2d.setColor(new Color (255, 255, 255, 255));
			g2d.fillOval(500, 450, 100, 100);
					
			//Right Eye
			g2d.setColor(new Color (0, 0, 0));
			g.fillOval(556, 485, 25, 25);
			g.setColor(new Color (19, 162, 230));
			g.fillOval(563, 490, 13, 13);
					
			//Left Eye
			g.setColor(new Color (0, 0, 0));
			g.fillOval(520, 485, 25, 25);
			g.setColor(new Color (19, 162, 230));
			g.fillOval(525, 490, 13, 13);
					
			//Nose
			g2d.setColor(new Color (105, 105, 105));
			g2d.fillRect(545, 495, 12, 26);
			g2d.setColor(new Color (249, 136, 206));
			g2d.fillOval(545, 521, 10, 10);
			g2d.setColor(new Color (0, 0, 0)); 
			g2d.drawOval(545, 521, 10, 10);
					
			//Mouth
			g2d.setColor(new Color (0, 0, 0));
			g2d.drawArc(525, 500, 50, 50, 0, -180);
					
			//Legs
			g2d.setColor(new Color (250, 250, 250));
			g2d.fillRect(600, 545, 25, 25);
			g2d.fillRect(750, 545, 25, 25);
			g2d.fillRect(635, 535, 25, 25);
			g2d.fillRect(715, 535, 25, 25);
					
			//Spots on Face
			g2d.setColor(new Color (0, 0, 0));
			g2d.fillOval(525, 475, 5, 5);
			g2d.fillOval(531, 481, 5, 5);
			g2d.fillOval(549, 449, 5, 5);
			g2d.fillOval(550, 500, 5, 5);
			g2d.fillOval(575, 525, 5, 5);
			g2d.fillOval(550, 540, 5, 5);
			g2d.fillOval(540, 490, 5, 5);
			g2d.fillOval(510, 525, 5, 5);
			g2d.fillOval(550, 525, 5, 5);
					
			//Spots on Body
			Random randint = new Random(12345);
			for (int k = 1; k <= 100; k++)
			{

				int x = randint.nextInt(200) + 605;
				int y = randint.nextInt(80) + 450;
				g2d.fillOval(x, y, 5, 5);
				int black = randint.nextInt(50);
				g2d.setColor(new Color (black));
				
			
				
		}

		}

		 void moveIt() {

		while(true){

		if(oneX >= 283){

		right = false;

		left = true;

		}

		if(oneX <= 7){

		right = true;

	
		left = false;

		}

		if(oneY >= 259){

		up = true;

		down = false;

		}

		if(oneY <= 7){

		up = false;

		down = true;

		}

		if(up){

		

		}

		if(down){

		oneY++;

		}

		if(left){

		

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

}
}
