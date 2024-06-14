package week3.day2assingments;

public class OddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		String[] testarr=test.split("");
		String[] outarr=testarr;
		for (int i=0;i<testarr.length;i++) {
			//System.out.println(testarr[i]);
			if (i%2==1) {
				System.out.println(i + " is odd position. converting to upper case and saving char:"
			+ testarr[i] + " in outarr");
				outarr[i]=testarr[i].toUpperCase();
			}
			else {
				//System.out.println(testarr[i]);
			}
		}
		System.out.println(String.join("",outarr));

	}

}
