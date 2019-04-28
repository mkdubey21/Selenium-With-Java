package basicJavaConcept;

import java.util.Scanner;
public class TableFromUserInputNumber {

	public static void main(String [] args){
		Scanner usernum = new Scanner(System.in);
		System.out.println("Please Enter Number to prepare table: ");
		int tablenum = usernum.nextInt();
		System.out.println("Your table for Required number:"+"tablenum"+"is below:");
		for (int i = 1; i<11; i++)
		{
			System.out.println(tablenum*i);
		}
		
	}
}
