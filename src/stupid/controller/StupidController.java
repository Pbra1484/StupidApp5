package stupid.controller;

import java.util.Scanner;

public class StupidController 
{
	private String myName;
	private Scanner readKeyboardInput;
	
	
	public StupidController()
	{
		myName = "Patrick";
		readKeyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("Hm");
		System.out.println(myName);
		askQuestions();
		
		
	}
	
	private void askQuestions()
	{
		System.out.println("What is your Name?");
		String userInput = readKeyboardInput.nextLine();
		System.out.println("Your name is " + userInput);
		
		System.out.println("What is your birthdate as an integer?");
		Integer userInputQuestion2 = readKeyboardInput.nextInt();
		System.out.println("Your birthay is " + userInputQuestion2);
		readKeyboardInput.nextInt();
		
		System.out.println("Enter a number");
		double userInputQuestion3 = readKeyboardInput.nextDouble();
		System.out.println("The result is " + userInputQuestion3);
		readKeyboardInput.nextLine();
		
		System.out.println("Type a word here");
		String userInputQuestion4 = readKeyboardInput.next();
		System.out.println("You typed " + userInputQuestion4);
		
		System.out.println("If you typed more than a word it will apear here");
		String userInputExtra = readKeyboardInput.nextLine();
		System.out.println(userInputExtra);
		
		System.out.println("Type somting to fill up space");
		String userInputQuestion5 = readKeyboardInput.nextLine();
		System.out.println("You typed" + userInputQuestion5);
		
		System.out.println("How was your day?");
		String userInputQuestion6 = readKeyboardInput.nextLine();
		System.out.println("My day was " + userInputQuestion6 + " too");
		
		System.out.println("This is the end any final toughts?");
		String userInputQuestion7 = readKeyboardInput.nextLine();
		System.out.println("To repeat you typed " + userInputQuestion7);
		
		
		
		
		
	}
}