package controlTransferStatements;

import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("**********Calculator*************");
		System.out.println("********************************");
		
		System.out.print(" ");
		int num1=sc.nextInt();
		
		System.out.print(" ");
		char sym=sc.next().charAt(0);
		
		System.out.print(" ");
		int num2=sc.nextInt();
		
		if(sym == '+') {
			int res1=num1 +num2;
			System.out.print(res1);
		}else if(sym == '-') {
			int res2=num1 - num2;
			System.out.print(res2);
		}else if(sym == '*') {
			int res3=num1 * num2;
			System.out.print(res3);
		}else if(sym == '/') {
			int res4 = (num1 /num2);
			System.out.print(res4);
		}else {
			System.out.println("Invalid Symbol");
		}
		System.out.println(" ");
		System.out.print("********************************");

	}

}
