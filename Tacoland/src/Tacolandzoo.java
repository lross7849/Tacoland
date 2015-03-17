//Levi, Jesse, Carlos, Jacob and Lori

import java.awt.*;
import java.applet.*;
import java.awt.*;
import java.awt.event. *;

import javax.swing.*; 

public class Tacolandzoo {
	private JFrame WelcomeJframe, Branch1Jframe, Branch2Jframe, SmallLandAnimalMapJframe, LargeLandAnimalMapJframe, AquaticMapJframe;
	private ActionListener action;
	private JButton Opening, Land, Aquatic, Small, Large, bBunbun, bDolphin, bdragon, 
	bElephant, bFish, bflamingo, bhabitat, bjPenguin, bjsnake, bleopard, bLion, bMeerkat, 
	bmonkey, bMuntjac, bPandaBear, bShark, Main1, Main2, Main3;
	
	
	boolean move = true;
	
	public void MainMethod()
	{
		
		//Variables for jframe's size and location
		final short lsize = 1000;
		final short hsize = 750;	
		final short xloc = 200;
		final short yloc = 10;
		
	
		
		WelcomeJframe = new JFrame ("Welcome to Tacoland Zoo!");
		
		WelcomeJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WelcomeJframe.setLocationByPlatform(true);
		
		
		WelcomeClass WelcomePanel = new WelcomeClass();
		
		final Branch1Class Branch1Panel = new Branch1Class();
		final Branch2Class Branch2Panel = new Branch2Class();
		final AquaticClass AquaticPanel = new AquaticClass();
		//final DrawPenguinPanel penguinpanel = new DrawPenguinPanel();
		final SmallLandAnimalMapClass SmallLandAnimalMapPanel = new SmallLandAnimalMapClass();
		final LargeLandAnimalMapClass LargeLandAnimalMapPanel = new LargeLandAnimalMapClass();
			
		
		Opening = new JButton("Click Here to go into the zoo!");
		Land = new JButton("Land Animals");
		Aquatic = new JButton("Aquatic Animals");
		Small = new JButton("Small Land Animals");
		Large = new JButton("Large Land Animals");
		Main1 = new JButton("Back to Gate");
		Main2 = new JButton("Back to Gate");
		Main3 = new JButton("Back to Gate");
		
		action = new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				JButton button = (JButton) ae.getSource();			
				
				
				if (button == Opening)
				{
					Branch1Jframe = new JFrame("What would you like to see?");
					Branch1Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					Branch1Jframe.setLocationByPlatform(true);
					
					Branch1Panel.add(Land);
					Branch1Panel.add(Aquatic);
					
					Branch1Jframe.getContentPane().add(Branch1Panel);
					Branch1Jframe.setSize(lsize, hsize);
				    Branch1Jframe.setLocation(xloc,yloc);
				    Branch1Jframe.setResizable(false);
				    
					Branch1Jframe.setVisible(true);
					WelcomeJframe.setVisible(false);
				}
				
				else if (button == Land)
				{
					Branch2Jframe = new JFrame("Pick one of the two catigorizes.");
					Branch2Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					Branch2Jframe.setLocationByPlatform(true);
					
					Branch2Panel.add(Small);
					Branch2Panel.add(Large);
					
					Branch2Jframe.getContentPane().add(Branch2Panel);
					Branch2Jframe.setSize(lsize,hsize);
					Branch2Jframe.setLocation(xloc,yloc);
					Branch2Jframe.setResizable(false);
					
					Branch2Jframe.setVisible(true);
					Branch1Jframe.setVisible(false);
				
				}
			
				else if (button == Aquatic)
				{
				
					AquaticMapJframe = new JFrame("Aquatic Map: Pick the animal of your choice. ");
					AquaticMapJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					AquaticMapJframe.setLocationByPlatform(true);
				
					AquaticPanel.add(Main1);
					//add animal buttons later
				
					AquaticMapJframe.getContentPane().add(AquaticPanel);
					AquaticMapJframe.setSize(lsize, hsize);
					AquaticMapJframe.setLocation(xloc,yloc);
					AquaticMapJframe.setResizable(false);
					
					AquaticMapJframe.setVisible(true);
					Branch1Jframe.setVisible(false);
				
				}
					
				else if (button == Small)
				{
					SmallLandAnimalMapJframe = new JFrame("Small Land Animal Map: Pick the animal of your choice. ");
					SmallLandAnimalMapJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					SmallLandAnimalMapJframe.setLocationByPlatform(true);
				
					SmallLandAnimalMapPanel.add(Main2);
					//add animal buttons later
				
					SmallLandAnimalMapJframe.getContentPane().add(SmallLandAnimalMapPanel);
					SmallLandAnimalMapJframe.setSize(lsize, hsize);
					SmallLandAnimalMapJframe.setLocation(xloc,yloc);
					SmallLandAnimalMapJframe.setResizable(false);
					
					SmallLandAnimalMapJframe.setVisible(true);
					Branch2Jframe.setVisible(false);
				}
			
				else if (button == Large)
				{
					LargeLandAnimalMapJframe = new JFrame("Large Land Animal Map: Pick the animal of your choice. ");
					LargeLandAnimalMapJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					LargeLandAnimalMapJframe.setLocationByPlatform(true);
				
					LargeLandAnimalMapPanel.add(Main3);
					//add animal buttons later
				
					LargeLandAnimalMapJframe.getContentPane().add(LargeLandAnimalMapPanel);
					LargeLandAnimalMapJframe.setSize(lsize, hsize);
					LargeLandAnimalMapJframe.setLocation(xloc,yloc);
					LargeLandAnimalMapJframe.setResizable(false);
					
					LargeLandAnimalMapJframe.setVisible(true);
					Branch2Jframe.setVisible(false);
				}
			
				 if (button == Main1)
				{
					WelcomeJframe.setVisible(true);
					AquaticMapJframe.setVisible(false);
			
				}
				 
				 if (button == Main2)
				 {
					 WelcomeJframe.setVisible(true);
					 SmallLandAnimalMapJframe.setVisible(false);
						
				 }
			
				 if (button == Main3)
				 {
					 WelcomeJframe.setVisible(true);
					 LargeLandAnimalMapJframe.setVisible(false);
				 }
			}
		
		};
		
		Opening.addActionListener(action);
		Land.addActionListener(action);
		Aquatic.addActionListener(action);
		Small.addActionListener(action);
		Large.addActionListener(action);
		Main1.addActionListener(action);
		Main2.addActionListener(action);
		Main3.addActionListener(action);
		
		WelcomePanel.add(Opening);
		
		WelcomeJframe.getContentPane().add(WelcomePanel);
		WelcomeJframe.setSize(lsize, hsize);
		WelcomeJframe.setLocation(xloc, yloc);
		WelcomeJframe.setResizable(false);
		WelcomeJframe.setVisible(true);
	

	}
	
	public static void main(String args[])
	{
		
		
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Tacolandzoo().MainMethod();
			}
		});
		
			
	}

    class WelcomeClass extends JPanel 
    {
   
    	public void paintComponent(Graphics g) 
        {
    	
    	/** Class that draws the first screen of our Tacoland project **/

    	//Sky	
    		//Sky color + body
			Graphics2D gd1 = (Graphics2D) g;
			GradientPaint gd2 = new GradientPaint(1600, 1000,
			new Color(240,240,250), 1000, 2000,  new Color(120,200,250), true);
			gd1.setPaint(gd2);
			g.fillRect(0, 0, 1000, 750);
			
			//Clouds 
			g.setColor(new Color(250,250,250));
			g.fillOval(90,60,150,90);
			
			
		//Background trees
			//First tree
			
			int m = 41;
			
			g.setColor(new Color(140,90,10));
			g.fillRect(65-m, 410, 128, 490);
			
			gd1.setPaint(gd2);
			g.fillOval(55-m, 350, 40, 350);
			g.fillOval(167-m, 350, 50, 350);
			
			g.setColor(new Color(107,180,20));
			g.fillOval(10-m,250,200,150);
			g.fillOval(-20-m,310,120,120);
			g.fillOval(180-m,310,60,60);
			g.fillOval(130-m,260,90,90);
			g.fillOval(100-m,330,160,85);
			g.fillOval(50-m, 380, 100, 50);
			
			
			
			
		
		//Gate
			//Gate's Gradient Color
			Graphics2D gd3 = (Graphics2D) g;
			GradientPaint gd4 = new GradientPaint(25, 200,
			new Color(100,100,100), 100, 100,  new Color(0,0,0), true);
			gd3.setPaint(gd4);
			
			//Gate's main draw bar loop
			short i = -2;
			while (i<=1000)
			{
				g.fillRect(i, 200, 8, 550);
				g.fillOval(i-4, 192, 15, 14);	
				i+=20;
			}
			
			
		//Sky Rectangle Overlay	#1
			gd1.setPaint(gd2);
			g.fillRect(250, 300, 500, 450);
			
			
		//Gate's additional bars
			//Gate Color
			gd3.setPaint(gd4);
			
			//Small indent bar loop
			for (i=-2; i<=1000; i+=20)
			g.fillRect(i, 300, 8, 6);
			
			//Horizontal bars (descending y cord. order)
			g.fillRect(0,210 , 1000, 8);
			g.fillRect(0,225 , 1000, 8);
			g.fillRect(0, 292, 1000, 8);
			//(insert #1)
			g.fillRect(0, 292+92, 1000, 8);
			g.fillRect(0, 292+92+92, 1000, 8);
			g.fillRect(0, 292+92+92+92, 1000, 8);
			g.fillRect(0, 292+92+92+92+82, 1000, 8);
			g.fillRect(0, 292+92+92+92+82+15, 1000, 8);
			
			
		//Sky Rectangle	Overlay #2
			gd1.setPaint(gd2);
			g.fillRect(248, 310, 508, 450);
			
			
		//Gate additional bar (insert #1)	
			gd3.setPaint(gd4);
			g.fillRect(0, 292+15, 1000, 8);
			
			
		//Gate Sign border
			//Gate sign's border color
			Graphics2D gd9 = (Graphics2D) g;
			GradientPaint gd10 = new GradientPaint(25, 200,
			new Color(210,210,210), 100, 100,  new Color(209-25,180-25,12-12), true);
			gd9.setPaint(gd10);
			
			//Draw gate sign's border
			g.fillRect(250, 304, 505, 104);

			
		//Gate sign	
			//Gate sign color
			Graphics2D gd5 = (Graphics2D) g;
			GradientPaint gd6 = new GradientPaint(25, 200,
			new Color(250,250,250), 100, 100,  new Color(209,180,12), true);
			gd5.setPaint(gd6);
			
			//Draw gate sign
			g.fillRect(255, 306, 495, 100);
			
			
		//Sign's Text
			//Text color
			Graphics2D gd7 = (Graphics2D) g;
			GradientPaint gd8 = new GradientPaint(25, 200,
			new Color(60,60,60), 100, 100,  new Color(0,0,0), true);
			gd7.setPaint(gd8);
			
			//Font, size and draw string
			Font abc = new Font("Jokerman",Font.BOLD, 90);
			g.setFont(abc);
			g.drawString("Tacoland", 275, 396);
			
			
		//Disclaimer sign	
			//Sign Shape
			Graphics2D gd11 = (Graphics2D) g;
			GradientPaint gd12 = new GradientPaint(25, 200,
			new Color(250,250,250), 100, 100,  new Color(220,220,220), true);
			gd11.setPaint(gd12);
			g.fillOval(794, 400, 50, 50);
			g.fillOval(900, 400, 50, 50);
			g.fillOval(794, 510, 50, 50);
			g.fillOval(900, 510, 50, 50);
			Polygon d = new Polygon();
			d.addPoint(794,425);
			d.addPoint(794, 535);
			d.addPoint(950,535);
			d.addPoint(950,425);
			g.fillPolygon(d);
			Polygon di = new Polygon();
			di.addPoint(819, 400);
			di.addPoint(925, 400);
			di.addPoint(925, 560);
			di.addPoint(819, 560);
			g.fillPolygon(di);
			
			//Disclaimer sign text
			Font dis = new Font("Arial", Font.BOLD,20);
			g.setFont(dis);
			g.setColor(Color.red);
			g.drawString("DISCLAIMER:",804, 450);
			Font disi = new Font("Arial", Font.BOLD,16);
			g.setFont(disi);
			g.setColor(Color.black);
			g.drawString("Tacoland does not", 802, 470);
			g.drawString("infuse or create", 802, 487);
			g.drawString("any of their sold", 802, 504);
			g.drawString("food products with", 802, 521);
			g.drawString("their zoo animals", 802, 538);
			
			
		//Ground
			g.setColor(new Color(150,150,150));
			g.fillRect(0, 680, 1000, 70);
    
        }
    }

    
    class Branch1Class extends JPanel 
    {
       
    	public void paintComponent(Graphics g) 
        {
        
    	/** Class that is drawn after WelcomeClass in our Tacoland project**/
    		
    	//Grass
    		g.setColor(new Color(34,177,76));
    		g.fillRect(0,0,1000,750);
    	
    		
    	//Main path oval
    		//Main path oval color
    		Graphics2D sk1 = (Graphics2D) g;
			GradientPaint sk2 = new GradientPaint(25, 1500,
			new Color(224,203,101), 100, 100,  new Color(239,228,176), true);
			sk1.setPaint(sk2);
			
			//Draw main path oval
    		g.fillOval(0, 400, 1000, 750);
    		
    		
    	//Left path
    		Polygon  l= new Polygon();
    		l.addPoint(0, 0);
    		l.addPoint(0, 50);
    		l.addPoint(250, 900);
    		l.addPoint(500, 900);
    		l.addPoint(160, 0);
    		g.fillPolygon(l);
    		
    		
    	//Right path
    		Polygon  r = new Polygon();
    		r.addPoint(1000, 0);
    		r.addPoint(1000, 50);
    		r.addPoint(750, 900);
    		r.addPoint(500, 900);
    		r.addPoint(840, 0);
    		g.fillPolygon(r);
    		
    		
    	//Left Sign
			//Draw left sign shape
    		g.setColor(new Color(220,140,51));
			g.fillRect(305,300,100,60);	
			g.fillRect(345,300,20,110);	
			
			//Draw left sign text
			Font SignFont = new Font("Garamond", Font.BOLD,29);
			g.setFont(SignFont);
			g.setColor(Color.gray);
			g.drawString(("Land "), 316, 325);
			g.drawString(("Animals"), 305, 347);
		
			
		//Right Sign
			//Draw right sign shape
			g.setColor(new Color(220,140,51));
			g.fillRect(305+290,300,100,60);	
			g.fillRect(345+290,300,20,110);	
			
			//Draw right sign text
			g.setFont(SignFont);
			g.setColor(Color.gray);
			g.drawString(("Aquatic "), 308+290, 325);
			g.drawString(("Animals"), 305+290, 347);
        
        }
    }
    
    
    class Branch2Class extends JPanel 
    {
       
      	public void paintComponent(Graphics g) 
        {
    
      	/** Class that is drawn after Branch1Class (Animals) in our Tacoland project **/
      		
      	//Sky	
      		//Sky color + body
      		Graphics2D gd1 = (Graphics2D) g;
			GradientPaint gd2 = new GradientPaint(1500, 2000,
			new Color(250,250,250), 1000, 2000,  new Color(120,200,250), true);
			gd1.setPaint(gd2);
			g.fillRect(0,0,1000,750);
		
			
		//Land	
			g.setColor(new Color(34,177,76));
			g.fillRect(0,300,1000,750);
		
			
		//Dividing line	
			g.setColor(Color.black);
			g.fillRect(490,0,3,750);
	
			
		//Left path		
			g.setColor(new Color(224,203,101));
			Polygon f = new Polygon();
			f.addPoint(160, 300);
			f.addPoint(350, 300);
			f.addPoint(470, 900);
			f.addPoint(40, 900);
			g.fillPolygon(f);
			
			
		//Right path
			Polygon a = new Polygon();
			a.addPoint(620, 300);
			a.addPoint(810, 300);
			a.addPoint(930, 900);
			a.addPoint(500, 900);
			g.fillPolygon(a);


		//Left sign
			//Left sign shape
			g.setColor(new Color(220,140,51));
			g.fillRect(50,150,150,80);
			g.fillRect(110,230,20, 80);
			
			//Left sign text
			Font thefont=new Font ("Garamond",Font.BOLD,22);
			g.setColor(Color.black);
			g.setFont(thefont);
			g.drawString("Small Animals",55 , 200);
			
			
		//Right sign
			//Right sign shape
			g.setColor(new Color(220,140,51));
			g.fillRect(800,150,150,80);
			g.fillRect(870,230,20, 80);
			
			//Right sign text
			g.setColor(Color.black);
			g.setFont(thefont);
			g.drawString("Big Animals",815 , 200);
			
		
		//Button enclosed rectangles
			//Outer Rectangle
			g.setColor(new Color(0,0,0));
			g.fillRect(332, 0, 321, 43);
			
			//Inner Rectangle
			g.setColor(new Color(0,250,250));
			g.fillRect(335, 0, 315, 40);
			
			
        }
    }
    
    
    class AquaticClass extends JPanel 
    {
       
    	public void paintComponent(Graphics g) 
        {
        
    	/** Class that is drawn after Branch1Class (Aquatic) in our Tacoland project **/	
    		
    		Graphics2D sk1 = (Graphics2D) g;
        	
    	//Water
			g.setColor(new Color(130,130,250));
			g.fillRect(0,0,1000,750);
		
			
		//Bottom Left Grass island
			g.setColor(new Color(34,177,76));
    		g.fillRect(0,550,400,750);
    		g.fillOval(360,550,80,80);
			g.fillRect(360,590,80,300);
		
			
		//Bottom Left Grass Island Path
			GradientPaint sk2 = new GradientPaint(25, 1500,
			new Color(224,203,101), 100, 100,  new Color(239,228,176), true);
			sk1.setPaint(sk2);
			Polygon FIP = new Polygon();
			FIP.addPoint(40,750);
			FIP.addPoint(40,550);
			FIP.addPoint(80,550);
			FIP.addPoint(80,630);
			FIP.addPoint(440,630);
			FIP.addPoint(440,670);
			FIP.addPoint(80,670);
			FIP.addPoint(80,790);
			g.fillPolygon(FIP);
			
			
		//Right Middle Island
			Polygon RMI = new Polygon();
					
        }
    }
   
    
    class SmallLandAnimalMapClass extends JPanel 
    {
       
    	public void paintComponent(Graphics g) 
        {
        	
			g.setColor(Color. red);
			
			g.fillRect(0,0,1000,750);
			
				
		
        }
    }
    
    
    class LargeLandAnimalMapClass extends JPanel 
    {
       
    	public void paintComponent(Graphics g) 
        {
        	
			g.setColor(Color.green);
			g.fillRect(0,0,1000,750);
			
				
		
        }
    }
    
    


}


