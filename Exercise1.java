package decision;

public class Exercise1 {

	public static void main(String[] args) {
		// Nested If - Else Statement
		
		int num=555;
		if(num%2==0 && num%4==0) {
			System.out.println("Hi");
			if(num%2==0 && num%4!=0) 
				System.out.println("Even Number");
				if(num%3==0)
					System.out.println("Bye");
			else
				System.out.println("odd Number..");
				
		//
		}
	}

}
