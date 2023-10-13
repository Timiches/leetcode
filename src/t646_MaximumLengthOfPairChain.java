import java.util.Arrays;
import java.util.Comparator;

public class t646_MaximumLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));
        int result = 1;
        int prev = pairs[0][1];

        for(int i = 1; i < pairs.length; i++){
            if(prev < pairs[i][0]){
                result++;
                prev = pairs[i][1];
            }
        }
        return result;
    }
}
