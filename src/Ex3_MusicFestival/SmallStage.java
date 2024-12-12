package Ex3_MusicFestival;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class SmallStage extends Event{

    ArrayList<String> techRequirements;
    ArrayList<String> songs;
    ArrayList<Integer> songGirth;

    public SmallStage(String name, String type){
        super(name, type);
        super.setLocation("Sub Stage");

        techRequirements = new ArrayList<String>();
        songs = new ArrayList<String>();
        songGirth = new ArrayList<Integer>();
    }

    public int numSongs = 0;

    public void setSongTime() {
        System.out.println("Whats the length of the suzz(song huzz)");
        int girth = Library.input.nextInt();
        Library.input.nextLine();
        songGirth.add(girth);


    }

    public void addSongs(){
        System.out.println("On skibidi give me a song");
        songs.add(Library.input.nextLine());
        setSongTime();
        numSongs += 1;
    }
}
