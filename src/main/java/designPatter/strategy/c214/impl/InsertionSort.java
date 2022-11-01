package designPatter.strategy.c214.impl;

import designPatter.strategy.c214.Sort;

public class InsertionSort implements Sort {


    @Override
    public int[] sort(int[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int r = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (r >= 0 && arr[r] > key) {
                arr[r + 1] = arr[r];
                r = r - 1;
            }
            arr[r + 1] = key;
        }

        return arr;

    }
}
