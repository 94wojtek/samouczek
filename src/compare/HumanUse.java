package compare;

public class HumanUse {
    public static void main(String[] args) {
        Human hum1 = new Human("Wojtek", "Wachta", "24");
        Human hum2 = new Human("Wojtek", null, "24");
        Human hum3 = new Human("Wojtek", "Kowalski", "24");
        Human hum4 = new Human("Zdzichu", "Wachta", "24");

        System.out.println("hum1 == hum2: " + (hum1 == hum2));
        System.out.println("hum1 equals hum2: " + (hum1.equals(hum2)));
        System.out.println("hum1 == hum3: " + (hum1 == hum3));
        System.out.println("hum1 equals hum3: " + (hum1.equals(hum3)));
        System.out.println("hum1 == hum4: " + (hum1 == hum4));
        System.out.println("hum1 equals hum4: " + (hum1.equals(hum4)));

        System.out.println();

        System.out.println("hum1 hashCode: " + hum1.hashCode());
        System.out.println("hum2 hashCode: " + hum2.hashCode());
        System.out.println("hum1 compareHashCode hum2: " + hum1.compareHashCode(hum2));
    }
}
