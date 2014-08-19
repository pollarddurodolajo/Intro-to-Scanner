import java.util.Scanner;
 
public class IntroToScanner
	{
	static String name, response1, response2, response3, response4, response5;
 	
	public static void main(String[] args)
  	{		
		System.out.println( "Hello what's your name?");
		
		Scanner userInput1 = new Scanner(System.in);
		name = userInput1.nextLine();
		
		System.out.println("hello " + name);
		System.out.println("How's your day?");
		
		response1 = userInput1.nextLine();
			{
			if ("good".equals(response1))
				System.out.println("Oh that's nice. My day has been pretty ok");
			else
				System.out.println("Oh well i hope you have a better day.");
			}
			
		System.out.println("So what's your next class?");
		response2 = userInput1.nextLine();
		System.out.println("Do you like " + response2 + "?" );
		response3 = userInput1.nextLine();
		
		{
		if ("yes".equals(response3))
			System.out.println("Oh that's good.");
		else
			System.out.println("Is it because of the teacher?");
		response4 = userInput1.nextLine();
		}
		
		{
		if ("yes".equals(response4))
			System.out.println("Transfer out");
		else 
			System.out.println("Well if it's not them then it must be your problem. You should probably fix it. Sorry was that rude?");
			 response5 = userInput1.nextLine();
		}
		
			{
			 if ("yes".equals(response5))
				 System.out.println("Well i'll just go then . . .");
			 else
				 System.out.println("Oh ok well i have to go anyway have a good day");
			}	 
  		}
	}