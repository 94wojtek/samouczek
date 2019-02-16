package excercises.xmas.tree;

import java.util.Random;

public class ChristmasTree {
    private final char treeSymbol = '*';
    private char[] defaOrnaments = {'+', 'o', '$', '#'};
    private char[] ornaments = new char[4];
    Decision decision = new Decision();
    Random random = new Random();

    public ChristmasTree() {}

    //TREE BUILDING METHOD
    public void buildTree(int treeHight) {
        StringBuilder tree = new StringBuilder();

        //CREATE ROWS OF TREE LOOP
        for (int row = 0; row < treeHight; row++) {
            int maxWidth = (row * 2) + 1;

            //ADDING INDENTATION LOOP
            for (int indentation = 0; indentation < treeHight - row - 1; indentation++) {
                tree.append(" ");
            }

            //ADDING TREE SYMBOL LOOP
            for (int currentPosition = 1; currentPosition <= maxWidth; currentPosition++) {
                tree.append(treeSymbol);
            }
            tree.append(System.lineSeparator());
        }
        System.out.println(tree.toString());
    }

    //TREE WITH REGULAR DECORATION BUILDING METHOD
    public void buildRegDecoratedTree(int treeHight) {
        StringBuilder tree = new StringBuilder();
        char[] selectedArr = decision.pickOrnaments(defaOrnaments, ornaments);

        //CREATE ROWS OF TREE LOOP
        for (int row = 0; row < treeHight; row++) {
            int maxWidth = (row * 2) + 1;

            //ADDING INDENTATION LOOP
            for (int indentation = 0; indentation < treeHight - row - 1; indentation++) {
                tree.append(" ");
            }

            //ADDING TREE SYMBOL WITH ORNAMENTS LOOP
            for (int currentPosition = 1, arrIndex = -1; currentPosition <= maxWidth; currentPosition++, arrIndex++) {

                if (currentPosition % 2 == 0 && arrIndex < selectedArr.length) {
                    tree.append(selectedArr[arrIndex]);
                    arrIndex--;
                }
                else if (arrIndex == selectedArr.length) {
                    arrIndex = 0;
                    tree.append(selectedArr[arrIndex]);
                    arrIndex--;
                }
                else {
                    tree.append(treeSymbol);
                }
            }
            tree.append(System.lineSeparator());
        }
        System.out.println(tree.toString());
    }

    //TREE WITH IRREGULAR DECORATION BUILDING METHOD
    public void buildIrregDecoratedTree(int treeHight) {
        StringBuilder tree = new StringBuilder();
        char[] selectedArr = decision.pickOrnaments(defaOrnaments, ornaments);

        //CREATE ROWS OF TREE LOOP
        for (int row = 0; row < treeHight; row++) {
            int maxWidth = (row * 2) + 1;

            //ADDING INDENTATION LOOP
            for (int indentation = 0; indentation < treeHight - row - 1; indentation++) {
                tree.append(" ");
            }

            //ADDING TREE SYMBOL WITH RANDOM ORNAMENTS LOOP
            for (int currentPosition = 1; currentPosition <= maxWidth; currentPosition++) {
                int rndOrnament = random.nextInt(selectedArr.length);

                if (thirtyPercentChance()) {
                    tree.append(selectedArr[rndOrnament]);
                }
                else {
                    tree.append(treeSymbol);
                }
            }
            tree.append(System.lineSeparator());
        }
        System.out.println(tree.toString());
    }

    private boolean thirtyPercentChance() {
        int tmp = random.nextInt(10);
         if (tmp < 3) {
             return true;
         }
         return false;
    }
}
