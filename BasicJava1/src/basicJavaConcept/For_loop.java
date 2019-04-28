package basicJavaConcept;

public class For_loop {
	
	static int num = 5;
	static int num2 = 10;
	
	public static void main(String [] args){
		System.out.println("Below is the table of 5:");
		for (int i = 1; i<11; i++)
			System.out.println(+num*i);
		
		System.out.println("Below is the table of number2 = 10:");
		for (int j = 1; j<11; j++)
			System.out.println(+num2*j);
		
		//infinite loop
		for(int k = 1; k>1; k++){
			System.out.println("Below can be infinite loop:"+k);
		}
		
	}

}
