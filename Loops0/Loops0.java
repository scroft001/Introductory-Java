/* a program that sums all numbers from 1 to 50
 and just the even ones
 Steven Croft */
 
 import java.util.Scanner;
 import java.io.File;
 import java.io.IOException;
 
 public class Loops0
 {
 	public static void main (String [] args)
	{
		int sum = 0;
		int sumEven = 0;
		int count = 0;
		int countEven = 2;
		
		while ( count != 51 )
		{
			sum = sum + count;
			count ++;
		}
		System.out.println ( "The total is: " + sum);
		
		while ( countEven != 52 )
		{
			sumEven = sumEven + countEven;
			countEven = countEven + 2;
		}
		System.out.println ("The total of the evens is: " + sumEven);
	}
 }