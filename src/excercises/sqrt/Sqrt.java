package excercises.sqrt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sqrt {
    public Sqrt() {
        Scanner input = new Scanner(System.in);
        Root sqrt = new Root();
        double number = 0;
        double sqrtResult = 0;
        String breakLoop = " ";

        while(true) {
            System.out.println("Type number:");

            try {
                number = input.nextDouble();
                sqrtResult = sqrt.squareRoot(number);
            }
            catch (InputMismatchException e) {
                System.err.println("Only digits allowed.");
            }
            catch (IllegalArgumentException e) {
                System.err.println("Number must be positive. Input: " + number + "\nSquare root of " + (number * -1) + ": ");
                sqrtResult = Math.sqrt(number * -1);
            }

            System.out.println(sqrtResult);
            System.out.println("Do you wish to continue? [e] - exit, any key to continue");
            breakLoop = input.next();

            if (breakLoop.equals("e")) {
                input.close();
                break;
            }
        }

        /*
        do {
            System.out.println("Type number:");

            try {
                number = input.nextDouble();
                sqrtResult = sqrt.squareRoot(number);
            }
            catch (InputMismatchException e) {
                System.err.println("Only digits allowed.");
            }
            catch (IllegalArgumentException e) {
                System.err.println("Number must be positive. Input: " + number + "\nSquare root of " + (number * -1) + ": ");
                sqrtResult = Math.sqrt(number * -1);
            }

            System.out.println(sqrtResult);
            System.out.println("Do you wish to continue? [e] - exit, any key to continue");
            breakLoop = input.next();
        }
        while (!breakLoop.equals("e"));
        input.close();
        */
    }
}
