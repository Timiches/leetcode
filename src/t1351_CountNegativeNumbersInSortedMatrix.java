public class t1351_CountNegativeNumbersInSortedMatrix {
    public int countNegatives(int[][] grid) {
        int k = 0;
        for(int i = 0; i < grid.length; i++){
            for(int num : grid[i]){
                if(num < 0){
                    k++;
                }
            }
        }
        return k;
    }
}
