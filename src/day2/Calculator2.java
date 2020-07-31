package day2;

import java.util.Scanner;

public class Calculator2 {
	public static void main(String[] args) {
		Scanner ob =new Scanner(System.in);
		System.out.println("Enter any two nos.  !!!");
		int a = ob.nextInt();
		int b =ob.nextInt();
		int sum = a+b;
		int sub = a-b;
		int div = a/b;
		System.out.println("sum="+sum);
		System.out.println("sub="+sub);
		System.out.println("div="+div);
		
		ob.close();
		
	}

}
