package week6.lab;

public class BinarySearch {
    public static void search(int[] array, int value) {

        int left = 0, right = array.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == value) {
                System.out.println("Element " + value + " is in the array");
            }

            if (array[middle] < value) {
                left = middle + 1;
            }

            else {
                right = middle - 1;
            }
        }
        if (left > right) {
            System.out.println("Element " + value + " is not in the array");
        }
    }
}
