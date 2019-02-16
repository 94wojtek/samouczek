package generic;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection {
    public void fillList(ArrayList<String> animals) {
        animals.add("cat");
        animals.add("dog");
        animals.add("horse");
        animals.add("zebra");
    }

    public static void main(String[] args) {
        Collection listFiller = new Collection();
        ArrayList<String> animals = new ArrayList<>();

        listFiller.fillList(animals);

        Scanner input = new Scanner(System.in);
        System.out.println("Animal: ");
        String newAnimal = input.next();

        int index = 0;
        while(newAnimal.compareToIgnoreCase(animals.get(index)) > 0 && index < animals.size()){
            index++;
        }
        animals.add(index, newAnimal);

        System.out.println(animals);
        input.close();
    }

}
