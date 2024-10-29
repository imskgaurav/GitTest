package selenium.express.code;

public class StrEquals {
	
	
	public static void main(String[] args) {
		
		String s1 = "100";
		
		Integer i1= 100;
		
		String s2 = i1.toString();
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);
		
		Integer i2= 100;
	    String s3=  String.valueOf(i2);
	    
	    System.out.println(s1==s3);
		
		
		
		
		
	}

}
