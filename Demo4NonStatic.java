package NonStatic;
//Non static variables
public class Demo4NonStatic {
	int a=10; //non-static variable / a is Global Variable
	public static void main(String[] args) {
		int b=440; // Local Variable
		System.out.println(a); //cannot use non-Static variable without creating object
		System.out.println(b);
		
	}
}
