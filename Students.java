package Application;
import java.util.Scanner;
public class Students 
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //userInput
		
		System.out.println("========================================");
		System.out.print("===============Student Details======================");
		System.out.println("Enter Choice as Number ");
		System.out.println("1.Without Details \n2.Name\n3.Name & Age\n4.Name , Age , Phone Number \n5.Name , Age, Phone Number, Email");
		
		int ch=sc.nextInt(); //user input stored in the variable 
		
		
		switch(ch) 
		{
		case 1:
		{
		StudentDetails stu1=new StudentDetails();
		
		break;	
		}
		case 2:
		{
			System.out.print("Enter Name: ");
			String name=sc.next();
			StudentDetails stu1=new StudentDetails(name);
			System.out.println("Name: "+name);
			
			break;	
		}
		case 3:
		{
			System.out.print("Enter Name: ");
			String name=sc.next();
			System.out.print("Enter Age: ");
			int age=sc.nextInt();
			StudentDetails stu1=new StudentDetails(name,age);
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);	
			
			break;	
		}
		case 4:
		{
			System.out.print("Enter Name: ");
			String name=sc.next();
			System.out.print("Enter Age: ");
			int age=sc.nextInt();
			System.out.print("Enter Phone Number: ");
			long ph=sc.nextLong();
			StudentDetails stu1=new StudentDetails(name,age,ph);
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
			System.out.println("Phone Number:  "+ph);
			
			break;	
		}
		case 5:
		{
			System.out.print("Enter Name: ");
			String name=sc.next();
			System.out.print("Enter Age: ");
			int age=sc.nextInt();
			System.out.print("Enter Phone Number: ");
			long ph=sc.nextLong();
			System.out.print("Enter Email: ");
			String email=sc.next();
			StudentDetails stu1=new StudentDetails(name,age,ph,email);
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
			System.out.println("Phone Number:  "+ph);
			System.out.println("Email:  "+email);
			
			break;	
		}
		
		}
		System.out.println("========================================");
		

	}

}
