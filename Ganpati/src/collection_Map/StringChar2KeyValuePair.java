package collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StringChar2KeyValuePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "AAAABBCDDDD";
		//output : A4 B2 c1 
		Map<Character, Integer> m1 = new HashMap();
		
		for(int i=0; i<input.length(); i++) {
			
			
			     char c= input.charAt(i);
			     
			     System.out.print(c);
			     
			     if(m1.containsKey(c)) {
			    	 
			    	 m1.put(c, m1.get(c)+1);
			     }
			     else {
			    	 
			    	 m1.put(c, 1);
			     }
			     
			     
		}
		
		System.out.println(m1);
		
		  
		for(Entry<Character, Integer> m : m1.entrySet()) {
			//System.out.print(m.getKey());
			//System.out.print(m.getValue());
			
		String res=	String.valueOf(m.getKey()).concat(String.valueOf(m.getValue()));
		
		System.out.print(res);
			
			
			
		}
		
		

	}

}
