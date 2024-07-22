package selenium.express.code;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= new String("Test");
		String s2= new String("Test");
		
		//System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = new StringBuilder("java");
		
		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.hashCode());
		
		System.out.println(sb2.hashCode());
		
		

	}

}
