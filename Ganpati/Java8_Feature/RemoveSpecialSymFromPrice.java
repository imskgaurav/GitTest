
public class RemoveSpecialSymFromPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String price= "$9,999.10";
		System.out.println(price.hashCode());
		price=price.replaceAll("[$,]", "");
		
		System.out.println(price);
		
		System.out.println(price.hashCode());
		

	}

}
