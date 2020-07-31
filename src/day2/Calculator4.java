package day2;

import javax.swing.JOptionPane;

public class Calculator4 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter b: "));
		
		int sum = a+b;
		int sub = a-b;
		int div = a/b;
		int mul = a*b;
		
		JOptionPane.showMessageDialog(null, "Sum of a and b is: "+ sum);
		JOptionPane.showMessageDialog(null, "Sub of a and b is:  "+ sub);
		JOptionPane.showMessageDialog(null, " Div of a by b is: "+ div);
		JOptionPane.showMessageDialog(null, " Mul of a by b is:"+ mul);
		
	}
}
