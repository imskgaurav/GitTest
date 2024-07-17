
public class FindAllSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "abc";
		
		String str = "bc";
		
		System.out.println(s1.length());
		
		
		//System.out.println(s1.substring(1,2));
		
		
		for(int i =0; i<s1.length(); i++) {
			
			
			for(int j = i+1; j<=s1.length(); j++) {
				
				
				String subString=s1.substring(i, j);
				
				System.out.println("SubString is :"+subString );
				
				
				if(str.equals(subString)) {
					
					  System.out.println("True");
					
				}
				
			}
			
		}
		
		
		

	}

}
