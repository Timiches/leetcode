import java.util.HashSet;
import java.util.Random;

public class t380_InsertDeleteGetRandomO1 {
    HashSet<Integer> set;
    Random random;

    public t380_InsertDeleteGetRandomO1() {
        set = new HashSet<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(set.contains(val))
            return false;
        set.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!set.contains(val))
            return false;
        set.remove(val);
        return true;
    }

    public int getRandom() {
        Integer[] setString = set.toArray(new Integer[0]);
        return setString[random.nextInt(set.size())];
    }
}
