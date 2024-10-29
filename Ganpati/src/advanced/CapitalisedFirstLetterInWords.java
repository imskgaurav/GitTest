package advanced;

public class CapitalisedFirstLetterInWords {



    public static void main(String[] args) {
        
   
    String input = "java is   object oriented programming ";

    String newInput = input.replaceAll("\\s{2,}", " ");
    
    System.out.println(newInput);

    String [] str = newInput.split(" ");

    String res = "";
    for(String s: str){

    ///System.out.println(s);

    res=  res+ s.substring(0,1).toUpperCase()+s.substring(1)+" ";

   


    }
    System.out.println(res.trim());

    }

}
