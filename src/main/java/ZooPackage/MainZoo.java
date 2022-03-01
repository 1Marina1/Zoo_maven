package ZooPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class MainZoo {
    public static void main(String[] args) {
        ArrayList<String> zooAnimals = new ArrayList<>();
        zooAnimals.add("1. Wolf");
        zooAnimals.add("2. Giraffe");
        zooAnimals.add("3. Rhino");
        zooAnimals.add("4. Flamingo");
        zooAnimals.add("5. Owl");
        zooAnimals.add("6. Parrot");
        zooAnimals.add("7. Goldfish");
        zooAnimals.add("8. Ocellaris Clownfish");
        zooAnimals.add("9. Piranha");// adding animal options to the array zooAnimals


        Wolf wolfEgor = new Wolf();
        Giraffe giraffeDenis = new Giraffe();
        Rhino rhinoAnton = new Rhino();
        Flamingo flamingoKsenia = new Flamingo();
        Owl owlSonya = new Owl();
        Parrot parrotKatya = new Parrot();
        Goldfish goldfishPetya = new Goldfish();
        OcellarisClownfish nemo = new OcellarisClownfish();
        Piranha piranhaMarina = new Piranha();//creating of new classes examples

        System.out.println("We have these animals in the zoo." +
                "\nChoose an animal to know more about by entering their number. Press 0 to exit");
        //start of the cycle
        for (String animal: zooAnimals){//choosing every option in the array in order
            System.out.println(animal);//displaying every option in console in order
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt(); //getting number of the animal option

        while (true) {

            switch (number) {//making cases
                case 0:
                    return;//to exit when 0 is entered
                case 1:
                    System.out.printf("You chose a %s\n", zooAnimals.get(0));
                    wolfEgor.breathing();
                    wolfEgor.moving();
                    wolfEgor.uniqueFact();//the information on a wolf is displayed
                    break;
                case 2:
                    System.out.printf("You chose a %s\n", zooAnimals.get(1));
                    giraffeDenis.breathing();
                    giraffeDenis.moving();
                    giraffeDenis.bodyColoring();//the information on a giraffe is displayed
                    break;
                case 3:
                    System.out.printf("You chose a %s\n", zooAnimals.get(2));
                    rhinoAnton.breathing();
                    rhinoAnton.moving();
                    rhinoAnton.havingAHorn();//the information on a rhino is displayed
                    break;
                case 4:
                    System.out.printf("You chose a %s\n", zooAnimals.get(3));
                    flamingoKsenia.breathing();
                    flamingoKsenia.moving();
                    flamingoKsenia.eatingHabits();//the information on a flamingo is displayed
                    break;
                case 5:
                    System.out.printf("You chose a %s\n", zooAnimals.get(4));
                    owlSonya.breathing();
                    owlSonya.moving();
                    owlSonya.neckAbility();//the information on an owl is displayed
                    break;
                case 6:
                    System.out.printf("You chose a %s\n", zooAnimals.get(5));
                    parrotKatya.breathing();
                    parrotKatya.moving();
                    parrotKatya.tasteMethod();//the information on a parrot is displayed
                    break;
                case 7:
                    System.out.printf("You chose a %s\n", zooAnimals.get(6));
                    goldfishPetya.breathing();
                    goldfishPetya.moving();
                    goldfishPetya.areGoldfishStupid();//the information on a goldfish is displayed
                    break;
                case 8:
                    System.out.printf("You chose a %s\n", zooAnimals.get(7));
                    nemo.breathing();
                    nemo.moving();
                    nemo.howToFind();//the information on a ocellaris clownfish is displayed
                    break;
                case 9:
                    System.out.printf("You chose a %s\n", zooAnimals.get(8));
                    piranhaMarina.breathing();
                    piranhaMarina.moving();
                    piranhaMarina.motherLand();//the information on a piranha is displayed
                    break;
            }
            System.out.println("\nChoose an animal to know more about by entering their number. Press 0 to exit");
            for (String animal: zooAnimals){
                System.out.println(animal);//to continue the cycles
            }
            System.out.println("Enter a number: ");
            number = scanner.nextInt();//getting next number

        }
    }
}
