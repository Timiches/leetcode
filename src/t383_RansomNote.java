import java.util.HashMap;

public class t383_RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() < 1 || magazine.length() < 1)
            return false;
        int i = 0;
        HashMap<Integer,Character> set = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            set.put(i++, ch);
        }
        for(char ch : ransomNote.toCharArray()){
            if(!set.values().remove(ch))
                return false;
        }
        return true;
    }
}
