public class t33_SearchInRotatedSortedArray {
    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int pivot = 0;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = arr[mid];

            if (midVal > arr[high])
                low = mid + 1;
            else if (midVal < arr[high])
                high = mid;
            else{
                pivot = mid;
                break;
            }
        }

        low = pivot;
        high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = arr[mid];

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return mid;
        }

        low = 0;
        high = pivot - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = arr[mid];

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
