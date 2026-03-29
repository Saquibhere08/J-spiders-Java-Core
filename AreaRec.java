package methodS;

import java.util.Scanner;
public class AreaRec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Length: ");
		int length=sc.nextInt();
		System.out.print("Enter the Breadth: ");
		int breadth=sc.nextInt();
		
		cal(length,breadth);
		
	}
	public static void cal(int a,int b) {
		int area=a*b;
		System.out.println("Area of Rectangle: "+area);
	}

}
