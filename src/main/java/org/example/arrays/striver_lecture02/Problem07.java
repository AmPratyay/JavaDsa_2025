package org.example.arrays.striver_lecture02;

import java.util.Arrays;

public class Problem07 {

    // Move Zeros to end

    public static void moveZeroToEndBasic(int[] arr) {
        int[] nArr = new int[arr.length];

        int start = 0;
        int end = nArr.length - 1;

        for (int j : arr) {
            if (j != 0) {
                nArr[start] = j;
                start++;
            } else {
                nArr[end] = j;
            }
        }

        System.out.println(Arrays.toString(nArr));
    }

    // Optimal solution

    public static void moveZerosToEndOptimal(int[] arr) {

        int j = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < arr.length; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};

//        moveZeroToEndBasic(arr);

        moveZerosToEndOptimal(arr);

    }
}
