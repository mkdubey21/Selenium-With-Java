package basicJavaConcept;

public class String_Function {
	
	static String OrigStr1 = "This is First String an Original String";
	String OrigStr2 = "Manual Testing and Automation Testing";
	static String OrigStr3 = "Manoranjan Dubey, Meenakshi Dubey, Deepti Dubey, Drishti Dubey";
	//String OrigStr1 = "This is First String an Original String";
	//String OrigStr1 = "This is First String an Original String";
	
	static String Mod1Str1 = OrigStr1.replaceFirst("This", "That");
	static String Mod2Str3 = OrigStr3.replaceFirst("Dube", "DubeyPandey");
	static int Mod3Str3 = OrigStr3.compareTo(OrigStr1);
	
	public static void main(String [] args){
		
		System.out.println("original String: "+OrigStr1);
		System.out.println("Modified String: "+Mod1Str1);
		//
		
		System.out.println("Modified Mod2Str3: "+OrigStr3);
		System.out.println("Modified Mod2Str3: "+Mod2Str3);
		//
		
		System.out.println("Modified Mod2Str3: "+OrigStr3);
		System.out.println("Modified Mod2Str3: "+Mod3Str3);
		
		
		
	}

}
