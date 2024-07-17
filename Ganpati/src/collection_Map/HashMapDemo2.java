package collection_Map;

import java.util.HashMap;
import java.util.Set;

///https://www.w3schools.com/java/java_hashmap.asp
public class HashMapDemo2 {
    public static void main(String[] args) {


    HashMap<String, String> map1 = new HashMap<String, String>();

    System.out.println(map1.isEmpty());

    map1.put("England", "London");
    map1.put("Germany", "Berlin");
    map1.put("Norway", "Oslo");
    map1.put("USA", "Washington DC");
    map1.put( "Canada","Ottawa");
    map1.putIfAbsent("India","New Delhi");

    System.out.println(map1);

    System.out.println(map1.size());

    //remove with Keys: value will be return
       String x= map1.remove("Norway");
       System.out.println(x);
        System.out.println(map1);
     //remove 1  pair // : boolean will be return  
        boolean y=map1.remove("USA", "Washington DC");
        System.out.println(y);
        System.out.println(map1);

        ///Iteate throughy key Set 

        for (String s: map1.keySet()){

            System.out.println("key is :"+ s);
            System.out.println("Value is :"+ map1.get(s));
        }
    }

   // print HashMap: 



}
