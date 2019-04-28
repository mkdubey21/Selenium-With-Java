package selfPractice;

import java.util.Scanner;

public class DataType {
	static int a;
	static int b;
			  public static void main (String[] args) 
		  {
		    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		    
		    Scanner in = new Scanner(System.in);
		    
		    System.out.println("Enter an command:");
		      a = in.nextInt();
		    
		    System.out.println ("**Below are from Array but based on Index **");
		    System.out.println(cars[0]);
		    System.out.println(cars[1]);
		    System.out.println(cars[3]);
		    System.out.println ("*******************************");
		    System.out.println ("**Below are from Array**");
		    
		    for (int i = 0; i < cars.length; i++) {
		    	System.out.println("Your Car Model is:"+cars[i]);
		  }
	}
}