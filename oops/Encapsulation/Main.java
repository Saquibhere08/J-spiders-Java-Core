package Encapsulation;

public class Main {

	public static void main(String[] args) {
		//calling both getter() and setter()
		
		Mobile m=new Mobile();
		
		m.setBrand("Apple");
		m.setPrice(64000);
		
		System.out.println(m.getBrand());
		System.out.println(m.getPrice());

	}

}
