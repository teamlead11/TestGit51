package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
		System.out.println("added some code");
		System.out.println("merge");
		
	
		System.out.println("This is my git task");
	
		BaseClass b = new BaseClass();
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
	
	public static void stringrev_kumar() 
	{
		String str = "Git working environment";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
		
		
	}


	
	}
	
