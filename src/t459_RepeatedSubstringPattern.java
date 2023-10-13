public class t459_RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int subsLength = 0;
        int length = s.length();
        boolean flag = true;
        while(++subsLength < length/2 +1 && flag) {
            if (length % subsLength != 0)
                continue;
            flag = false;
            String subs = s.substring(0, subsLength);
            for (int i = subsLength; i < s.length(); i += subsLength) {
                String temp = s.substring(i, i + subsLength);
                if(!subs.equals(temp)){
                    flag = true;
                    break;
                }
            }
        }
        return !flag;
    }
}
