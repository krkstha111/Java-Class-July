package day14;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the size of an arrey: ");
		int size = input.nextInt();
		
		// to take input
		int [] arr = new int [size];
		for (int i =0; i<arr.length; i++) {
			System.out.println("Enter elements: ");
			arr [i] = input.nextInt();	
			//sum and print of elements of array.
		}
		int mul = 1;//+3+
		for (int i = 0; i <arr.length; i++) {
			System.out.print(+ arr[i]+" ");
			mul = mul * arr [i];	
		}
		System.out.println("\nMultification of array elements is: "+mul);
		input.close();
	}

}
