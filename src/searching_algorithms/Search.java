package searching_algorithms;

public class Search {

    // Integer
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; ++i)
            if (arr[i] == target)
                return i;

        return -1;
    }

    // String
    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; ++i)
            if (arr[i].equals(target))
                return i;

        return -1;
    }

    // Integers
    public static int binarySearch(int[] arr, int target) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target)
                return mid;
            else if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    // String
    public static int binarySearch(String[] arr, String target) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid].equals(target))
                return mid;
            else if (arr[mid].compareTo(target) > 0)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return -1;
    }

    public static int interpolationSearch(int[] arr, int target) {

        int low = 0, high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            if (low == high) {
                if (arr[low] == target)
                    return low;
                return -1;
            }

            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[pos] == target)
                return pos;
            else if (arr[pos] < target)
                low = pos + 1;
            else
                high = pos - 1;
        }

        return -1;
    }

}
