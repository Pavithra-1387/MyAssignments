package week3.day2assingments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> array=new ArrayList<String>();
		array.add("3");
		array.add("2");
		array.add("11");
		array.add("4");
		array.add("6");
		array.add("7");
		Collections.sort(array);
		int len=array.size();
		System.out.println(array.get(len-1));
			
		}

	}
