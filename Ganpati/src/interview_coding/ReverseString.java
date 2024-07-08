package interview_coding;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String res= revString("Java");

		System.out.println(res);

	}


	//Naveen Automation Lab//

	public static  String revString(String s) {

		if(s==null) {

			return null;
		}

		if(s.isEmpty()) {


			return s;
		}


	int len = s.length();

	  if(len==1) {

		  return s;
	  }


	  String rev = "";
	    for (int i=len-1; i>=0; i--) {

	    	rev= rev+ s.charAt(i);
	    }
		return rev;
	}
}
