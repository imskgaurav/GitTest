
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double area=Area(7);
		
		System.out.println(area);

	}
	
	
	public static double Area(int radius) {
		
		final double PI = Math.PI;
		
		
		double area= PI*radius*radius;
		
		
		return area;
	}

}
