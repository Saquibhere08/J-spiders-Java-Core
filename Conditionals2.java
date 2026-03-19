package decision;

public class Conditionals2 {

	public static void main(String[] args) {
		int a=12;
		int b=200;
		int c=44;
		int d=77;
		
		if(a<b && a<c && a<d) {
				System.out.print(a+ " is smaller");
		}else if(b<c && b<d) {
			System.out.print(b+ " is smaller");
		}else if(c<d) {
			System.out.println(c + "is smaller");
		}else
			System.out.println(d+ "is smaller");

	}

}
