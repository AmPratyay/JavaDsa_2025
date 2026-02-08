package aditya_verma_algos.binary_search;

public class FirstAndLastOccurrence {

    public static int firstOccurrence(int[] arr, int target) {
        int result = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int result = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 10, 10, 10, 18, 20};
        int target = 10;

        int resIdxFirstOccurrence = firstOccurrence(arr, target);
        int resIdxLastOccurrence = lastOccurrence(arr, target);

        System.out.println(resIdxFirstOccurrence);
        System.out.println(resIdxLastOccurrence);
    }
}
