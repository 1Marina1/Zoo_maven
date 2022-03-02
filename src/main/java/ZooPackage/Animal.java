package ZooPackage;

public abstract class Animal { //The class which is a parent of all animal classes
    public static String breath = "I breath air with my lungs";
    public static String movement = "I walk with my 4 feet";
    public void breathing() {

        System.out.println(breath);
    }
    public void moving() {
        System.out.println(movement);
    }

}
