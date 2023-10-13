public class t875_KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int bananas : piles) {
            high = Math.max(high, bananas);
        }

        while (low < high) {
            int mid = (low + high) >>> 1;
            int time = 0;

            for (int bananas : piles) {
                time += (bananas + mid - 1) / mid;
            }

            if (h >= time) {
                high = mid;
            }
            else
                low = mid + 1;
        }
        return low;
    }
}
