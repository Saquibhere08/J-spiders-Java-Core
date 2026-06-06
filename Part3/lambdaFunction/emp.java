package LambdaFunction;
//Anonymous Class
public class emp {
public static void main(String[] args) {
	Employee e1=new Employee(); 
	Employee e2=new Employee() {
		void getHike() {
			System.out.println("Getting Hike of 100%");
		}
	}; 
	Employee e3=new Employee();
	
	e1.getHike();
	e2.getHike();
	e3.getHike();
}
}
