package week1.day2;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		//Creating new Object for the class browser
		Browser vbrowser=new Browser();
		//Calling the methods in the class browser
		name=vbrowser.launchBrowser("testleaf browser");
		System.out.println(name);
		vbrowser.loadUrl();
	}
	
	public String launchBrowser(String browserName) {
		System.out.println(browserName + ": browser launched successfully");
		return browserName;
	}
	public void loadUrl() {
		System.out.println("Application Url Loaded successfully");
	}
}
