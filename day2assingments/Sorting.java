package week3.day2assingments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> array=new ArrayList<String>();
		array.add("HCL");
		array.add("Wipro");
		array.add("Aspire Systems");
		array.add("CTS");
		Collections.sort(array);
		
		//System.out.println("array");
		for (int i=array.size()-1;i>=0;i--) {
			System.out.println(array.get(i));
		}
		
		


	}

}
