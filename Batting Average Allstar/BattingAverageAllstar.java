/* Batting average and allstar eligibility
Steven Croft */

import java.util.Scanner;
public class BattingAverageAllstar
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner( System.in );
      
      // enter data
		System.out.print ("Enter the number of hits here: " );
		float hits = kb.nextFloat ();
		System.out.print ("Enter the number at bats here: ");
		float atBats = kb.nextFloat ();
		
		// compare data with if else statements
		if ( (hits/atBats) > .300 )
		{
		System.out.println( "The player is eligible for Allstar game." );
		}
		else 
		{
			System.out.println ( "The player is not eligible for Allstar game." );
		}
      
   }
}