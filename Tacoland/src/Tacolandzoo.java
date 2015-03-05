

import java.awt.*;
import java.applet.*;




	
	


import java.awt.*;
import java.awt.event. *;

import javax.swing.*; 

public class Tacolandzoo {
	private JFrame WelcomeJframe, Branch1Jframe, Branch2Jframe, SmallLandAnimalMapJframe, LargeLandAnimaMapJframe, AquaticMapJframe;
	private ActionListener action;
	private JButton Opening, Land, Aquatic, Small, Large;
	

	public void ButtonAndFunctinalityMethod()
	{
		

		final short lsize = 1000;
		final short hsize = 750;	
		final short xloc = 200;
		final short yloc = 10;
		
		WelcomeJframe = new JFrame ("Welcome to Taco Zoo!");
		
		WelcomeJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WelcomeJframe.setLocationByPlatform(true);
		//WelcomeJframe.setSize(100, 100);
		
		
		WelcomeClass WelcomePanel = new WelcomeClass();
		//WelcomePanel.setBackground(new Color(150,150,250));
		
		final Branch1Class Branch1Panel = new Branch1Class();
		//Branch1Panel.setBackground(new Color(100,100,100));
		
		final Branch2Class Branch2Panel = new Branch2Class();
		Branch2Panel.setBackground(new Color(100,100,100));
		
		//final DrawPenguinPanel penguinpanel = new DrawPenguinPanel();
		
		final AquaticClass AquaticPanel = new AquaticClass();
		//AquaticPanel.setBackground(new Color(100,100,100));
		
		final LargeLandAnimalMapClass SmallLandAnimalMapPanel = new LargeLandAnimalMapClass();
		//SmallLandAnimalMapJPanel.setBackground(new Color(100,100,100));
		
		final LargeLandAnimalMapClass LargeLandAnimalMapPanel = new LargeLandAnimalMapClass();
		//LargeLandAnimalMapJPanel.setBackground(new Color(100,100,100));
		
		
		Opening = new JButton("Click Here to go into the zoo!");
		Land = new JButton("Land Animals");
		Aquatic = new JButton("Aquatic Animals");
		Small = new JButton("Small Land Animals");
		Large = new JButton("Large Land Animals");
		
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
					
					Branch2Jframe.setVisible(true);
					Branch1Jframe.setVisible(false);
				}
			
				else if (button == Aquatic)
				{
					AquaticMapJframe = new JFrame("Aquatic Map: Pick the animal of your choice. ");
					AquaticMapJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					AquaticMapJframe.setLocationByPlatform(true);
				
					//add animal buttons later
				
					AquaticMapJframe.getContentPane().add(AquaticPanel);
					AquaticMapJframe.setSize(lsize, hsize);
					AquaticMapJframe.setLocation(xloc,yloc);
				
					AquaticMapJframe.setVisible(true);
					Branch1Jframe.setVisible(false);
				}
					
				else if (button == Small)
				{
					SmallLandAnimalMapJframe = new JFrame("Small Land Animal Map: Pick the animal of your choice. ");
					SmallLandAnimalMapJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					SmallLandAnimalMapJframe.setLocationByPlatform(true);
				
					//add animal buttons later
				
					SmallLandAnimalMapJframe.getContentPane().add(SmallLandAnimalMapPanel);
					SmallLandAnimalMapJframe.setSize(lsize, hsize);
					SmallLandAnimalMapJframe.setLocation(xloc,yloc);
				
					SmallLandAnimalMapJframe.setVisible(true);
					Branch2Jframe.setVisible(false);
				}
			
				else if (button == Large)
				{
					LargeLandAnimaMapJframe = new JFrame("Large Land Animal Map: Pick the animal of your choice. ");
					LargeLandAnimaMapJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					LargeLandAnimaMapJframe.setLocationByPlatform(true);
				
					//add animal buttons later
				
					LargeLandAnimaMapJframe.getContentPane().add(LargeLandAnimalMapPanel);
					LargeLandAnimaMapJframe.setSize(lsize, hsize);
					LargeLandAnimaMapJframe.setLocation(xloc,yloc);
				
					LargeLandAnimaMapJframe.setVisible(true);
					Branch2Jframe.setVisible(false);
				}
			
			
			
			
			
			
			
			
			}
		
		};
		
		Opening.addActionListener(action);
		Land.addActionListener(action);
		Aquatic.addActionListener(action);
		Small.addActionListener(action);
		Large.addActionListener(action);
		
		WelcomePanel.add(Opening);
		
		
		WelcomeJframe.getContentPane().add(WelcomePanel);
		WelcomeJframe.setSize(lsize, hsize);
		WelcomeJframe.setLocation(xloc, yloc);
		WelcomeJframe.setVisible(true);

	}
	public static void main(String args[])
	{
		
		
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Tacolandzoo().ButtonAndFunctinalityMethod();
			}
		});
		
		
		
		
	}

    class WelcomeClass extends JPanel 
    {
   
    	public void paintComponent(Graphics g) 
        {
        	//sky
    		g.setColor(new Color(150,200,250));
			g.fillRect(0, 0, 1000, 750);
			
			
			//Gate
			
			short i = -2;
			g.setColor(Color.black);
			while (i<=1000){
				g.fillRect(i, 200, 8, 550);
				g.fillOval(i-5, 190, 15, 15);
				i+=20;}
			
    		g.setColor(new Color(150,200,250));
			g.fillRect(250, 300, 500, 450);
			
			//
			
			g.setColor(Color.black);
			g.fillRect(245, 292, 515, 8);
        }
    }

    class Branch1Class extends JPanel 
    {
       
    	public void paintComponent(Graphics g) 
        {
        	
    		g.setColor(new Color(34,177,76));
    		g.fillRect(0,0,1000,750);
    		//g.setColor(new Color(239,228,176));
    		Graphics2D sk1 = (Graphics2D) g;
			GradientPaint sk2 = new GradientPaint(25, 1500,
			new Color(224,203,101), 100, 100,  new Color(239,228,176), true);
	sk1.setPaint(sk2);
    		g.fillOval(0, 400, 1000, 750);
    		Polygon  l= new Polygon();
    		l.addPoint(0, 0);
    		l.addPoint(0, 50);
    		l.addPoint(250, 900);
    		l.addPoint(500, 900);
    		l.addPoint(100, 0);
    		g.fillPolygon(l);
    		Polygon  r= new Polygon();
    		r.addPoint(1000, 0);
    		r.addPoint(1000, 50);
    		r.addPoint(750, 900);
    		r.addPoint(500, 900);
    		r.addPoint(900, 0);
    		g.fillPolygon(r);
			g.setColor(new Color(94,57,38));
			g.fillRect(350,350,100,60);	
		
        }
    }
    class Branch2Class extends JPanel 
    {
       
    	public void paintComponent(Graphics g) 
        {
        	
			g.setColor(new Color(28,198,151));
			g.fillRect(0,0,1000,750);
			
			g.setColor(Color.black);
			g.fillRect(490,0,3,750);
		
        }
    }
    
    class AquaticClass extends JPanel 
    {
       
    	public void paintComponent(Graphics g) 
        {
        	
			g.setColor(Color. blue);
			g.fillRect(0,0,1000,750);
			
				
		
        }
    }
   
    class LargeLandAnimalMapClass extends JPanel 
    {
       
    	public void paintComponent(Graphics g) 
        {
        	
			g.setColor(new Color(200,100,100));
			g.fillRect(0,0,1000,750);
			
				
		
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
}





