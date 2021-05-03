import algorithm.SelectionSort;
import entity.Student;
import util.ArrayGenerator;
import algorithm.LinearSearch;

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

    public static <T> void printArray(T[] array) {
        for (T entity : array
        ) {
            System.out.print(entity + " ");
        }
        System.out.println();
    }

    public static void testSelectionSort() {
        Integer[] data = {6, 4, 2, 3, 1, 5};
        SelectionSort.sort(data);
        printArray(data);
        Student[] students = {new Student("Alice", 98), new Student("Bobo", 100), new Student("Charles", 66)};
        SelectionSort.sort(students);
        printArray(students);
    }

    public static void main(String[] args) {
        testSelectionSort();
    }
}
