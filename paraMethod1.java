package methodS;
import java.util.Scanner;
public class paraMethod1 {

	public static void main(String[] args) {
		// Parameterized Method Example1
		Scanner sc = new Scanner(System.in); //userInput
		System.out.print("Enter number 1: ");
		int a=sc.nextInt();
		System.out.print("Enter number 2: ");
		int b=sc.nextInt();
		
		add(a,b); //method call

	}
	public static void add(int a,int b) {
		int sum=a+b;
		System.out.println("Result: "+sum);
	}

}
