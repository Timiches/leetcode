public class t125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int size = s.length();
        char[] word = new char[s.length()];
        s = s.toLowerCase();
        char temp;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if ((temp >= 'a' && temp <= 'z') || (temp >= '0' && temp <= '9')) {
                word[j++] = temp;
            } else {
                size--;
            }
        }

        int left = size / 2 + size % 2 - 1;
        int right = size / 2;

        while (left >= 0) {
            if (word[left--] != word[right++])
                return false;
        }

        return true;
    }
}
