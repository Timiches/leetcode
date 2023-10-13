public class t905_SortArrayByParity {
    public int[] sortArrayByParity(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int temp = 0;
        while (i < j) {
            if (arr[i] % 2 == 0) {
                i++;
                continue;
            }
            if (arr[i] % 2 == 1) {
                j--;
                continue;
            }
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
