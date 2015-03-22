/* program that compares two numbers
Steven Croft */

import java.util.Scanner;

public class IfTestStartHere
{
   public static void main(String[] args)
   {
     // declare the variables we need in this code
     // we need a Scanner for keyboard input
     Scanner kb = new Scanner( System.in );
     
     // two integer variables to hold the input
     int a, b;
     
     // get the input from the user
     System.out.print("Enter an integer for a: ");
     a = kb.nextInt(); // pause and collect the integer from the keyboard
     
     System.out.print("Enter an integer for b: ");
     b = kb.nextInt();
     
     // the if statements in every possible combination
     // I will write the first on for you
     
     if ( a == b ) // equality
     {
       System.out.println( "a equals b" );
     }
     
     // okay, one more
     if ( a != b ) // not equal
     {
       System.out.println( "a does not equal b" );
     }
	  
	  // a is greater than b
	  if ( a > b ) 
	  {
		System.out.println ( "a is greater than and crushes b" );
	  }
     
	  // a is less than b
	  if ( a < b )
	  {
	  	System.out.println ( "a is less than and flees from b");
	  }
   }
}