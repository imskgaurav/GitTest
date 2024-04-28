package interview_coding;

import java.util.ArrayList;
import java.util.List;

public class AscendingOrderArray_AppendZeroInLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,5,1,2,0,3,4};
		
		int min = arr[0];
		
		List<Integer> li1 = new ArrayList<Integer>();
		
		List<Integer> li2 = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length; i++) {
			
			for (int j =i+1; j<arr.length; j++) {
				
				if(arr[i]<=arr[j]) {
					
					min = arr[i];
				}else {
					
					min = arr[j];
				}
				
		}
			
	    li1.add(null);
	}
		System.out.println(li1);		
		
		System.out.println(li2);

}
	
}