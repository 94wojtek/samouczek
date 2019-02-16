package excercises.inheritance.animal;

public class Human extends Mammal {
    private String humanDescription = "This is Human class and it inherit after Animal and Mammal classes";

    public Human() {
    }

    public Human(String description, String describeMammal, String humanDescription) {
        super(description, describeMammal);
        this.humanDescription = humanDescription;
    }

    @Override
    public String toString() {
        return humanDescription;
    }
}
