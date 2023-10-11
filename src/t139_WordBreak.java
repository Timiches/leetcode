import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class t139_WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> wordSet = new HashSet<>(wordDict);
        int[] last_length = new int[s.length()];
        Arrays.fill(last_length, -1);
        for (int i = 0; i < s.length(); i++) {
            if (wordSet.contains(s.substring(0, i + 1))) {
                last_length[i] = i + 1;
                continue;
            }
            for (int j = i - 1; j >= 0; j--) {
                if (last_length[j] != -1 && wordSet.contains(s.substring(j + 1, i + 1))) {
                    last_length[i] = i - j;
                    break;
                }
            }
        }
        return last_length[s.length() - 1] != -1;
    }
}
