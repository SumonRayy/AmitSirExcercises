/*
 * This Program Will do the Addition of N number of Natural Numbers 
 */
package SimpleNumProblems;

import java.util.Scanner;

class Add{
	int val;
	int sum(int x) 
	{
		int y=x;
		for(int i=1; i<=y;  i++)
		{
			val+=i;
		}
		return val;
	}
	int data()
	{
		return val;
    }
}

public class AdditionOfNaturalNums {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		System.out.println("Enter The Value of n");
		int n1=n.nextInt(),res;
		Add n2= new Add();
		n2.sum(n1);
		res=n2.data();
		System.out.println("Addition of natural numbers ="+res);
		
	}

}
