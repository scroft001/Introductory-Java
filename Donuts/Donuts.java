/* class that draws donuts
Steven Croft */

import java.awt.Graphics;
import javax.swing.JPanel;

public class Donuts extends JPanel
{
	public void paintComponent ( Graphics g )
	{
		// call super class method
		super.paintComponent (g);
		int x = 100, y = 100;
		g.drawOval ( x, y, x, y);
		g.drawOval ( x+10, y+10, x-20, y-20);
		
		int x1 = 170, y1 = 60;
		g.drawOval ( x1, y1, x1-120, y1-10);
		g.drawOval ( x1+10, y1+10, x1-140, y1-30);
		
		int x2 = 80, y2 = 60;
		g.drawOval ( x2, y2, x2 - 30, y2 - 10);
		g.drawOval ( x2 + 10, y2 + 10, x2-50, y2-30);
	}
}