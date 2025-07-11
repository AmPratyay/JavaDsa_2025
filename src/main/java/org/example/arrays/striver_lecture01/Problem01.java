package org.example.arrays.striver_lecture01;

public class Problem01 {

    // Find the Largest Element in the Array

    private static int largestElement(int[] arr) {
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 5, 2};

        int largest = largestElement(arr);

        System.out.println(largest);
    }
}
