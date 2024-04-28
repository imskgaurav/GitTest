package interview_coding;

public class Number_increasingReverse_pyramidPattern {
//	
//	1 2 3 4 5 6 
//	1 2 3 4 5 
//	1 2 3 4 
//	1 2 3 
//	1 2 
//	1 
    static int count =6;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cal= count;
		for(int row=1; row<=count;row++) {
			
			
			for(int col=1; col<=cal;col++) {
				
				System.out.print(col+" ");
			}
			cal = cal-1;
			System.out.println();
			
		}

	}

}
