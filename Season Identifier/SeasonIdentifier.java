/* testing which season it is with user input
Steven Croft */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SeasonIdentifier
{
	public static void main (String [] args)
	{
		String temperature = JOptionPane.showInputDialog ( null, "Please enter the temperature: " + " degrees");
		int temp = Integer.parseInt ( temperature );
		JOptionPane.showMessageDialog ( null, "You entered: " + temp + " degrees");
		if ( temp > 120 || temp < -20 )
		{
			JOptionPane.showMessageDialog (null, "That is not a valid temperature.");
		}
		else if ( temp >= 90 )
		{
			JOptionPane.showMessageDialog (null, "It is most likely Summer.");
		}
		else if ( temp >= 70 && temp < 90)
		{
			JOptionPane.showMessageDialog ( null, "It is most likely Spring.");
		}
		else if ( temp >= 50 && temp < 70 )
		{
			JOptionPane.showMessageDialog ( null, "It is most likely Fall.");
		}
		else if ( temp < 50 )
		{
			JOptionPane.showMessageDialog ( null, "It is most likely Winter.");
		}
	}
}