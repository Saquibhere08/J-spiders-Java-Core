package methodS;

import java.util.Scanner;

public class MyDetails {

	public static void main(String[] args) {
		//Using Scanner Functions
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name=sc.next();
		
		System.out.print("Enter Gender (M/F): ");
		char gender=sc.next().charAt(0);
		
		System.out.print("Enter DOB: ");
		String dob=sc.next();
		
		System.out.print("Enter Email: ");
		String email=sc.next();
		
		System.out.print("Enter Marital Status: ");
		String marital=sc.next();
		
		sc.nextLine();
		
		System.out.println("Enter address: ");
		String address=sc.nextLine();
	
		System.out.println("Enter the age: ");
		 int age=sc.nextInt();
		
		
		System.out.println("***************Details*************");
		System.out.println("---------------------------------------------");
		System.out.println("Name: "+name);
		System.out.println("Gender(F/M): "+gender);
		System.out.println("Age: "+age);
		System.out.println("Email: "+email);
		System.out.println("DOB: "+name);
		System.out.println("Marital Status: "+marital);
		System.out.println("Address: "+address);
		
		
		
	
		
		
		
		
		

	}

}
