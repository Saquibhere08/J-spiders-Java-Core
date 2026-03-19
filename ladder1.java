package decision;

public class ladder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dbId=1234;
		int dbPwd=888;
		
		int userId=1234;
		int userPwd=345;
		
		if(dbId == userId) {
			System.out.println("Enter Password to Login");
		}else if(dbPwd == userPwd) {
			System.out.println("Welcome to Home Page");
		}else {
			System.out.println("Invalid Cradentials..............");
		}
	}

}
