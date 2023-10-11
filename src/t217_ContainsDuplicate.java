import java.util.HashSet;

public class t217_ContainsDuplicate {
    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }
}
