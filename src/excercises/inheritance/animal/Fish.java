package excercises.inheritance.animal;

public class Fish extends Animal {
    protected String describeFish = "This is Fish class and it inherit after Animal class";

    public Fish() {
    }

    public Fish(String description, String describeFish) {
        super(description);
        this.describeFish = describeFish;
    }
}
