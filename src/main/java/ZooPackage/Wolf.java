package ZooPackage;


public class Wolf extends Animals {//used inheritance to get methods breathing() and moving()
    @Override
    public void breathing() {
        super.breathing();
    }
    @Override
    public void moving(){
        super.moving();
    }
    public void uniqueFact(){
        System.out.println("I ate the grandma");
    }//used the fairy tale to make a method

}
