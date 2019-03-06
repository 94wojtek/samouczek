package test_driven_development.tests;

import org.junit.Before;
import org.junit.Test;
import test_driven_development.Diary;
import test_driven_development.Subject;
import test_driven_development.SubjectName;

import static org.junit.Assert.*;

public class DiaryTest {
    private Diary diary;
    private Diary diary2;
    private Subject math;
    private Subject english;

    @Before
    public void setUp() {
        diary = new Diary();
        diary2 = new Diary();
        math = new Subject(SubjectName.MATH);
        english = null;
    }

    @Test
    public void checkIfAddSubject() {
        diary.addSubject(math);
        assertTrue(diary.getDiary().contains(math));
    }

    @Test(expected = NullPointerException.class)
    public void checkIfThrowsNullPointerException() {
        diary.addSubject(null);
    }

    @Test
    public void checkIfRetrieveSubject() {
        diary.getDiary().add(math);
        math.addGrade(4.5);
        math.addGrade(4.0);
        math.addGrade(3.5);

        String mathSampleRepresentation = SubjectName.MATH.name() + ": " +
                                            "[4.5, " + "4.0, " + "3.5]; Average: " + "4.0";

        assertEquals(mathSampleRepresentation, diary.getSubject(math));
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionWhenNullToRetrieve() {
        diary.getSubject(english);
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowIllegalStateExceptionWhenEmptyDiary() {
        diary.computeDiaryAverage();
    }
}
