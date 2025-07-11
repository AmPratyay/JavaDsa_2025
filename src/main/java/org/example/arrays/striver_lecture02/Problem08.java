package org.example.arrays.striver_lecture02;

public class Problem08 {

    // Linear Search in an array

    public static int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {6, 7, 8, 4, 1};

        int num = 4;

        int result = linearSearch(arr, num);

        System.out.println(result);

    }
}
