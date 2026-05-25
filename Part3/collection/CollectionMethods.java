package Collection;
import java.util.ArrayList;

public class CollectionMethods {
	public static void main(String[] args) {
		System.out.println("Important Methods of Collection Interface");
		//Important Methods of Collection Interface
		ArrayList al=new ArrayList(); //Non-Generic 
		ArrayList a2=new ArrayList();
		add1(al);
		add2(a2);
		addAll(al,a2);
		remove(al);
		removeAll(al,a2);
		retainAll(al,a2);
		contains(al,a2);
		containsAll(al,a2);
		isEmpty(al,a2);
		size(al,a2);
		toArray(al,a2);
		clear(al,a2);
	}
	public static void add1(ArrayList al) {
		System.out.println("add()");
		al.add(10);
		al.add(4.6);
		al.add("Hello");
		al.add('J');
		al.add(null);
		al.add(true);
		System.out.println("ArrayList 1: "+al);
	}
	public static void add2(ArrayList a2) {
		System.out.println();
		System.out.println("add()");
		a2.add("Bye");
		a2.add(100);
		a2.add(5.5);
		a2.add(false);
		a2.add(null);
		a2.add('A');
		System.out.println("ArrayList 2: "+a2);
	}
	public static void addAll(ArrayList al,ArrayList a2) {		
		System.out.println();
		System.out.println("addAll()");
		//addAll method
		a2.addAll(al);
		//System.out.println("ArrayList 2 & 1 combined: "+al);
		System.out.println("ArrayList 2 & 1 combined: "+a2);
	}
	public static void remove(ArrayList al) {
		System.out.println();
		System.out.println("remove()");
		add1(al);
		al.remove(null);
		System.out.println(al);
	}
	public static void removeAll(ArrayList al,ArrayList a2) {
		System.out.println();
		System.out.println("removeAll()");
		al.removeAll(a2);
		System.out.println("RemovedAll from List 2: "+a2);
		System.out.println("RemovedAll from List 1: "+al);
	}
	public static void retainAll(ArrayList al,ArrayList a2) {
		System.out.println();
		System.out.println("retainAll()");
		add1(al);
		add2(a2);
		al.retainAll(a2);
		System.out.println("retaine()1: "+al);
		System.out.println("retained()2: "+a2);
	}
	
	public static void contains(ArrayList al,ArrayList a2) {
		System.out.println();
		System.out.println("contains()");
		add1(al);
		add2(a2);
		al.contains(a2);
		System.out.println("contains()1: "+al);
		System.out.println("contains()2: "+a2);
	}
	public static void containsAll(ArrayList al,ArrayList a2) {
		System.out.println();
		System.out.println("containsAll()");
		add1(al);
		add2(a2);
		al.containsAll(a2);
		System.out.println("containsAll(): "+al);
		System.out.println("containsAll(): "+a2);
	}
	public static void isEmpty(ArrayList al,ArrayList a2) {
		System.out.println();
		System.out.println("isEmpty()");
		add1(al);
		add2(a2);
		
		System.out.println("List 1 is Empty: "+al.isEmpty());
		System.out.println("List 2 is Empty: "+a2.isEmpty());
		
	}
	public static void size(ArrayList al, ArrayList a2) {
		System.out.println();
		System.out.println("size()");
		add1(al);
		add2(a2);
		
		System.out.println("Size of List 1: "+ al.size());
		System.out.println("Size of List 2: "+ a2.size());
	}
	public static void toArray(ArrayList al,ArrayList a2) {
		System.out.println();
		System.out.println("toArray()");
		add1(al);
		add2(a2);
		System.out.println(al.toArray());
		System.out.println(a2.toArray());
	}
	public static void clear(ArrayList al, ArrayList a2) {
		System.out.println();
		System.out.println("clear()");
		add1(al);
		add2(a2);
		al.clear();
		a2.clear();
		System.out.println("List 1: "+al);
		System.out.println("List 2: "+a2);
	}
	
}
