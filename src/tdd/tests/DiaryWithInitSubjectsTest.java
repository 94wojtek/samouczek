package test_driven_development.tests;

import org.junit.Before;
import org.junit.Test;
import test_driven_development.Diary;
import test_driven_development.Subject;
import test_driven_development.SubjectName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DiaryWithInitSubjectsTest {
    private Diary diary;
    private Diary diary2;
    private Diary diary3;

    @Before
    public void setUp() {
        //diary = new Diary(new LinkedHashSet<>());
        diary = new Diary();
        diary2 = diary;
        diary3 = new Diary();
        Subject math = new Subject(SubjectName.MATH);
        Subject physics = new Subject(SubjectName.PHYSICS);
        Subject chemistry = new Subject(SubjectName.CHEMISTRY);
        Subject english = new Subject(SubjectName.ENGLISH);

        diary.getDiary().add(math);
        math.getGrades().add(4.5);
        math.getGrades().add(4.0);
        math.getGrades().add(3.5);

        diary.getDiary().add(physics);
        physics.getGrades().add(1.5);
        physics.getGrades().add(1.5);
        physics.getGrades().add(3.0);

        diary.getDiary().add(chemistry);
        chemistry.getGrades().add(4.5);
        chemistry.getGrades().add(4.5);

        diary.getDiary().add(english);
    }

    @Test
    public void shouldBeEqualsWhenTheSameSetOfSubjects() {
        assertEquals(new Diary(), new Diary());
    }

    @Test
    public void shouldBeEqualWhenTheSameAverage() {
        assertEquals(diary.getDiaryAverage(), diary2.getDiaryAverage(), 0.001);
    }

    @Test
    public void shouldCheckIfHashCodeEquals() {
        assertEquals(diary.hashCode(), diary2.hashCode());
    }

    @Test
    public void shouldCheckIfHashCodeNotEquals() {
        assertNotEquals(diary.hashCode(), diary3.hashCode());
    }

    @Test
    public void shouldCheckIfDisplaysDiaryCorrectly() {
        String sampleDiaryDisplay = "MATH: [4.5, 4.0, 3.5]; Average: 4.0" + System.lineSeparator() +
                                    "PHYSICS: [1.5, 1.5, 3.0]; Average: 2.0" + System.lineSeparator() +
                                    "CHEMISTRY: [4.5, 4.5]; Average: 4.5" + System.lineSeparator()+
                                    "ENGLISH: []; Average: 0.0" + System.lineSeparator()+
                                    "Average of all subjects: 2.625";

        assertEquals(sampleDiaryDisplay, diary.toString());
    }

    @Test
    public void shouldCheckIfComputesDiaryAverage() {
       assertEquals(2.625, diary.computeDiaryAverage(), 0.01);
    }
}
