package advanced;

public class FindHCFOfTwoNumber {

    public static void main(String[] args) {

     int res= findHFC(12, 3);

    System.out.println(res);

        

    }

    public static int findHFC(int x, int y){
     int hcf =0;

 int min = (x<y)?x:y;

 System.out.println("Min is:"+x);

 for(int i =x; i>=1; i--){

     if((x%i==0)&&(y%i==0)){
       System.out.println("Hcf is:"+i);

       hcf =i;
       break;
     } 


 }




     return hcf;
    }
    
}
