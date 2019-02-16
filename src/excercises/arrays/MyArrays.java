package excercises.arrays;

public class MyArrays {

    public int sum(int[] numbers) {
        int result = 0;
        for(int index : numbers) {
            result += index;
        }
        return result;
    }

    public int theGreates(int[] numbers) {
        int i = 0;
        int greates = numbers[0];

        for(i = 0; i < numbers.length; i++) {
            if (numbers[i] > greates)
                greates = numbers[i];
        }

        return greates;
    }

    public int theGreatesWithNoIf(int[] numbers) {
        return Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
    }
}
