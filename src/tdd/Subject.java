package test_driven_development;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Subject {
    private SubjectName name;
    private List<Double> grades;
    private double average;

    public Subject(SubjectName name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public SubjectName getName() {
        return name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public double getAverage() {
        this.average = computeAverage();
        return average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Subject)) {
            return false;
        }
        Subject subject = (Subject) o;
        return Double.compare(subject.average, average) == 0 &&
                name == subject.name &&
                Objects.equals(grades, subject.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grades, average);
    }

    @Override
    public String toString() {
        return getName() + ": " + getGrades() + "; Average: " + getAverage();
    }

    public void addGrade(double grade) {
        if (grade < 1.0) {
            throw new IllegalArgumentException("Grade must be 1.0 or more.");
        }

        if (grade > 6.0) {
            throw new IllegalArgumentException("Grade cannot be above 6.0.");
        }

        grades.add(grade);
    }

    public double computeAverage() {
        double gradesSum = 0;
        double average = 0;

        if(getGrades().isEmpty()) {
            average = 0.0;
        }
        else {
            for (double grade : grades) {
                gradesSum += grade;
            }
            average = gradesSum / grades.size();
        }

        return average;
    }
}
