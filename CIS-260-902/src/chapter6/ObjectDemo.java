package chapter6;

import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class ObjectDemo 
{
	public static void main(String[] args) throws IOException
	{
		int maxNumbers;		//Max number of random numbers
		int number;			//To hold a random number
		
		//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		//Create a Random object to generate random numbers.
		Random rand = new Random();
		
		//Get the number of random numbers to write.
		System.out.println("How many random numbers should I write? ");
		maxNumbers = keyboard.nextInt();
		
		//Create a PrintWriter object to open the file.
		PrintWriter outputFile = new PrintWriter("numbers.txt");
		
		//Write the random numbers to the file.
		for (int count = 0; count < maxNumbers; count++) 
		{
			//Generate a random integer.
			number = rand.nextInt();
			
			//Write the random integer to the file.
			outputFile.println(number);
		}
		
		//Close the file.
		outputFile.close();
		System.out.println("Done.");
	}//end of class
}//end of main
