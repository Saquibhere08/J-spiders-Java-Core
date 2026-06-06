package LambdaFunction;
//Without Lambda Expression
interface Addition{
	void add(int a, int b);
}
class Add implements Addition{
	@Override
	public void add(int a, int b) {
		System.out.println("Sum: "+(a+b));
		
	}
}
public class LambdaExample1 {
	public static void main(String[] args) {
		Addition a=new Add();
		a.add(12, 10);
	}
}
