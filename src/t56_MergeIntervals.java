import java.util.Arrays;
import java.util.Comparator;

public class t56_MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int size = intervals.length;
        int[] cur = intervals[0];
        int i;

        for (i = 1; i < intervals.length; i++) {
            if (cur[1] >= intervals[i][0]) {
                if (cur[1] < intervals[i][1]) {
                    cur[1] = intervals[i][1];
                }
                intervals[i][0] = -1;
                size--;
            } else cur = intervals[i];
        }

        if (size == intervals.length)
            return intervals;

        int[][] result = new int[size][2];
        i = 0;

        for (int[] interval : intervals) {
            if (interval[0] != -1)
                result[i++] = interval;
        }
        return result;
    }
}
