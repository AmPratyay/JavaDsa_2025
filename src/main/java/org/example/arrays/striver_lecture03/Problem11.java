package org.example.arrays.striver_lecture03;

public class Problem11 {

    // Maximum consecutive one's

    private static int maxConsecutiveOnes(int[] arr) {
        int count = 0;

        int maxConsecutive = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                count += 1;
            } else {

                if (count > maxConsecutive) {
                    maxConsecutive = count;
                }

                count = 0;
            }
        }

        if (count > maxConsecutive) {
            maxConsecutive = count;
        }

        return maxConsecutive;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1};

        int maxConsecutive = maxConsecutiveOnes(arr);

        System.out.println(maxConsecutive);
    }
}
