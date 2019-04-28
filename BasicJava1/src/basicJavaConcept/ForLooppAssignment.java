package basicJavaConcept;

public class ForLooppAssignment {
	
	static int num = 5, k, j;
	
	public static void main(String [] args)
	{
		for (k=0; k<=num; k++)
		{
			for(j=0;j<=k;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
