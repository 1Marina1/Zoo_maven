package ZooPackage;

public class Rhino extends Animals{//used inheritance to get methods breathing() and moving()
    @Override
    public void breathing() {
        super.breathing();
    }
    @Override
    public void moving(){
        super.moving();
    }
    public void havingAHorn(){
        System.out.println("Their horns are made up of keratin, that protein makes up the base of our hair and nails.");
    }//used interesting fact as a method
}
