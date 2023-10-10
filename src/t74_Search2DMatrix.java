public class t74_Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int high = row * col - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = matrix[mid/col][mid%col];

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return true;
        }
        return false;
    }
}
