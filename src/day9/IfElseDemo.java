package day9;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a = input.nextInt();
		System.out.println("Enter value of b:");
		int b = input.nextInt();
		
		if (a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("a is less than b");
		}
		System.out.println("more codes.....");
		System.out.println("Exit Programe..");
	}
}
