package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to reverse");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      System.out.println("Reverse of entered string is: "+reverse);
		System.out.println("this is my base class");
		System.out.println("added some code");
		System.out.println("This is my git task");
	} 

}
