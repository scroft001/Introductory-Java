/* Steven Croft modelling a table */

public class Table
{
	// fields for a table
	private String type;
	private int width;
	private int length;
	private int height;
	
	// initialize fields
	public Table (String t, int w, int l, int h )
	{
		type = t;
		width = w;
		length = l;
		height = h;
	}
	
	// accessors and mutators
	// accessor
	public String getType ()
	{
		return type;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	//mutators
	public void setType (String t)
	{
	type = t;
	}
	
	public int area ()
	{
		return length * width;
	}
}