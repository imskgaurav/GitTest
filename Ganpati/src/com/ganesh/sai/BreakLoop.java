package com.ganesh.sai;

public class BreakLoop {

    public static void main(String[] args) {
        String animal[] = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

   int index =0; 



     My_LOOP: while ( index<animal.length){
        
           String x = animal[index];

           if(x.equals("Lizard")){
              
            break My_LOOP;

           }
         System.out.println(animal[index]);

          index++;
      }


         


    }
    
}
