package com.ganesh.sai;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String input = "AAABBCDD";
		//input: AAABBCDD  : Shrink A 3

		//output: A3B2C1D2
		
		// char arr[] : str.toCharArray();
		
		//hashMap <Character, Integer> map1 = new LinkedHashMap();
		//count of char :  
		
		//char with count
		
		HashMap<Character, Integer> hmap = new LinkedHashMap();
		
		char ch[] = input.toCharArray();
		
	
		  for (int i = 0; i<ch.length-1; i++) {
			   
			
			    	 if(hmap.containsKey(ch[i])) {
			    		 hmap.put(ch[i],hmap.get(ch[i])+1);
			    	 }
			    	
			    	 else {
			    	 hmap.put(ch[i], 1);
			    	 }
			     
			    
		  }
		  
		  System.out.println(hmap);
		  
		 
		  
		  
		  
		  String test = "\"I!@#N &*(Ter )(VIE  %^&W))\"";
		  
		  //specail char and spaces 
		  
		  
		  test=test.replaceAll("[^a-zA-Z0-9]", "");
		  
		  System.out.println(test);
		  
		
		 

	}
	
	

}
