package algorithm;

import util.SortingHelper;

public class InsertionSort {
    private InsertionSort() {
    }

    /**
     * 插入排序法
     * 不断地把元素往前移动，如果发现前一个元素大于当前的元素，则一直往前移动
     *
     * @param arr
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    SortingHelper.swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
