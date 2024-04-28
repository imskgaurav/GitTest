package interview_coding;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sp = "aAtestaAAutomationaAAAutomation";
		
		String arr[] = sp.split("aA");
		
	System.out.println(arr[1]);
		
		/*
		 * String str= "Java_test_Automation";
		 * 
		 * String s[] = str.split("_");
		 * 
		 * System.out.println(s.length);
		 * 
		 * System.out.println(s[0]); System.out.println(s[2]);
		 */
		
		System.out.println(arr[0]);
		System.out.println(arr[0].length());
		
		String em= ""; //Blank String
		
		System.out.println(em.length());
		

	}

}
