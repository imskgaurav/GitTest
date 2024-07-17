
public class ExpandString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input= "a10b5";
		
		
		for(int i =0; i<input.length(); i++) {
			
			
			char c = input.charAt(i);
			//Character.isDigit(c)  :  Only one Charactre of Digit is taken at a timr
			if((c>=48&&c<=57)) {
				
				int count =0;
				
				int x = input.charAt(i)- '0';
				
				System.out.println("Max Countis :"+x);
				
			StringBuilder sb = 	new StringBuilder();
			  while(x!=count) {
				  count++;
			sb.append(input.charAt(i-1));
			   
			  }
			 
			  System.out.println(sb);
		
			//	input.charAt(i-1);
				
				
			}
			
			
		}
		
		

	}

}
