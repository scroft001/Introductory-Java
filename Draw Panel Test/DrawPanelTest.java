// Steven Croft draw panel test code copy

import java.awt.*;
import javax.swing.*;

public class DrawPanelTest
{
	public static void main(String[] args)
	{
		Donuts dp = new Donuts ();
		JFrame win = new JFrame();
		win.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		win.add( dp );//put draw panel into window
		win.setSize(600,600);
		win.setVisible( true );
	}
}