import java.util.ArrayList;
import java.util.List;

public class LamdaExpression {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("dog", true, true));
      print(animals, new checkCanJump());
       print(animals, animal->animal.canSwim());
       print(animals, animal->!animal.canSwim());

        
    }

    private static void print(List<Animal> animals, checkAnimal filter){

        for (Animal animal : animals){

         if(filter.check(animal)){
          System.out.println(animal.getType());

         }
        }
  System.out.println();

    }
    
}
