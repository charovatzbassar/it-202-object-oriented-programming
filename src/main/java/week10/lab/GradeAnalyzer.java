package week10.lab;

import java.util.ArrayList;

public class GradeAnalyzer {
    private ArrayList<Integer> grades;

    public GradeAnalyzer(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public double calculateAverage() {
        return ((double) this.grades.stream().reduce(0, (total, grade) -> total + grade)) / ((double) this.grades.size());
    }
}
