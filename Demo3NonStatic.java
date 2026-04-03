package NonStatic;

public class Demo3NonStatic {
	{
		new Demo3NonStatic();
		System.out.print("NSIB-1");
	}
	public static void main(String [] arg) {
		System.out.println("Main Starts..");
		new Demo3NonStatic();
		System.out.println("Main Ends");
	}
	{
		System.out.println("NSIB-2");
	}
	//StackOverFlow
}
