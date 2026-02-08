package aditya_verma_algos.binary_search;

public class BinarySearchDescending {

    public static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0)
            return -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 9;

        int resIdx = binarySearch(arr, target);

        System.out.println(resIdx);
    }
}