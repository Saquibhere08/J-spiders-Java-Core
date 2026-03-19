package decision;

public class Condtionals1 {

	public static void main(String[] args) {
		//Using Nested if - else Statements
		
		int a=12;
		int b=22;
		int c=4;
		int d=8;
		
		if(a<b && a<c) {
			if(a<d) {
				System.out.println("A is Smallest"+ a);
			}else
				if(b<a && b<c) {
					if(b<d) {
						System.out.println("B is smallest "+b);
					}else
						if(c<a&& c<b) {
							if(c<d) {
								System.out.println("C is smallest"+c);
								
							}else
								System.out.println("D is smallest"+d);
				}
		}
	}
}
}