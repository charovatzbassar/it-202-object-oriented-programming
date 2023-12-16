package week11.lab;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        StudentSystem sis = new StudentSystem("src/main/java/week11/lab/students.csv");
        List<Student> students = sis.readStudents();
        System.out.println(sis.getStudentById(10));
        System.out.println(sis.getHighestGPAStudent());
        System.out.println(sis.getLongestNameStudent());
    }
}
