package week1.day2;

public class FindingIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,2,11,4,6,7};
		int b[]={1,2,8,4,9,7};
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					System.out.println(b[i]);
				}
			}
		}
	}

}
