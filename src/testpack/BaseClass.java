package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
		System.out.println("added some code");
		System.out.println("merge");


		System.out.println("This is my git task");
		
		String string = "Java";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("String before reverse: "+string);
		System.out.println("String after reverse: "+reverse);

		BaseClass b = new BaseClass();
		b.joyRevString();
		b.balaStrRev();

		b.stringReverseByShayina();

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any String for reversal: ");
		String inputString = input.nextLine();
		System.out.println(b.stringReversalByBanu(inputString));

		stringrev_kumar();

	} 

	public String stringReversalByBanu(String inputString) {
		String outputString = "";
		for (int i=(inputString.length()-1); i>=0; i--) {
			char temp = inputString.charAt(i);
			outputString = outputString+temp;
		}
		return outputString;
	}

	public void stringReverseByShayina(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string to be reversed:");
		String string=scanner.nextLine();
		String reverse="";
		for(int i=string.length()-1;i>=0;i--)
		{
			reverse=reverse+string.charAt(i);
		}
		System.out.println("Your reversed string is:"+reverse);	

	}


	public static void stringrev_kumar() 
	{
		String str = "Git working environment";

		for(int i = str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}

				
	}

	public static  void balaStrRev()
	{
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String nm=sc.nextLine();
		
		StringBuilder sb=new StringBuilder();
		sb.append(nm);
		sb=sb.reverse();
		System.out.println(sb);
		
	}

	
	public static void joyRevString(){
		String em1,rev="";
		System.out.println("Enter any String");
		Scanner em=new Scanner(System.in);
		em1=em.nextLine();
		int l=em1.length();
		
		for(int i=l-1;i>=0;i--)
		{
			rev=rev + em1.charAt(i);
		}
		System.out.println(rev);

	
}

	

	}




