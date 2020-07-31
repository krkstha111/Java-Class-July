package day4;

public class IncrementDecrementOperator {
public static void main(String[] args) {
	
	int i = 5;
	i= (i++) + (++i) + i + 1;
	System.out.println(i);
	
	int m =4;
	System.out.println(m++);
	System.out.println(m++);
	System.out.println(++m);
	
	int x = 5;
	++x;
	System.out.println(x);
	int a = 5;
	int b = 6;
	String s = (a>b)? "a is greater than b.": "b is greater than a.";
	System.out.println(s);
	boolean r = (a<b)? true : false;
	System.out.println(r);
	
}
}
