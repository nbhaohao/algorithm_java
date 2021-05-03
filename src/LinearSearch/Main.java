package LinearSearch;

public class Main {
    public static void main(String[] args) {
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
}
