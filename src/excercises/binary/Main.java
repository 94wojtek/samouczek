package excercises.binary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type decimal number: ");
        Binary binary = new Binary();
        int number = input.nextInt();

        try {
            System.out.println("Binary form:");
            binary.binaryCompute(number);
        }
        catch (IllegalArgumentException e) {
            System.err.println("Only positive numbers allowed! Main form of " + (number * -1) + ": ");
            binary.binaryCompute(number * -1);
        }

        input.close();
    }

}
