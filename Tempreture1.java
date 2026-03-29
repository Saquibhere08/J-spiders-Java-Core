package decision;

public class Tempreture1 {

	public static void main(String[] args) {
		int temp1=22;
		
		//if - else Statements 
		if(temp1>=30) {
			System.out.println("Turn on Ac on High Speed");
		}else if(temp1>=25) {
			System.out.println("Turn on Ac on Power Saving Mode");
		}else if(temp1<=15 && temp1>5) {
			System.out.println("Turn on Heater in Natural Mode");
		}else if(temp1<=5) {
			System.out.println("Turn on Heater in High Alert Mode");
		}
		

	}

}
