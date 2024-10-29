package com.ganesh.sai;

public class continueLoop {

    public static void main(String[] args) {

        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

         Loop1:for (String animal : animals){
                  if(animal.equals("Bird")||animal.equals("Cat")){
                    continue Loop1;

                  }
                  System.out.println(animal);
         }
        
    }
    
}
