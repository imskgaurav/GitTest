import java.util.ArrayList;
import java.util.List;

public class DuplicateElmInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {2,3,4,6,2,3,7,9,9,5,7};
		
		List<Integer> l1= new ArrayList<Integer>();
		
		
		for(int i = 0; i<arr.length; i++) {
			
			
			for(int j= i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					
					l1.add(arr[i]);
					
					
				}
				
				
			}
			
			
		}
		System.out.println(l1);
		
	}

}
