package Collection;

import java.util.List;

public class NonGenericCollection {
	public static void main(String[] args) {
		List al=new ArrayList();
		
		al.add(10);
		al.add(1.20);
		al.add("Hello");
		al.add('J');
		al.add(true);
		al.add(null);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}
