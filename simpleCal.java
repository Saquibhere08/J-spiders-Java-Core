package controlTransferStatements;

import java.util.Scanner;
public class simpleCal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("**********Calculator*************");
		System.out.println("----------------------------------------");
		
		System.out.print(" ");
		int num1=sc.nextInt();
		
		System.out.print(" ");
		char sym=sc.next().charAt(0);
		
		System.out.print(" ");
		int num2=sc.nextInt();
		
		switch(sym) {
		case '+':{
			int res= num1+num2;
			System.out.println(res);
			break;
		}
		case '-':{
			int res=num1 - num2;
			System.out.println(res);
			break;
		}
		case '*':{
			int res=num1 *num2;
			System.out.println(res);
			break;
		}
		case '/':{
			int res=num1 / num2;
			System.out.println(res);
			break;
		}
		case '%':{
			int res2=num1 % num2;
			System.out.println(res2);
			break;
		}
		default:
			System.out.println("Invalid");
		
		}
		System.out.print("********************************");

	}

}
