public class t66_PlusOne {
    public int[] plusOne(int[] digits) {
        int memory = 0;
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += memory--;
            if (digits[i] == 10) {
                digits[i] = 0;
                memory = 1;
            } else break;
        }
        if (memory == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
    }
}
