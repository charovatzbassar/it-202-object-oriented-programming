package main.java.week1.lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("Basar Carovac");

        //2
        System.out.println("Hello world!");
        System.out.println("(and all the people of the world)");

        //3
        System.out.println("There are " + (365*24*60*60) + " seconds in a year");

        //4
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Type a number: ");
        int firstNumber = scanner.nextInt();


        System.out.printf("Type another number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Sum of the numbers: " + (firstNumber + secondNumber));

        //5
        System.out.printf("Type a number: ");
        int number = scanner.nextInt();
        System.out.println(number > 0 ? "Number is positive" : "Number is not positive");

        //6
        System.out.printf("Type the first number: ");
        int firstNum = scanner.nextInt();


        System.out.printf("Type the second number: ");
        int secondNum = scanner.nextInt();

        if (firstNum == secondNum) {
            System.out.println("They are equal");
        } else {
            int greaterNum = firstNum > secondNum ? firstNum : secondNum;
            System.out.println("Greater number: " + greaterNum);
        }


    }
}
