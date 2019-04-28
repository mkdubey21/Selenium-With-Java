package basicJavaConcept;

public class If_Else_Nested {
	
	static int p_age = 6;
	
	public static void main(String [] args){
		
		//if else
		if(p_age>0 && p_age<=5)
		{
			System.out.println("Enjoy the Free Rides");	
		}
		else
			{
				if(p_age>5 && p_age<=14)
					{
					System.out.println("You are Child, You will get the CHILD concession");
					}
				else
					{
					if(p_age>15 && p_age<60)
					{
						System.out.println("Hey, You are Young, NO Concession Please");
					}
		
					else
					{
						if(p_age>60 && p_age<100)
							{
								System.out.println("Wait, You will get the Concession Please");
							}
		else
		{
			System.out.println("Sorry, Invalid Input");
		}
	}
	}
	}
	}
}
