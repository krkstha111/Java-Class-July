package day7;

public class TypeCastingDemo2 {
 public static void main(String[] args) {
	
	 //implicit type casting.
	 
	 byte b = 100;
	 short s = b;
	 int i = s;
	 long l = s;
	 float f = l;
	 double d = f;
	 
	 System.out.println("b is: "+b);
	 System.out.println("i is: "+s);
	 System.out.println("s is: "+i);
	 System.out.println("l is: "+l);
	 System.out.println("f is: "+f);
	 System.out.println("d is: "+d);
	 
}
}
