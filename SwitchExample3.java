package decision;

public class SwitchExample3 {

	public static void main(String[] args) {
		 String mon="Febuary";
		 mon = mon.toLowerCase();
		 
		 switch(mon) {
		 
		 case "january","march","may","july","september","october","december":{
			 System.out.println(mon + "has 31 days");
			 break;
			 
		 }
		 case "febuary":{
			 System.out.println(mon+" has 28 days");
			 break;
		 }
		 case "april","june","august","november":{
			 System.out.println(mon+ "has 30 days");
			 break;
			 
		 }
		 default:
		 {
			 System.out.println("Invalid...");
		 }
		 }
		 

	}

}
