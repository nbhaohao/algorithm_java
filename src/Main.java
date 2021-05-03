import algorithms.SelectionSort;
import utils.ArrayGenerator;
import algorithms.LinearSearch;

public class Main {
    public static void testLinearSearch() {

        int[] dataSize = {100_0000, 1000_0000};
        for (int n : dataSize
        ) {
            Integer[] data = ArrayGenerator.generateOrderedArray(n);
            long startTime = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                LinearSearch.search(data, n);
            }
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("n = " + n + ", 100 runs :" + time + " s");
        }
    }

    public static void printArray(Integer[] array) {
        for (int i : array
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void testSelectionSort() {
        Integer[] data = {6, 4, 2, 3, 1, 5};
        SelectionSort.sort(data);
        printArray(data);
    }

    public static void main(String[] args) {
        testSelectionSort();
    }
}
