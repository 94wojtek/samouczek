package excercises.sqrt;

public class Root {

    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }

        return Math.sqrt(number);
    }
}
