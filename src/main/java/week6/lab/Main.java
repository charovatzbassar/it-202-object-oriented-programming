package week6.lab;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] values = {7,2,4,8,3,2,43};
//        System.out.println(indexOfTheSmallest(values));

//        int[] values = {-1,6,9,8,12};
//        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//        int[] values = {3,2,5,4,8};
//        System.out.println(Arrays.toString(values));
//        swap(values,1,0);
//        System.out.println(Arrays.toString(values));
//
//        BinarySearch.search(values, 10);

//        NightSky ns = new NightSky(0.1, 40, 10);
//        ns.print();
//        System.out.println(ns.starsInLastPrint());
//
//
//        Library Library = new Library();
//
//        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
//        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
//        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
//        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
//
//        ArrayList<Book> result = Library.searchByTitle("cheese");
//        for (Book book: result) {
//            System.out.println(book);
//        }
//
//        System.out.println("---");
//        for (Book book: Library.searchByPublisher("Penguin Group  ")) {
//            System.out.println(book);
//        }
//
//        System.out.println("---");
//        for (Book book: Library.searchByYear(1851)) {
//            System.out.println(book);
//        }

        Birdwatchers bwdb = new Birdwatchers();
        Scanner scanner = new Scanner(System.in);
        List<String> options = Arrays.asList("add", "statistics", "observation", "show");
        String input = "";

        while (!input.equals("quit")) {
            input = scanner.nextLine().toLowerCase();

            if (!options.contains(input)) {
                continue;
            }

            switch (input) {
                case "add" -> {
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Latin Name: ");
                    String latinName = scanner.nextLine();
                    bwdb.add(name, latinName);
                }
                case "statistics" -> bwdb.statistics();
                case "show" -> {
                    System.out.print("What? ");
                    String birdName = scanner.nextLine();
                    bwdb.show(birdName);
                }
                case "observation" -> {
                    System.out.print("What was observed? ");
                    String observedBirdName = scanner.nextLine();
                    bwdb.observation(observedBirdName);
                }
            }
        }


    }

    public static int smallest(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static int indexOfTheSmallest(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                index = i;
            }
        }

        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = array[index];
        int minIndex = index;

        for (int i = index; i < array.length; i++) {
            if (array[i] < min) {
                index = i;
            }
        }

        return index;
    }

    public static void swap (int[] array, int index1, int index2) {
        if (index1 >= array.length || index2 >= array.length || index1 < 0 || index2 < 0) {
            throw new RuntimeException();
        }

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void printElegantly(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
