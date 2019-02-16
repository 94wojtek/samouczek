package conversion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Multiply int number by Pi number with decimal point result and with int result
        Multiplication convert1 = new Multiplication();
        System.out.println("Type int number: ");

        try {
            int intNumber = input.nextInt();
            if (intNumber != 0) {
                convert1.multiply(intNumber);
            }
            else
                throw new IllegalArgumentException("Number must be positive.");
        }
        catch (InputMismatchException e) {
            System.err.println("Type int number only.");
        }
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("__________________");

        //Division two int arguments with decimal point result
        Division convert2 = new Division();

        System.out.println("Type first int number: ");
        int intNum1 = input.nextInt();
        System.out.println("Type second int number: ");
        int intNum2 = input.nextInt();
        convert2.divide(intNum1, intNum2);

        //Console displays Infinity
        System.out.println(intNum1/(double)intNum2);

        //Console displays exception
        System.out.println(intNum1/intNum2);

        input.close();

        System.out.println("__________________");

        //Assigning null to int variable
        //NullPointerExeption thrown
        Integer i = null;
        int j = i;
        System.out.println(j);

        System.out.println("__________________");

        //Char to int assigment
        //Print result: 42
        //ASCII: asterix (*)
        char character = '*';
        int intNumber = 0;
        System.out.println(intNumber = character);
    }
}
