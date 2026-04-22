package Encapsulation;

class Mobile {
	private String brand;
	private int price;
	
	//setter() methods
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price =price;
	}
	
	//getter() methods
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
}
