public class t1309_DecryptStringFromAlphabetToIntegerMapping {
    public String freqAlphabets(String s) {
        int length = s.length();
        int i = 0;
        char ch;
        StringBuilder returns = new StringBuilder();
        while (i < length){
            StringBuilder str = new StringBuilder();
            if(i+ 2 < length && s.charAt(i+2) == '#'){
                str.append(s.charAt(i)).append(s.charAt(i+1));
                ch = (char)(96 + Integer.parseInt(str.toString()));
                returns.append(ch);
                i += 3;
            } else{
                ch = (char) (48 + s.charAt(i));
                returns.append(ch);
                i++;
            }
        }
        return returns.toString();
    }
}
