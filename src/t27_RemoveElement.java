public class t27_RemoveElement {
    public int removeElement(int[] arr, int val) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (arr[i] == val) {
                arr[i] = arr[--size];
                i--;
            }
        }
        return size;
    }
}
