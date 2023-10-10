public class t26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] arr) {
        int cur = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[cur] = arr[i];
                cur++;
            }
        }
        return cur;
    }
}
