package Final;

public class FinalNonStaticVariables {
	final int a=100;
	final int b;
	final int c;
	
	FinalNonStaticVariables(){
		b=200;
	}
	
	public static void main(String[] arg) {
		FinalNonStaticVariables obj=new FinalNonStaticVariables();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}
	
	{
		c=300;
	}
	
}
