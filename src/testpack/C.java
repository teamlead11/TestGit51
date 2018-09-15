package testpack;

import java.util.Scanner;

public class C {

	
	public static  void balaStrRev()
	{
		
		System.out.println("Sample test case");
		
		
		Scanner sc=new Scanner(System.in);
		String nm=sc.nextLine();
		
		StringBuilder sb=new StringBuilder();
		sb.append(nm);
		sb=sb.reverse();
		System.out.println(sb);
		
}
}