package basicJavaConcept;

//Java program to demonstrate working of Scanner in Java 
import java.util.Scanner;

public class InputFromUser 
{
	//static String str1 = "Name";
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
	{
		System.out.println("Please enter your Name:");
		String str1 = input.nextLine();
		System.out.println("You have entered Your Name: "+str1);
	
		System.out.println("Please enter your Age:");
		int age = input.nextInt();
		//System.out.println("You have entered Your Name: "+age);
		System.out.println("You have entered Your Name: "+str1);
		System.out.println("You have entered Your Age: "+age);
		if (age<=5)
		{
			System.out.println("You can go for Polio Drop:");
		}
		else
		{
			System.out.println("Sorry, You can NOT go for Polio Drop:");
		}
	}
	}
}
	
