/* Steven Croft
cat class lab 2 */

public class Cat
{
	//fields for the cat
	private String name;
	private int age;
	private float weight;


	//initialize fields
	public Cat ( String n, int a, float w)
	{
		name = n;
		age = a;
		weight = w;
	}
	
	//accessors and mutators
	
	//accessors
	public String getName ()
	{
		return name;
	}
	
	public int getAge ()
	{
		return age;
	}
	
	public float getWeight ()
	{
		return weight;
	}
	
	// mutators
	public void setName (String n)
	{
		name = n;
	}
	
	public void eat ()
	{
		System.out.println (name + " is eating all of the tuna in the sea.");
	}
	
	public void sleep()
	{
		System.out.println (name + " is sleeping off last night's drinking.");
	}
}