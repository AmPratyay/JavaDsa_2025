package org.example.arrays.striver_lecture01;

public class Problem02 {

    // Find the second-Largest Element in the Array

    private static int largestElement(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 5, 2};

        int secondLargest = largestElement(arr);

        System.out.println(secondLargest);
    }
}
