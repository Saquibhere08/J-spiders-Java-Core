package ObjectClass;

public class Demo1 {
	public static void main(String[] arg) {
		Car c= new Car("BMW","Black",1000);
		System.out.println(c);
	}
}
	class Car{
		String brand;
		String color;
		double price;
		
		public Car(String brand, String color, double price) {
			this.brand=brand;
			this.color=color;
			this.price=price;
		}
		
		@Override
		public String toString() {
			return "Brand: "+brand+"\nColor: "+color+"\nPrice: "+price; 
		}
	}

