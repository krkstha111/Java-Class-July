package day7;

public class TypeCastingDemo1 {

	// Implicit Casting (Conversion), Up Cast
	// Conversion is done by compiler
	
	public static void main(String[] args) {
		
		byte b = 127;
		int i = b;
		System.out.println("b is : "+b);
		System.out.println(" i is : "+i);
		
		//Explicit Casting (Conversing) , Down Cast
		// It is done by Programmer
		int ii = 127;
		byte bb = (byte) ii;// forcefully converted to bye programmer using byte option in front.
		System.out.println("ii is: "+ii);
		System.out.println("bb is: "+bb);
		
		int iii = 200;
		byte bbb = (byte) iii;// if the value given is out of range, printed value of byte is garbage value.
		System.out.println("iii is: "+iii);
		System.out.println("bbb is: "+bbb);
	}
}
