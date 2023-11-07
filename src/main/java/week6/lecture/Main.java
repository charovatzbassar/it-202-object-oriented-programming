package week6.lecture;

import java.util.HashMap;

class Test<T extends Comparable<T>> implements Comparable<Test<T>> {
    private T value;

    public Test(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public int compareTo(Test<T> o) {
        return this.value.compareTo(o.getValue());
    }
}

public class Main {
    public static void main(String[] args) {
        Test<Integer> testInt = new Test<Integer>(12);
        Test<String> testStr = new Test<String>("Basar");

        System.out.println(testInt.getValue());
        System.out.println(testStr.getValue());

        printValue("Something");
        printValue(false);

        HashMap<Integer, String> testMap = new HashMap<Integer, String>(); // the key is being hashed in the background

        testMap.put(1, "One");
        testMap.put(2, "Two");

        System.out.println(testMap.get(1));
    }

    public static <T> void printValue(T value) {
        System.out.println(value);
    }
}
