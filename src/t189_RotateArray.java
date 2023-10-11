public class t189_RotateArray {
    public void rotate(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        System.gc();
    }

    private void reverse(int[] arr, int from, int to){
        int temp;
        while(from < to){
            temp = arr[from];
            arr[from++] = arr[to];
            arr[to--] = temp;
        }
    }
}
