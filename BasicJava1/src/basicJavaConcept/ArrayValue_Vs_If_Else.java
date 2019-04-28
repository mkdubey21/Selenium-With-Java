package basicJavaConcept;

public class ArrayValue_Vs_If_Else {
	
	public static void main(String [] args){
		
		String name = "Manoranjan";
		String team = "MD, NL, AC, PP";
		String [] teammem = team.split(", ");
		
		System.out.println(name);
		System.out.println(team);
		
		System.out.println(teammem[0]);
		System.out.println(teammem[1]);
		System.out.println(teammem[2]);
		System.out.println(teammem[3]);
		
		if (teammem[0].equalsIgnoreCase("RD"))
		{
			System.out.println("This is from Team");
		}
		else
		{
			System.out.println("This is NOT from Team");
		}
	}

}
