package SimpleNumProblems;

import java.util.Scanner;

class func {
	void num(int x , int y) {
		if(x>y)
			System.out.println("First Number is Greatest");
		else
			System.out.println("Second Number is Greatest");
		
	}
}

public class GreatestNumber {

	public static void main(String[] args) {
		
		int a,b;
		func num1= new func();
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter The First Number");
		a=in1.nextInt();
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter The Second Number");
		b=in2.nextInt();
		num1.num(a,b);
		

	}

}
