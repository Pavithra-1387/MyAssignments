package week3.day2assingments;

public class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection obj=new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		obj.executeQuery();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connects");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnects");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeupadates");
	}

}
