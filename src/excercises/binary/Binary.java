package excercises.binary;

public class Binary {

    public void binaryCompute(int number) {
        StringBuilder binaryString = new StringBuilder();
        int result = 0;
        int moduloResult = 0;

        if (number < 0) {
            throw new IllegalArgumentException();
        }
        else {
            do {
                result = number / 2;
                moduloResult = number % 2;
                number = result;
                binaryString.append(moduloResult);
            }
            while (result > 0);

            System.out.println(binaryString.reverse());
        }
    }
}
