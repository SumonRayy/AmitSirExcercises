package SimpleSums;

import java.util.Scanner;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the First Number = ");
		int a= scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the Second Number = ");
		int b= scan2.nextInt();
		
		int  mul=0;
		mul=a*b;
		System.out.println("Multiplication of Both Number = "+mul);


	}

}
