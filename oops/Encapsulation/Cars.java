package Encapsulation;

import java.util.Scanner;

//factory Class
public class Cars {
	public static Car createCar() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Brand: ");
		String brand=sc.next();
		System.out.print("Enter color: ");
		String color=sc.next();
		System.out.print("Enter Price: ");
		double price=sc.nextDouble();
		
		return new Car(brand,color,price);
	}	
		public static void carDetails(Car car) {
			System.out.println("**********CAR DETAILS**************");
			System.out.println("Brand: "+car.brand);
			System.out.println("Color: "+car.color);
			System.out.println("Price: "+car.price);
		}
	}

