package UE1;

import java.util.Scanner;

public class CalculatorWithSwitch {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter two Integer Values :");
		Scanner s1 = new Scanner(System.in);
		a=s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		b=s2.nextInt();
		System.out.println("Enter A Choice :");
		System.out.println("1 : Addition");
		System.out.println("2 : Subtraction");
		System.out.println("3 : Multiplication");
		System.out.println("4 : Division");
		int opt;
		Scanner s3 = new Scanner(System.in);
		opt=s3.nextInt();
		
		switch(opt) {
		case 1: 
			System.out.println("Addition of Two values :"+Add(a,b));break;
		case 2:
			System.out.println("Subtraction of Two values :"+Sub(a,b));break;
		case 3:
			System.out.println("Multiplication of Two values :"+Mul(a,b));break;
		case 4:
			System.out.println("Division of Two values :"+Div(a,b));break;
		default :
			System.out.println("Error Input");break;
		}
		
		
		s1.close();s2.close();s3.close();
	}

	public static int Add(int a , int b) {
		int sum=a+b;
		return sum;
	}
	public static int Sub(int a , int b) {
		int sub=a-b;
		return sub;
	}
	public static int Mul(int a , int b) {
		int mul=a*b;
		return mul;
	}
	public static int Div(int a , int b) {
		int div=a/b;
		return div;
	}

}
