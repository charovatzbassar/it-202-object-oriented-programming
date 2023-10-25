package week4.lab;

import week4.lab.people.Person;
import week4.lab.people.Student;
import week4.lab.shapes.Circle;
import week4.lab.shapes.FillType;
import week4.lab.shapes.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printDepartment(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
    public static void main(String[] args) {


        Circle circle = new Circle("black", FillType.FILLED, 2);
        Rectangle rectangle = new Rectangle("yellow", FillType.NOT_FILLED, 4, 7);

        circle.displayInfo();
        rectangle.displayInfo();

        Student max = new Student("Max Caulfield", "Sesame Street 3, Arcadia Bay", 18, "USA", 345322);

        max.study();
        max.addGrade(9);
        max.addGrade(10);

        System.out.println(max);



    }
}
