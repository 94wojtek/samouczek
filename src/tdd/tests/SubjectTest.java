package test_driven_development.tests;

import org.junit.Before;
import org.junit.Test;
import test_driven_development.Subject;
import test_driven_development.SubjectName;

import static org.junit.Assert.*;

public class SubjectTest {
    private Subject math;
    private Subject math2;
    private Subject subject;

    @Before
    public void setUp() {
        math = new Subject(SubjectName.MATH);
        math2 = new Subject(SubjectName.MATH);
        subject = new Subject(SubjectName.HISTORY);

        math.getGrades().add(4.5);
        math.getGrades().add(3.5);
        math.getGrades().add(4.0);
        math.getAverage();
    }

    @Test
    public void shouldCheckIfSubjectsWithSameNameSameGradesAndSameAverageEquals() {
        math2.getGrades().add(4.5);
        math2.getGrades().add(3.5);
        math2.getGrades().add(4.0);
        math2.getAverage();

        assertEquals(math, math2);
    }

    @Test
    public void shouldCheckIfSubjectsWithDifferentNamesNotEquals() {
        assertNotEquals(math, subject);
    }

    @Test
    public void shouldCheckIfSubjectsWithDifferentGradesNotEqual() {
        assertNotEquals(math, math2);
    }

    @Test
    public void checkIfDisplayCorrectly() {
        String displaySubjectSample = "MATH: [4.5, 3.5, 4.0]; Average: 4.0";

        assertEquals(displaySubjectSample, math.toString());
    }

    @Test
    public void checkIfAddGradeToSubject() {
        math.addGrade(4.0);
        assertTrue(math.getGrades().contains(4.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIfThrowIllegalArgumentExceptionForGradeBelowOne() {
        math.addGrade(-2.5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIfThrowIllegalArgumentExceptionForGradeAboveSix() {
        math.addGrade(6.5);
    }

    //check if computes average of grades for one subject
    @Test
    public void shouldComputeAverage() {
       assertEquals(4, math.computeAverage(), 0.001);
    }

    //check if subjects average is 0 when subjects grade list is empty
    @Test
    public void shouldReturnZeroIfGradeListIsEmpty() {
        assertTrue(math2.computeAverage() == 0);
    }
}