
public class Dog implements animal{

	public void sound(){
	System.out.println("Bow Bow");
	}

	public void bites(){
	System.out.println("Dog Bites");
	}

	public static void main(String[] arg){
	animal a=new Dog();
	a.sound();
	a.bites();
	}
}