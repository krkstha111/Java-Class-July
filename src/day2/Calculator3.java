package day2;

import java.util.Scanner;

public class Calculator3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a: ");
	int a = input.nextInt();
	System.out.println("Enter b: ");
	int b = input.nextInt();
	
	int sum = a+a;
	int sub = a-a;
	int div = a/a;
	int mul = a*a;
	
	System.out.println("Addition of "+a+" and "+a+" is: "+ sum);
	System.out.println("Subtraction of "+a+" and "+a+" is: "+sub);
	System.out.println("Division of "+a+" and "+a+" is: "+div);
	System.out.println("Multification of "+a+" and "+a+" is: "+mul);
	
	input.close();
	
	
}
}
