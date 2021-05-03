package algorithms;

public class SelectionSort {
    private SelectionSort() {
    }

    /**
     * 选择排序法
     * 每次都找出数组中最小的一个数字，依次放置在数组的开头
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 交换位置
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
