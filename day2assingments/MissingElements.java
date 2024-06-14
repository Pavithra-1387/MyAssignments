package week3.day2assingments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> array=new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(10);
		array.add(6);
		array.add(8);
		int sz=array.size();
		Collections.sort(array);
		for (int i=0;i<array.get(sz-1);i++) {
			if(array.contains(i+1)!=true) {
				System.out.println(i+1 + " is missing");
			}
			
		}
		
		
		

		

	}

}
