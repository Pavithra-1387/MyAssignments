package week3.day2assingments;

import java.util.List;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] arr=text.split(" ");
		String[] outarr=arr;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count=0;
			//System.out.println(arr[i] + " outer ");
		for (int j=0;j<arr.length;j++) {
			System.out.println(i + arr[i].toLowerCase() + j + arr[j].toLowerCase());
			if (arr[i].toLowerCase() == arr[j].toLowerCase()) {
				System.out.println("matched " + arr[j]);
				count++;
				if (count>1) {
					outarr[j]=" ";
				}
			} 

		}

		}
		System.out.println(String.join(" ", outarr));
		
	}

}
