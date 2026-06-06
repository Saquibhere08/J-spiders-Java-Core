package LambdaFunction;
//With Lambda Expression
interface Adition{
	void add(int a, int b);
}
public class LambdaExample2 {
public static void main(String[] args) {
	Adition ad= (a,b) -> { 
		System.out.println(a+b);
	};
	ad.add(11, 110);
}
}
