package enum_package;

public enum Computation {
    ADD {
        @Override
        public double perform(double num1, double num2) {
            return num1 + num2;
        }
    },
    SUBSTRACT {
        @Override
        public double perform(double num1, double num2) {
            return num1 - num2;
        }
    },
    MULTIPLY {
        @Override
        public double perform(double num1, double num2) {
            return num1 * num2;
        }
    },
    DIVIDE {
        @Override
        public double perform(double num1, double num2) {
            return num1 / num2;
        }
    };

    public abstract double perform(double num1, double num2);
}

class Main {
    public static void main(String[] args) {
        System.out.println(Computation.ADD.perform(5, 3));
        System.out.println(Computation.SUBSTRACT.perform(5, 3));
        System.out.println(Computation.MULTIPLY.perform(5, 3));
        System.out.println(Computation.DIVIDE.perform(5, 3));
    }
}
