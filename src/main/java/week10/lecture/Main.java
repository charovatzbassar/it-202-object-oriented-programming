package week10.lecture;

import java.io.*;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.print("Give student number: ");
//        Scanner reader = new Scanner(System.in);
//        String num = reader.nextLine();
//
//        if (num.matches("01[0-9]{7}")) {
//            System.out.println("The form is valid.");
//        } else {
//            System.out.println("The form is not valid.");
//        }

//        simpleWrite("Something is written here");
//            simpleRead("output.txt");
        Cat myCat = new Cat("Cicko Cile", 12);
        Field[] catFields = myCat.getClass().getDeclaredFields();

        for (Field f : catFields) {
            System.out.println(f.getName());
        }
    }

    public static void simpleWrite(String text) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write(text);
        bw.close();
    }

    public static void simpleRead(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        System.out.println(br.readLine());
        br.close();
    }

    public static void readWholeFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("output.txt")
        );
        String tempLine;
        while ((tempLine = bufferedReader.readLine()) != null){
            System.out.println(tempLine);
        }

        bufferedReader.close();
    }

}
