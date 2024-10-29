public class CountOccurenceofStringChar {


    public static void main(String[] args) {

        String str= "Keerthana";

       long count= str.chars().filter(ch->ch=='e').count();
       
        System.out.println(count);


        
    }
    
}
