package testpack;

import java.util.Scanner;

public class PushPull {


		public static  void main(String [] args)
		{
			
			System.out.println("enter string");
			
			
			Scanner read=new Scanner(System.in);
			String str=read.nextLine();
			String reverse = "";
			for (int i= str.length()-1;i>=0; i--)
			{
				reverse =reverse + str.charAt(i);
				System.out.println("the reversed string is");
				System.out.println(reverse);
		}
	}

}
