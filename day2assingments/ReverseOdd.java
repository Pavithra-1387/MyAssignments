package week3.day2assingments;


public class ReverseOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] testarray=test.split(" ");
		String[] outarr=testarray;
		String innervariable="";
		for (int i=0;i<testarray.length;i++) {
			//System.out.println(testarray[i]);
			if (i%2==1) {
				innervariable="";
				
				  for(int j=testarray[i].length();j>0;j--) { 
					  innervariable=innervariable + testarray[i].split("")[j-1]; 
					  }
				 
				outarr[i]=innervariable;
			}
			
		}
		System.out.println(String.join(" ",outarr));

		

	}

}
