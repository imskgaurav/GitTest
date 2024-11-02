
public class CheckSubStringPresence {
	
	//Java Program to Check if a string contains a substring

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String inputStr = "Simply Easy Learning";
		  String subString = "ply";
		int x=  inputStr.indexOf(subString);
		System.out.println(x);  
		
		if(x!=-1) {
			
			System.out.println("SubString is part of Given String");
		}
		else {
			
			System.out.println("SubString NOT Present in String");
		}
		
		
		
		
		  

	}

}
