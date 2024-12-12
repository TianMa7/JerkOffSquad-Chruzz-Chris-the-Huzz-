package Ex3_MusicFestival;

import java.util.ArrayList;
public class Ex3_Main {

    public static void run(){
        ArrayList<Event> allEvents = new ArrayList<>();
        allEvents.add(new MainStageEvent("Walk off the Earth", "Music"));
        allEvents.add(new MainStageEvent("The Black Pumas", "Music"));
        allEvents.add(new MainStageEvent("The Black Peas", "Music"));
        allEvents.add(new MainStageEvent("Keshi", "Music"));
        allEvents.add(new MainStageEvent("Frank Sinatraa", "Music"));
        allEvents.add(new NonMusicEvent("Curry Connection", "Food Truck", "Truck 9"));
        allEvents.add(new NonMusicEvent("Minor Influence", "Food Truck", "Truck 1"));
        allEvents.add(new NonMusicEvent("Ma Man", "Food Truck", "Truck 2"));
        allEvents.add(new NonMusicEvent("Al-Quesadilla", "Food Truck", "Truck 3"));
        allEvents.add(new NonMusicEvent("Herro its Churro", "Food Truck", "Truck 9"));
        allEvents.add(new SmallStage("Mohammed x boombox", "Music"));
        allEvents.add(new SmallStage("Ringadinga", "Dance"));
        allEvents.add(new SmallStage("Chris x Minne", "Dance"));
        allEvents.add(new SmallStage("9/11", "Show"));
        allEvents.add(new SmallStage("ABBA Cadaver", "Music"));

        ((SmallStage)allEvents.get(0)).addSongs();


        ((MainStageEvent)allEvents.get(0)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(0)).addTech("Symphony Orchestra");

        for (int i = 0; i < allEvents.size(); i++) {
            System.out.println(allEvents.get(i).getEventName());
            if(allEvents.get(i) instanceof MainStageEvent) {
                ((MainStageEvent) allEvents.get(i)).printTech();
            }
        }
    }
}
