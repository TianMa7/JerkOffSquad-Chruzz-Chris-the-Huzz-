package Ex1_Animals;

import java.util.ArrayList;

public class Ex1_Main {
    public static void run(){
        ArrayList<Animal> allAnimals = new ArrayList<>();

        allAnimals.add(new Animal("Peppy"));
        allAnimals.add(new Dog("Scout"));
        allAnimals.add(new Rotweiller("Rubble"));
        allAnimals.add(new Shihtzu("Bubbles"));
        allAnimals.add(new Trout("Slippery"));
        allAnimals.add(new Baboon("Chuckles", 750));

        System.out.println("What does the dog say");
        for (int i = 0; i < allAnimals.size(); i++) {
//

//            System.out.println(allAnimals.get(i));
            allAnimals.get(i).talk();
        }

        System.out.println(allAnimals.get(5));
        System.out.println("AP QUESTION !");
        Animal a  = new Rotweiller("AngryDog");

        a.talk();



    }//run
}//Ex1_Main

