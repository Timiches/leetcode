import java.util.Arrays;

public class t14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        int shortest = Arrays.stream(strs).map(String::length).min(Integer::compare).get();
        int i = 0;
        while (i < shortest) {
            boolean isSame = true;
            char ch = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != ch){
                    isSame = false;
                    break;
                }
            }
            if(!isSame){
                return prefix.toString();
            }
            prefix.append(ch);
            i++;
        }

        return prefix.toString();
    }
}
