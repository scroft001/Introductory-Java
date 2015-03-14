/* Steven Croft Computing batting averages from user input
changed data type to doubles to produce a decimal result for more accuracy */

import java.util.Scanner;

public class ComputeBattingAverage
{
	public static void main (String [] args)
	{
		//instantiate a scanner object and connect to keyboard
		Scanner kb = new Scanner ( System.in );
		double hits;
		double atBats;
		double battingAverage;
		
		// get hits from user
		System.out.print("Please enter number of hits: ");
		hits = kb.nextDouble();
		
		// get at bats from user
		System.out.print("Please enter number of at bats: ");
		atBats = kb.nextDouble();
		
		// calculate batting average
		battingAverage = (hits/atBats)* 100;
		
		// display batting average
		System.out.println("Your batting average is: " + battingAverage + " %");
		
		
	}
}

