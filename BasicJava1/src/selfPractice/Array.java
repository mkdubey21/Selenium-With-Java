package selfPractice;

public class Array {

	public static void main(String [] args)
	{
		int math = 60;
		int sst = 60;
		int sci = 59;
		int eng = 58;
		int hindi = 57;
		int marathi = 56;
	
		System.out.println("Daughter semester Marks:"+math);
		System.out.println("Daughter semester Marks:"+sst);
		System.out.println("Daughter semester Marks:"+sci);
		System.out.println("Daughter semester Marks:"+eng);
		System.out.println("Daughter semester Marks:"+hindi);
		System.out.println("Daughter semester Marks:"+marathi);
	//try with String Array
		System.out.println("---By Using String Array--------------");
		String [] subjects = {"Maths", "SST", "Science", "Eng", "Hindi", "Marathi"};
		for (int i =0; i<subjects.length; i++)
		{
			System.out.println("Deepti Subjects in IV std.:"+subjects[i]);
		}
	//try with INT Array
		System.out.println("---By Using INT Array--------------");
		int [] marks = {60, 60, 59, 58, 57, 56};
		for (int i =0; i<marks.length; i++)
		{
			System.out.println("Deepti Marks in Sem:"+(i+1)+"is"+marks[i]);
		}
	}
}
