package ZooPackage;

public class Goldfish extends Fish{//used inheritance to get methods breathing() and moving()
    @Override
    public void breathing() {
        super.breathing();
    }
    @Override
    public void moving(){
        super.moving();
    }
    public void areGoldfishStupid(){
        System.out.println("Goldfish can recognize peoples faces. So watch out!");
    }//used interesting fact as a method

}
