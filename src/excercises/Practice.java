package excercises;

import excercises.arrays.Chess;
import excercises.arrays.MyArrays;
import java.util.Arrays;
import java.util.Scanner;
import excercises.sqrt.Sqrt;

public class Practice {
    public static void main(String[] args) {

        /*
        String weather1 = "Today is raining. ";
        String weather2 = "There were no sunshine. ";
        String weather3 = "Very cloudy and miserable. ";
        String weather4 = weather1 + weather2 + weather3;

        System.out.println(weather4);
        System.out.println(weather4.length());

        MyArrays array = new MyArrays();
        int[] numbers = {1, 4};

        System.out.println(array.sum(numbers));

        int[] numbers1 = {-3, 0, -5, 4, -69};
        System.out.println(array.theGreates(numbers1));

        Chess board = Chess.deepBlueKasparov();
        System.out.println(Arrays.deepToString(board.board));

        int[] a = {1, 2, 3};
        int[] b = a;

        int A = 1;
        int B = A;
        System.out.println(A);
        System.out.println(B);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int[] c = {6, -5, 0};
        Arrays.sort(c);
        */

        //Sqrt sqrt = new Sqrt();

        Practice p = new Practice();
        System.out.println(Arrays.deepToString(p.identityMatrix()));
    }
    int x = 6;
    public int[][] identityMatrix() {
        int[][] twoD = new int[x][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j) {
                    twoD[i][j] = 1;
                }
            }
        }
        return twoD;
    }

}
