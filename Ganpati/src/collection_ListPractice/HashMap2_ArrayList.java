package collection_ListPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMap2_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		
		hm.put("Google", 2500);
		hm.put("Meta", 3500);
		hm.put("IBM", 5000);
		
		System.out.println(hm);
		
/// CREATE a ArrayList for keys and Values 
		
		List<String> compNames =  new ArrayList<String>(hm.keySet());
		
		System.out.println(compNames);
		
		
		List<Integer> empNum= new ArrayList<Integer>(hm.values());
		
		System.out.println(empNum);
		
		
		

	}

}
