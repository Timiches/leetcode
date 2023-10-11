public class t153_FindMinimumInRotatedSortedArray {
    public int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = arr[mid];

            if (midVal > arr[high])
                low = mid + 1;
            else if (midVal < arr[high])
                high = mid;
            else{
                return arr[mid];
            }
        }
        return -1;
    }
}
