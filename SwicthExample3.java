package decision;

public class SwicthExample3 {

	public static void main(String[] args) {
		//12Months displaying days in every month.
		
		String mon="Jul".toLowerCase();
		
		switch(mon) {
			case "jan" :{
				int n=31;
				System.out.println(mon+" has "+n+ "days");
				break;
			}
			case "feb" :{
				int n=28;
				System.out.println(mon+" has "+n+ "days");
				break;
			}
			case "mar" :{
				int n=31;
				System.out.println(mon+" has "+n+ "days");
				break;
			}
			case "apr" :{
				int n=30;
				System.out.println("Jan has "+n+ "days");
				break;
			}
			case "may" :{
				int n=31;
				System.out.println(mon+" has "+n+ "days");
				break;
			}
			case "jun" :{
				int n=30;
				System.out.println(mon+" has "+n+ "days");
				break;
			}
			case "jul" :{
				int n=31;
				System.out.println(mon+" has "+n+ "days");
				break;
			}
			case "sept" :{
				int n=30;
				System.out.println(mon+" has "+n+ "days");
				break;
			}
			case "oct" :{
				int n=31;
				System.out.println(mon+" has "+n+ "days");
				break;
			}
			case "nov" :{
				int n=30;
				System.out.println(mon+" has "+n+ "days");
				break;
			}
			case "dec" :{
				int n=31;
				System.out.println(mon+" has "+n+ "days");
				break;
			}
			default :{
				
				System.out.println("Invalid");
			}

	}

}
}
