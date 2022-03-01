package ZooPackage;

public class Piranha extends Fish{//used inheritance to get methods breathing() and moving()
    @Override
    public void breathing() {
        super.breathing();
    }
    @Override
    public void moving(){
        super.moving();
    }
    public void motherLand(){
        System.out.println("Piranhas live in South America");
    }//used places of habitat as a method
}
