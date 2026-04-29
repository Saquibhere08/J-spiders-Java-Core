package Final;

public class FinalStaticVariable {
	final static int a=100;
	final static int b;
	
	static {
		b=200;
	}
	public static void main(String [] arh) {
		System.out.println(a);
		System.out.println(b);
	}
}
