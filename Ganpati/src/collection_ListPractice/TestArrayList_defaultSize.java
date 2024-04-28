package collection_ListPractice;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList_defaultSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List li = new ArrayList();
		
		System.out.println(li.size());
		System.out.println(li);
		
				li.add("dd");
		
		List<String>strLi= new ArrayList<String>(10);
		
		System.out.println(strLi.size());
		System.out.println(strLi);
		

	}

}
