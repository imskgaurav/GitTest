package collection_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {


		//https://github.com/pavanoltraining/JavaCollections/blob/master/src/collectiondemos/HashMapDemo.java


		 Map<Integer, String> m = new HashMap<>();

		   m.put(101,"John");
			m.put(102,"David");
			m.put(103,"Scott");
			m.put(104,"Mary");
			m.put(105,"Tye");
			m.put(103,"X");
			m.put(106,"David");
			m.put(01, null);
			m.put(02, null);
			 m.put(null, null);
			 m.put(null, "Test");
			System.out.println(m.size());
			// PRINT HashmAP
			//System.out.print(m);

			//Iterate using Entry Set //

			//Set<Map.Entry<Integer, String>> mSet  =   m.entrySet();

			Set<Map.Entry<Integer, String>>mapSet= m.entrySet();

			for(Entry<Integer, String> entry  : mapSet) {

				System.out.println(entry.getKey());

				System.out.println(entry.getValue());

			}



			System.out.println(m.get(104).hashCode());

			m.remove(106);
			System.out.print(m);

			System.out.print(m.size());

			System.out.println(m.containsKey(105));
			  System.out.println(m.containsValue("David"));

			  System.out.println(m.keySet());
			   for (Object s: m.keySet()) {
				   System.out.print("Key is:"+s+" ");

			   }
			    System.out.println(m.values());

	}

}
