package week3.day2assingments;

public class APIClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient obj = new APIClient();
		obj.sendRequest("learncheckbox");
		obj.sendRequest("learnradiobutton", "testing", true);
	}
public void sendRequest(String endpoint) {
	System.out.println("endpoint is "+endpoint);
}
public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
	System.out.println("endpoint is "+endpoint);
	System.out.println("requestbody is "+requestBody);
	System.out.println("requeststatus is"+requestStatus);
	
}

}
