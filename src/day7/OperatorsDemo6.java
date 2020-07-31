package day7;

public class OperatorsDemo6 {
// Ternary Operators(Conditional Operators).
	//?, :
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		if (a>b) {
			System.out.println("a is greater than b: ");
		}else {
			System.out.println("b is greater than a: ");
		}
		String s = (a > b) ? "a is greater than b." : "b is greater than a.";
		System.out.println(s);
		
		boolean r = (a > b) ? true : false;
		System.out.println(r);
	}
}
