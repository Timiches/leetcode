import java.util.Arrays;
import java.util.HashMap;

public class t403_FrogJump {
    HashMap<Integer, Integer> map = new HashMap<>();
    int mem[][] = new int[2001][2001];

    boolean jump(int[] stones, int n, int index, int prevJump) {
        if (index == n - 1) {
            return true;
        }

        if (mem[index][prevJump] != -1) {
            return mem[index][prevJump] == 1;
        }

        boolean result = false;
        for (int nextJump = prevJump - 1; nextJump <= prevJump + 1; nextJump++) {
            if (nextJump > 0 && map.containsKey(stones[index] + nextJump)) {
                result = result || jump(stones, n, map.get(stones[index] + nextJump), nextJump);
            }
        }
        mem[index][prevJump] = (result ? 1 :0);
        return result;
    }

    public boolean canCross(int[] stones) {
        for (int i = 0 ; i < stones.length; i++) {
            map.put(stones[i], i);
        }

        for (int i = 0; i < 2000; i++) {
            Arrays.fill(mem[i], -1);
        }

        return jump(stones, stones.length, 0, 0);
    }
}
