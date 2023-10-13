public class t1870_MinimumSpeedToArriveOnTime {
    public int minSpeedOnTime(int[] dist, double hour) {
        if (dist.length - 1 + 1e-2 > hour)
            return -1;
        int high = 10000000;
        int low = 1;
        int result = -1;
        int i;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            double time = 0.0;

            for (i = 0; i < dist.length - 1; i++) {
                time += Math.ceil((double) dist[i] / (double) mid);
            }
            time += dist[i] / (double) mid;

            if (hour >= time) {
                result = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return result;
    }
}
