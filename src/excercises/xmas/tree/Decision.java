package excercises.xmas.tree;


import java.util.Scanner;

public class Decision {
    Scanner inPut = new Scanner(System.in);

    public char[] pickOrnaments(char[] arr1, char[] arr2) {
        System.out.println("Select type of ornaments:");
        System.out.println("[d] - default ornaments");
        System.out.println("[c] - customize ornaments");
        String decision = inPut.next();

        char[] tmp = {' '};
        if (decision.equals("d")) {
            tmp = arr1;
        }
        else if (decision.equals("c")) {
            tmp = arr2;
            System.out.println("Type 4 ornament you wish to add: ");

            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = inPut.next().charAt(0);
            }
            inPut.close();
        }
        else {
            throw new IllegalArgumentException("You can only select [d] for default or [c] for custom.");
        }

        return tmp;
    }
}
