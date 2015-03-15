/* steven croft testing the table class previously created */

public class TableTest
{
	public static void main (String [] args)
	{
		Table myTable; //reference variable
		// creating a new table with given properties
		myTable = new Table ("Kitchen", 30, 50, 29);
		
		System.out.println( myTable.getType() );
		System.out.println( myTable.area() );
		
		myTable.setType ("End");
		
		System.out.println( myTable.getType() );
	}
}