public class t1679_MaxNumberOfKSumPairs {
//    public int maxOperations(int[] arr, int k) {
//        int result = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) continue;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] == 0) continue;
//                if (arr[i] + arr[j] == k) {
//                    arr[i] = 0;
//                    arr[j] = 0;
//                    result++;
//                    break;
//                }
//            }
//        }
//        return result;
//    }

    public static int maxOperations(int[] arr, int k) {
        int result = 0;
        int left = 0;
        int right = 1;
        int window = 1;
        while (left != 0|| right <= arr.length - 1) {
            if (arr[left] == 0 || arr[right] == 0) {
                left++;
                right++;
            } else
            if (right > arr.length - 1) {
                window++;
                left = 0;
                right = window;
            } else if (arr[left] + arr[right] == k) {
                arr[left] = 0;
                arr[right] = 0;
                result++;
            } else {
                left++;
                right++;
            }
        }
        return result;
    }
}
