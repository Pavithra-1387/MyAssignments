package week3.day1.assignments;

public class LoginTestData extends TestData{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData obj =new LoginTestData();
		obj.enterCredentials();
		obj.enterUsername();
		obj.enterPassword();
		obj.navigateToHomePage();
		
		
	}
public static void enterUsername() {
	System.out.println("Hi enterusername");
}
public static void enterPassword() {
	System.out.println("Hi Password");
}
}
