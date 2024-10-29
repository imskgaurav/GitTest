package selenium.express.code;

import java.util.HashMap;
import java.util.Iterator;

public class FindDuplicateOccurenceOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am am java code java code";
		
		ocuurenceOfWords(str);

	}
	
	
	public static void ocuurenceOfWords(String sentence) {
		
		
	String strArr[] = sentence.split(" ");
	
	HashMap<String, Integer> map1 = new HashMap<String, Integer>();
	
	
	
	   for(String s: strArr) {
		   
		   if(map1.containsKey(s)) {
			   
			   map1.put(s, map1.get(s)+1);
			   
		   }
		   else {
			   
			   map1.put(s, 1);
		   }
		   
		   
	   }
	   
	   System.out.println(map1);
	
		
	   //
	   
	   
	    Iterator<String> it=  map1.keySet().iterator();
	    
	       while(it.hasNext()) {
	    	   
	    	   
	    	   //System.out.println(it.next());
	    	   String str= it.next();
	    	 if (map1.get(str)>1) {
	    		 
	    		 System.out.println("Occurence of key "+str+" "+map1.get(str));
	    	 }
	    	   
	    	   
	       }
	    
		
	}

}
