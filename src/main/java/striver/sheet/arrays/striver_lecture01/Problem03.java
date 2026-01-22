package striver.sheet.arrays.striver_lecture01;

public class Problem03 {

    // check if the array is sorted

    private static boolean isSortedAsc(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isSortedDesc(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 4, 5};

        boolean isSortedAsc = isSortedAsc(arr);

        System.out.println(isSortedAsc);

        boolean isSortedDesc = isSortedDesc(arr);

        System.out.println(isSortedDesc);
    }
}
