import java.util.Arrays;

public class t435_NonoverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int result = 0 ;
        int border = Integer.MIN_VALUE;

        for(int[] interval : intervals){
            if(interval[0] >= border){
                border = interval[1];
            }else{
                result++;
            }
        }
        return result;
    }
}
