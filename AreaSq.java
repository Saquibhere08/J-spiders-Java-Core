package methodS;

import java.util.Scanner;
public class AreaSq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Side of Square: ");
		int side=sc.nextInt();
		
		cal(side);
	}
	
	public static void cal(int a) {
		int area=a*a;
		System.out.println("Area of Square: "+area);
}
}
