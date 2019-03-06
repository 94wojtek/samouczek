package test_driven_development;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Diary {
    private Set<Subject> diary;
    private double diaryAverage;

    public Diary() {
        this.diary = new LinkedHashSet<>();
    }

    public Set<Subject> getDiary() {
        return diary;
    }

    public double getDiaryAverage() {
        this.diaryAverage = computeDiaryAverage();
        return diaryAverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Diary)) {
            return false;
        }
        Diary diary1 = (Diary) o;
        return Double.compare(diary1.diaryAverage, diaryAverage) == 0 &&
                Objects.equals(diary, diary1.diary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diary, diaryAverage);
    }

    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder();

        for(Subject subject : diary) {
            representation.append(subject);
            representation.append(System.lineSeparator());
        }
        representation.append("Average of all subjects: ");
        representation.append(getDiaryAverage());

        return representation.toString();
    }

    public void addSubject(Subject subject) {
        if(subject == null) {
            throw new NullPointerException("Select subject.");
        }
        diary.add(subject);
    }

    public String getSubject(Subject subject) {
        if(subject == null) {
            throw new NullPointerException("Select subject to retrieve.");
        }

        return subject.getName() + ": " + subject.getGrades() + "; Average: " + subject.getAverage();
    }

    public double computeDiaryAverage() {
        double totalGradesSum = 0;

        if(diary.isEmpty()) {
            throw new IllegalStateException("Add subject to compute average.");
        }

        for(Subject subjectGrade : diary) {
            totalGradesSum += subjectGrade.getAverage();
        }

        return totalGradesSum / diary.size();
    }
}
