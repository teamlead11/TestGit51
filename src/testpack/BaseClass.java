package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
		System.out.println("added some code");
		System.out.println("merge");
		
		stringrev_kumar();
	}
	public static void stringrev_kumar() 
	{
		String str = "Git working environment";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
		
		
	}
}