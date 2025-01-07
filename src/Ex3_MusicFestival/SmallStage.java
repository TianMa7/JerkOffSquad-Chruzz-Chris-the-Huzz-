package Ex3_MusicFestival;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class SmallStage extends Event{

    ArrayList<String> songNames;
    int numSongs;


    public SmallStage(String name, String type){
        super(name, type);
        super.setLocation("Small Stage");

        this.songNames = new ArrayList<String>();
        this.numSongs = 0;

    }

    public void addSong(String song){
        this.songNames.add(song);
        this.numSongs++;
    }

    public void printSongs(){
        System.out.println("The songs for " + super.getEventName() + " are: ");
        for(String song: this.songNames){
            System.out.println(song);
        }
    }




}
