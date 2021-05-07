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

    // 优化版，减少交换的操作次数
    public static <E extends Comparable<E>> void sort2(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            E temp = arr[i];
            boolean isSwap = false;
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    arr[j - 1] = arr[j];
                    isSwap = true;
                } else {
                    if (isSwap) {
                        arr[j - 1] = temp;
                    }
                    break;
                }
            }
        }
    }
}
