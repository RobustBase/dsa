package com.robustbase.dsa.sorting.bubble;

import java.util.Arrays;

/**
 * @author Atul Dwivedi
 * @date 01/07/21
 */
public class BubbleSort {

    public void sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length - 1) - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        //input array
        int[] arr = {4, 2, 9, 7, 3, 5};

        //sorting
        new BubbleSort().sort(arr);

        //printing sorted array
        Arrays.stream(arr).forEach(element -> System.out.print(element + "\t"));
    }
}
