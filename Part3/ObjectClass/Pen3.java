package ObjectClass;

public class Pen3  implements Cloneable{
	String brand;
	double price;
	public Pen3(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Brand: "+brand+"\nPrice: "+price;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
