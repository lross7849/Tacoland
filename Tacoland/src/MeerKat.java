import java.awt.*; 
import java.applet.*;  


public class MeerKat extends Applet{
	{ 
	}
		
		public void paint(Graphics g)
			{

				drawHabitat(g);
				drawAnimal(g);
			}
		
			private void drawAnimal(Graphics g)
			{  
				
				 g.setColor(new Color(152, 137, 58));   
				 g.fillOval(700, 390, 15, 15);  
				 g.setColor(new Color(152, 137, 58));  
				 g.fillOval(730, 390, 15, 15); 
				 g.setColor(new Color(152, 137, 58));  
				 g.fillRect(700, 400, 50, 50); 
				 g.setColor(new Color(152, 137, 58));  
				 g.fillRect(700, 450, 50, 50);  
			
				 g.setColor(Color.WHITE);  
				 g.fillOval(705, 417, 10, 10); 
				 g.setColor(Color.WHITE);  
				 g.fillOval(730, 417, 10, 10);  
				 g.setColor(Color.BLACK); 
				 g.fillOval(708,420,5,5); 
				 g.setColor(Color.BLACK); 
				 g.fillOval(731,420,5,5);
				
				 g.setColor(Color.RED);  
				 g.fillOval(712, 440, 20, 20); 
				 g.setColor(new Color(152, 137, 58));  
				 g.fillOval(730, 490, 20, 20);  
				 g.setColor(new Color(152, 137, 58));  
				 g.fillOval(702, 490, 20, 20); 
				 g.setColor(new Color(152, 137, 58));   
				 g.fillOval(689, 437, 20, 30); 
				 g.setColor(new Color(152, 137, 58));  
				 g.fillOval(740, 437, 20, 30);   
				 g.setColor(Color.BLACK); 
				 g.fillOval(715, 446, 14, 14);   
			     g.setColor(new Color(152, 137, 58));  
				 g.fillRect(712, 453, 20, 20);   
			
				 g.setColor(new Color(152, 137, 58)); 
				 g.fillRect(750, 490, 40, 10); 
				 g.setColor(Color.BLACK); 
				 g.fillRect(780,490,10,10);
			}
			
	         private void drawHabitat(Graphics g)
			 {
				   g.setColor(new Color(100,200,255)); 
				   g.fillRect(0,0,2000,550);
	        	   g. setColor(Color.ORANGE);  
			       g.fillRect(0, 350, 2000, 350); 
			       g.setColor(Color.BLACK); 
			       g.fillOval(20, 500, 77, 30); 
			       g.setColor(Color.BLUE); 
			       g.fillOval(100, 500, 200, 95); 
			       g.setColor(Color.BLACK); 
			       g.fillOval(50,475, 77, 40);  
			       g.setColor(new Color(85,62,36)); 
			       g.fillRect(1100, 97, 63, 300);
			       g.setColor(new Color(84,103,18)); 
			       g.fillOval(994, 94, 300, 100);  
			       g.setColor(Color.YELLOW); 
			       g.fillOval(98, 98, 200, 200); 
			       g.setColor(new Color(186,198,199)); 
			       g.fillOval(1198, 300, 200, 200); 
			       g.setColor(Color.ORANGE); 
			       g.fillRect(1198, 370, 200, 200); 
			       g.setColor(new Color(186,198,208)); 
			       g.fillOval(1380, 300, 100, 100);  
			       g.setColor(Color.ORANGE); 
			       g.fillRect(1380, 370, 200, 200); 
			 }  
	         
	}