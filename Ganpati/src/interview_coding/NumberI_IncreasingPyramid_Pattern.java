package interview_coding;

public class NumberI_IncreasingPyramid_Pattern {

	
//	1 
//	1 2 
//	1 2 3 
//	1 2 3 4 
//	1 2 3 4 5 
//	1 2 3 4 5 6 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =6;
		for(int row= 1; row<=count;row++) {
			
			//For column 
			
			for (int col =1; col<=row; col++) {
				
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
