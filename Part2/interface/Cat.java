public class Cat implements animal{

	public void sound(){
	System.out.println("Meow Meow");
	}

	public void bites(){
	System.out.println("Cat Bites");
	}
	
	public static void main(String [] arg){
	animal a = new Cat();
	a.sound();
	a.bites();
	}
}