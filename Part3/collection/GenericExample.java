package Collection;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
 public static void main(String[] args) {
	List<Integer> al=new ArrayList();
	
	al.add(12);
	al.add(15);
	al.add(1);
	al.add(2);
	al.add(90);
	al.add(34);
	al.add(145);
	System.out.println("List 1: "+al);
	
	//for-each loop
	//for(Integer i: al) { //it will give exception - ConcurrentIndexException
		al.remove(al.indexOf(1));
	//}
	System.out.println("Result: "+al);
	
}
}
