package Final;
//Method Overloading Example
//FinalOverloadingMethod
public class Parent {
	final static void seeing(int a) {
		System.out.println("Parent is Seeing...."+a+" eyes");
	}
	final static void seeing(int a,int b) {
		System.out.println("Parent is Seeing...."+(a+b)+" eyes");
	}
	final static void seeing(int a,int b,int c) {
		System.out.println("Parent is Seeing...."+(a+b+c)+" eyes");
	}
	public static void main(String[] arg) {
		seeing(1);
		seeing(1,1);
		seeing(1,1,2);
		
	}
}
