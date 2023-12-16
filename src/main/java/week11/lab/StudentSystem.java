package week11.lab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentSystem {
    private String filename;
    private ArrayList<Student> students;

    public StudentSystem(String filename) throws IOException {
        this.filename = filename;
        this.students = new ArrayList<Student>();
    }

    public List<Student> readStudents() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(this.filename));
        List<Student> studentList = br.lines().map(student -> {
            String[] line = student.split(",");
            return new Student(Integer.parseInt(line[0]), line[1], line[2], line[3], Double.parseDouble(line[4]));
        }).toList();
        br.close();
        this.students = new ArrayList<Student>(studentList);
        return studentList;
    }

    public Optional<Student> getStudentById(int id) {
        try {
            if (this.students.size() == 0) {
                throw new EmptyStudentListException("Student list empty!");
            }

            for (Student student : this.students) {
                if (student.getId() == id) {
                    return Optional.of(student);
                }
            }

            throw new StudentNotFoundException("Student not found!");
        } catch (EmptyStudentListException e) {
            return null;
        } catch (StudentNotFoundException e) {
            return Optional.ofNullable(null);
        }
    }

    public Student getHighestGPAStudent() {
        return this.students.stream().reduce(this.students.get(0), (maxStudent, student) -> {
            return student.getGpa() > maxStudent.getGpa() ? student : maxStudent;
        });
    }

    public Student getLongestNameStudent() {
        return this.students.stream().reduce(this.students.get(0), (longestNameStudent, student) -> {
            return student.getName().length() > longestNameStudent.getName().length() ? student : longestNameStudent;
        });
    }

}
