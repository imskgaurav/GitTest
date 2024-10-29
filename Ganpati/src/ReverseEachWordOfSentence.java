public class ReverseEachWordOfSentence {

    public static void main(String[] args) {


        String str= "python iS for Data Analyst";

        String [] words= str.split(" ");
        String finalString ="";
        for(String word :words ){
           System.out.println(word);
            String revWord ="";
            for(int i= word.length()-1; i>=0; i--){

              revWord= revWord+word.charAt(i);

            }
            finalString = finalString+revWord;
    

        }
        System.out.println(finalString);
        
    }
    
}
