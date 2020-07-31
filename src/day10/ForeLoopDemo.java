package day10;

import java.util.Scanner;

public class ForeLoopDemo {

	//for (initialization, condition, update (increment/decrement)){======}
	//{====}
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number:");
		int n = input.nextInt();
		
		for (int i =0; i <=n; i++) {
			System.out.println("Display numbers: "+i);
			input.close();
		}
		
	}
}
