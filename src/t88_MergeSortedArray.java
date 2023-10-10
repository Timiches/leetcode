public class t88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 == null)
            return;
        int cur = m + n - 1;
        int n1 = m - 1;
        int n2 = n - 1;
        while (n1 >= 0 && n2 >= 0) {
            if (nums1[n1] >= nums2[n2])
                nums1[cur--] = nums1[n1--];
            else
                nums1[cur--] = nums2[n2--];
        }
        while (n2 >= 0) {
            nums1[n2] = nums2[n2];
            n2--;
        }
    }
}
