package main.java.week2.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
//        String password = "carrot";
//
//        while (true) {
//            System.out.print("Type the password: ");
//            String passwordInput = scanner.nextLine();
//
//            if (passwordInput.equals(password)) {
//                break;
//            }
//            System.out.println("Wrong!");
//        }
//
//        System.out.println("Rignt!\n");
//        System.out.println("The secret is: jryy qbar!");

        //2
//        int sum = 0;
//        int read;
//
//        int i = 0;
//        List<String> numberMsg = Arrays.asList("first", "second", "third");
//
//        while (i < 3) {
//            System.out.print("Type the " + numberMsg.get(i) + " number: ");
//            read = scanner.nextInt();
//            sum += read;
//            i++;
//        }
//
//        System.out.println("\nSum: " + sum);

        //3
//        int sum = 0;
//        while (true) {
//            int read = Integer.parseInt(scanner.nextLine());
//            if (read == 0) {
//                break;
//            }
//            sum += read;
//            System.out.println("Sum now: " + sum);
//        }
//
//        System.out.println("Sum in the end: " + sum);

        //4
//        System.out.print("First: ");
//        int firstNumber = scanner.nextInt();
//
//        System.out.print("Second: ");
//        int secondNumber = scanner.nextInt();
//
//        if (secondNumber >= firstNumber) {
//            // the rest of the program will execute only if this condition is satisfied
//
//            for (int i = firstNumber; i <= secondNumber ; i++) {
//                System.out.println(i);
//            }
//        }

        //5
//        System.out.print("Type a number: ");
//        int n = scanner.nextInt();
//        int sum = 0;
//
//        for (int i = 0; i <= n; i++) {
//            sum += Math.pow(2, i);
//        }
//
//        System.out.println("The result is " + sum);

        //6
//        printText();

        //7
//        printStars(5);
//        printStars(3);
//        printStars(9);

        //8
//        drawStarsPyramid(5);
//        drawInvertedStarsPyramid(5);

        //9
//        drawNumbersPyramid(7, true);
//        drawNumbersPyramid(7, false);

        //10
//        int drawnNumber = drawNumber(0, 101);
//        System.out.println(drawnNumber);
//        int guesses = 0;
//
//        while (true) {
//            System.out.print("Guess a number: ");
//            int guess = scanner.nextInt();
//            guesses++;
//
//            if (drawnNumber == guess) {
//                break;
//            }
//
//            String message = "The number is " + (guess > drawnNumber ? "lesser, " : "greater, ") + "guesses made: " + guesses;
//
//            System.out.println(message);
//        }
//
//        System.out.println("Congratulations, your guess is correct!");

    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.\n");
    }

    private static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    private static void drawStarsPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    private static void drawInvertedStarsPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    private static void drawNumbersPyramid(int n, boolean isSequence) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((isSequence ? j : i) + " ");
            }
            System.out.print("\n");
        }
    }

    private static int drawNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
