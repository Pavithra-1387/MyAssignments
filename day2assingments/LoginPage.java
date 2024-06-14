package week3.day2assingments;

public class LoginPage extends BasePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage obj = new LoginPage();
		obj.performCommonTasks();
		BasePage obj2 = new BasePage();
		obj2.performCommonTasks();
	}
	//@Override 
	public static void performCommonTasks() {
		System.out.println("overidecommon");
	}
}
