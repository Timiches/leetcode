public class t11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int result = 0;
        int r = n - 1;

        while(l < r){
            int currArea = Math.min(height[l], height[r])*(r - l);
            result = Math.max(result, currArea);
            if(height[l] < height[r]){
                l++;
            } else {
                r--;
            }
        }
        return result;
    }
}
