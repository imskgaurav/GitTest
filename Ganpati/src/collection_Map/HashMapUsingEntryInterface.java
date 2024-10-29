package collection_Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapUsingEntryInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> m1= new HashMap<String, Integer>();
		
		m1.put("one", 1);
		m1.put("two", 2);
		
		m1.put("three", 3);
		
		
		for ( Entry<String, Integer> e: m1.entrySet()) {
			
			System.out.println("key is :"+ e.getKey()+e.getValue());
			
			//System.out.println("Value is :"+ e.getValue());
			
			
		}
		
		

	}

}
