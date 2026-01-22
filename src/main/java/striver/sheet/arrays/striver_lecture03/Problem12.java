package striver.sheet.arrays.striver_lecture03;

import java.util.*;

public class Problem12 {

    // find the number that appears ones and other twice

    private static void numAppearsOnceWay1(int[] arr) {
        Map<Integer, Integer> hs = new HashMap<>();

        for (int j : arr) {
            hs.put(j, hs.getOrDefault(j, 0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> entrySet = hs.entrySet();

        for (Map.Entry<Integer, Integer> data : entrySet) {
            if (data.getValue() == 1) {
                System.out.println(data.getKey());
            }
        }
    }

    private static int count(int[] arr, int val) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                count++;
            }
        }
        return count;
    }

    private static void numAppearsOnceWay2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = count(arr, arr[i]);
            if (count == 1) {
                System.out.println(arr[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 4};

        numAppearsOnceWay1(arr);
        numAppearsOnceWay2(arr);
    }

}
