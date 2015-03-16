/* Steven Croft lab 2
testing the cat class */

import javax.swing.JOptionPane;

public class CatTest
{
	public static void main ( String [] args )
	{
		Cat myCat; //reference variable 
		// create first new cat
		myCat = new Cat ( "Gerry", 2, 30 );
		
		//test methods with first cat
		
		JOptionPane.showMessageDialog (null,"My Cat's name is " + myCat.getName () 
		+ "\nMy Cat's age is " + myCat.getAge () 
		+ "\nMy Cat's weight is " + myCat.getWeight () + " pounds" );
		
		myCat.setName ("Tom");
		JOptionPane.showMessageDialog (null, "My Cat's new name is" + myCat.getName () );
		
		myCat.eat ();
		myCat.sleep ();
		
		// create second new cat
		
		Cat yourCat;
		yourCat = new Cat ("Ben", 4, 300);
		
		//test methods with second new cat
		 JOptionPane.showMessageDialog (null," Your Cat's name is " + yourCat.getName ()
		 + "\nYour Cat's age is " + yourCat.getAge () 
		+ "\nYour Cat's weight is " + yourCat.getWeight ()+ "pounds" );
		
		yourCat.setName ("Jimmy");
		JOptionPane.showMessageDialog (null, "Your Cat's new name is " +  yourCat.getName () );
		
		yourCat.eat (); // is a void statement and will return a value ( the string statement ) from the class
		yourCat.sleep ();
		
	}
}