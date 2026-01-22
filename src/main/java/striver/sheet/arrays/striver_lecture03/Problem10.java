package striver.sheet.arrays.striver_lecture03;

public class Problem10 {

    // Find the missing number from an array

    private static int findMissingNumberNormal(int[] arr, int n) {

        for (int i = 1; i <= n; i++) {

            int flag = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == i) {
                    flag = 1;
                    break;
                }

            }

            if (flag == 0) {
                return i;
            }

        }
        return -1;
    }


    private static int findMissingNumberOptimal(int[] arr, int n) {

        int sum = n * (n + 1) / 2;


        int arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        return sum - arrSum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};

        int n = 5;

        int missingNum = findMissingNumberNormal(arr, n);

        System.out.println(missingNum);


        int missingNumberOptimal = findMissingNumberOptimal(arr,n);

        System.out.println(missingNumberOptimal);

    }
}
