package ZooPackage;

public class Flamingo extends Bird { //used inheritance to get methods breathing() and moving()
    @Override
    public void breathing() {
        super.breathing();
    }

    @Override
    public void moving() {
        super.moving();
    }

    public void eatingHabits() {
        System.out.println("Flamingo are pink because they eat algae that contains carotenoid pigments");
    }//method consists of an interesting fact
}
