/* Steven Croft homework assignment number 2 
this program computes the area of a circle using double variables and a single line of math*/

public class AreaOfCircle
{
	public static void main (String[] args)
	{
		//variables for pi and radius
		float radius;
		double area;
		
		//assigned constant pi
		final double PI = 3.14159;
		
		//assign variables
		radius = 30;
		
		
		//compute radius
		area = PI*radius*radius;
		
		//output
		System.out.println( "Area is " + area);
	}
}