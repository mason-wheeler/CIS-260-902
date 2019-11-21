//Mason Wheeler Section 902
package chapter6;

/**
	This program rolls a 6-sided die and a 20-sided die.
 */

public class DiceDemo 
{
	public static void main(String[] args) 
	{
		final int SIX_SIDES = 6;			//Number of sides for die #1
		final int TWENTY_SIDES = 20;			//Number of sides for die #2
		
		//Create a 6-sided die.
		Die sixDie = new Die(SIX_SIDES);
		
		//Create a 20-sided die. 
		Die twentyDie = new Die(TWENTY_SIDES);
		
		//Roll the dice.
		rollDie(sixDie);
		rollDie(twentyDie);
		/**
		 	This method simulates a die roll, displaying the die's number of sides and value. 
		 	@param	d The Die object to roll.
		 */
	}//end of main
		public static void rollDie(Die d)
		{
			//Display the number of sides.
			System.out.println("Rolling a " + d.getSides() + " sided die");
			
			//Roll the die.
			d.roll();
			
			//Display the die's value.
			System.out.println("The die's value: " + d.getValue());
		}
		
}//end of class
