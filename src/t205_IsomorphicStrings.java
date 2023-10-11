import java.util.HashMap;

public class t205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if (map.containsKey(ss)) {
                if (tt == map.get(ss))
                    continue;
                return false;
            } else{
                if(!map.containsValue(tt))
                    map.put(ss, tt);
                else return false;
            }
        }
        return true;
    }
}
