package ashokIT;

public class LamdaExpression {
	
	public static void main(String[] args) {
		
	
	Test2 t2=(int j, int k)->{
		
		if((j+k)>=30) {
			
			return true;
		}
		return false;
		
	};
	
Test3 tt = (e)->{
	 return e.getName();
	 
};
tt.m1(new Employee());	

boolean z=	t2.add(33, 90);

System.out.println(z);


Test2 t3= (x, y)->((x+y)>10);
	
  System.out.println(t3.add(7, 0));
}
	



  

}