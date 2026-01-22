package striver.sheet.arrays.striver_lecture02;

import java.util.LinkedHashSet;
import java.util.Set;

public class Problem09 {

    // Find the Union

    private static void unionOfArrayBasic(int[] arr1, int[] arr2) {
        Set<Integer> hset = new LinkedHashSet<>();

        for (int j : arr1) {
            hset.add(j);
        }

        for (int j : arr2) {
            hset.add(j);
        }

        System.out.println(hset);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};

        unionOfArrayBasic(arr1, arr2);
    }
}