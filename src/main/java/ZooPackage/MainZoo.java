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
        zooAnimals.add("9. Piranha");


        Wolf wolfEgor = new Wolf();
        Giraffe giraffeDenis = new Giraffe();
        Rhino rhinoAnton = new Rhino();
        Flamingo flamingoKsenia = new Flamingo();
        Owl owlSonya = new Owl();
        Parrot parrotKatya = new Parrot();
        Goldfish goldfishPetya = new Goldfish();
        OcellarisClownfish nemo = new OcellarisClownfish();
        Piranha piranhaMarina = new Piranha();

        System.out.println("We have these animals in the zoo." +
                "\nChoose an animal to know more about by entering their number. Press 0 to exit");
        for (String animal: zooAnimals){
            System.out.println(animal);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        while (true) {

            switch (number) {
                case 0:
                    return;
                case 1:
                    System.out.printf("You chose a %s\n", zooAnimals.get(0));
                    wolfEgor.breathing();
                    wolfEgor.moving();
                    wolfEgor.uniqueFact();
                    break;
                case 2:
                    System.out.printf("You chose a %s\n", zooAnimals.get(1));
                    giraffeDenis.breathing();
                    giraffeDenis.moving();
                    giraffeDenis.bodyColoring();
                    break;
                case 3:
                    System.out.printf("You chose a %s\n", zooAnimals.get(2));
                    rhinoAnton.breathing();
                    rhinoAnton.moving();
                    rhinoAnton.havingAHorn();
                    break;
                case 4:
                    System.out.printf("You chose a %s\n", zooAnimals.get(3));
                    flamingoKsenia.breathing();
                    flamingoKsenia.moving();
                    flamingoKsenia.eatingHabits();
                    break;
                case 5:
                    System.out.printf("You chose a %s\n", zooAnimals.get(4));
                    owlSonya.breathing();
                    owlSonya.moving();
                    owlSonya.neckAbility();
                    break;
                case 6:
                    System.out.printf("You chose a %s\n", zooAnimals.get(5));
                    parrotKatya.breathing();
                    parrotKatya.moving();
                    parrotKatya.tasteMethod();
                    break;
                case 7:
                    System.out.printf("You chose a %s\n", zooAnimals.get(6));
                    goldfishPetya.breathing();
                    goldfishPetya.moving();
                    goldfishPetya.areGoldfishStupid();
                    break;
                case 8:
                    System.out.printf("You chose a %s\n", zooAnimals.get(7));
                    nemo.breathing();
                    nemo.moving();
                    nemo.howToFind();
                    break;
                case 9:
                    System.out.printf("You chose a %s\n", zooAnimals.get(8));
                    piranhaMarina.breathing();
                    piranhaMarina.moving();
                    piranhaMarina.motherLand();
                    break;
            }
            System.out.println("\nChoose an animal to know more about by entering their number. Press 0 to exit");
            for (String animal: zooAnimals){
                System.out.println(animal);
            }
            System.out.println("Enter a number: ");
            number = scanner.nextInt();

        }
    }
}
