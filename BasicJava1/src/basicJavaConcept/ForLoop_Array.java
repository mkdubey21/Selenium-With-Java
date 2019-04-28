package basicJavaConcept;

public class ForLoop_Array {

	static int Marks1[] = {10, 15, 20, 25, 30};
	static String Cars [] = {"BMW", "Maruti", "Toyata"};
	public static void main(String [] args){
		
		System.out.println("----Below are for Marks---");
		for (int i = 0; i<Marks1.length;i++)
		{
			System.out.println("These are Marks for std1:"+Marks1[i]);
		}
		System.out.println("****Below are for Cars****");
		for (int j = 0; j<Cars.length; j++)
		{
			System.out.println("These are the Cars:"+Cars[j]);
		}
		
	}
}
