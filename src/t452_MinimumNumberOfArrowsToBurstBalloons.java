import java.util.Arrays;
import java.util.Comparator;

public class t452_MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        int shots = 1;
        int prev = points[0][1];

        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

        for (int[] point : points) {
            if (point[0] > prev) {
                shots++;
                prev = point[1];
            } else prev = Math.min(prev, point[1]);
        }

        return shots;
    }
}
