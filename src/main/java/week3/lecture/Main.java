package week3.lecture;

import java.util.ArrayList;

public class Main {
    public static void printList(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }


    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<String>();
        studentNames.add("Basar Carovac");
        studentNames.add("Pera Detlic");

        System.out.println(studentNames.size());

        printList(studentNames);

        Gender gender = Gender.MALE;
        System.out.println(gender);

        ArrayList<String> students = new ArrayList<String>();

        students.add("Basar");
        students.add("Pera");

        students.stream().forEach(name -> System.out.println(name));
    }
}
