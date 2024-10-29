import java.util.HashMap;
import java.util.Map;

public class CountOfOccurencesOfEachChar_usingHashMap {

    public static void main(String[] args) {

        String input = "Programming";

  char[] ch = input.toCharArray();

  Map<Character, Integer> map = new HashMap<>();


  for(char c: ch){

System.out.println(c);

if(!map.containsKey(c)){

  map.put(c,1);
}
else{
  int val = map.get(c);

  map.put(c, val+1);

}

  }

  System.out.println(map);

        
    }
    
}
