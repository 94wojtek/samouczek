package excercises.inheritance.animal;

public class Mammal extends Animal {
    protected String describeMammal = "This is Mammal class and it inherit after Animal class";

    public Mammal() {
    }

    public Mammal(String description, String describeMammal) {
        super(description);
        this.describeMammal = describeMammal;
    }
}
