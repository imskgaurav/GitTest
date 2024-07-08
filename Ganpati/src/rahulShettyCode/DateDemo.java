package rahulShettyCode;


import java.text.SimpleDateFormat;
import java.util.Date;
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/text/SimpleDateFormat.html
		
		Date date = new Date();
		
		//System.out.println(date.toString());
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/YYYY");
		
		  String formatDate =sdf.format(date);
		
		System.out.println(formatDate);
		
		SimpleDateFormat sd = new SimpleDateFormat("M/d/YYYY hh:mm:ss" );
		
		System.out.println(sd.format(date));
		

	}

}
