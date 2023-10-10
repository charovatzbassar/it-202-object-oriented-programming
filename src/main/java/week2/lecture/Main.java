package main.java.week2.lecture;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");

        while (true) {
            int age = scanner.nextInt();
            if (age < 3 || age > 125) {
                System.out.println("You are lying.");
                if (age < 3) {
                    System.out.println("You are too young to read and write!");
                } else {
                    System.out.println("Go die!");
                }
                System.out.println("Please enter your age again! Don't lie");
                continue;
            }
            System.out.println("You are " + age + " years old!");
            break;
        }
    }
}
