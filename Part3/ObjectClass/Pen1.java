package ObjectClass;

public class Pen1 {
	String brand;
	double price;
	public Pen1(String brand, double price){
		this.brand=brand;
		this.price=price;
	}
	
	@Override
	public int hashcode() {
		return brand.hashcode()+(int) price;
	}
}
