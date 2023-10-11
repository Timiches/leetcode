import java.util.HashMap;

public class t290_WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length != pattern.length())
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String tt = words[i];
            if (map.containsKey(p)) {
                if (tt.equals(map.get(p)))
                    continue;
                return false;
            } else{
                if(!map.containsValue(tt))
                    map.put(p, tt);
                else return false;
            }
        }
        return true;
    }
}
