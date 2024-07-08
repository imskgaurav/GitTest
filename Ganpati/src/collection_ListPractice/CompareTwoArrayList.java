package collection_ListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1 = Arrays.asList("A", "E", "I", "O", "Z");

		List<String> l2 = Arrays.asList("A", "O", "I", "E", "Z");

		// Compare Two List //

		System.out.println(l1.equals(l2));

		/// For comparing Two ArrayList first sort them

		Collections.sort(l1);

		Collections.sort(l2);

		System.out.println(l1.equals(l2));

//		List<String> al1 = Arrays.asList("Z" , "Y", "X" , "W", "m");
//	
//		List<String> al2 = Arrays.asList("Z" , "Y", "X" , "W", "n");
//		//compare Two List AND find additional Element .. al1 and al2 : m is the addition element
//		
//		Collections.sort(al1);
//		
//		Collections.sort(al2);
//		
//		al1.removeAll(al2);

		List<String> ll1 = new ArrayList(Arrays.asList("Z" , "Y", "X" , "W", "m"));
		List<String> ll2 = new ArrayList(Arrays.asList("Z" , "Y", "X" , "W", "n"));
		
		ll1.removeAll(ll2);
		
		
		System.out.println("Additional Element :"+ll1);
		
		//Missing Element  : 
		
		List<String> list1 = new ArrayList(Arrays.asList("Z" , "Y", "X" , "W", "m"));
		List<String> list2 = new ArrayList(Arrays.asList("Z" , "Y", "X" , "W", "n"));
		
		list2.removeAll(list1);/// Remove All element from list2 Which are found in list1
		
		System.out.println("Missing Element is :"+list2);
		
		

	}

}
