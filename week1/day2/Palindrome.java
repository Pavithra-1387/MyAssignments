package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=121;
		int sum=0;
		for(int i=input;i>0;i=i) {
		sum=(sum*10) +(i%10);
		i=i/10;
		System.out.println(sum);	

		}
		if(input==sum) {
			System.out.println(input + " is pali");
			
		}else {
			System.out.println(input + " is not pali");
		}

	}

}
