package ObjectClass;

public class Pendriver {
public static void main(String[] args)throws CloneNotSupportedException {
	Pen3 p1=new Pen3("Cello",10);
	Pen3 p2=(Pen3)p1.clone();
	System.out.println(p1);
	System.out.println("=========================");
	System.out.println(p2);
}
}
