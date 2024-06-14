package week3.day2assingments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> array1=new ArrayList<String>();
		array1.add("3");
		array1.add("2");
		array1.add("11");
		array1.add("4");
		array1.add("6");
		array1.add("7");
		
		List <String> array2=new ArrayList<String>();
		array2.add("1");
		array2.add("2");
		array2.add("8");
		array2.add("4");
		array2.add("9");
		array2.add("7");
		
		for (int i=0;i<array1.size();i++) {
			if(array2.contains(array1.get(i))==true) {
				System.out.println(array1.get(i));
			}
		}
		
		
		//List<Integer> list2=Arrays.asList( {1, 2, 8, 4, 9, 7});
		
	

	}

}
