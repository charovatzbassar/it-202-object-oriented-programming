package week7.lecture;

import jdk.dynalink.Operation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Daniel", 24);
    }
}

record Person(String name, int age) {} // reduces boilerplate code, they are just like POJO classes
