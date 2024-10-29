
import java.lang.String;
public class RepeatedCharacterInString {

    public static void main(String[] args) {

     String str = "JAVA IS AWESOME LANG";

     char [] ch= str.toCharArray();
      int count =0;

     for (int i=0; i< ch.length; i++){

        
        for(int j =i+1;j<ch.length; j++){

        if(!String.valueOf(ch[j]).isEmpty()){

        
        if(ch[i]==ch[j]){

            System.out.println("char at "+ch[i] +" is Repeated");

        count++;





        }
        System.out.println(count);

        }

    }
     }





        
    }
    
}
