package enum_package;

public class Human {
    private String name;
    private int age;
    private EyesColour eyesColour;
    private HairColour hairColour;

    public Human(String name, int age, EyesColour eyesColour, HairColour hairColour) {
        this.name = name;
        this.age = age;
        this.eyesColour = eyesColour;
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public EyesColour getEyesColour() {
        return eyesColour;
    }

    public HairColour getHairColour() {
        return hairColour;
    }
}
