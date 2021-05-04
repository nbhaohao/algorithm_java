package algorithm;

import util.SortingHelper;

public class SelectionSort {
    private SelectionSort() {
    }

    /**
     * 选择排序法
     * 每次都找出数组中最小的一个数字，依次放置在数组的开头
     *
     * @param arr
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // 交换位置
            SortingHelper.swap(arr, i, minIndex);
        }
    }
}
