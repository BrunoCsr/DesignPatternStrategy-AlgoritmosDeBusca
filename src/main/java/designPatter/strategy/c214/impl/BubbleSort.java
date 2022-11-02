package designPatter.strategy.c214.impl;

import designPatter.strategy.c214.Sort;

public class BubbleSort implements Sort {


    @Override
    public int[] sort(int[] arr) {
        if (arr.length > 0) {
            int n = arr.length;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (arr[j - 1] > arr[j]) {
                        //swap elements
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }

                }
            }
            return arr;
        } else{
            int[]a = {0};
            return a;
        }


    }


}
