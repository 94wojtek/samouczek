package excercises.xmas.tree;

import java.util.Scanner;

public class Xmas {
    public static void main(String[] args) {

        ChristmasTree tree = new ChristmasTree();
        Scanner inPut = new Scanner(System.in);

        System.out.println("Pass tree hight: ");
        int treeHight = inPut.nextInt();
        tree.buildTree(treeHight);

        tree.buildRegDecoratedTree(treeHight);

        tree.buildIrregDecoratedTree(treeHight);
        inPut.close();
    }
}
