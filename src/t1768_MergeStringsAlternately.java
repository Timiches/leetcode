public class t1768_MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        char[] result = new char[word1.length() + word2.length()];
        while(i < word1.length() && j < word2.length()){
            result[i+j] = word1.charAt(i++);
            result[i+j] = word2.charAt(j++);
        }
        while(i < word1.length()){
            result[i+j] = word1.charAt(i++);
        }
        while(j < word2.length()){
            result[i+j] = word2.charAt(j++);
        }
        return new String(result);
    }
}
