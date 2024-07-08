package collection_ListPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.programiz.com/java-programming/examples/remove-duplicate-elements-from-arraylist
  
   int arr[]  = {4,5,6,6,7,5};
		
		List<Integer> li = new ArrayList<Integer>();
		
		for(int x: arr) {
			
			
			li.add(x);
			
		}
		
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		
		set.addAll(li);
		
		
		System.out.println(set);
		
		//Convert the set in List . Clear the existing List value and  then pass the set into List
		
		li.clear();
		
		li.addAll(set);
		
		System.out.println(li);
		
		
		
		
		
		
		
		
	}

}
