package conversion;

public class Multiplication {

    protected void multiply(int inputNumber) {
        System.out.println("Result with decimal point of " + inputNumber + " * " + Math.PI + " = " + inputNumber * Math.PI);
        System.out.println("Int result of " + inputNumber + " * " + Math.PI + " = " + inputNumber * (int)Math.PI);
    }

}
