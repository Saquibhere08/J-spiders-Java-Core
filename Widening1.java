class Widening1
{
	public static void main(String [] args)
	{
		byte b=10;
		short s = b;
		int a = b;
		long l = b;
		float f = b;
		double d = b;
		
		System.out.println("Byte : "+b);
		System.out.println("Short : "+s);
		System.out.println("Int : "+a);
		System.out.println("Long : "+l);
		System.out.println("Float : "+f);
		System.out.println("Double : "+d);
	}
}