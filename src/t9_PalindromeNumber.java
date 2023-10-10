public class t9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;

        while(original > 0){
            reversed = reversed * 10 + original % 10;
            original = original / 10;
        }
        return reversed == x;
    }
}
