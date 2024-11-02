package util.selenium.java;

public class ArrayProg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3, -1,-2,4, 5, -8 };
		//Ascedning 	
		for (int i =0; i<arr.length; i++) {
			
			
			for(int j =i+1; j<arr.length; j++) {
				
				//Assecnding Order
				if(arr[i]<arr[j]) {
					
					
					//System.out.println("Ascending order "+arr[i]);
				
					System.out.println("Ascending order "+arr[j]);
					
					
			}
			
			

				
			}
			
		}
		
		
		
	}

}
