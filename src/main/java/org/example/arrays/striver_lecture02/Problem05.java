package org.example.arrays.striver_lecture02;

import java.util.Arrays;

public class Problem05 {

    // left rotate an array by 1

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int first = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = first;

        System.out.println(Arrays.toString(arr));
    }
}
