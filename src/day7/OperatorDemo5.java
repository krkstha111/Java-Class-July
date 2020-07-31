package day7;

public class OperatorDemo5 {

	public static void main(String[] args) {
		//Logical operators
		//&&(and), ||(or), !(not)
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);//short circuit logical operators
		System.out.println(false && false);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);//short circuit logical operators
		System.out.println(false || false);
		
		System.out.println(!true);//false
		System.out.println(!false);//true
	}
}
