import dataStructure.Array;
import dataStructure.Queue.ArrayQueue;
import dataStructure.Queue.LoopQueue;
import dataStructure.Stack.ArrayStack;
import util.ArrayGenerator;
import algorithm.LinearSearch;
import util.SortingHelper;

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
        int n = 1_0000;
        Integer[] data = ArrayGenerator.generateRandomArray(n, n);
        SortingHelper.sortTest("SelectionSort", data);
    }

    public static void testInsertionSort() {
        int n = 1_0000;
        Integer[] data = ArrayGenerator.generateRandomArray(n, n);
        SortingHelper.sortTest("InsertionSort", data);
    }

    public static void testArray() {
        Array<Integer> array = new Array<>(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);
        array.add(1, 100);
        System.out.println(array);
        array.addFirst(-1);
        System.out.println(array);

        array.remove(2);
        System.out.println(array);
    }

    public static void testStack() {
        ArrayStack<Object> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }

    public static void testQueue() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }

    public static void testLoopQueue() {
        LoopQueue<Integer> queue = new LoopQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }

    public static void main(String[] args) {
        testLoopQueue();
    }
}
