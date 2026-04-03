package Static;
//Static Initializers
public class Demo6Static {
	static {//it will executes first before the main method
		System.out.println("SIB-1");
	}

	public static void main(String[] args) {
		
		System.out.println("Main Starts...");
		System.out.println("Main Ends...");

	}
	static {//it will executes first before the main method
		System.out.println("SIB-2");
	}
	static {//it will executes first before the main method
		System.out.println("SIB-3");
	}

}
