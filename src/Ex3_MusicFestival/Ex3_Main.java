package Ex3_MusicFestival;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;

public class Ex3_Main {

    public static void run(){
        ArrayList<Event> allEvents = new ArrayList<>();
        allEvents.add(new MainStageEvent("Walk off the Earth", "Music"));
        allEvents.add(new MainStageEvent("The Black Pumas", "Music"));
        allEvents.add(new MainStageEvent("The Black Peas", "Music"));
        allEvents.add(new MainStageEvent("Keshi", "Music"));
        allEvents.add(new MainStageEvent("Frank Sinatraa", "Music"));
        allEvents.add(new FoodTruck("Curry Connection", "Food Truck", "Truck 9"));
        allEvents.add(new FoodTruck("Minor Influence", "Food Truck", "Truck 1"));
        allEvents.add(new FoodTruck("Ma Man", "Food Truck", "Truck 2"));
        allEvents.add(new FoodTruck("Al-Quesadilla", "Food Truck", "Truck 3"));
        allEvents.add(new FoodTruck("Herro its Churro", "Food Truck", "Truck 9"));
        allEvents.add(new SmallStage("Mohammed x boombox", "Music"));
        allEvents.add(new SmallStage("Ringadinga", "Dance"));
        allEvents.add(new SmallStage("Chris x Minnie", "Dance"));
        allEvents.add(new SmallStage("9/11", "Show"));
        allEvents.add(new SmallStage("ABBA Cadaver", "Music"));



        ((MainStageEvent)allEvents.get(0)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(0)).addTech("Symphony Orchestra");

        while (true) {
            System.out.println("Choose from the following options.");

            System.out.println("1. Add new event");
            System.out.println("2. Find Event");
            System.out.println("3. Filter by type");
            System.out.println("4. Print events grouped by type");
            System.out.println("5. Add Main Stage Tech");
            System.out.println("6. exit.");

            int choice = Library.input.nextInt();
            Library.input.nextLine();

            if (choice == 1) {
                System.out.println("Add new event");
                System.out.println("What event type is this?");
                String type = Library.input.nextLine();
                if(type.equals("FoodTruck")){
                    System.out.println("What is the name?");
                    String name = Library.input.nextLine();
                    System.out.println("What truck number?");
                    int num = Library.input.nextInt();
                    Library.input.nextLine();

                    allEvents.add( new FoodTruck(name, "Food Truck" , "Truck " + num));

                    while(true){
                        System.out.println("Please input menu items");
                        String item = Library.input.nextLine();
                        if(item.equalsIgnoreCase("exit")){
                            break;
                        }else {
                            ((FoodTruck) allEvents.get(allEvents.size() - 1)).AddMenu(item);
                        }
                    }

                }//FoodTruck
                else if(type.equals("SmallStage")){
                    System.out.println("What is the name?");
                    String name = Library.input.nextLine();
                    System.out.println("Whats the type?");
                    String stageType = Library.input.nextLine();
                    Library.input.nextLine();

                    allEvents.add( new SmallStage(name, stageType));

                    while(true){
                        System.out.println("Please input songs");
                        String song = Library.input.nextLine();
                        if(song.equalsIgnoreCase("exit")){
                            break;
                        }else {
                            ((SmallStage) allEvents.get(allEvents.size() - 1)).addSong(song);
                        }
                    }
                }//smallstage
                else if(type.equals("MainStageEvent")){
                    System.out.println("What is the name?");
                    String name = Library.input.nextLine();
                    System.out.println("Whats the type?");
                    String stageType = Library.input.nextLine();



                    allEvents.add( new MainStageEvent(name, stageType));

                    while(true){
                        System.out.println("Please input tech");
                        String tech = Library.input.nextLine();
                        if(tech.equalsIgnoreCase("exit")){
                            break;
                        }else {
                            ((MainStageEvent) allEvents.get(allEvents.size() - 1)).addTech(tech);
                        }
                    }
                }//Mainstage


            } else if (choice == 2) {
                System.out.println("Search for event");
                System.out.println("Please input event name");
                String name = Library.input.nextLine();
                Boolean isFound = false;
                for (int i = 0; i < allEvents.size(); i++) {
                    if(name.equalsIgnoreCase(allEvents.get(i).getEventName())){
                        isFound = true;
                        System.out.println("Name: "+ allEvents.get(i).getEventName());
                        System.out.println("ID: "+allEvents.get(i).getEventID());
                        System.out.println("Type: "+allEvents.get(i).getEventType());
                        System.out.println("Time: "+allEvents.get(i).getTime());
                        System.out.println("Location: "+allEvents.get(i).getLocation());
                        if(allEvents.get(i) instanceof FoodTruck){
                            ((FoodTruck) allEvents.get(i)).printMenu();
                        }
                        else if(allEvents.get(i) instanceof SmallStage){
                            ((SmallStage) allEvents.get(i)).printSongs();
                        }
                        else if(allEvents.get(i) instanceof MainStageEvent){
                            ((MainStageEvent) allEvents.get(i)).printTech();
                        }
                    }
                }
                if(!isFound){
                    System.out.println("Not Found");
                }

            } else if (choice == 3) {
                System.out.println("Filter By Event Type");
                System.out.println("Please input event Type");
                String type = Library.input.nextLine();
                Boolean isFound = false;
                for (int i = 0; i < allEvents.size(); i++) {
                    if(type.equalsIgnoreCase(allEvents.get(i).getEventType())){
                        isFound = true;
                        System.out.println("Name: "+ allEvents.get(i).getEventName());
                        System.out.println("ID: "+allEvents.get(i).getEventID());
                        System.out.println("Type: "+allEvents.get(i).getEventType());
                        System.out.println("Time: "+allEvents.get(i).getTime());
                        System.out.println("Location: "+allEvents.get(i).getLocation());
                        if(allEvents.get(i) instanceof FoodTruck){
                            ((FoodTruck) allEvents.get(i)).printMenu();
                        }
                        else if(allEvents.get(i) instanceof SmallStage){
                            ((SmallStage) allEvents.get(i)).printSongs();
                        }
                        else if(allEvents.get(i) instanceof MainStageEvent){
                            ((MainStageEvent) allEvents.get(i)).printTech();
                        }
                    }
                }
                if(!isFound){
                    System.out.println("Not Found");
                }

            }else if(choice == 4){
                System.out.println("hi");
                for (int i = 0; i < allEvents.size(); i++) {
                    if(allEvents.get(i) instanceof MainStageEvent){
                        System.out.println("Name: "+ allEvents.get(i).getEventName());
                        System.out.println("ID: "+allEvents.get(i).getEventID());
                        System.out.println("Type: "+allEvents.get(i).getEventType());
                        System.out.println("Time: "+allEvents.get(i).getTime());
                        System.out.println("Location: "+allEvents.get(i).getLocation());
                        if(allEvents.get(i) instanceof FoodTruck){
                            ((FoodTruck) allEvents.get(i)).printMenu();
                        }
                        else if(allEvents.get(i) instanceof SmallStage){
                            ((SmallStage) allEvents.get(i)).printSongs();
                        }
                        else if(allEvents.get(i) instanceof MainStageEvent){
                            ((MainStageEvent) allEvents.get(i)).printTech();
                        }
                    }
                }
                for (int i = 0; i < allEvents.size(); i++) {
                    if(allEvents.get(i) instanceof FoodTruck){
                        System.out.println("Name: "+ allEvents.get(i).getEventName());
                        System.out.println("ID: "+allEvents.get(i).getEventID());
                        System.out.println("Type: "+allEvents.get(i).getEventType());
                        System.out.println("Time: "+allEvents.get(i).getTime());
                        System.out.println("Location: "+allEvents.get(i).getLocation());
                        if(allEvents.get(i) instanceof FoodTruck){
                            ((FoodTruck) allEvents.get(i)).printMenu();
                        }
                        else if(allEvents.get(i) instanceof SmallStage){
                            ((SmallStage) allEvents.get(i)).printSongs();
                        }
                        else if(allEvents.get(i) instanceof MainStageEvent){
                            ((MainStageEvent) allEvents.get(i)).printTech();
                        }
                    }
                }
                for (int i = 0; i < allEvents.size(); i++) {
                    if(allEvents.get(i) instanceof SmallStage){
                        System.out.println("Name: "+ allEvents.get(i).getEventName());
                        System.out.println("ID: "+allEvents.get(i).getEventID());
                        System.out.println("Type: "+allEvents.get(i).getEventType());
                        System.out.println("Time: "+allEvents.get(i).getTime());
                        System.out.println("Location: "+allEvents.get(i).getLocation());
                        if(allEvents.get(i) instanceof FoodTruck){
                            ((FoodTruck) allEvents.get(i)).printMenu();
                        }
                        else if(allEvents.get(i) instanceof SmallStage){
                            ((SmallStage) allEvents.get(i)).printSongs();
                        }
                        else if(allEvents.get(i) instanceof MainStageEvent){
                            ((MainStageEvent) allEvents.get(i)).printTech();
                        }
                    }
                }
            }else if(choice == 5){
                System.out.println("Search for main stage");
                String name = Library.input.nextLine();
                boolean isFound = false;
                for (int i = 0; i < allEvents.size() - 1; i++) {
                    if(name.equalsIgnoreCase(allEvents.get(i).getEventName()) && allEvents.get(i) instanceof MainStageEvent){
                        isFound = true;

                        while(true){
                            System.out.println("What tech do you want to add?");
                            String input = Library.input.nextLine();
                            if(input.equalsIgnoreCase("exit")){
                                break;
                            }else{
                                ((MainStageEvent) allEvents.get(i)).addTech(input);
                            }
                        }

                    }
                }
                if(!isFound){
                    System.out.println("No event found");
                }
            }

            else if (choice == 6) {
                break;
            }

        } // while loop

        System.out.println("Thank you. Please come again.");


    }
}
