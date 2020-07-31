package day2;

public class Calculator1 {
public static void main(String[] args) {
	System.out.println(2+3);
	
	int a = 4;
	int b = 2;
	System.out.println(a+b);
	int sum = a+b;
	System.out.println(sum);
	System.out.println("Sum of a and b is: " + sum);
	System.out.println("Sum of " + a + " and " + b + " is: " + sum);
	
	int sub = a - b;
	System.out.println(sub);
	System.out.println("Subtraction of " + a + " and " + b + " is: " + sub);
	
	int mul = a * b;
	System.out.println(mul);
	System.out.println("Multification of " + a + " and " + b + " is: " + mul);
	
	int div = a / b;
	System.out.println(div);
	System.out.println("Division of " + a + " by " + b + " is: " + div);
	
}
}
