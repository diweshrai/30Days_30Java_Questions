package myPack;

public class DayTwo {

	//swap two numbers without using a third variable....
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a = 5;
	int b = 4;
	System.out.println("Before value of a is"+a);
	System.out.println("Before value of b is"+b);
	
	a = a+b;
	b = a-b;
	a= a-b;
	
	System.out.println("After  value of a is"+a);
	System.out.println("After  value of b is"+b);
	}

}


