package decision;

public class SwitchExample1 {

	public static void main(String[] args) {
		//Switch Case with Char DataType
		
		char ch='a';
		// char ch= Character.toLowerCase('A'); - inbuilt methods 
		
		switch(ch){
			case 'A', 'a' : {
				System.out.println("A - Apple");
				break;
			}
			case 'B', 'b':{
				System.out.println("B - Ball");
				break;
			}
			
			case 'C' , 'c':{
				System.out.println("C - Cat");
				break;
			}
			case 'D', 'd':{
				System.out.println("D - Dog");
				break;
			}
			default :{
				System.out.println("Invalid Input");
				
			}

		}

	}
}
