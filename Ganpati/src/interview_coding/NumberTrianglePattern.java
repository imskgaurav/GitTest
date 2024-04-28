package interview_coding;

public class NumberTrianglePattern {
	
	
	/*
	 * 1 
	 * 2 2 
	 * 3 3 3
	 * 4 4 4 4
	 * 5 5 5 5 5
	 * 6 6 6 6 6 6
	 */
	public static void main(String[] args) {
		
		//pass Number of Rows and column // Say m is rows and n is column 
		int count=6;
		// Create Rows 
		for (int m =1; m<=count; m++) {
			
			// For each rows we have to complete the columns 
			
			for (int n=1; n<=m; n++) {
				
				System.out.print(m+" ");
			}
			System.out.println();
			
		}
		
		
		
	}
	
}
