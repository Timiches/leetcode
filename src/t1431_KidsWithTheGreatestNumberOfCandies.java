import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class t1431_KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        LinkedList<Boolean> result = new LinkedList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i : candies)
            result.addLast(i+extraCandies >= max);
        return result;
    }
}
