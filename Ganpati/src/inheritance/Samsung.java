package inheritance;

public class Samsung extends Mobile  {
	
	void calling() {
		
		System.out.println("Samsung is Calling");
	}
	
	
     void camera() {
    	 
    		System.out.println("Camera is On");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Mobile m = new Mobile();
		
		m.calling();//

		System.out.println(m);
		
		//Parent Reference and Child method 
		
		System.out.println("Child class Object with parent CLASS referenc");
		
		Mobile m1 = new Samsung();
		
		System.out.println(m1);
		
		m1.calling();
		
		//m1.camera();
		
		System.out.println("Child class Reference and Child class Object");
		Samsung s2  = new Samsung();
		
		s2.calling();
		
		s2.camera();
		
		System.out.println(s2);
		
		

	}

}
