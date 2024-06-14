package week3.day2assingments;

public class Concrete implements DatabseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concrete obj=new Concrete();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
	}
	public void connect() {
	System.out.println("hello connect");	
	}
	public void disconnect() {
		System.out.println("pls disconnect");
		
	}
	public void executeUpdate() {
		System.out.println("update");
		
	}
}
