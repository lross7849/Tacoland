//Levi, Jesse, Carlos, Jacob and Lori
/*new Tacolandzoo().MainMethod(); */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Tacolandzoo {
	private JFrame WelcomeJframe, Branch1Jframe, Branch2Jframe, SmallLandAnimalMapJframe,
	LargeLandAnimalMapJframe, AquaticMapJframe, PenguinJframe, FishJframe, BunbunJframe, RabbitJframe;
	private ActionListener action;
	private JButton WelcomeButton, LandButton, AquaticButton, SmallButton, LargeButton, BunbunButton, DolphinButton,
	DragonButton, ElephantButton, FishButton, FlamingoButton, RabbitButton, PenguinButton, SnakeButton, bleopard, 
	LionButton, bMeerkat, bmonkey, bMuntjac, bPandaBear, bShark, MainA, MainS, MainL, MainB2, MainB1;
	
	
    private int oneX = 7;
    private int oneY = 967;
    
    boolean up = false;
    boolean down = true;
    boolean left = false;
    boolean right = true;
    
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
		
		
	//Classes extending DrawPanels
		//
		WelcomeClass WelcomePanel = new WelcomeClass();
		final Branch1Class Branch1Panel = new Branch1Class();
		final Branch2Class Branch2Panel = new Branch2Class();
		final AquaticClass AquaticPanel = new AquaticClass();
		final SmallLandAnimalMapClass SmallLandAnimalMapPanel = new SmallLandAnimalMapClass();
		final LargeLandAnimalMapClass LargeLandAnimalMapPanel = new LargeLandAnimalMapClass();

		//Aquatic Land Animals' classes extending DrawPanels
		final jPenguin pBird = new jPenguin(); 
		final jPenguin.DrawPenguinPanel PenguinPanel = pBird.new DrawPenguinPanel();
		
		final FishClass FishPanel = new FishClass();
		
		
		//Small Land Animals' classes extending DrawPanels
		final Bunbun Bunn = new Bunbun();
		final Bunbun.drawBunbun BunbunPanel = Bunn.new drawBunbun();
		
		final habitat Rab = new habitat();
		final habitat.DrawRabbit drawRabbitPanel = Rab.new DrawRabbit();

		
		//Large Land Animals' classes extending DrawPanels
		
		
	//Declaring buttons and their names
		//Zoo's main slide buttons
		WelcomeButton = new JButton("Click Here to go into the zoo!");
		LandButton = new JButton("Land Animals");
		AquaticButton = new JButton("Aquatic Animals");
		SmallButton = new JButton("Small Land Animals");
		LargeButton = new JButton("Large land Animals");
		MainA = new JButton("Go to Previous Page");
		MainS = new JButton("Go to Previous Page");
		MainL = new JButton("Go to Previous Page");
		MainB2 = new JButton("Go to Previous Page");
		MainB1 = new JButton("Go Back to Zoo Gates");

		
		//Aquatic Animals buttons
		DolphinButton = new JButton("Dolphine");
		PenguinButton = new JButton ("Penguin");
		FishButton = new JButton ("Fish");
	
		
		//Small Animals buttons
		BunbunButton = new JButton("Bunbun");
		RabbitButton = new JButton("Rabbit");
		
		//Large Animals buttons
		DragonButton = new JButton("Dragon");
		ElephantButton = new JButton("Elephant");
		
		
		action = new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				JButton button = (JButton) ae.getSource();			
				
				
				if (button == WelcomeButton)
				{
					Branch1Jframe = new JFrame("What would you like to see?");
					Branch1Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					Branch1Jframe.setLocationByPlatform(true);
					
					Branch1Panel.add(LandButton);
					Branch1Panel.add(MainB1);
					Branch1Panel.add(AquaticButton);
					
					
					Branch1Jframe.getContentPane().add(Branch1Panel);
					Branch1Jframe.setSize(lsize, hsize);
				    Branch1Jframe.setLocation(xloc,yloc);
				    Branch1Jframe.setResizable(false);
				    
					Branch1Jframe.setVisible(true);
					WelcomeJframe.setVisible(false);
				}
				
				else if (button == LandButton)
				{
					Branch2Jframe = new JFrame("Pick one of the two catigorizes.");
					Branch2Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					Branch2Jframe.setLocationByPlatform(true);
					
					Branch2Panel.add(SmallButton);
					Branch2Panel.add(MainB2);
					Branch2Panel.add(LargeButton);
					
					Branch2Jframe.getContentPane().add(Branch2Panel);
					Branch2Jframe.setSize(lsize,hsize);
					Branch2Jframe.setLocation(xloc,yloc);
					Branch2Jframe.setResizable(false);
					
					Branch2Jframe.setVisible(true);
					Branch1Jframe.setVisible(false);
				
				}
			
				else if (button == AquaticButton)
				{
				
					AquaticMapJframe = new JFrame("AquaticButton Map: Pick the animal of your choice. ");
					AquaticMapJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					AquaticMapJframe.setLocationByPlatform(true);
				
					AquaticPanel.add(MainA);
					AquaticPanel.add(DolphinButton);
					AquaticPanel.add(PenguinButton);
					AquaticPanel.add(FishButton);

			
					//add animal Tacolandzoo later
				
					AquaticMapJframe.getContentPane().add(AquaticPanel);
					AquaticMapJframe.setSize(lsize, hsize);
					AquaticMapJframe.setLocation(xloc,yloc);
					AquaticMapJframe.setResizable(false);
					
					AquaticMapJframe.setVisible(true);
					Branch1Jframe.setVisible(false);
				
				}
					
				else if (button == SmallButton)
				{
					SmallLandAnimalMapJframe = new JFrame("Small Land Animal Map: Pick the animal of your choice. ");
					SmallLandAnimalMapJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					SmallLandAnimalMapJframe.setLocationByPlatform(true);
				
					SmallLandAnimalMapPanel.add(MainS);
					SmallLandAnimalMapPanel.add(BunbunButton);
					SmallLandAnimalMapPanel.add(RabbitButton);
				
					SmallLandAnimalMapJframe.getContentPane().add(SmallLandAnimalMapPanel);
					SmallLandAnimalMapJframe.setSize(lsize, hsize);
					SmallLandAnimalMapJframe.setLocation(xloc,yloc);
					SmallLandAnimalMapJframe.setResizable(false);
					
					SmallLandAnimalMapJframe.setVisible(true);
					Branch2Jframe.setVisible(false);
				}
			
				else if (button == LargeButton)
				{
					LargeLandAnimalMapJframe = new JFrame("Large Land Animal Map: Pick the animal of your choice. ");
					LargeLandAnimalMapJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					LargeLandAnimalMapJframe.setLocationByPlatform(true);
				
					LargeLandAnimalMapPanel.add(MainL);
					LargeLandAnimalMapPanel.add(DragonButton);
					LargeLandAnimalMapPanel.add(ElephantButton);
					//add animal Tacolandzoo later
				
					LargeLandAnimalMapJframe.getContentPane().add(LargeLandAnimalMapPanel);
					LargeLandAnimalMapJframe.setSize(lsize, hsize);
					LargeLandAnimalMapJframe.setLocation(xloc,yloc);
					LargeLandAnimalMapJframe.setResizable(false);
					
					LargeLandAnimalMapJframe.setVisible(true);
					Branch2Jframe.setVisible(false);
				}
			
				 if (button == MainA)
				{
					Branch1Jframe.setVisible(true);
					AquaticMapJframe.setVisible(false);
			
				}
				 
				 if (button == MainS)
				 {
					 Branch2Jframe.setVisible(true);
					 SmallLandAnimalMapJframe.setVisible(false);
						
				 }
			
				 if (button == MainL)
				 {
					 Branch2Jframe.setVisible(true);
					 LargeLandAnimalMapJframe.setVisible(false);
				 }
				 
				 if (button == MainB2)
				 {
					 Branch1Jframe.setVisible(true);
					 Branch2Jframe.setVisible(false);
				 }
				 
				 if (button == MainB1)
				 {
					 WelcomeJframe.setVisible(true);
					 Branch1Jframe.setVisible(false);
				 }
				 
				 
				 if (button == BunbunButton){
					 
					 BunbunJframe = new JFrame("It is a penguin");
					 BunbunJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 BunbunJframe.setLocationByPlatform(true);
					
					
					
					BunbunJframe.getContentPane().add(BunbunPanel);
					BunbunJframe.setSize(lsize, hsize);
					BunbunJframe.setLocation(xloc,yloc);
					BunbunJframe.setResizable(true);
						
					BunbunJframe.setVisible(true);
						AquaticMapJframe.setVisible(false);
					 
					 
				 }
						 
				 if (button == RabbitButton)
				 {
					 
					 RabbitJframe = new JFrame("It is a Rabbit");
					 RabbitJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 RabbitJframe.setLocationByPlatform(true);
					
					
					
					 RabbitJframe.getContentPane().add(drawRabbitPanel);
					 RabbitJframe.setSize(lsize, hsize);
					 RabbitJframe.setLocation(xloc,yloc);
					 RabbitJframe.setResizable(true);
						
					 RabbitJframe.setVisible(true);
						SmallLandAnimalMapJframe.setVisible(false);
					 
					 
				 }
				 
				 
				 if (button == PenguinButton){
					 
					 
					 PenguinJframe = new JFrame("It is a penguin");
					 PenguinJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 PenguinJframe.setLocationByPlatform(true);
					
					
					
					 PenguinJframe.getContentPane().add(PenguinPanel);
					 PenguinJframe.setSize(lsize, hsize);
					 PenguinJframe.setLocation(xloc,yloc);
					 PenguinJframe.setResizable(true);
						
					 PenguinJframe.setVisible(true);
						AquaticMapJframe.setVisible(false);
					 
				 }
				 
				 if (button == FishButton)
				 {
					 	
					
						FishJframe = new JFrame("It is a Fish");
						FishJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						FishJframe.setLocationByPlatform(true);
					
					
				
						//add animal Tacolandzoo later
					
						FishJframe.getContentPane().add(FishPanel);
						FishJframe.setSize(lsize, hsize);
						FishJframe.setLocation(xloc,yloc);
						FishJframe.setResizable(true);
						
						FishJframe.setVisible(true);
						AquaticMapJframe.setVisible(false);
					
					 
				 }
				 
				 
				 
				 
			}

		
		};
		
	//Action Listeners
		WelcomeButton.addActionListener(action);
		LandButton.addActionListener(action);
		AquaticButton.addActionListener(action);
		SmallButton.addActionListener(action);
		LargeButton.addActionListener(action);
		MainA.addActionListener(action);
		MainS.addActionListener(action);
		MainL.addActionListener(action);
		MainB2.addActionListener(action);
		MainB1.addActionListener(action);
		
		//Aquatic Animals' Action Listeners
		DolphinButton.addActionListener(action);
		PenguinButton.addActionListener(action);
		FishButton.addActionListener(action);

		//Small Land Animals' Action Listeners
		BunbunButton.addActionListener(action);
		RabbitButton.addActionListener(action);
		
		//Large Land Animals' Action Listeners
		DragonButton.addActionListener(action);
		ElephantButton.addActionListener(action);
		
		
		WelcomePanel.add(WelcomeButton);
		
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
			Graphics2D CL1 = (Graphics2D) g;
			GradientPaint CL2 = new GradientPaint(1600, 1000,
			new Color(240,240,250), 1000, 2000,  new Color(120,200,250), true);
			CL1.setPaint(CL2);
			g.fillRect(0, 0, 1000, 750);
			
			//Clouds 
			g.setColor(new Color(250,250,250));
			g.fillOval(90,60,150,90);
			
			
		//Background tree
			//Math integers
			byte m = 41;
			byte q = 35; 
			
			
			Graphics2D CL03 = (Graphics2D) g;
			GradientPaint CL04 = new GradientPaint(200, 150,
			new Color(220-q-30,175-q-30,73-q-30), 100,100,  new Color(220-q,175-q,73-q), true);
			CL03.setPaint(CL04);
			
			g.fillRect(65-m, 410, 128, 490);
			
			CL1.setPaint(CL2);
			g.fillOval(55-m, 350, 40, 350);
			g.fillOval(167-m, 350, 50, 350);
			
			Graphics2D CL05 = (Graphics2D) g;
			GradientPaint CL06 = new GradientPaint(300, 150,
			new Color(100,140,40), 100, 100,  new Color(125+10,190+10,45), true);
			CL05.setPaint(CL06);
	
			g.fillOval(10-m,250,200,150);
			g.fillOval(-20-m,310,120,120);
			g.fillOval(180-m,310,60,60);
			g.fillOval(130-m,260,90,90);
			g.fillOval(100-m,330,160,85);
			g.fillOval(50-m, 380, 100, 50);
			
			
			
			
		
		//Gate
			//Gate's Gradient Color
			Graphics2D CL3 = (Graphics2D) g;
			GradientPaint CL4 = new GradientPaint(25, 200,
			new Color(100,100,100), 100, 100,  Color.black, true);
			CL3.setPaint(CL4);
			
			//Gate's main draw bar loop
			short i = -2;
			while (i<=1000)
			{
				g.fillRect(i, 200, 8, 550);
				g.fillOval(i-4, 192, 15, 14);	
				i+=20;
			}
			
			
		//Sky Rectangle Overlay	#1
			CL1.setPaint(CL2);
			g.fillRect(250, 300, 500, 450);
			
			
		//Gate's additional bars
			//Gate Color
			CL3.setPaint(CL4);
			
			//SmallButton indent bar loop
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
			CL1.setPaint(CL2);
			g.fillRect(248, 310, 508, 450);
			
			
		//Gate additional bar (insert #1)	
			CL3.setPaint(CL4);
			g.fillRect(0, 292+15, 1000, 8);
			
			
		//Gate Sign border
			//Gate sign's border color
			Graphics2D CL9 = (Graphics2D) g;
			GradientPaint CL10 = new GradientPaint(25, 200,
			new Color(210,210,210), 100, 100,  new Color(209-25,180-25,12-12), true);
			CL9.setPaint(CL10);
			
			//Draw gate sign's border
			g.fillRect(250, 304, 505, 104);

			
		//Gate sign	
			//Gate sign color
			Graphics2D CL5 = (Graphics2D) g;
			GradientPaint CL6 = new GradientPaint(25, 200,
			new Color(250,250,250), 100, 100,  new Color(209,180,12), true);
			CL5.setPaint(CL6);
			
			//Draw gate sign
			g.fillRect(255, 306, 495, 100);
			
			
		//Sign's Text
			//Text color
			Graphics2D CL7 = (Graphics2D) g;
			GradientPaint CL8 = new GradientPaint(25, 200,
			new Color(60,60,60), 100, 100,  new Color(0,0,0), true);
			CL7.setPaint(CL8);
			
			//Font, size and draw string
			Font abc = new Font("Jokerman",Font.BOLD, 90);
			g.setFont(abc);
			g.drawString("Tacoland", 275, 396);
			
			
		//Disclaimer sign	
			//Sign Shape
			Graphics2D CL11 = (Graphics2D) g;
			GradientPaint CL12 = new GradientPaint(25, 200,
			new Color(250,250,250), 100, 100,  new Color(220,220,220), true);
			CL11.setPaint(CL12);
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
    	
    	//
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
    		g.setColor(new Color(220-20,140-20,51-20));
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
			g.setColor(new Color(220-20,140-20,51-20));
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
      		Graphics2D CL1 = (Graphics2D) g;
			GradientPaint CL2 = new GradientPaint(1500, 2000,
			new Color(250,250,250), 1000, 2000,  new Color(120,200,250), true);
			CL1.setPaint(CL2);
			g.fillRect(0,0,1000,750);
		
			
		//Land	
			g.setColor(new Color(34,177,76));
			g.fillRect(0,300,1000,750);
		
			
		//Dividing line	
			g.setColor(new Color(0,0,0));
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
			g.fillRect(265, 0, 321+(72*2), 43);
			
			//Inner Rectangle
			g.setColor(new Color(29,147,203));
			g.fillRect(268, 0, 315+(72*2), 40);
			
			
        }
    }
    
    
    class AquaticClass extends JPanel 
    {
       
    	public void paintComponent(Graphics g) 
        {
        
    	/** Class that is drawn after Branch1Class (AquaticButton) in our Tacoland project **/	
    		
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
        	
			g.setColor(new Color(240,210,100));
			g.fillRect(0,0,1000,750);
			
			
		
        }
    }



    class FishClass extends JPanel
    {
    	
    	
    	public void paintComponent(Graphics g) 
        {
        	
    		//sky
    		g.setColor(new Color (94,175,242));
    		g.fillRect(0, 0, 1700, 400);
    		//sun
    		g.setColor(new Color (254,209,29));
    		g.fillOval(100,100,200,200);
    		//clouds
    		g.setColor(new Color(193,193,193));
    		// top right
    	    g.fillOval(300, 20, 150, 50);
    		g.fillOval(400, 20, 150, 50);
    	    g.fillOval(500, 20, 150, 50);
    	    g.fillOval(600, 20, 150, 50);
    	    g.fillOval(700, 20, 150, 50);
    		// top left
    		 g.fillOval(1000, 20, 150, 50);
    		 g.fillOval(1100, 20, 150, 50);
    		 g.fillOval(1200, 20, 150, 50);
    		//bottom right
    		 g.fillOval(250, 40, 150, 50);
    		 g.fillOval(350, 40, 150, 50);
    		 g.fillOval(450, 40, 150, 50);
    		 g.fillOval(550, 40, 150, 50);
    		 g.fillOval(650, 40, 150, 50);
    		 g.fillOval(750, 40, 150, 50);
    		//bottom left
    		 g.fillOval(950, 40, 150, 50);
    		 g.fillOval(1050, 40, 150, 50);
    		 g.fillOval(1150, 40, 150, 50);
    		 g.fillOval(1250, 40, 150, 50);
    		
    		
    		
    		//ocean
    		g.setColor(new Color (0,56,249));
    		g.fillRect(0,400,1700,400);
    		//fish
    		g.setColor(new Color (249,107,2));
    		g.fillOval(500,600,100,60);
    		//fin
    		g.setColor(new Color (253,139,55));
    		g.fillRect(515,620,45,20);
    		//eyeball 
    		g.setColor(new Color (0,0,0));
    		g.fillOval(575,610,15,15);
    		//plants
    		g.setColor(new Color (56,163,41));
    		g.fillRect(50,700,30,200);
    		g.fillRect(250,650,30,250);
    		g.fillRect(450,700,10,165);
    		g.fillRect(520,620,20,400);
    		g.fillRect(580,670,15,350);
    		g.fillRect(700,500,25,350);
    		g.fillRect(850,600,15,350);
    		g.fillRect(920,700,30,200);
    		g.fillRect(1000,600,20,350);
    		g.fillRect(1200,460,23,700);
    		g.fillRect(1400,600,20,250);
    		//boat
    		g.setColor(new Color (85,99,80));
    		g.fillArc(700,140,700,400,180,180);
    		g.setColor(new Color (243,7,26));
    		g.fillRect(750,170,600,170);
    		
    		//g.setColor
    		g.fillRect(800,120,50,100);
    		//pollution
    		g.setColor(new Color (46,47,48));
    		g.fillOval(750,100,80,20);
    		g.setColor(new Color (208,209,210));
    		g.fillOval(710,100,80,20);
    		g.fillOval(730,110,80,20);
    		g.setColor(new Color (46,47,48));
    		g.fillOval(780,110,80,20);
    		//window
    		g.setColor(new Color (171,230,252));
    		g.fillRect(1240,190,60,100);
    		g.setColor(new Color (0,0,0));
    		g.fillRect(1265,190,10,100);
    		g.fillRect(1240,235,60,10);
			
    		
		
        }
    	
    	
    }

    
}


