/* program that plays with arrays
Steven Croft */

public class ArrayFun
{
	public static void main(String[] args)
	{
		int[] numbers = {0,1,2,3,4,5};
		// a for loop that prints the array
		for ( int i=0; i < numbers.length; i++)
		{
			System.out.println (i + "\t" + numbers [i] );
		}
		// a for loop that sums the array
		int sum = 0;
		for ( int i = 0; i < numbers.length; i++ )
		{
			sum += i;
		}
		// after you sum the array, print the sum
		System.out.println ( "The sum is: " + sum );
		
		// a for loop that adds one to each element of the array and prints the array
		for ( int i = 0; i < numbers.length; i++ )
		{
			
			System.out.println ((numbers [i] +1));
		}
		

	}
}