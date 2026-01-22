package striver.sheet.arrays.striver_lecture02;

import java.util.Arrays;

public class Problem06 {

    // left rotate an array by d

    // Normal code solution
    private static void rotate(int[] arr, int d) {

        int k = d % arr.length;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }

        int index2 = arr.length - k;

        for (int j : temp) {
            arr[index2] = j;
            index2++;
        }


        System.out.println(Arrays.toString(arr));
    }

    // Optimal code solution

    public static void rotateAnArray(int[] arr, int d) {

        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int s, int e) {

        int start = s;
        int end = e;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int d = 2;

//        rotate(arr, d);

        rotateAnArray(arr, d);
    }
}
