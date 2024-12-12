package Ex1_Animals;

public class Baboon extends Animal{
    int numBerries;

    public Baboon(String name, int n ){
        super(name);
        numBerries = n;
    }

    @Override
    public String toString() {
        return "Baboon{" +
                "numBerries=" + numBerries +
                '}';
    }
}
