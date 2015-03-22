/* demo of reading from the console using scanner
Steven Croft */

import java.util.Scanner;

public class DataInput
{
	public static void main ( String [] args )
	{
		Scanner kb = new Scanner ( System.in );
		System.out.print( "Enter your first name: ");
		String firstName = kb.next ();
		System.out.println( "Your first name is " + firstName );
		
		
	}
}