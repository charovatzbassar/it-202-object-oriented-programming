package week4.lab.people;

import java.util.ArrayList;

public class Student extends Person {
    private int credits;
    private int studentId;
    private ArrayList<Integer> grades;

    public Student(String fullName, String homeAddress, int age, String country, int studentId) {
        super(fullName, homeAddress, age, country);
        this.credits = 0;
        this.studentId = studentId;
        this.grades = new ArrayList<Integer>();
    }

    public void study() {
        this.credits++;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade) {
        if (grade < 4 || grade > 11) {
            System.out.println("Invalid grade");
        } else {
            this.grades.add(grade);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "credits " + this.credits + "\nGrades: " + getGrades();

    }
}
