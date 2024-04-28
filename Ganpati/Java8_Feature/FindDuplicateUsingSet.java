import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String arr [] =	new String[] {"Tom","Megan", "Melissa", "Tom", "John", "Megan", "Melissa"};
	
	Set<String> set = new HashSet<String>();
	
	
	for(String str : arr) {
		
		
		boolean z= set.add(str);
		
		System.out.println(z);
		
		 if(!z) {
			
			 
			 System.out.println("Duplicate Element is:"+ str);
		 }
		
		
		
	}

		

	}

}
