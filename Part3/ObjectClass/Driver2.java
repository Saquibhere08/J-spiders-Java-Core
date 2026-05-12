package ObjectClass;

public class Driver2 {
	//Case 2 : Compared the add reference of the two objects
	public static void main(String[] args) {
		Pen1 p1= new Pen1("Cello",10);
		Pen1 p2= new Pen1("Cello",10);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1==p2); //false
		System.out.println(p1.equals(p2)); //false
		System.out.println(p1.equals(p2)? "Same":"Different..");
	}
}
