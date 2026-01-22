package striver.sheet.arrays.striver_lecture01;

import java.util.HashSet;
import java.util.Set;

public class Problem04 {

    // Remove duplicates from the sorted array

    // not optimal
    private static int sizeOfUniqueElement(int[] arr) {

        Set<Integer> hset = new HashSet<>();

        for (int j : arr) {
            hset.add(j);
        }

        return hset.size();
    }

    // optimal
    private static int sizeOfUniqueElementOptimal(int[] arr) {
        int i = 0;
        int j = 1;

        while (j < arr.length) {

            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
            j++;
        }
        return i + 1;
    }


    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 3, 3};

//        int size = sizeOfUniqueElement(arr);
//        System.out.println(size);

        System.out.println(sizeOfUniqueElementOptimal(arr));


    }
}
