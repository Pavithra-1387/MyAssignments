package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c=0;
		for(int i=0; i <8; i++) {
			System.out.println(c);
			c=a+b;
			b=a;
			a=c;
		}
		// TODO Auto-generated method stub

	}

}

