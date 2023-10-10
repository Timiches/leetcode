public class t34_FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] arr, int target) {
        int[] result = new int[]{-1,-1};
        if(arr.length == 0)
            return result;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = arr[mid];

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else{
                low = mid;
                high = mid;
                break;
            }

        }
        while(low >= 0 && low < arr.length && arr[low] == target){
            result[0] = low;
            low--;
        }
        while(high < arr.length && high > -1 && arr[high] == target){
            result[1] = high;
            high++;
        }
        return result;
    }
}
