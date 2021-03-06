//Levi, Jesse, Carlos, Jacob and Lori
//

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;








import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Tacolandzoo {
	private JFrame WelcomeJframe, Branch1Jframe, Branch2Jframe, SmallLandAnimalMapJframe,
	LargeLandAnimalMapJframe, AquaticMapJframe, PenguinJframe, FishJframe, BunbunJframe, RabbitJframe, 
	DragonJframe, SharkJframe,HippoJframe, ZebraJframe, SnowLeopardJframe,SquidJframe, DolphinJframe, MeerKatJframe;
	private ActionListener action;
	private JButton WelcomeButton, LandButton, AquaticButton, SmallButton, LargeButton, 
	BunbunButton, DolphinButton, DragonButton, MeerKatButton, FishButton, FlamingoButton,
	RabbitButton, PenguinButton, SnakeButton, SnowLeopardButton, LionButton, MeerkatButton, MonkeyButton, 
	MuntjacButton, PandaBearButton,HippoButton, SharkButton,ZebraButton,SquidButton,
	MainA, MainS, MainL, MainB2, MainB1;
	
	
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

		

		
		//Aquatic Animals' classes extending DrawPanels
		final jPenguin xjPenguin = new jPenguin(); 
		final jPenguin.DrawPenguinPanel PenguinPanel = xjPenguin.new DrawPenguinPanel();
		
		final Dolphin xDolphin = new Dolphin();
		final Dolphin.DrawDolphin DolphinPanel = xDolphin.new DrawDolphin();
		
		
		final FishClass FishPanel = new FishClass();
		
		final Shark xShark = new Shark();
		final Shark.DrawShark SharkPanel = xShark.new DrawShark();
		
		final Squid xSquid = new Squid();
		final Squid.DrawSquid SquidPanel = xSquid.new DrawSquid();
		
		
		//Small Land Animals' classes extending DrawPanels
		final Bunbun xBunbun = new Bunbun();
		final Bunbun.DrawBunbun BunbunPanel = xBunbun.new DrawBunbun();
		
		final habitat xhabitat = new habitat();
		final habitat.DrawRabbit RabbitPanel = xhabitat.new DrawRabbit();
		
		final MeerKat xMeerKat = new MeerKat();
		final MeerKat.DrawMeerKat MeerKatPanel = xMeerKat.new DrawMeerKat();

		//final SwingSnowLeopard xSwingSnowLeopard = new SwingSnowLeopard();
		//final SwingSnowLeopard.DrawSnowLeopard SnowLeopardPanel = xSwingSnowLeopard.new DrawSnowLeopard();
		
		
		//Large Land Animals' classes extending DrawPanels
		final dragon xdragon = new dragon();
		final dragon.DrawCow DragonPanel = xdragon.new DrawCow();
		
		final hippo xHippo = new hippo();
		final hippo.DrawHippo HippoPanel = xHippo.new DrawHippo();
		
		final Zebra xZebra = new Zebra();
		final Zebra.DrawZebra ZebraPanel = xZebra.new DrawZebra();
		
		/**
		
		final leopard xleopard = new leopard();
		final leopard.DrawLeopard LeopardPanel = xleopard.new DrawLeopard();
		
		final Lion xLion = new Lion();
		final Lion.DrawLion LionPanel = xLion.new DrawLion
		
		**/
		
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
		DolphinButton = new JButton("Dolphin");
		PenguinButton = new JButton ("Penguin");
		FishButton = new JButton ("Fish");
		SharkButton = new JButton("Shark");
		SquidButton = new JButton("Squid");
		
		//Small Animals buttons
		BunbunButton = new JButton("Bunbun");
		RabbitButton = new JButton("Rabbit");
		
		//Large Animals buttons
		DragonButton = new JButton("Cow");
		MeerKatButton = new JButton("MeerKat");
		SnowLeopardButton = new JButton("Snow Leopard");
		HippoButton = new JButton("Hippo");
		ZebraButton = new JButton("Zebra");
		
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
				
					//buttons for aquatic animals
					AquaticPanel.add(MainA);
					AquaticPanel.add(SquidButton);
					AquaticPanel.add(DolphinButton);
					AquaticPanel.add(PenguinButton);
					AquaticPanel.add(FishButton);
					AquaticPanel.add(SharkButton);
			
					
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
				
					//Buttons for small animals
					SmallLandAnimalMapPanel.add(MainS);
					SmallLandAnimalMapPanel.add(BunbunButton);
					SmallLandAnimalMapPanel.add(RabbitButton);
					SmallLandAnimalMapPanel.add(MeerKatButton);
				
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
				
					//Buttons for large animals
					LargeLandAnimalMapPanel.add(MainL);
					LargeLandAnimalMapPanel.add(DragonButton);
					LargeLandAnimalMapPanel.add(HippoButton);
					LargeLandAnimalMapPanel.add(ZebraButton);

				
					LargeLandAnimalMapJframe.getContentPane().add(LargeLandAnimalMapPanel);
					LargeLandAnimalMapJframe.setSize(lsize, hsize);
					LargeLandAnimalMapJframe.setLocation(xloc,yloc);
					LargeLandAnimalMapJframe.setResizable(false);
					
					LargeLandAnimalMapJframe.setVisible(true);
					Branch2Jframe.setVisible(false);
				}
			
				//Buttons that if clicked will redirect you back to previous Jframe
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
				 
				 //Buttons that if clicked will take you to that desired animal 
				 
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
					
					
					
					 RabbitJframe.getContentPane().add(RabbitPanel);
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
				 
				 if (button==DragonButton){
					 
					 DragonJframe = new JFrame("cowwwwwww");
					 DragonJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 DragonJframe.setLocationByPlatform(true);
					
					
					
					 DragonJframe.getContentPane().add(DragonPanel);
					 DragonJframe.setSize(lsize, hsize);
					 DragonJframe.setLocation(xloc,yloc);
					 DragonJframe.setResizable(true);
						
					 DragonJframe.setVisible(true);
						LargeLandAnimalMapJframe.setVisible(false);
					 
				 }
				 
				 if (button==SharkButton){
					 
					 SharkJframe = new JFrame("Shark");
					 SharkJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 SharkJframe.setLocationByPlatform(true);
					
					
					
					 SharkJframe.getContentPane().add(SharkPanel);
					 SharkJframe.setSize(lsize, hsize);
					 SharkJframe.setLocation(xloc,yloc);
					 SharkJframe.setResizable(true);
						
					 SharkJframe.setVisible(true);
						AquaticMapJframe.setVisible(false);
					 
					 
					 
				 }
				 
				 if (button==HippoButton){
					 
					 HippoJframe = new JFrame("Hippo");
					 HippoJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 HippoJframe.setLocationByPlatform(true);
					
					
					
					 HippoJframe.getContentPane().add(HippoPanel);
					 HippoJframe.setSize(lsize, hsize);
					 HippoJframe.setLocation(xloc,yloc);
					 HippoJframe.setResizable(true);
						
					 HippoJframe.setVisible(true);
						LargeLandAnimalMapJframe.setVisible(false);
					 
					 
					 
				 }
				 
				 if (button == ZebraButton){
					 
					 ZebraJframe = new JFrame("Zebra");
					 ZebraJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 ZebraJframe.setLocationByPlatform(true);
					
					
					
					 ZebraJframe.getContentPane().add(ZebraPanel);
					 ZebraJframe.setSize(lsize, hsize);
					 ZebraJframe.setLocation(xloc,yloc);
					 ZebraJframe.setResizable(true);
						
					 ZebraJframe.setVisible(true);
						LargeLandAnimalMapJframe.setVisible(false);
					 
					 
				 }
			
				 if (button==SquidButton){
					 SquidJframe = new JFrame("Squid");
					 SquidJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 SquidJframe.setLocationByPlatform(true);
					
					
					
					 SquidJframe.getContentPane().add(SquidPanel);
					 SquidJframe.setSize(lsize, hsize);
					 SquidJframe.setLocation(xloc,yloc);
					 SquidJframe.setResizable(true);
						
					 SquidJframe.setVisible(true);
						AquaticMapJframe.setVisible(false);
					 
					 
					 
				 }
		
				 if (button == DolphinButton){
					 DolphinJframe = new JFrame("Squid");
					 DolphinJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 DolphinJframe.setLocationByPlatform(true);
					
					
					
					 DolphinJframe.getContentPane().add(DolphinPanel);
					 DolphinJframe.setSize(lsize, hsize);
					 DolphinJframe.setLocation(xloc,yloc);
					 DolphinJframe.setResizable(true);
						
					 DolphinJframe.setVisible(true);
						AquaticMapJframe.setVisible(false);
					 
					 
					 
					 
					 
					 
				 }
				 
				 if (button==MeerKatButton){
					 MeerKatJframe = new JFrame("Squid");
					 MeerKatJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 MeerKatJframe.setLocationByPlatform(true);
					
					
					
					 MeerKatJframe.getContentPane().add(MeerKatPanel);
					 MeerKatJframe.setSize(lsize, hsize);
					 MeerKatJframe.setLocation(xloc,yloc);
					 MeerKatJframe.setResizable(true);
						
					 MeerKatJframe.setVisible(true);
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
		SquidButton.addActionListener(action);
		PenguinButton.addActionListener(action);
		FishButton.addActionListener(action);
		SharkButton.addActionListener(action);
		DolphinButton.addActionListener(action);
		
		//Small Land Animals' Action Listeners
		BunbunButton.addActionListener(action);
		RabbitButton.addActionListener(action);
		SnowLeopardButton.addActionListener(action);
		MeerKatButton.addActionListener(action);
		
		//Large Land Animals' Action Listeners
		DragonButton.addActionListener(action);
		HippoButton.addActionListener(action);
		ZebraButton.addActionListener(action);
		
		
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
				//The thing that creates the greatest impact on the project
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
    		
    
			Graphics2D CL05 = (Graphics2D) g;
			GradientPaint CL06 = new GradientPaint(1000, 150,
			new Color((255+66)/2,(255+160)/2,(255+200)/2), 100, 100,  new Color(66,160,200), true);
			CL05.setPaint(CL06);
    		//Water
		//	g.setColor(new Color(56,56,250));
			g.fillRect(0,0,1000,750);
		
			
		//Bottom Left Grass island
			g.setColor(new Color(34,177,76));
    		g.fillRect(0,550,400,750);
    		g.fillOval(360,550,80,80);
			g.fillRect(360,590,80,300);	
		//Bottom Left Grass Island Path
			Graphics2D dr1 = (Graphics2D)g;
			GradientPaint dr  = new GradientPaint (25,1500,
					new Color (224,203,101),100,100, new Color(239,228,176),true);
			dr1.setPaint(dr);
					
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
					//Bridge 1 points V
			RMI.addPoint(650, 500);
			RMI.addPoint(750, 600);
					//Bridge 1 Pontys ^
			RMI.addPoint(811, 595);
			RMI.addPoint(841, 575);
			RMI.addPoint(857, 548);
			RMI.addPoint(862, 523);
			RMI.addPoint(852, 345);
			RMI.addPoint(839, 167);
			RMI.addPoint(790, 130);
			RMI.addPoint(690, 120);
			RMI.addPoint(670, 126);
			RMI.addPoint(550, 136);
			RMI.addPoint(500, 186);
			RMI.addPoint(480, 240);
			RMI.addPoint(500, 270);
			RMI.addPoint(530, 285);
			RMI.addPoint(500, 270);
			RMI.addPoint(530, 288);
			RMI.addPoint(620, 320);
			g.setColor(new Color(34,177,76));
			g.fillPolygon(RMI);	
			g.fillOval(740, 130, 100, 100);	
		byte b = 35;
			
			//Bridge 1
			g.setColor(new Color(79+b,50+b,6+b));
			Polygon bridge1 = new Polygon();
			bridge1.addPoint(750-25, 600-25); //top right
			bridge1.addPoint(440,675); // bottom top
			bridge1.addPoint(440,625); //bottom b
			bridge1.addPoint(650+25, 500+25); //t l
			g.fillPolygon(bridge1);
		//Ice island
			Polygon II = new Polygon();
			II.addPoint(0,0);
			II.addPoint(0,190);
			II.addPoint(115,300);
			II.addPoint(199,280);
			II.addPoint(237,329);
			II.addPoint(300,350);
			II.addPoint(400,300);
			II.addPoint(480, 240);
			II.addPoint(500, 186);
			II.addPoint(550, 136);
			II.addPoint(600,30);
			II.addPoint(560,0);
			g.setColor(new Color(209,243,239));
			g.fillPolygon(II);
		//Bridge 2
			Polygon B2 = new Polygon();
			B2.addPoint(35,223);
			B2.addPoint(35,550);
			B2.addPoint(85,550);
			B2.addPoint(85,271);
			g.setColor(new Color(79+b,50+b,6+b));
			g.fillPolygon(B2);
					
        }
    }
   
    
    class SmallLandAnimalMapClass extends JPanel 
    {
       
    	public void paintComponent(Graphics g) 
        {
    		//background/path color
    		
    		g.setColor(	new Color(224,203,101));
    		g.fillRect(0,0,1000,750);
    	
    		//center oval
    		g.setColor(new Color(34,177,76));
    		g.fillOval(400,250,200,250);
    		//centeroval water
    		g.setColor(new Color(71,141,245));
    		g.fillOval(425, 280, 150, 200);
    		
    	//flamingo in pond
    		g.setColor(Color.pink);
    		
    		g.fillOval(900-450,560-200,60,45);
    		
    		g.setColor(Color.pink);
    		
    		g.fillRect(1000-510, 500-180, 15,75);
    		//head (x, y, width, length  x and width, y and length)
    		g.fillOval(993-510, 460-170, 60, 50);
    		
    		g.setColor(Color.black);
    		g.fillOval(1035-520,475-180,5,5);
    		
    		//beak
    		
    		g.setColor(Color.orange);
    	g.fillRect(1045-510, 480-175, 30, 20);
    		
    		
    		
    		
    		g.setColor(new Color (128,64,64));
    		g.fillRect(940-453, 647-245, 5, 60);
    		g.fillRect(980-487,647-250,5,70);
    		//left	buildings of oval
    		g.setColor(new Color(34,177,76));
    		g.fillRect(0, 550, 1000, 150);    	    	
    		g.fillRect(10, 325, 200, 150);
    		g.fillRect(10,50,200,200);
    		g.fillRect(10, 325, 200, 150);
    		g.fillRect(245, 50, 130,420);
    		g.fillRect(436, 50, 140, 180);
    		
    	//right buildings of oval
    	    
    		g.fillRect(10+775,50,200,200);
    		g.fillRect(10+775, 325, 200, 150);
    		g.fillRect(245+375, 50, 130,420);  

    //fence lines
    	g.setColor(Color.black);
    int x=0;
    int y=10;
    int w=245;
    int a=436;

    
    
while(x<21){
		g.fillRect(y+775, 325,5, 150);
    	g.fillRect(y, 325, 5, 150);
    	g.fillRect(y,50,5,200);

        	
		g.fillRect(y+775,50,5,200);

		
    a+=20;	
    w+=20;	
	y+=10;
		x++;
	
	
	
        }

//entering path in bvetween the green
	g.setColor(	new Color(224,203,101));
	g.fillRect(460,500,100,600);
//sign that says you are in the small animals habitat
	g.setColor(new Color(220,140,51));
	g.fillRect(660,600,20, 80);	
	Graphics2D CL5 = (Graphics2D) g;
	GradientPaint CL6 = new GradientPaint(25, 200,
	new Color(250,250,250), 100, 100,  new Color(209,180,12), true);
	CL5.setPaint(CL6);
	g.fillRect(620,590,100,50);
	//sign letters
	Font thefont=new Font ("Garamond",Font.BOLD,15);
	g.setColor(Color.black);
	g.setFont(thefont);
	g.drawString("You are in the",620 , 605);
	g.drawString(" small animals' ",620 , 620);
	g.drawString("       habitat     ",620 , 633);
	g.setColor(Color.white);
	g.fillOval(455,425,25,35);
	
	//white bunbun
	g.setColor(Color.white);
	g.fillOval(248+150,500+100,50,60);
g.setColor(Color.gray);
	g.drawOval(248+150,500+100,50,60);
	g.drawOval(253+150, 450+100, 15, 55);
	g.drawOval(278+150, 450+100, 15, 55);
g.setColor(Color.white);
	g.fillOval(253+150,480+100,40,40);
g.setColor(Color.gray);
	g.drawOval(253+150,48+533,40,40);
g.setColor(Color.white);
	g.fillOval(253+150, 450+100, 15, 55);
	g.fillOval(278+150, 450+100, 15, 55);
	g.fillOval(242+150,515+100,20,25);
	g.fillOval(285+150,515+100,20,25);
	g.fillOval(240+150,545+100,30,25);
	g.fillOval(272+150,545+100,30,25);
g.setColor(Color.gray);
	g.drawOval(242+150,515+100,20,25);
	g.drawOval(285+150,515+100,20,25);
	g.drawOval(240+150,545+100,30,25);
	g.drawOval(272+150,545+100,30,25);
g.setColor(Color.gray);
	g.drawOval(259+150,489+104,10,1);
	g.drawOval(277+150,489+100,10,9);
g.setColor(Color.black);
	g.fillOval(279+150,491+100,4,5);
	g.fillOval(277+150,491+100,4,5);
g.setColor(Color.black);
	g.drawOval(273+150,498+101,15,15);
	g.drawOval(260+150-1,498+101,15,15);
g.setColor(Color.white);
	g.fillRect(257+150, 498+101, 33,5 );
g.setColor(Color.black);
	g.fillRect(270+151, 500+100, 6,6);
}

        }
    }
    
    
    class LargeLandAnimalMapClass extends JPanel 
    {
       
    	public void paintComponent(Graphics g) 
        {
        	
    		
    		/**A re-template of the Small animal map*/
    		//background/path color
    		//g.setColor(Color.darkGray);
    		g.setColor(	new Color(224,203,101));
    		g.setColor(new Color(255,153+30,51+30));
    		g.fillRect(0,0,1000,750);
  
    		//center oval
    		g.setColor(new Color(34+20,177+20,76+20));
    		g.fillOval(400,250,200,250);
    	
    		//left	buildings of oval
    		
    		
    		g.setColor(new Color(34+20,177+20,76+20));
    		g.fillRect(0, 550, 1000, 150);    	    	
    		g.fillRect(10, 325, 200, 150);
    		g.fillRect(10,50,200,200);

    		g.fillRect(10, 325, 200, 150);
    		g.fillRect(245, 50, 130,420);
    		g.fillRect(436, 50, 140, 180);
    	//right buildings of oval
    	
    
    		g.fillRect(10+775,50,200,200);

    		g.fillRect(10+775, 325, 200, 150);
    	g.fillRect(245+375, 50, 130,420);  
    	

   
    //fence
    	g.setColor(Color.black);
    int x=0;
    int y=10;
 

    g.fillRect(785,325-7, 200, 7);
    
while(x<11){
		g.fillRect(y+775, 325,10, 150);
    	g.fillRect(y, 325, 10, 150);
    	g.fillRect(y,50,10,200);

        	
		g.fillRect(y+775,50,10,200);

		
  
	y+=19;
		x++;
	
	
	
        }
int s=245;
int r=0;
while (r<7){
//		g.fillRect(s, 50, 10,420);
    	
 //   	g.fillRect(s+375, 50, 10,420);
    	
    	s+=20;
    r++;
}
			
			
		
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

    



