public class t4_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] resultNums = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                resultNums[k] = nums1[i];
                i++;
            } else {
                resultNums[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            resultNums[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            resultNums[k] = nums2[j];
            j++;
            k++;
        }

        if(resultNums.length % 2 == 0){
            return (double)(resultNums[k/2 - 1] +  resultNums[k/2]) / 2;
        } else
            return resultNums[k/2];
    }
}
