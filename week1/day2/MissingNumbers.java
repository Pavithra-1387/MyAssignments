package week1.day2;
import java.util.Arrays;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,4,3,2,8,6,7};
		Arrays.sort(a);
		for (int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			if(a[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}
		
	}

}
