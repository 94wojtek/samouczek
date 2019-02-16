package excercises.inheritance.animal;

public class Goldfish extends Fish {
    private String goldfishDesription = "This is Goldfish class and it inhertit after Fish and Animal classess";

    public Goldfish() {
    }

    public Goldfish(String description, String describeFish, String goldfishDesription) {
        super(description, describeFish);
        this.goldfishDesription = goldfishDesription;
    }

    @Override
    public String toString() {
        return goldfishDesription;
    }
}
