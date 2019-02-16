package excercises.inheritance;

import excercises.inheritance.animal.Animal;
import excercises.inheritance.animal.Goldfish;
import excercises.inheritance.animal.Human;
import excercises.inheritance.computation.Addition;
import excercises.inheritance.computation.Computation;
import excercises.inheritance.computation.Multiplication;

import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {

        //COMPUTATION
        Inheritance main = new Inheritance();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        }
        else {
            computation = new Addition();
        }

        double arg1 = main.getArgument();
        double arg2 = main.getArgument();

        double result = computation.compute(arg1, arg2);
        System.out.println("Wynik: " + result);
        main.inPut.close();

        System.out.println();

        Animal human = new Human();
        Animal fish = new Goldfish();

        System.out.println(human);
        System.out.println(fish);
    }

    Scanner inPut = new Scanner(System.in);

    private boolean shouldMultiply() {
        System.out.println("Would you like to multiply? (y/n)");
        String answer = inPut.next();
        if (answer.equals("y"))
            return true;
        else if (answer.equals("n"))
            return false;

        return false;
    }

    private double getArgument() {
        System.out.println("Type number: ");
        double arg = inPut.nextDouble();
        return arg;
    }
}
