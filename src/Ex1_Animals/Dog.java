package Ex1_Animals;

class Dog extends Animal {
    public int numLegs;
    public Dog(String s) {
        super(s);
        this.numLegs = 4;
    }

    public void talk() {
        System.out.println(name + " is a dog that says \"Bark!\"");
    }

}