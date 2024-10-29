
public class factorialCalculationUsingFoeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // 5 = 5*4*3*2*1;
		   long fact =1;
		   
		   
		  int zz= factorial(6);
		  
		  System.out.println(zz);
		
		for(int num= 10; num>=1; num--) {
			
			
			fact = fact*num;
			
			
			
			
		}
		
		
		System.out.println(fact);
		
	}
	
	static int factorial(int x) {
		 int res=1;
		  if(x==0) {
			  
		return 1;	  
		  }
		  else {
			  
			  res= (x*factorial(x-1));
		  }
		return res;
	}

}
