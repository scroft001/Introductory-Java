/* for loop to add the number 1 - 50
Steven Croft */

public class Loops1
{
	public static void main (String [] args )
	{
		int sum = 0;
		int sumEven = 0;
		
		
		// loop that sums integers from 1 - 50 
		
		for ( int i = 0; i <= 50; i ++ )
		{
			sum += i;
		}
		System.out.println ( "The total is : " + sum );
		
		for ( int i = 2; i <= 50; i +=2)
		{
			sumEven += i;
		}
		System.out.println ("The even total is: " + sumEven);
	}
}