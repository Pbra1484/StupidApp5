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
		System.out.println("You said " + userInput);
		
	}
}