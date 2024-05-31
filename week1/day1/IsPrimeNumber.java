package week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=5;
		boolean isprime=true;
		for (int i=2; i<input; i++) {
			if (input%i==0) {
			System.out.println(input + " is not a prime number");
			isprime=false;
			break;
			}
		}
		if (isprime==true) {
			System.out.println(input + " is a prime number");
		}
	}

}
