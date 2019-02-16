package enum_package;

public class UseEnum {
    public static void main(String[] args) {
        Human hum1 = new Human("Wojtek", 24, EyesColour.BLUE, HairColour.BLONDE);
        Human hum2 = new Human("Ola", 24, EyesColour.GREEN, HairColour.BROWN);
        Human hum3 = new Human("Zuza", 1, EyesColour.BROWN, HairColour.BLONDE);

        System.out.println(hum1.getName());
        System.out.println(hum1.getEyesColour());
    }
}
