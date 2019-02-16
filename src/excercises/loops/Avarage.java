package excercises.loops;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {

        Avarage avarage = new Avarage(3, 4);
        avarage.inPutNotes();
        avarage.computeAvarage();
    }

    private final int numberOfClasses;
    private final int numberOfNotes;
    public int[][] notes;

    public Avarage(int numberOfClasses, int numberOfNotes) {
        this.numberOfClasses = numberOfClasses;
        this.numberOfNotes = numberOfNotes;
        initializeNotes();
    }

    private void initializeNotes() {
        notes = new int[numberOfClasses][];
        for (int classIndex = 0; classIndex < notes.length; classIndex++) {
            notes[classIndex] = new int[numberOfNotes];
        }
    }

    public void inPutNotes() {
        Scanner inPut = new Scanner(System.in);
        for (int classIndex = 0; classIndex < numberOfClasses; classIndex++) {
            for (int note = 0; note < numberOfNotes; note++) {
                System.out.println("Insert note " + (note + 1) + " for subject " + (classIndex + 1) + ": ");
                notes[classIndex][note] = inPut.nextInt();
            }
        }
    }

    public void computeAvarage() {
        int notesSum = 0;
        int classAvarage = 0;
        int totalAvarage = 0;

        for (int classIndex = 0; classIndex < numberOfClasses; classIndex++) {
            for (int noteIndex = 0; noteIndex < numberOfNotes; noteIndex++) {
                notesSum += notes[classIndex][noteIndex];
            }
            classAvarage = notesSum / numberOfNotes;
            System.out.println("Classe's avarage for class " + (classIndex + 1) + " is: " + classAvarage);
            totalAvarage += classAvarage;
        }
        totalAvarage /= numberOfClasses;
        System.out.println("All classess total avarage is: " + totalAvarage);
    }
}
