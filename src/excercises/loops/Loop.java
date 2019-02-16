package excercises.loops;

public class Loop {
    public static void main(String[] args) {
        for (int i = 20; i >= 10; i--) {
            System.out.println(i);
        }

        int index = 10;
        while (index <= 20) {
            System.out.print(index + " ");
            index++;
        }

        System.out.println();

        for (int i = -10; i <= 40; i++) {
            int reminder = i % 2;
            if (reminder == -1 || reminder == 1) {
                System.out.println(i);
            }
        }

        System.out.println();

        int i = -10;
        while (i <= 40) {
            int reminder = i % 2;
            if (reminder == -1 || reminder == 1) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println();

        int[] elements = {3, 7, 25};
        System.out.println(arraySum(elements));

        System.out.println();

        int[][] doubleArray = {
            new int[] {1, 2},
            new int[] {3, 1},
            new int[] {2, 3}
        };
        System.out.println(multiArraySum(doubleArray));

    }

    public static int arraySum(int[] elements) {
        int sum = 0;
        for(int index : elements) {
            sum += index;
        }
        return sum;
    }

    public static int multiArraySum(int[][] elements) {
        int sum = 0;
        for(int[] row : elements) {
            for(int index : row){
                sum += index;
            }
        }
        return sum;
    }
}
