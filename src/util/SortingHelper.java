package util;

import algorithm.InsertionSort;
import algorithm.SelectionSort;
import entity.Student;

public class SortingHelper {
    private SortingHelper() {
    }

    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sortName, E[] data) {
        long startTime = System.nanoTime();
        if (sortName.equals("SelectionSort")) {
            SelectionSort.sort(data);
        } else if (sortName.equals("InsertionSort")) {
            InsertionSort.sort(data);
        }
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        if (!SortingHelper.isSorted(data)) {
            throw new RuntimeException("SelectionSort failed");
        }
        System.out.printf("%s , n= %d : %f s%n", sortName, data.length, time);
    }


    public static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
