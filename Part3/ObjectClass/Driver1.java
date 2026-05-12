package ObjectClass;

public class Driver1 {
	public static void main(String [] arg) {
		//Case:1 Compared state of the two objects
		Pen p1=new Pen("Cello",123);
		Pen p2=p1;
		
		System.out.println(p1==p2); //True
		System.out.println(p1.equals(p2)); //True
		System.out.println(p1.equals(p2)? "Same":"Different..");
	}
}
