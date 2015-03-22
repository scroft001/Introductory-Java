/* Draw panel lab 3
Steven Croft everything drawn in this class 
will show up in test */

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class DrawPanel extends JPanel // inheriting those methods
{
	public void paintComponent ( Graphics g )
	{
		// call super class method
		super.paintComponent ( g );
		int x = 300;
		int y = 300;
		
		g.drawOval (x - 35,y - 30,70,60); // head
		g.drawLine ( x, y + 30 , x , y + 100); // body
		Color red = Color.RED; // instantiating color method
		g.setColor ( Color.RED ); // setting eyes red
		g.fillOval ( x - 15, y - 10 , 10,10); // left eye
		g.fillOval ( x + 15, y - 10 , 10, 10 );// right eye
		g.drawString ( " This is Tom the Alien " , 250,250);
		g.setColor ( Color.BLACK );
		g.drawRect ( x - 50, y + 100, 100,10 );
		g.fillRect ( x - 50, y + 100, 10, 20 );
		g.fillRect ( x + 50 , y + 100, 10 ,20 );
		
	} // ends pain component
} // ends draw panel