//Carlos Salinas

import javax.swing.*;

import java.awt.*;

final public class habitat {

JFrame frame;

DrawRabbit drawRabbitPanel;

boolean up = false;

boolean down = true;

boolean left = false;

boolean right = true;
int x=0;
int y=50;

public static void main(String[] args) {

new habitat().go();

}

private void go() {

frame = new JFrame("Test");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

drawRabbitPanel = new DrawRabbit();

frame.getContentPane().add(BorderLayout.CENTER, drawRabbitPanel);

frame.setVisible(true);

//frame.setResizable(false);

frame.setSize(1200, 800);

frame.setLocation(175, 55);

moveIt();

}

class DrawRabbit extends JPanel {
	
//sky
public void paintComponent(Graphics g) {
	
	int R = (int) (Math.random( )*256);
	int G = (int)(Math.random( )*256);
	int B= (int)(Math.random( )*256);
	Color randomColor = new Color(R, G, B);
	
	
 	g.setColor(new Color(52,186,7));
	 g.fillRect(0, 500, 5000, 5000);
  Graphics2D g2d1 = (Graphics2D) g;
   GradientPaint gp11 = new GradientPaint(5, 1,
  	                Color.red, 20, 20, Color.black, true);

  	        g2d1.setPaint(gp11);
  	        
g2d1.fillRect(0, 0, 5000, 500);
//land
//	g.setColor(Color.green);
g.setColor(new Color(52,186,7));
g.fillOval(200, 400, 300, 300);
g.fillOval(400, 400, 300, 300);
g.fillOval(700, 400, 300, 300);
g.fillOval(900, 400, 300, 300);
g.fillOval(1000, 400, 300, 300);
g.fillOval(1300, 400, 300, 300);
//	g.setColor(Color.yellow);
//g.fillOval(900, 100, 100, 100);
//g.setColor(randomColor);
//clouds

//g.setColor(Color.white);
//g.fillOval(10+x,10+y,500,200);
	

//g.setColor(Color.blue);
g.setColor(randomColor);
g.fillOval(10+x,10+y,500,200);

g.fillOval(150+x,0+y,230,230);
g.setColor(Color.white);


g.fillOval(60+x,70+y,50,50);
g.fillOval(120+x,70+y,50,50);
g.fillOval(180+x,70+y,50,50);
g.fillOval(240+x,70+y,50,50);
g.fillOval(300+x,70+y,50,50);
g.fillOval(360+x,70+y,50,50);
g.fillOval(420+x,70+y,50,50);

//
/*
g.setColor(Color.yellow);
g.fillOval(800, 100, 100, 100);
//sun eyes
g.setColor(Color.black);
g.fillOval(22, 10, 20, 30);
g.fillOval(53, 10, 20, 30);
//sun white
g.setColor(Color.white);
g.fillOval(57, 25, 10, 10);
g.fillOval(25, 25, 10, 10);
//sun mouth
g.setColor(Color.black);
g.fillOval(33, 50, 30, 10);
*/ 
Graphics2D g2d = (Graphics2D) g;
GradientPaint gp1 = new GradientPaint(5, 5,
            Color.red, 20, 20, Color.black, true);

    g2d.setPaint(gp1);
    
g.setColor(Color.white);
    g2d.fillOval(400, 470, 125,150);
//paws
g.setColor(Color.white);
g.fillOval(345, 580, 110,54);
//g.setColor(Color.black);
//g.drawOval(345, 580, 110,54);
g.setColor(Color.white);
g.fillOval(465, 580, 110,54);
//	g.setColor(Color.black);
//	g.drawOval(465, 580, 110,54);

//neck and cheeks

g.setColor(Color.white);
g.fillOval(412, 380, 110,110);

g.setColor(Color.white);
g.fillOval(485, 415, 60,60);


g.setColor(Color.white);
g.fillOval(385, 415, 60,60);

g.setColor(Color.white);
g.fillOval(410, 339, 110,110);

//ears
g.setColor(Color.white);
g.fillOval(400, 280, 50,100);

g.setColor(Color.white);
g.fillOval(470, 280, 50,100);
//
//features
g.setColor(Color.pink);
g.fillOval(437, 400, 50, 30);
g.setColor(Color.black);
//g.drawOval(414, 370, 40, 30);
//	g.drawOval(474, 370, 40, 30);
//eyes
g.setColor(Color.black);
g.fillOval(434, 370, 20, 30);
g.fillOval(474, 370, 20, 30);
//eye circles
g.setColor(Color.white);
g.fillOval(434+10,378,10,10);
g.fillOval(434+50,378,10,10);

//
g.setColor(Color.gray);
g.fillOval(430, 480, 70, 90);
//ears
g.setColor(Color.gray);
g.fillOval(480, 285, 30, 70);
g.fillOval(410, 285, 30, 70);
//mouth
g.setColor(Color.black);
g.fillOval(430, 440, 70, 10);
g.fillRect(452, 440, 32, 32);
g.setColor(Color.white);
g.fillRect(453, 443, 30, 28);
//hands
g.fillOval(350, 490, 80,40);
g.fillOval(500, 490, 80,40);

//2nd bunny
//body
g.setColor(Color.red);
g.fillOval(400+200, 470, 125,150);
//paws

g.fillOval(345+200, 580, 110,54);
//	g.setColor(Color.black);
//	g.drawOval(345+200, 580, 110,54);

g.fillOval(465+200, 580, 110,54);
//	g.setColor(Color.black);
//	g.drawOval(465+200, 580, 110,54);

//neck and cheeks


g.fillOval(412+200, 380, 110,110);


g.fillOval(485+200, 415, 60,60);



g.fillOval(385+200, 415, 60,60);


g.fillOval(410+200, 339, 110,110);

//ears

g.fillOval(400+200, 280, 50,100);


g.fillOval(470+200, 280, 50,100);
//
//features
g.setColor(Color.pink);
g.fillOval(437+200, 400, 50, 30);
g.setColor(Color.black);

//eyes
g.setColor(Color.black);
g.fillOval(434+200, 370, 20, 30);
g.fillOval(474+200, 370, 20, 30);
//eye circle
g.setColor(Color.white);
g.fillOval(434+200,378,10,10);
g.fillOval(434+240,378,10,10);
//
g.setColor(Color.gray);
g.fillOval(430+200, 480, 70, 90);
//ears
g.setColor(Color.gray);
g.fillOval(480+200, 285, 30, 70);
g.fillOval(410+200, 285, 30, 70);
//mouth
g.setColor(Color.black);
g.fillOval(430+200, 440, 70, 10);
g.fillRect(452+200, 440, 32, 32);
g.setColor(Color.white);
g.fillRect(453+200, 443, 30, 28);
//hands
g.setColor(Color.red);
g.fillOval(350+200, 490, 80,40);
g.fillOval(500+200, 490, 80,40);
//3rd bunny
//body
g.setColor(Color.blue);
g.fillOval(400+400, 470, 125,150);
//paws

g.fillOval(345+400, 580, 110,54);
//	g.setColor(Color.black);
//	g.drawOval(345+200, 580, 110,54);

g.fillOval(465+400, 580, 110,54);
//	g.setColor(Color.black);
//	g.drawOval(465+200, 580, 110,54);

//neck and cheeks


g.fillOval(412+400, 380, 110,110);


g.fillOval(485+400, 415, 60,60);



g.fillOval(385+400, 415, 60,60);


g.fillOval(410+400, 339, 110,110);

//ears

g.fillOval(400+400, 280, 50,100);


g.fillOval(470+400, 280, 50,100);
//
//features
g.setColor(Color.pink);
g.fillOval(437+400, 400, 50, 30);
g.setColor(Color.black);

//eyes
g.setColor(Color.black);
g.fillOval(434+400, 370, 20, 30);
g.fillOval(474+400, 370, 20, 30);
//eye circle
g.setColor(Color.white);
g.fillOval(434+400,378,10,10);
g.fillOval(434+440,378,10,10);
//
g.setColor(Color.gray);
g.fillOval(430+400, 480, 70, 90);
//ears
g.setColor(Color.gray);
g.fillOval(480+400, 285, 30, 70);
g.fillOval(410+400, 285, 30, 70);
//mouth
g.setColor(Color.black);
g.fillOval(430+400, 440, 70, 10);
g.fillRect(452+400, 440, 32, 32);
g.setColor(Color.white);
g.fillRect(453+400, 443, 30, 28);
//hands
g.setColor(Color.blue);
g.fillOval(350+400, 490, 80,40);
g.fillOval(500+400, 490, 80,40);
//4th bunny
		//body
	g.setColor(Color.yellow);
		g.fillOval(400+600, 470, 125,150);
		//paws
		
		g.fillOval(345+600, 580, 110,54);
	//	g.setColor(Color.black);
	//	g.drawOval(345+200, 580, 110,54);
		
		g.fillOval(465+600, 580, 110,54);
	//	g.setColor(Color.black);
	//	g.drawOval(465+200, 580, 110,54);
		
		//neck and cheeks
	
		
		g.fillOval(412+600, 380, 110,110);
		
		
		g.fillOval(485+600, 415, 60,60);
		
		

		g.fillOval(385+600, 415, 60,60);
		
	
		g.fillOval(410+600, 339, 110,110);
		
//		ears
		
		g.fillOval(400+600, 280, 50,100);
		
		
		g.fillOval(470+600, 280, 50,100);
//		
//		features
		g.setColor(Color.pink);
		g.fillOval(437+600, 400, 50, 30);
		g.setColor(Color.black);

		//eyes
		g.setColor(Color.black);
		g.fillOval(434+600, 370, 20, 30);
		g.fillOval(474+600, 370, 20, 30);
		//eye circle
		g.setColor(Color.white);
		g.fillOval(434+600,378,10,10);
		g.fillOval(434+640,378,10,10);
		//
		g.setColor(Color.gray);
		g.fillOval(430+600, 480, 70, 90);
//		ears
		g.setColor(Color.gray);
		g.fillOval(480+600, 285, 30, 70);
		g.fillOval(410+600, 285, 30, 70);
		//mouth
		g.setColor(Color.black);
		g.fillOval(430+600, 440, 70, 10);
		g.fillRect(452+600, 440, 32, 32);
		g.setColor(Color.white);
		g.fillRect(453+600, 443, 30, 28);
		//hands
		g.setColor(Color.yellow);
		g.fillOval(350+600, 490, 80,40);
		g.fillOval(500+600, 490, 80,40);
/*		sun eyes
		g.setColor(Color.black);
		g.fillOval(920, 130, 20, 30);
		g.fillOval(960, 130, 20, 30);
		//sun white
		g.setColor(Color.white);
		g.fillOval(925, 145, 10, 10);
		g.fillOval(965, 145, 10, 10);
		//sun mouth
		g.setColor(Color.black);
		g.fillOval(935, 165, 30, 10);
	 
    	//g.setColor(new Color(0,162,232));
  	
g.setColor(Color.BLUE);

g.fillRect(0, 0, this.getWidth(), this.getHeight());

g.setColor(Color.RED);

g.fillRect(3, 3, this.getWidth()-6, this.getHeight()-6);

g.setColor(Color.WHITE);

g.fillRect(6, 6, this.getWidth()-12, this.getHeight()-12);

g.setColor(Color.BLACK);

g.fillRect(oneX, oneY, 6, 6);
 */ 
}

}

private void moveIt() {

while(true){
	int m=5;
	
	
	if(x<1140)
		   m=m*1;
	x=x+m;
if(x>1640)
		
		   m=m*-500;
x=x+m;

try{

Thread.sleep(10);

} catch (Exception exc){}

frame.repaint();

}

}

}