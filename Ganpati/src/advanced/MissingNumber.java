package advanced;

public class MissingNumber {
	
	 public static void main(String[] args) {
	        int[] arr = {12, 13, 17, 18, 20, 21, 24, 26};
	        
	        
	        for(int i =0; i<arr.length-1; i++) {
	        	
	        	
	        	for(int j =arr[i]+1; j<arr[i+1]; j++) {
	        		
	        		
	        		System.out.println("Missing Number is :"+j);
	        		
	        		
	        		
	        	}
	        	
	        	
	        }

}
}