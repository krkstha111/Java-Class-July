package day14;

import java.util.Scanner;
//Finding maximum and minimum element from and an array series.
public class ArrayDemo3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your choice:");
		String choice = input.next();
		int [] a = {3, 4, 7, 6, 2};
		int max = a[0];
		int min	= a[0];
		switch (choice) {
		case "maxE":// maximum element
		case "maxe":
		for (int i=1; i<a.length; i++) {
			if (max<a[i]) {
				max = a[i];
							}
		}
		System.out.println("Maximum element of an array is: "+max);
		break;
		case "minE":// minimum element
		case "mine":
			for (int i = 1; i<a.length; i++) {
				if (min>a[i]) {
					min=a[i];
				}
			}
			System.out.println("Minimum element of an array is: "+min);
			break;
		case "secH":
			
		}	
	}	
}
	

