public class t389_FindTheDifference {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        int i;
        for (i = 0; i < s.length(); i++)
            sum ^= t.charAt(i) ^ s.charAt(i);
        sum ^= t.charAt(i);
        return (char) sum;
    }
}
