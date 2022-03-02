package ZooPackage;

public class Owl extends Bird {//used inheritance to get methods breathing() and moving()
    @Override
    public void breathing() {
        super.breathing();
    }
    @Override
    public void moving(){
        super.moving();
    }
    public void neckAbility(){
        System.out.println("Owls can rotate their necks 270 degrees");
    }//used interesting fact as a method
}
