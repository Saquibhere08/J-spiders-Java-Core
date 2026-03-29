package methodS;
import java.util.Scanner;
public class AreaTri {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base: ");
		int base=sc.nextInt();
		
		System.out.print("Enter the Height: ");
		int height=sc.nextInt();
		
		cal(base,height);
	}
	public static void cal(int b,int h) {
		int area= 1/2 *b * h;
		System.out.print("Area of Triangle: "+area);
	}

}
