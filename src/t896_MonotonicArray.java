public class t896_MonotonicArray {
    public boolean isMonotonic(int[] arr) {
        if (arr.length == 1)
            return true;
        int i = 1;
        while (i < arr.length - 1) {
            if (arr[i] != arr[i - 1])
                break;
            i++;
        }
        if (arr[i] > arr[i - 1]) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) return false;
            }
        } else {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[j - 1]) return false;
            }
        }
        return true;
    }
}
