package Assignment1;

public class Calculator {
double powerInt(int num1,int num2) {
	return Math.pow(num1, num2);
	
}
double powerDouble(double num1,int num2) {
	return Math.pow(num1, num2);
}
public static void main(String[] args) {
	Calculator c=new Calculator();
	System.out.println(c.powerDouble(2,6));
	System.out.println(c.powerInt(2, 3));
}
}
