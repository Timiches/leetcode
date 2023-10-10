import java.util.HashSet;

public class t3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int from = 0;
        int to = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for(char ch : arr){
            if(set.contains(ch)) {
                while(arr[from] != ch){
                    set.remove(arr[from++]);
                }
                set.remove(arr[from++]);
            }
            set.add(ch);
            to++;
            max = Math.max(max, to - from);
        }
        return max;
    }
}
