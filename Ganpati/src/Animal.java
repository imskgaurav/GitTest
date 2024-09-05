
public class Animal {
    
    private String type;
    private boolean canJump;
    private boolean canSwim;

    

    public Animal(String type, boolean canJump, boolean canSwim){

     this.type= type;

     this.canJump = canJump;
     this.canSwim = canSwim;
    }

    public boolean canJump(){

      return canJump;

    }

    public boolean canSwim(){

        return canSwim;
    }
 public String getType(){

    return type;
 }


}

