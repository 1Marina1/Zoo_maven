package ZooPackage;

public class Giraffe extends Animal {//used inheritance to get methods breathing() and moving()
    @Override
    public void breathing() {
        super.breathing();
    }
    @Override
    public void moving(){
        super.moving();
    }
    public void bodyColoring(){
        System.out.println("I have dots all over my body");
    }//used body description as a method
}
