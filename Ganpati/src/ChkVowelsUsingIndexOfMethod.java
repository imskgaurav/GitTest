
public class ChkVowelsUsingIndexOfMethod {
	
	static String VOWELS = "aeiouAEIOU";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input = "English";
		
		char c = 'a';
		
		String s= String.valueOf(c);
		
		System.out.println(s.getClass()+" Lenght is"+ s.length());
		
		
		 for(int i =0; i<input.length(); i++) {
			 
			 
			 if(isInVowelString(input.charAt(i))) {
				 
				 System.out.println("Volwels is :"+input.charAt(i) );
			 }
		 }
		

	}
	
	public static boolean isInVowelString(char c ) {
		
		return   VOWELS.indexOf(c)!=-1;
	}

}
