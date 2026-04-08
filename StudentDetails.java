package Application;

public class StudentDetails {
	String name;
	int age;
	long ph;
	String email;
	StudentDetails(){
		System.out.println("Registration Sucessfull.");
	}
	StudentDetails(String name){
		this.name=name;
	}
	StudentDetails(String name, int age){
		this.name=name;
		this.age=age;
	}
	StudentDetails(String name,int age,long ph){
		this.name=name;
		this.age=age;
		this.ph=ph;
	}
	StudentDetails(String name, int age,long ph, String email){
		this.name=name;
		this.age=age;
		this.ph=ph;
		this.email=email;
	}
}
