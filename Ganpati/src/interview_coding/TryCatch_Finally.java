package interview_coding;

public class TryCatch_Finally {
	
	
	
	public static void main(String[] args) {
		
		int div, i, j;
		String s;
		try {
			 i=10;
			div = i/0;
			
		}
		
		
		catch(ArithmeticException ae) {
			
			  ae.printStackTrace();
		}
		
		finally {
			
			s= null;
			
			System.out.println(s.toString());
			
		}
		
	}

}
