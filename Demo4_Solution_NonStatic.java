package NonStatic;
//Non static variables
public class Demo4_Solution_NonStatic {
	int a=10; //non-static variable / a is Global Variable
	public static void main(String[] args) {
		int b=440; // Local Variable
		//System.out.println(a); //cannot use non-Static variable without creating object
		System.out.println(b);
		Demo4_Solution_NonStatic d1=new Demo4_Solution_NonStatic();
		System.out.println(d1.a); //can be accessed using Object reference.
		
	}
}
