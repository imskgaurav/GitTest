

import java.util.Arrays;

import javax.print.DocFlavor.READER;

public class CompareArray {

    public static void main(String[] args) {
        int a[] = {3,4,5,6};
        int b[] ={3,4,5,6};
        // Value are in between 0 t0 99;
        // System.out.println(Arrays.equals(a, b));
        System.err.println(arrAreEqualUsingBucketArray(a, b));
        
    }

    static boolean arrAreEqualUsingBucketArray(int [] arrA, int [] arrB){
    
        if(arrA.length!=arrB.length){

            return false;    
        }
        int len= arrA.length;
      
        int count[] = new int[100];

        for(int i =0; i<len; i++){
           int diff =  arrA[i]- '0';
           System.out.print(diff);
           count[diff] = count[diff]+1;

        }



  return true;  
}
}
