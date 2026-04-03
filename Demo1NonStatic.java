package NonStatic;

public class Demo1NonStatic {
	{
		System.out.println("NSIB-1");
	}

	public static void main(String[] args) {
		// Non-static
		System.out.println("Main Starts");
		System.out.println("Main Ends");
	}
		static {
			new Demo1NonStatic(); //object creation
			System.out.println("SBI-1");
		}
		static {
			System.out.println("SBI-2");
		}
		{
			System.out.println("NSIB-2");
		}

}
