package week10.lab;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
//        User bassar = new User("chrvtzbssr");
//        Admin daniel = new Admin("Daniel");
//
//        MessagingSystem ms = new MessagingSystem();
//
//        ms.sendMessage(daniel);

        Student bassar = new Student("Bassar Charovatz", 123);
        bassar.getGrades().add(10);
        bassar.getGrades().add(10);
        bassar.getGrades().add(8);
        bassar.getGrades().add(9);
        bassar.getGrades().add(9);
        GradeAnalyzer ga = new GradeAnalyzer(bassar.getGrades());

        for (Field f : ga.getClass().getDeclaredFields()) {
            f.setAccessible(true);

            System.out.println(f.getName() + ": " + f.get(ga));
        }

        for (Method m : ga.getClass().getDeclaredMethods()) {
            if (m.getName().startsWith("calculate") || m.getName().startsWith("print")) {
                System.out.println(m.invoke(ga));;
            }
        }

    }
}
