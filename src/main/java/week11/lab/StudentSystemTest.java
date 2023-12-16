package week11.lab;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class StudentSystemTest {
    @Test
    public void testIfStudentIsPresent() throws IOException {
        StudentSystem sis = new StudentSystem("src/main/java/week11/lab/students.csv");
        List<Student> students = sis.readStudents();
        assertEquals(1, students.size());
    }

    @Test
    public void testIfStudentWithId100() throws IOException {
        StudentSystem sis = new StudentSystem("src/main/java/week11/lab/students.csv");
        List<Student> students = sis.readStudents();
        assertFalse(sis.getStudentById(100).isPresent());
    }

    @Test
    public void testIfStudentNull() throws IOException {
        StudentSystem sis = new StudentSystem("src/main/java/week11/lab/students.csv");
        List<Student> students = sis.readStudents();
        assertNull(sis.getStudentById(100));
    }

    @Test
    public void testHighestGPAStudent() throws IOException {
        StudentSystem sis = new StudentSystem("src/main/java/week11/lab/students.csv");
        List<Student> students = sis.readStudents();
        assertNull(sis.getHighestGPAStudent());
    }

    @Test
    public void testExceptionForEmptyStudentLists() throws IOException {
        StudentSystem sis = new StudentSystem("src/main/java/week11/lab/empty.csv");
        assertThrows(FileNotFoundException.class, () -> {
            System.out.println("Thrown exception");
        });
    }

    @Test
    public void testNamesArray() throws IOException {
        StudentSystem sis = new StudentSystem("src/main/java/week11/lab/students.csv");
        List<String> actualNames = sis.readStudents().stream().map(student -> student.getName()).toList().subList(0,4);
    }

    @Test
    public void testSize() throws IOException {
        assertEquals(70, Files.size(Paths.get("src/main/java/week11/lab/students.csv")));
    }

    @Test
    public void testLargestName() throws IOException {
        StudentSystem sis = new StudentSystem("src/main/java/week11/lab/students.csv");
        List<Student> students = sis.readStudents();
        assertNotEquals("Ava White", sis.getLongestNameStudent().getName());
    }

    @Test
    public void testStudents() throws IOException {
        StudentSystem sis = new StudentSystem("src/main/java/week11/lab/students.csv");
        List<Student> students = sis.readStudents();
        assertNotEquals(sis.getHighestGPAStudent().getName(), sis.getLongestNameStudent().getName());
    }

    @Test
    public void testSameStudent() throws IOException {
        StudentSystem sis = new StudentSystem("src/main/java/week11/lab/students.csv");
        List<Student> students = sis.readStudents();
        assertEquals(sis.getHighestGPAStudent().getName(), sis.getStudentById(12).get().getName());
    }
}